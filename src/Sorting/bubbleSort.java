package Sorting;
import java.util.*;
public class bubbleSort {

    static int[] data = {10,15,3,8,2};

    public static int[] bubbleSort(int[] data){
        for (int i = 0; i < data.length;i++){
            for(int j = 0; j < data.length;j++){
                if(data[j] < data[i]){
                    int temp = data[j];
                    data[j] = data [i];
                    data[i] = temp;
                }
            }
        }
        return data;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(bubbleSort(data)));
    }
}
