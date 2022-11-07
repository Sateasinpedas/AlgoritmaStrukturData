package binarySearchTree;

public class Main {
    public static void main(String[] args) {
        binarySearchTree<String> b = new binarySearchTree<String>();
        b.root = new Node<>(20, "20");
        b.root.left = new Node<>(10, "10");
        b.root.right = new Node<>(47, "47");
        b.root.left.left = new Node<>(6, "6");
        b.root.left.right = new Node<>(15, "15");
        b.root.left.left.left = new Node<>(2,"2");
        b.root.left.left.right = new Node<> (8,"8");
        b.root.left.left.right.left = new Node<>(7,"7");
        b.root.right.right = new Node<>(50,"50");

        System.out.println(b);
        Node<String> k = b.search(50,b.root);
        System.out.println("Node: " + k.data);

        Node<String> m = b.searchMin(b.root);
        System.out.println("Min: " + m.data);

        Node<String> n = b.searchMax(b.root);
        System.out.println("Max: "+ n.data);

        Node<String> l = b.getParent(8,b.root);
        System.out.println("Parent: " + l.data);

        b.delete(b.search(2,b.root));
        b.delete(b.search(15,b.root));

        System.out.println(b);

        b.delete(b.search(8,b.root));
        b.delete(b.search(47,b.root));
        System.out.println(b);
    }
}