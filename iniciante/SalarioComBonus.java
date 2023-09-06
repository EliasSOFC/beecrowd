import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class SalarioComBonus {
 
    public static void main(String[] args) throws IOException {
 
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        double salFixo = sc.nextDouble();
        double totVendas = sc.nextDouble();
        double comissao = totVendas * 15 / 100;
        double salarioTotal = salFixo + comissao;
        System.out.printf("TOTAL = R$ %.2f\n", salarioTotal);
        
        sc.close();
    }
 
}