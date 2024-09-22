module io_utilidades
    implicit none
    contains

    ! Lectura de archivos CSV
    subroutine leer_csv(filename, data, rows, cols)
        character(len=*), intent(in) :: filename
        real, dimension(:,:), allocatable, intent(out) :: data
        integer, intent(out) :: rows, cols
        integer :: i, j, ios
        character(len=100) :: line
        character(len=10), dimension(:), allocatable :: tokens
        integer :: token_count

        open(unit=10, file=filename, status='old', iostat=ios)
        if (ios /= 0) stop "Error al abrir el archivo"

        rows = 0
        cols = 0
        do
            read(10, '(A)', iostat=ios) line
            if (ios /= 0) exit
            rows = rows + 1
            call tokenize(line, tokens, token_count)
            if (cols < token_count) cols = token_count
        end do

        allocate(data(rows, cols))
        rewind(10)

        i = 0
        do
            read(10, '(A)', iostat=ios) line
            if (ios /= 0) exit
            i = i + 1
            call tokenize(line, tokens, token_count)
            do j = 1, token_count
                read(tokens(j), *) data(i, j)
            end do
        end do

        close(10)
    end subroutine leer_csv

    ! Escritura de archivos CSV
    subroutine escribir_csv(filename, data, rows, cols)
        character(len=*), intent(in) :: filename
        real, dimension(rows, cols), intent(in) :: data
        integer, intent(in) :: rows, cols
        integer :: i, j

        open(unit=10, file=filename, status='replace')
        do i = 1, rows
            do j = 1, cols
                write(10, '(F10.4)', advance='no') data(i, j)
                if (j /= cols) write(10, '(A)', advance='no') ","
            end do
            write(10, *)
        end do
        close(10)
    end subroutine escribir_csv

    ! Tokenización de una cadena
    subroutine tokenize(line, tokens, token_count)
        character(len=*), intent(in) :: line
        character(len=10), dimension(:), allocatable, intent(out) :: tokens
        integer, intent(out) :: token_count
        character(len=1) :: delimiter
        character(len=100), dimension(:), allocatable :: tmp_tokens
        integer :: i, j, start, len_line

        delimiter = ","
        len_line = len_trim(line)
        token_count = 0
        allocate(tmp_tokens(len_line))

        start = 1
        do i = 1, len_line
            if (line(i:i) == delimiter .or. i == len_line) then
                if (i == len_line) i = i + 1  ! Para capturar el último token
                token_count = token_count + 1
                tmp_tokens(token_count) = line(start:i-1)
                start = i + 1
            end if
        end do

        allocate(tokens(token_count))
        tokens = tmp_tokens(:token_count)
    end subroutine tokenize

end module io_utilidades
