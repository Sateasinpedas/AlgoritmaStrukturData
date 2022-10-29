package Queue;
import java.util.*;

public class coba {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double r = input.nextDouble();
        double phi = 3.14;
        double L = (phi*r);
        double K = (2*phi*r) ;

        System.out.printf("Hasil: " + "%.2f ",K);
        System.out.printf("Hasil: " + "%.2f ",L);

    }
}
