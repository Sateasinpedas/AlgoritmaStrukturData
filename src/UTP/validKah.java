package UTP;

import java.util.*;

public class validKah {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String isi = input.nextLine();
        isi = isi.replaceAll("[^]\\[{}]", "");

        Stack<Character> validasi = new Stack<>();
        boolean status = true;

        int i = 0;
        while (i<isi.length()){
//        for (int i = 0; i < isi.length(); i++) {
            char isinya = isi.charAt(i);
            if (isinya == '{' || isinya == '[') {
                validasi.push(isinya);
            } if (isinya == '}') {
                if (validasi.isEmpty()) {
                    status = false;
                    break;
                }
                if (validasi.peek() == '{') {
                    validasi.pop();
                } else {
                    status = false;
                    break;
                }
            }
                if (isinya == ']') {
                    if (validasi.isEmpty()) {
                        status = false;
                    break;
                }
                if (validasi.peek() == '[') {
                    validasi.pop();
                } else {
                    status = false;
                    break;
                }
            }
        }
        if (!validasi.isEmpty()) {
            status = false;
        }
        if (status) {
            System.out.println("valid");
        } else {
            System.out.println("tidak valid");
        }
        i++;
    }
}