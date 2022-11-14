package Graph;

public class graph {

    int adj[][];
    int nv = 0; // number of vertex

    //Constructor
    public graph(int nv) {
        this.nv = nv;
        this.adj = new int[nv][nv];
    }

    public void addEdge(int s, int d){ // s = source d = destination
        this.adj[s][d] = 1;
        this.adj[d][s] = 1;
    }

    public void print(){
        System.out.printf("   ");
        for(int d = 0; d < nv; d++){
            System.out.printf("%3d", d);
        }
        System.out.println();

        for(int s = 0; s < nv; s++){
            System.out.printf("%3d", s);
            for(int d = 0; d < nv; d++)
                System.out.printf("%3d", this.adj[s][d]);
            System.out.println();
        }
    }
}
