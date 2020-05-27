/**
 * Generic stack implementation.
 */

/**
 *
 * @param <Item>
 */

public class FixedCapacityStack<Item> {
    private Item[] data;
    private int n = 0;

    public FixedCapacityStack(int cap) {
        data = (Item[]) new Object[cap];
    }

    public boolean isEmpty() {
        return n == 0;
    }

    public void push(Item item) {
        data[n++] = item; // accessing index then incrementing
    }

    public Item pop() {
        return data[n--]; // accessing index then decrementing
    }

    public int size() {
        return n;
    }
}

/*
Ex. usage
    FixedCapacityStack st = new FixedCapacityStack<Integer>();
 */

// Java roughly rewrites FixedCapacityStack<Integer>() in a new class as

/*
public class FixedCapacityStack$0 {
    private Integer[] data;
    private int n = 0;

    public FixedCapacityStack$0(int cap) {
        data = (Integer[]) new Object[cap];
    }

    public boolean isEmpty() {
        return n == 0;
    }

    public void push(Integer item) {
        data[n++] = item; // accessing index then incrementing
    }

    public Integer pop() {
        return data[n--]; // accessing index then decrementing
    }

    public int size() {
        return n;
    }
}
 */