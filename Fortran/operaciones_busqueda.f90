module operaciones_busqueda
    implicit none
    contains

    ! Búsqueda Lineal en un array
    function busqueda_lineal(arr, n, valor) result(indice)
        integer, intent(in) :: n
        real, dimension(n), intent(in) :: arr
        real, intent(in) :: valor
        integer :: i, indice

        indice = -1  ! Retorna -1 si no se encuentra el valor
        do i = 1, n
            if (arr(i) == valor) then
                indice = i
                exit
            end if
        end do
    end function busqueda_lineal

    ! Búsqueda Binaria en un array ordenado
    function busqueda_binaria(arr, n, valor) result(indice)
        integer, intent(in) :: n
        real, dimension(n), intent(in) :: arr
        real, intent(in) :: valor
        integer :: low, high, mid, indice

        low = 1
        high = n
        indice = -1  ! Retorna -1 si no se encuentra el valor

        do while (low <= high)
            mid = (low + high) / 2
            if (arr(mid) == valor) then
                indice = mid
                exit
            elseif (arr(mid) < valor) then
                low = mid + 1
            else
                high = mid - 1
            end if
        end do
    end function busqueda_binaria

end module operaciones_busqueda