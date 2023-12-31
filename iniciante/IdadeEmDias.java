import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class IdadeEmDias {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        int idadeEmDias = sc.nextInt();
        int anos = idadeEmDias / 365;
        int restoEmDias = idadeEmDias % 365;
        int meses = restoEmDias / 30;
        int dias = restoEmDias % 30;
        System.out.println(anos + " ano(s)");
        System.out.println(meses + " mes(es)");
        System.out.println(dias + " dia(s)");
        
        sc.close();
 
    }
 
}