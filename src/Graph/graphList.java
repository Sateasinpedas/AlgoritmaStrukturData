package Graph;

import java.util.*;

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

    public static Stack<Integer> stack = new Stack<>();
    public static Set<Integer> visited = new HashSet<>();
    public static Queue<Integer> queue = new LinkedList<>();

    public void dfs(int v) {
        stack.push(v);
        System.out.printf("%3d",v);
        visited.add(v);
        for(int i = 0; i < adj.get(v).size();i++){
            int neighbor = adj.get(v).get(i);
            if (!visited.contains(neighbor)){
                dfs(neighbor);
            }
        }
        stack.pop();
    }

    public void bfs(int v){
        queue.add(v);
        visited.add(v);
        System.out.printf("%3d", v);
        while(!queue.isEmpty()){
            int current = queue.remove();
            visited.add(current);
            for (int i = 0; i < adj.get(current).size();i++){
                int neighbor = adj.get(current).get(i);
                if(!visited.contains(neighbor)) {
                    queue.add(neighbor);
                    visited.add(neighbor);
                    System.out.printf("%3d", neighbor);
                }
            }
        }
    }
}



