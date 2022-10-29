package UTP;

import java.util.LinkedList;
import java.util.stream.Collectors;
import java.util.Scanner;

import java.util.LinkedList;
import java.util.stream.Collectors;
import java.util.Scanner;

public class ganjilGenap {
    public static LinkedList<Integer> ganjilGenap(LinkedList<Integer> input) {
        /* Lengkapi method ini. Selamat mengerjakan! */
        LinkedList <Integer> genap = new LinkedList<>();
        LinkedList <Integer> ganjil = new LinkedList<>();
        int i = 0;
        while(i < input.size()){
            if(i%2 != 0){
                ganjil.addLast(input.get(i));
            } else {
                genap.addLast(input.get(i));
            }
            i++;
        }

        genap.addAll(ganjil);
        return genap;
    }

    /* Jangan ubah kode di bawah */
    public static void main(String[] args) {
        /* Input data dari testcase */
        String inputLine;
        try (Scanner stdin = new Scanner(System.in)) {
            inputLine = stdin.nextLine();
        }

        /* Konversi data ke dalam Linked List */
        LinkedList<Integer> input = new LinkedList<>();
        try (Scanner parser = new Scanner(inputLine)) {
            while (parser.hasNextInt()) {
                input.add(parser.nextInt());
            }
        }

        /* Memanggil method ganjilGenap, menyimpan hasilnya ke variabel
           output, dan mencetak setiap elemen dipisahkan dengan spasi */
        LinkedList<Integer> output = ganjilGenap(input);
        System.out.println(
                output.stream()
                        .map(Object::toString)
                        .collect(Collectors.joining(" "))
        );
    }
}