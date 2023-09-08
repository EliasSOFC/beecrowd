import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class GastoDeCombustivel {
 
    public static void main(String[] args) throws IOException {
 
 		Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int tempo = sc.nextInt();
        int km = sc.nextInt();
        double litros = (km / 12.0) * tempo;
        System.out.printf("%.3f\n", litros);
        
        sc.close();
 
    }
 
}