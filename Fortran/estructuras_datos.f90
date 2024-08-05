module estructuras_datos
    implicit none
    contains

    ! Implementación de una Pila (Stack)
    subroutine push(stack, n, top, value)
        integer, intent(in) :: n
        real, dimension(n), intent(inout) :: stack
        integer, intent(inout) :: top
        real, intent(in) :: value

        if (top >= n) then
            print *, "Error: Pila llena"
        else
            top = top + 1
            stack(top) = value
        end if
    end subroutine push

    subroutine pop(stack, top, value)
        real, dimension(:), intent(inout) :: stack
        integer, intent(inout) :: top
        real, intent(out) :: value

        if (top <= 0) then
            print *, "Error: Pila vacía"
        else
            value = stack(top)
            top = top - 1
        end if
    end subroutine pop

    ! Implementación de una Cola (Queue)
    subroutine enqueue(queue, n, rear, value)
        integer, intent(in) :: n
        real, dimension(n), intent(inout) :: queue
        integer, intent(inout) :: rear
        real, intent(in) :: value

        if (rear >= n) then
            print *, "Error: Cola llena"
        else
            rear = rear + 1
            queue(rear) = value
        end if
    end subroutine enqueue

    subroutine dequeue(queue, front, rear, value)
        real, dimension(:), intent(inout) :: queue
        integer, intent(inout) :: front, rear
        real, intent(out) :: value

        if (front > rear) then
            print *, "Error: Cola vacía"
        else
            value = queue(front)
            front = front + 1
        end if
    end subroutine dequeue

end module estructuras_datos
