import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double pesoA = 3.5, pesoB = 7.5;
        double somaP = pesoA + pesoB;
        double MEDIA = (A * pesoA + B * pesoB) / somaP;
        System.out.printf("MEDIA = %.5f\n", MEDIA);
        sc.close();
 
    }
 
}