package BinaryTree;

public class Main {
    public static void main(String[] args) {
        pohonBiner<String> p = new pohonBiner<>("/");

        p.root.left = new Node<String>("*");
        p.root.right = new Node<String>("+");

        p.root.left.left = new Node<String>("+");
        p.root.left.right = new Node<String>("-");

        p.root.left.left.left = new Node<String>("a");
        p.root.left.left.right = new Node<String>("b");

        p.root.left.right.left = new Node<String>("c");
        p.root.left.right.right = new Node<String>("d");

        p.root.right.left = new Node<String>("e");
        p.root.right.right = new Node<String>("f");

        //print preOrder
        System.out.println("PreOrder");
        p.preOrder(p.root);System.out.println();
        System.out.println();

        //print inOrder
        System.out.println("In Order");
        p.inOrder(p.root);System.out.println();
        System.out.println();

        //print postOrder
        System.out.println("Level Order");
        p.postOrder(p.root); System.out.println();
        System.out.println();

        //print levelOrder
        System.out.println("LevelOrder");
        p.levelOrder(p.root); System.out.println();
    }
}

