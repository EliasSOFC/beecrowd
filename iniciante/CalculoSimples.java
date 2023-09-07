import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class CalculoSimples {
 
    public static void main(String[] args) throws IOException {
 
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int cod1 = sc.nextInt();
        int nP1 = sc.nextInt();
        double vP1 = sc.nextDouble();
        int cod2 = sc.nextInt();
        int nP2 = sc.nextInt();
        double vP2 = sc.nextDouble();
        double total = (nP1 * vP1) + (nP2 * vP2);
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);
    }
 
}