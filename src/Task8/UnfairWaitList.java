package Task8;

/**
 * Class of queue with added functionality:<br>
 *     <ul>
 *         <li>Removing element from any place of queue by its value;</li>
 *         <li>Moving element <i>(find in queue by value)</i> to the end of queue.</li>
 *     </ul><br>
 *     At all other sides it is simply {@link WaitList}.
 * @param <E> Type of stored data.
 * @see WaitList
 * @author NuskhaevErencen
 * @version 1.0
 */
public class UnfairWaitList<E> extends WaitList<E> {

    public UnfairWaitList() {
        super();
    }

    public void remove (E element){
        // components.remove(element)
        boolean removed = false;
        for(int i = 0; i < components.size(); i++){
            E el = components.remove();
            if(!removed && el.equals(element)){
                removed = true; // i--
            }else{
                components.add(el);
            }
        }
        if(removed){
            components.add(components.remove());
        }
    }

    public void moveToBack(E element){
        int prevSize = components.size();
        remove(element);
        if(components.size() < prevSize){
            components.add(element);
        }

    }
}