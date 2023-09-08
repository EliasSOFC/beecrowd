import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class ConversaoDeTempo {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);

        int segundos = sc.nextInt();

        int horas = segundos / 3600;
        segundos = segundos % 3600;

        int minutos = segundos / 60;
        segundos = segundos % 60;

        int qtdSegundos = segundos;

        System.out.println(horas + ":" + minutos + ":" + qtdSegundos);

        sc.close();
    }
 
}