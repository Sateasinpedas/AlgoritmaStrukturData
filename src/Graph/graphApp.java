package Graph;

public class graphApp {
    public static void main(String[] args) {
        graph g = new graph(5);
        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(1,3);
        g.addEdge(3,2);
        g.addEdge(1,4);
        g.print();

        System.out.println();
        System.out.println();

        graphList gl = new graphList(5);
        gl.addEgde(0,1);
        gl.addEgde(0,2);
        gl.addEgde(1,3);
        gl.addEgde(3,2);
        gl.addEgde(1,4);
        gl.print();
    }
}
