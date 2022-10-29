import java.io.*;
import java.util.*;

public class stak1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        Stack<String> stackin= new Stack<String>();
        int n = input.nextInt();
        input.nextLine();
        
        for(int i=0;i<n;i++){
            String x = input.nextLine();
            String[] splitter = x.split(" ", 2);
            
            if(splitter[0].equalsIgnoreCase("TARUH")){
                 stackin.push(splitter[1]);
                }
            else if(splitter[0].equalsIgnoreCase("Ambil")){
                stackin.pop();
            } else if(splitter[0].equalsIgnoreCase("Lihat")){
                System.out.println(stackin.toString().replace("[", "").replace("]", ""));
            }
        }
    }
}