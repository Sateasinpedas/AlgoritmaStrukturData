package bstSoal;

import java.util.Scanner;


public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        SmallTree st = new SmallTree();

        int n = scan.nextInt();
        scan.nextLine();
        for (int i = 0; i < n; i++) {
            String[] operation = scan.nextLine().split(" ");
            if (!operation[0].equals("TARUH") && st.getRoot() == null) continue;
            switch (operation[0]) {
                case "TARUH" -> st.add(Integer.parseInt(operation[1]));
                case "PREORDER" -> {
                    st.preorder(st.getRoot());
                    System.out.println();
                }
                case "INORDER" -> {
                    st.inorder(st.getRoot());
                    System.out.println();
                }
                case "POSTORDER" -> {
                    st.postorder(st.getRoot());
                    System.out.println();
                }
            }
        }
    }
}

class Node {
    Node left, right;
    int data;
    Node (int data) {
        this.data = data;
    }

}

class SmallTree {
    Node root;
    public Node getRoot() {
        return root;
    }

    public void add(int data)  {
        root = addRecursive(root, data);
    }

    private Node addRecursive(Node root, int data) {
        /* Masukkan kode di sini. Selamat mengerjakan! */
        if(root == null){
            return new Node(data);
        } if (data < root.data){
            root.left = addRecursive(root.left,data);
        } else if (data > root.data){
            root.right = addRecursive(root.right,data);
        } else {
            return root;
        }
        return  root;
    }

    public void preorder(Node t) {
        /* Masukkan kode di sini. Selamat mengerjakan! */
        if (t != null){
            System.out.print(t.data + " ");
            preorder(t.left);
            preorder(t.right);
        }
    }

    public void inorder(Node t) {
        /* Masukkan kode di sini. Selamat mengerjakan! */
        if (t != null){
            inorder(t.left);
            System.out.print(t.data + " ");
            inorder(t.right);
        }
    }

    public void postorder(Node t) {
        /* Masukkan kode di sini. Selamat mengerjakan! */
        if(t != null){
            postorder(t.left);
            postorder(t.right);
            System.out.print(t.data + " ");
        }
    }

}