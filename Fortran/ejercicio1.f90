program Tarea1
    implicit none
    integer :: i, j, temp
    integer, dimension(5) :: numeros
    do i = 1, 5
        print *, "Inserte un numero(entero) que estara en la posicion ", i
        read(*,*) numeros(i)
    end do

    print *, "Array original: ", numeros

    do i = 1, 4 
        do j = 1, 5 - i 
            if (numeros(j) > numeros(j+1)) then
                temp = numeros(j)
                numeros(j) = numeros(j+1)
                numeros(j+1) = temp
            end if
        end do
    end do

    print *, "Array ordenado: ", numeros

end program Tarea1
