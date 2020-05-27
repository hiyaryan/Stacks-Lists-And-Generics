import org.w3c.dom.Node;

public class SomeClass<Element> {
    public Element value;
    public Node next;

    public void main() {

        // How to define a type in a generic class:
        // Must use an object type (not primitive)
        SomeClass<Integer> x = new SomeClass<Integer>();
        SomeClass<String> y = new SomeClass<String>();
    }
}