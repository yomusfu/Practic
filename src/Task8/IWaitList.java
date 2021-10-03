package Task8;

import java.util.Collection;
public interface IWaitList <E>{
    public void add(E element);
    public E remove();
    boolean contains(E element);
    boolean containsAII(Collection<E> c);
    boolean isEmpty();
}
