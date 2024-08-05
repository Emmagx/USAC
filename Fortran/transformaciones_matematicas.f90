module transformaciones_matematicas
    implicit none
    contains

    ! Interpolación Lineal
    function interpolar_lineal(x, x1, y1, x2, y2) result(y)
        real, intent(in) :: x, x1, y1, x2, y2
        real :: y

        y = y1 + (y2 - y1) * (x - x1) / (x2 - x1)
    end function interpolar_lineal

    ! Transformada de Fourier Discreta (DFT)
    subroutine DFT(x, y_real, y_imag, N)
        integer, intent(in) :: N
        real, dimension(N), intent(in) :: x
        real, dimension(N), intent(out) :: y_real, y_imag
        integer :: k, n
        real :: theta

        y_real = 0.0
        y_imag = 0.0

        do k = 0, N-1
            do n = 0, N-1
                theta = 2.0 * 3.141592653589793 * n * k / N
                y_real(k+1) = y_real(k+1) + x(n+1) * cos(theta)
                y_imag(k+1) = y_imag(k+1) - x(n+1) * sin(theta)
            end do
        end do
    end subroutine DFT

    ! Diferenciación Numérica usando el método de las diferencias finitas
    function derivada_numerica(f, x, h) result(deriv)
        real, external :: f
        real, intent(in) :: x, h
        real :: deriv

        deriv = (f(x + h) - f(x - h)) / (2.0 * h)
    end function derivada_numerica

end module transformaciones_matematicas
