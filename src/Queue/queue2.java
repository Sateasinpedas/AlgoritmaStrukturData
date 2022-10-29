package Queue;
import java.io.*;
import java.util.*;
public class queue2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Queue<Character> queue = new LinkedList<>();
        Queue<Character> temp1 = new LinkedList<>();
        Queue<Character> temp2 = new LinkedList<>();
        String kalimat = input.nextLine();
        int jumlah = input.nextInt();

        for(int i = 0; i < kalimat.length(); i++){
            queue.add(kalimat.charAt(i));
        }
        for(int i = 0; i < jumlah; i++){
            for(int j = 0; j < (int) Math.ceil(kalimat.length() / 2.0); j++){
                temp1.add(queue.remove());
            }
            while(!queue.isEmpty()){
                temp2.add(queue.remove());
            }

            for(int j = 0; j<kalimat.length(); j++){
                if(j % 2 == 0){
                    queue.add(temp1.remove());
                } else{
                    queue.add(temp2.remove());
                }
            }
        }
        System.out.println(queue.toString().replace("[", "").replace("]", "").replace(", ", ""));
    }
}