package Task8;

import java.util.concurrent.ConcurrentLinkedDeque;

public class WaitList <E>{
    protected ConcurrentLinkedDeque<E> content;

    @Override
    public String toString() {
        return "WaitList{" +
                "content=" + content +
                '}';
    }

    public WaitList(ConcurrentLinkedDeque<E> content) {

        this.content = content;
    }
}
