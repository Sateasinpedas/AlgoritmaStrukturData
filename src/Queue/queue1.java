package Queue;

import java.io.*;
import java.util.*;

public class queue1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);

        Queue<String> dasarQ = new LinkedList<String>();

        int n = input.nextInt();
        input.nextLine();

        for (int i = 0; i < n; i++){
            String m = input.nextLine();

            String [] splitter = new String[3];
            splitter = m.split (" ");
            if(splitter[0].equals("LIHAT")){
                System.out.println(dasarQ.toString().replace("[","").replace("]",""));
            }
            if(splitter[0].equals("TARUH")){
                dasarQ.add(splitter[1]);
            }
            if(splitter[0].equals("AMBIL")){
                dasarQ.remove();
            }
        }
    }
}