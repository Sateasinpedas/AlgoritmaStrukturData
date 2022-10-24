package three;

public class PohonApp {
        public static void main(String[] args) {

            pohon<String> p = new pohon<String>("H");

            p.cantolin(p.root, new Node("D"));
            p.cantolin(p.root, new Node("K"));

            // cari Node D dari root.
            Node<String> nodeD = p.cariNode(p.root, "D");

            if  (nodeD != null) {
                p.cantolin(nodeD, new Node("F"));
                p.cantolin(nodeD, new Node("B"));
            }

            Node<String> nodeF = p.cariNode(p.root, "F");
            if (nodeF != null) {
                p.cantolin(nodeF, new Node("G"));
                p.cantolin(nodeF, new Node("E"));
            }

            Node<String> nodeB = p.cariNode(p.root, "B");
            if (nodeB != null) {
                p.cantolin(nodeB, new Node("A"));
                p.cantolin(nodeB, new Node("C"));
            }

            p.telusur(p.root);

            p.findParent(p.root, "C");
            p.findParent(p.root, "A");
            p.NodeLevel(p.root, nodeB);
            p.LeafNode(p.root);
            p.HeightNode("A",)
//            System.out.println("All leaf nodes are " + p.LeafNode(p.root);


        }
    }

