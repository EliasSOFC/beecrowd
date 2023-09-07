import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class OMaior {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int maiorAB = (a + b + Math.abs(a - b)) / 2;
        if (maiorAB > c) {
            System.out.println(maiorAB + " eh o maior");
        } else {
            System.out.println(c + " eh o maior");
        }

        sc.close();
 
    }
 
}