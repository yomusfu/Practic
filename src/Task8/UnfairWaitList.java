package Task8;

import java.util.concurrent.ConcurrentLinkedDeque;

public abstract class UnfairWaitList <E> extends  WaitList<E>{

    public UnfairWaitList(ConcurrentLinkedDeque<E> content) {
        super(content);
    }

    public void remove(E element){};
    public void moveToBack(E element){};
}
