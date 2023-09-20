import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class NotasEMoedas {
 
    public static void main(String[] args) throws IOException {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double valorMonetario = sc.nextDouble();
        int valor = 0;
        
        System.out.println("NOTAS:");
        valor = (int) valorMonetario / 100;
        System.out.printf("%d nota(s) de R$ 100.00\n", valor);
        valorMonetario = valorMonetario % 100;

        valor = (int) valorMonetario / 50;
        System.out.printf("%d nota(s) de R$ 50.00\n", valor);
        valorMonetario = valorMonetario % 50;

        valor = (int) valorMonetario / 20;
        System.out.printf("%d nota(s) de R$ 20.00\n", valor);
        valorMonetario = valorMonetario % 20;

        valor = (int) valorMonetario / 10;
        System.out.printf("%d nota(s) de R$ 10.00\n", valor);
        valorMonetario = valorMonetario % 10;

        valor = (int) valorMonetario / 5;
        System.out.printf("%d nota(s) de R$ 5.00\n", valor);
        valorMonetario = valorMonetario % 5;

        valor = (int) valorMonetario / 2;
        System.out.printf("%d nota(s) de R$ 2.00\n", valor);
        valorMonetario = valorMonetario % 2;

        System.out.println("MOEDAS:");

        valorMonetario = valorMonetario * 100;

        valor = (int) valorMonetario / 100;
        System.out.printf("%d moeda(s) de R$ 1.00\n", valor);
        valorMonetario = valorMonetario % 100;

        valor = (int) valorMonetario / 50;
        System.out.printf("%d moeda(s) de R$ 0.50\n", valor);
        valorMonetario = valorMonetario % 50;

        valor = (int) valorMonetario / 25;
        System.out.printf("%d moeda(s) de R$ 0.25\n", valor);
        valorMonetario = valorMonetario % 25;

        valor = (int) valorMonetario / 10;
        System.out.printf("%d moeda(s) de R$ 0.10\n", valor);
        valorMonetario = valorMonetario % 10;

        valor = (int) valorMonetario / 5;
        System.out.printf("%d moeda(s) de R$ 0.05\n", valor);
        valorMonetario = valorMonetario % 5;

        valor = (int) valorMonetario / 1;
        System.out.printf("%d moeda(s) de R$ 0.01\n", valor);
        valorMonetario = valorMonetario % 1;
    }
 
}