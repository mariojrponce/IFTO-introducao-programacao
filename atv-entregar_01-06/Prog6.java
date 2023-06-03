import java.util.Scanner;

public class Prog6 {
    int x;

    public boolean positivoNegativo() { // Método1
        if (x >= 0)
            return true; // Número positivo
        else
            return false; // Número negativo
    }

    public boolean parImpar() { // Método2
        if (x % 2 == 0)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner dd = new Scanner(System.in);

        System.out.print("Informe o número: ");
        int x = dd.nextInt();

        Prog6 programa = new Prog6(); // Cria uma instância da classe Prog6
        programa.x = x; // Atribui o valor de x à variável de instância x

        if (programa.positivoNegativo())
            System.out.println(x + " é positivo");
        else
            System.out.println(x + " é negativo.");

        if (programa.parImpar())
            System.out.println(x + " é par");
        else
            System.out.println(x + " é ímpar");
    }
}