/*
Stacks
    1. Ordered, allows duplicates
    2. Element access: LIFO "Last-in-first-out"
    3. docs.oracle.com/javase/9/docs/api/java/util/Stack.html

Applications
    1. Undo in text editor
    2. Tab history in browser
    3. Recording and maintaining method calls

    Stack() // create an empty stack
    void push(Item item) // add an item
    Item pop() // remove the most recently added item
    boolean isEmpty() // is the stack empty?
    int size() // number of items in the stack

Stack example 1: Common Stack Methods
    Stack s = new Stack(); // (top)
    s.push(5); // 5 (top)
    s.pop(); // (top)
    s.push(1); // 1 (top)
    s.push(4); // 1 4 (top)
    s.push(0); // 1 4 0 (top)
    s.pop(); // 1 4 (top)

Stack Example 2: Callstack
    During execution, methods call methods, and those methods call more methods
    The calls as well as local data for each call are tracked on the callstack
    A function call is a push while a function return is a pop
 */


// Implementation Example: Simple Stack
// Assumptions: 1. Stores strings
//              2. Can use array to store data
//              3. Methods don't need error handling (generally not a good assumption)
// Need to implement a constructor and four methods (push, pop, isEmpty, and size)
// Design should be mutable (it can be immutable)
//
// Problem: how to represent data?
//          n is the element at the top of a stack
//          n will need to change as push or pop is called
//          if n starts as 0, push can increase and pop can decrease
//
// Initially, n = 0:
//            push: array is updated -> n++
//            push: array is updated -> n++
//            pop: array is updated -> n--

// How to implement a generic stack?
// SomeClass<Type> Lets programmer use 'Type' as a datatype in the
//      definition
//

public class FixedCapacityStringStack {
    /**
     * data: array containing elements
     * n: number of elements in the stack and the index in the array
     *    where the next elements should be placed
     */
    private String[] data;
    private int n = 0;

    public FixedCapacityStringStack(int cap) {
        data = new String[cap];
    }

    public boolean isEmpty() {
        return n == 0;
    }

    public void push(String item) {
        data[n++] = item; // accessing index then incrementing
    }

    public String pop() {
        return data[n--]; // accessing index then decrementing
    }

    public int size() {
        return n;
    }
}