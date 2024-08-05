module algoritmos_genericos
    implicit none
    contains

    ! Implementación del algoritmo QuickSort
    subroutine quicksort(arr, low, high)
        real, dimension(:), intent(inout) :: arr
        integer, intent(in) :: low, high
        integer :: pivot

        if (low < high) then
            call particion(arr, low, high, pivot)
            call quicksort(arr, low, pivot-1)
            call quicksort(arr, pivot+1, high)
        end if
    end subroutine quicksort

    subroutine particion(arr, low, high, pivot)
        real, dimension(:), intent(inout) :: arr
        integer, intent(in) :: low, high
        integer, intent(out) :: pivot
        real :: temp, pivot_value
        integer :: i, j

        pivot_value = arr(low)
        pivot = low

        do i = low+1, high
            if (arr(i) < pivot_value) then
                pivot = pivot + 1
                temp = arr(i)
                arr(i) = arr(pivot)
                arr(pivot) = temp
            end if
        end do

        temp = arr(low)
        arr(low) = arr(pivot)
        arr(pivot) = temp
    end subroutine particion

    ! Implementación de un algoritmo de backtracking básico
    logical function backtracking(x, y, step, n)
        integer, intent(in) :: x, y, step, n
        logical :: success
        integer, dimension(8, 2) :: moves = &
                reshape([2, 1, 1, 2, -1, 2, -2, 1, -2, -1, -1, -2, 1, -2, 2, -1], [8, 2])
        integer :: nx, ny, k

        if (step == n*n) then
            success = .true.
        else
            success = .false.
            do k = 1, 8
                nx = x + moves(k, 1)
                ny = y + moves(k, 2)
                if (nx > 0 .and. ny > 0 .and. nx <= n .and. ny <= n) then
                    success = backtracking(nx, ny, step+1, n)
                    if (success) exit
                end if
            end do
        end if

        backtracking = success
    end function backtracking

end module algoritmos_genericos
