package binarySearchTree;

public class binarySearchTree <T> {
    Node<T> root;

    @Override
    public String toString() {
//        return "binarySearchTree{" + "root=" + root + '}';
        return preOrder(this.root);
    }

    public String preOrder(Node<T> n){
        if(n == null) return "";
        String out = String.format("%3s", n.data);
        out += preOrder(n.left);
        out += preOrder(n.right);
        return out;
    }

    public Node<T> search(int key, Node<T> node){
        Node<T> n = null;
        if (node.key == key) return node;
        if(node.left != null) n = this.search(key, node.left);
        if(n != null) return n;
        if(node.right != null) n = this.search(key, node.right);
        return n;
    }

    public Node<T> searchMin (Node<T> node){
        Node<T> n = null;
        if (node == null) return null;
        n = node;
        while(n.left != null){
            n = n.left;
        }
        return n;
    }

    public Node<T> searchMax (Node<T> node){
        Node<T> n = null;
        if (node == null) return null;
        n = node;
        while(n.right != null){
            n = n.right;
        }
        return n;
    }

    public int getDegree(Node<T> node){
        int degree = 0;
        if (node.left != null) degree++;
        if (node.right != null) degree++;
        return degree;
    }

    public Node<T> getParent(int key, Node<T> node){
        Node<T> n = null;
        if (node.key == key) return null;
        if (node.left != null && node.left.key == key)
            return node;
        else if (node.left != null)
            n = this.getParent(key, node.left);
        if (n != null) return n;

        if(node.right != null && node.right.key == key)
            return node;
        if(node.right != null)
            n = this.getParent(key, node.right);
        return n;
    }
    public void delete(Node<T> node){
        if(node == null) return;
        int degree = this.getDegree(node);

        switch (degree){
            case 0:
                Node<T> parent = this.getParent(node.key,this.root);
                if(parent != null){
                    if(parent.left.key == node.key)
                        parent.left = null;
                    if(parent.right.key == node.key)
                        parent.right = null;
                }
                break;
            case 1:
                Node<T> parent2 = this.getParent(node.key,this.root);
                Node<T> child = (node.left != null) ?
                        node.left : node.right;

                //putuskan node dari parent
                if (parent2.left != null && parent2.left.key == node.key)
                    parent2.left = child;
                else parent2.right = child;

                // putuskan node dari child
                if(node.left != null) node.left = null;
                if(node.right != null) node.right = null;
                break;
        }
    }
}