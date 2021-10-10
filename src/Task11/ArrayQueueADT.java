package Task11;

public class ArrayQueueADT {

    private ArrayQueueModule queue;

    public ArrayQueueADT(ArrayQueueModule queue){
        this.queue = queue;
    }
//Удаляет и возвращет первый элемент в очереди
    public Object dequeue() {
        return queue.dequeue();
    }
//Первый элемент в очереди
    public Object element() {
        return queue.element();
    }
//Добавляет элемент в очередь
    public void enqueue(Object o) {
        queue.enqueue(o);
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public boolean clear() {
        return queue.clear();
    }
}