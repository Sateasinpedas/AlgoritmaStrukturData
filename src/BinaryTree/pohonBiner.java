package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class pohonBiner<T> {
    Node<T> root;

    public pohonBiner(T data){
        this.root = new Node<T>(data);
    }

    public void preOrder(Node<T> node){
        if (node == null)
            return;

        System.out.printf("%3s", node.data);
        preOrder(node.left);
        preOrder(node.right);
    }

    public void inOrder(Node<T> node){
        if (node == null)
            return;

        inOrder(node.left);
        System.out.printf("%3s", node.data);
        inOrder(node.right);

    }

    public void postOrder(Node<T> node){
        if (node == null)
            return;

        postOrder(node.left);
        postOrder(node.right);
        System.out.printf("%3s", node.data);
    }

    public void levelOrder(Node<T> node){

        //Queue yang diantrikan merupakan Node yang bertipe data T
        Queue<Node<T>> queue = new LinkedList<>();
        queue.add(node);
        while(queue.peek() != null){
            Node<T> n = queue.poll();
            System.out.printf("%3s", n.data);
            if(n.left != null) queue.add(n.left);
            if(n.right != null) queue.add(n.right);
        }


    }
}
