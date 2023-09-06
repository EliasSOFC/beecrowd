import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Salario {
 
    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int nHoras = sc.nextInt();
        double vHoras = sc.nextDouble();
        double salario = nHoras * vHoras;
        System.out.println("NUMBER = " + num);
        System.out.printf("SALARY = U$ %.2f\n", salario);

        sc.close();
    }
 
}