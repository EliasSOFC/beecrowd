import java.util.Scanner;
import java.util.Locale;

public class Media2 {
    public static void main (String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();
        double pesoA = 2, pesoB = 3, pesoC = 5;
        double somaP = pesoA + pesoB + pesoC;
        double MEDIA = (A * pesoA + B * pesoB + C * pesoC) / somaP;
        System.out.printf("MEDIA = %.1f\n", MEDIA);
<<<<<<< HEAD
        
=======

>>>>>>> a4adf0b20f2d14c590fdb4f17c2faf40a2b3acd4
        sc.close();
    }
}
