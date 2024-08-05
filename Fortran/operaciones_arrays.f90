module operaciones_arrays
    implicit none
    contains

    ! Filtro de Mediana en un array
    subroutine filtro_mediana(arr, n, resultado)
        integer, intent(in) :: n
        real, dimension(n), intent(in) :: arr
        real, dimension(n), intent(out) :: resultado
        integer :: i, j, m, half
        real, dimension(:), allocatable :: window

        allocate(window(3))
        half = 1  ! Tamaño de la ventana / 2

        do i = 1, n
            m = 0
            do j = max(1, i-half), min(n, i+half)
                m = m + 1
                window(m) = arr(j)
            end do
            call ordenar_burbuja(window, m)
            resultado(i) = window((m+1)/2)
        end do

        deallocate(window)
    end subroutine filtro_mediana

    ! Redimensionar un array dinámicamente
    subroutine redimensionar_array(arr, n, nuevo_tam)
        integer, intent(in) :: n, nuevo_tam
        real, dimension(:), allocatable, intent(inout) :: arr
        real, dimension(:), allocatable :: temp

        allocate(temp(n))
        temp = arr

        deallocate(arr)
        allocate(arr(nuevo_tam))

        arr(1:min(n, nuevo_tam)) = temp(1:min(n, nuevo_tam))
    end subroutine redimensionar_array

    ! Normalización de un array de datos
    subroutine normalizar_datos(arr, n, arr_norm)
        integer, intent(in) :: n
        real, dimension(n), intent(in) :: arr
        real, dimension(n), intent(out) :: arr_norm
        real :: min_val, max_val
        integer :: i

        min_val = minval(arr)
        max_val = maxval(arr)

        do i = 1, n
            arr_norm(i) = (arr(i) - min_val) / (max_val - min_val)
        end do
    end subroutine normalizar_datos

end module operaciones_arrays
