module manipulacion_matrices
    implicit none
    contains

    ! Multiplicación de dos matrices
    subroutine multiplicar_matrices(A, B, C, n, m, p)
        integer, intent(in) :: n, m, p
        real, dimension(n, m), intent(in) :: A
        real, dimension(m, p), intent(in) :: B
        real, dimension(n, p), intent(out) :: C
        integer :: i, j, k

        C = 0.0
        do i = 1, n
            do j = 1, p
                do k = 1, m
                    C(i, j) = C(i, j) + A(i, k) * B(k, j)
                end do
            end do
        end do
    end subroutine multiplicar_matrices

    ! Cálculo del Determinante de una Matriz (2x2 para simplificación)
    function determinante2x2(A) result(det)
        real, dimension(2, 2), intent(in) :: A
        real :: det

        det = A(1, 1) * A(2, 2) - A(1, 2) * A(2, 1)
    end function determinante2x2

    ! Cálculo de la Inversa de una Matriz (2x2 para simplificación)
    subroutine inversa2x2(A, invA, singular)
        real, dimension(2, 2), intent(in) :: A
        real, dimension(2, 2), intent(out) :: invA
        logical, intent(out) :: singular
        real :: det

        det = determinante2x2(A)
        if (det == 0.0) then
            singular = .true.
            invA = 0.0
        else
            singular = .false.
            invA(1, 1) = A(2, 2) / det
            invA(1, 2) = -A(1, 2) / det
            invA(2, 1) = -A(2, 1) / det
            invA(2, 2) = A(1, 1) / det
        end if
    end subroutine inversa2x2

end module manipulacion_matrices
