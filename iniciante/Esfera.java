import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Esfera{
 
    public static void main(String[] args) throws IOException {
 
 		Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int raio = sc.nextInt();
        double pi = 3.14159;
        double volume = (4/3.0) * pi * Math.pow(raio, 3);
        System.out.printf("VOLUME = %.3f\n", volume);

        sc.close();
 
    }
 
}