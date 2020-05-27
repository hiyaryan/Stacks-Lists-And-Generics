import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.Iterator;

/*
public interface Iterable<T>
Implementing this interface allows an object to be the target of the "for-each loop" statement.
 */
public class Stack<Item> implements Iterable<Item> {
    private Item[] data;
    private int n = 0;

    public Stack() {

        /*
        Use a default constructor with a chosen cap to avoid errors of user chosen cap
         */
        data = (Item[]) new Object[100];
    }

    /*
    isEmpty is O(1) constant time: it checks only 1 element every time it is called
     */
    public boolean isEmpty() {
        return n == 0;
    }

    /*
    push is O(n) linear time: copyOf in resize copies each element to a new array
     */
    public void push(Item item) {
        if(data.length == n)
            resize();
        data[n++] = item;
    }

    /*
    pop is O(1): it removes only 1 element every time it is called
     */
    public Item pop() {
        if(isEmpty())
            throw new EmptyStackException();
        return data[--n];
    }

    /*
    copyOf is O(n): it has to make a copy of each element in the array
     */
    private void resize() {
        data = Arrays.copyOf(data, data.length * 2);
    }

    public Iterator<Item> iterator() {
        return new ReverseArrayIterator();
    }

    private class ReverseArrayIterator implements Iterator<Item> {
        private int i = n;
        public boolean hasNext() { return i > 0; }
        public Item next() { return data[--i]; }
        public void remove() {}
    }
}

/*
Iterator<T>	iterator()
Returns an iterator over elements of type T.

public interface Iterator<Item> {
    boolean hasNext(); // true if there is another element
    Item next(); // returns next object (advances)
    void remove(); // "safe" way to remove elements
}
 */

/*
Linked List
    Concept: Recursive data
    Classes that refer to themselves (similarly to how methods can call themselves)
        class Node { Node next; } // This class is self-referential

    def. Node - the term given to an object in a linked list
    A node contains a REFERENCE to another node (it does not contain a node)

    ([Node]->[Node]->[Node])list // each Node stores a reference to the next
 */