package binarySearchTree;

public class Node <T>{
    int key;
    T data;

    Node<T> left;
    Node<T> right;

    public Node(int key, T data){
        this.key = key;
        this.data = data;
    }
}