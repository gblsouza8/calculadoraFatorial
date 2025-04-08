package calculadorafatorial;
import java.util.Scanner;
// calcula a fatorial do numero inserido pelo usuário
public class Main {
    public static void main(String[] args) {
        // declaração das variaveis que serão utilizadas
        int numero;
        int i;
        int numero1;


        // inicia o scanner, pede um número, armazena na variável numero e fecha o scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Insira um número: ");
        numero = input.nextInt();
        input.close();

        // define o valor da variavel numero1 como igual ao valor da numero
        numero1 = numero;
        // laço for que decrementa realiza o calculo da fatorial
        for (i = numero - 1; i >= 1; i--)
        {
            numero1 = numero1*i;
        }

        // exibe a mensagem com o resultado
        System.out.printf("%s%d%s%d", "A fatorial de ", numero, " é: ", numero1);
        

    }
}