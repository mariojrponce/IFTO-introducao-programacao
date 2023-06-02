//Refaça os códigos Atividade a Prog6 alterando os métodos positivoNegativo e parImpar para métodos de objetos.
import java.util.Scanner;

public class Prog3{
    public boolean positivoNegativo(int x) { // Método1
        if (x >= 0)
            return true; // Número positivo
        else
            return false; // Número negativo
    }

    public boolean parImpar(int x) { // Método2
        if (x % 2 == 0)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner dd = new Scanner(System.in);

        System.out.print("Informe o número: ");
        int x = dd.nextInt();

        Prog3 programa = new Prog3(); // Cria uma instância da classe Atividade

        if (programa.positivoNegativo(x))
            System.out.println(x + " é positivo");
        else
            System.out.println(x + " é negativo.");

        if (programa.parImpar(x))
            System.out.println(x + " é par");
        else
            System.out.println(x + " é ímpar");
    }
}