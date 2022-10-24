package three;
import java.util.*;

public class Node<T> {
    T data;
    List <Node> children;

    public Node(T data){
        this.data = data;
        this.children = new LinkedList<Node>();
    }
}
