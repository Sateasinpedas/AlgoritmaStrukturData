package three;
import java.util.*;

public class pohon<T> {
    Node root;
    int level;
    int height = this.level;

    public pohon(Node root) {
        this.root = root;
    }

    public pohon(T data) {
        this.root = new Node<T>(data);
    }

    public void telusur(Node<T> node) {
        Node<T> currentNode =
                node == null ? this.root : node;

        System.out.println(currentNode.data);

        for(Node<T> childNode : currentNode.children) {
            telusur(childNode);
        }

    }

    public Node<T> cantolin(Node<T> parent, Node<T> child) {
        parent.children.add(child);
        return child;
    }

    public Node<T> cariNode(Node<T> parent, T data) {
        if (parent.data == data) return parent;
        for(Node<T> childNode : parent.children) {
            Node<T> tempNode = cariNode(childNode, data);
            if(tempNode != null) return tempNode;
        }
        return null;
    }


    public void findParent(Node<T> parent, T data){
        Node <T> current = parent.children == null ? this.root : parent;

        for (Node<T> currentNode : current.children){
            if(currentNode.data == data){
                System.out.println("Parent: " + parent.data);
                break;
            }
            else findParent(currentNode, data);
        }
    }

    public void LeafNode(Node<T> parentNode){
        LinkedList<Node> Link = new LinkedList<>();

        for(Node<T> currentNode : parentNode.children){
            if(currentNode.children.size() == 0) Link.add(currentNode);
            else LeafNode(currentNode);
        }
        for(Node<T> current : Link) {
            System.out.println("Leaf: " + current.data);
        }
    }

    public int HeightNode(Node<T> parent, Node<T> currentNode){
        int counter = this.level;

        for(Node<T> current: parent.children){
            counter--;

            if (currentNode.data == current.data){
                this.height = counter;
                System.out.println("Height is: " + counter);
                break;
            }
        }
        return this.height;
    }
        public int NodeLevel (Node<T> parent, Node<T> currentNode){
            int counter = 0;

            for(Node<T> current: parent.children){
                counter++;

                if(currentNode.data == current.data){
                    this.level = counter;
                    break;
                }
                NodeLevel(current, currentNode);
            }
            return counter;
        }
}
