package Task8;

import java.util.concurrent.ConcurrentLinkedDeque;

public abstract class BoundedWaitList<E> extends WaitList<E> {

    public BoundedWaitList(ConcurrentLinkedDeque<E> content) {
        super(content);
    }
    public int capacity;

    public int getCapacity() {
        return capacity;
    }

    public BoundedWaitList(ConcurrentLinkedDeque<E> content, int capacity) {

        super(content);
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "BoundedWaitList{" +
                "capacity=" + capacity +
                '}';
    }
    public abstract void add(E element);
}
