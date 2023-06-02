import java.util.Scanner;

public class Prog4 {
    public int positivoNegativo(int x) { // Método1
        if (x >= 0)
            return 1; // Número positivo
        else
            return 0; // Número negativo
    }

    public int parImpar(int x) { // Método2
        if (x % 2 == 0)
            return 1;
        else
            return 0;
    }

    public static void main(String[] args) {
        Scanner dd = new Scanner(System.in);

        System.out.print("Informe o número: ");
        int x = dd.nextInt();

        Prog4 programa = new Prog4(); // Cria uma instância da classe Prog4

        if (programa.positivoNegativo(x) == 1)
            System.out.println(x + " é positivo");
        else
            System.out.println(x + " é negativo.");

        if (programa.parImpar(x) == 1)
            System.out.println(x + " é par");
        else
            System.out.println(x + " é ímpar");
    }
}
