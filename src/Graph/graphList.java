package Graph;

import java.util.ArrayList;

public class graphList {
    ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
    int nv = 0;
    //ArrayList<Integer> Destination = row
    // Arraylist dari Arraylist<integer> Source = column

    public graphList(int nv){
        this.nv = nv;
        for(int s = 0; s < nv; s++){
            this.adj.add(new ArrayList<Integer>());
        }
    }

    public void addEgde(int s, int d){
        this.adj.get(s).add(d);
        this.adj.get(d).add(s);
    }

    public void print(){
        for(int s= 0; s < adj.size();s++){
            System.out.printf("Row %2d:", s);
            for(int d = 0; d < adj.get(s).size();d++){
                System.out.printf("%3d", adj.get(s).get(d));
            }
            System.out.println();
        }
    }
}



