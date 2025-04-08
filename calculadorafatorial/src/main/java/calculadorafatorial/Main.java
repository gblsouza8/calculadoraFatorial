package calculadorafatorial;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numero;
        int i;
        int numero1;


        Scanner input = new Scanner(System.in);
        System.out.println("Insira um número: ");
        numero = input.nextInt();
        input.close();

        numero1 = numero;
        for (i = numero - 1; i >= 1; i--)
        {
            numero1 = numero1*i;
        }

        System.out.printf("%s%d%s%d", "A fatorial de ", numero, " é: ", numero1);
        

    }
}