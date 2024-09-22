module optimizaciones_numericas
    implicit none
    contains

    ! Método de Newton-Raphson para encontrar raíces de una función
    function newton_raphson(f, df, x0, tol, max_iter) result(raiz)
        real, external :: f, df
        real, intent(in) :: x0, tol
        integer, intent(in) :: max_iter
        real :: x, raiz
        integer :: iter

        x = x0
        do iter = 1, max_iter
            x = x - f(x) / df(x)
            if (abs(f(x)) < tol) exit
        end do
        raiz = x
    end function newton_raphson

    ! Método de Gradiente Descendente
    subroutine gradiente_descendente(f, df, x0, alfa, tol, max_iter, min_x)
        real, external :: f, df
        real, intent(in) :: x0, alfa, tol
        integer, intent(in) :: max_iter
        real, intent(out) :: min_x
        integer :: iter
        real :: x

        x = x0
        do iter = 1, max_iter
            x = x - alfa * df(x)
            if (abs(df(x)) < tol) exit
        end do
        min_x = x
    end subroutine gradiente_descendente

end module optimizaciones_numericas
