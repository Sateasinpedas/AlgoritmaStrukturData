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

    public LinkedList<Node> nonLeafNode(Node<T> parentNode){
        LinkedList<Node> Linked = new LinkedList<>();

        if(parentNode == this.root && this.root.children.size() !=0){
            Linked.add(parentNode);
        }

        for(Node<T> currentNode : parentNode.children){
            if(currentNode.children.size() != 0) Linked.add(currentNode);
            nonLeafNode(currentNode);
        }
        for(Node<T> currentNode : Linked) {
            System.out.println("Non Leaf: " + currentNode.data);
        }
        return Linked;
    }
//    public int HeightNode(Node<T> parent, Node<T> currentNode){
//        int counter = this.level;
//
//        for(Node<T> current: parent.children){
//            counter--;
//
//            if (currentNode.data == current.data){
//                this.height = counter;
//                System.out.print("Height node is: " );
//                break;
//            }
//        }
//        return this.height;
//    }
//        public int NodeLevel (Node<T> parent, Node<T> currentNode){
//            int counter = 0;
//
//            for(Node<T> current: parent.children){
//                counter++;
//
//                if(currentNode.data == current.data){
//                    this.level = counter;
//                    break;
//                }
//                NodeLevel(current, currentNode);
//            }
//            return counter;
//        }

        public void Siblings (Node<T> parentNode, T data  ){
        LinkedList<Node> siblingNode = new LinkedList<>();

        for(Node<T> currentNode : parentNode.children){
            if(currentNode.data == data) {
                siblingNode.addAll(parentNode.children);
                break;
            } else Siblings(currentNode,data);

            if(siblingNode.size() != 0){
                for(Node S : siblingNode){
                    if( S.data != data){
                        System.out.println("Siblings: " + S.data);
                    }
                }
            }

        }
        }
        public void findDescedants(Node<T> parent){
        if(parent!= null){
            for(Node<T> currentNode : parent.children){
                System.out.println("Descedant: " +currentNode.data);
                findDescedants(currentNode);
            }
        } else
            System.out.println("Parent gabole kosong");
        }

        public void ancestors(Node<T> parent, T data) {
            Node<T> nodeAncestor = null;

            if (!data.equals(this.root.data))
                System.out.println("Ancestor: " + nodeAncestor.data);
            ancestors(this.root, nodeAncestor.data);
        }
}


