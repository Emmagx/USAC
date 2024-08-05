module utilidades
    implicit none
    contains

    ! Subrutina para ordenar un array usando el método de burbuja
    subroutine ordenar_burbuja(arr, n)
        implicit none
        integer, intent(in) :: n
        real, dimension(n), intent(inout) :: arr
        integer :: i, j
        real :: temp
        
        do i = 1, n-1
            do j = 1, n-i
                if (arr(j) > arr(j+1)) then
                    temp = arr(j)
                    arr(j) = arr(j+1)
                    arr(j+1) = temp
                end if
            end do
        end do
    end subroutine ordenar_burbuja

    ! Función para encontrar el valor máximo en un array
    function maximo(arr, n) result(max_val)
        implicit none
        integer, intent(in) :: n
        real, dimension(n), intent(in) :: arr
        real :: max_val
        integer :: i
        
        max_val = arr(1)
        do i = 2, n
            if (arr(i) > max_val) then
                max_val = arr(i)
            end if
        end do
    end function maximo

    ! Subrutina para transponer una matriz
    subroutine transponer_matriz(mat, filas, columnas, transpuesta)
        implicit none
        integer, intent(in) :: filas, columnas
        real, dimension(filas, columnas), intent(in) :: mat
        real, dimension(columnas, filas), intent(out) :: transpuesta
        integer :: i, j
        
        do i = 1, filas
            do j = 1, columnas
                transpuesta(j, i) = mat(i, j)
            end do
        end do
    end subroutine transponer_matriz

    ! Función para calcular el promedio de los elementos de un array
    function promedio(arr, n) result(prom)
        implicit none
        integer, intent(in) :: n
        real, dimension(n), intent(in) :: arr
        real :: prom
        integer :: i
        
        prom = 0.0
        do i = 1, n
            prom = prom + arr(i)
        end do
        prom = prom / n
    end function promedio

    ! Subrutina para sumar dos matrices de igual tamaño
    subroutine sumar_matrices(mat1, mat2, filas, columnas, resultado)
        implicit none
        integer, intent(in) :: filas, columnas
        real, dimension(filas, columnas), intent(in) :: mat1, mat2
        real, dimension(filas, columnas), intent(out) :: resultado
        integer :: i, j
        
        do i = 1, filas
            do j = 1, columnas
                resultado(i, j) = mat1(i, j) + mat2(i, j)
            end do
        end do
    end subroutine sumar_matrices

end module utilidades
