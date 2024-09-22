module estadisticas
    implicit none
    contains

    ! Cálculo de la Mediana
    function mediana(arr, n) result(med)
        integer, intent(in) :: n
        real, dimension(n), intent(in) :: arr
        real :: med

        call ordenar_burbuja(arr, n)  ! Ordenar el array antes de calcular la mediana

        if (mod(n, 2) == 0) then
            med = (arr(n/2) + arr(n/2 + 1)) / 2.0
        else
            med = arr((n+1)/2)
        end if
    end function mediana

    ! Cálculo de la Desviación Estándar
    function desviacion_estandar(arr, n) result(desv)
        integer, intent(in) :: n
        real, dimension(n), intent(in) :: arr
        real :: mean, sum, desv
        integer :: i

        mean = promedio(arr, n)
        sum = 0.0

        do i = 1, n
            sum = sum + (arr(i) - mean)**2
        end do

        desv = sqrt(sum / (n - 1))
    end function desviacion_estandar

    ! Cálculo de la Varianza
    function varianza(arr, n) result(var)
        integer, intent(in) :: n
        real, dimension(n), intent(in) :: arr
        real :: mean, sum, var
        integer :: i

        mean = promedio(arr, n)
        sum = 0.0

        do i = 1, n
            sum = sum + (arr(i) - mean)**2
        end do

        var = sum / (n - 1)
    end function varianza

end module estadisticas
