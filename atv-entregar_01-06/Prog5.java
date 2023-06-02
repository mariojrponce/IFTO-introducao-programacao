import java.util.Scanner;

public class Prog5 {
    int x;

    public void positivoNegativo() { // Método1
        if (x >= 0)
            System.out.println(x + " é positivo");
        else
            System.out.println(x + " é negativo.");
    }

    public void parImpar() { // Método2
        if (x % 2 == 0)
            System.out.println(x + " é par");
        else
            System.out.println(x + " é ímpar");
    }

    public static void main(String[] args) {
        Scanner dd = new Scanner(System.in);

        System.out.print("Informe o número: ");
        int x = dd.nextInt();

        Prog5 programa = new Prog5(); // Cria uma instância da classe Prog5
        programa.x = x; // Atribui o valor de x à variável de instância x

        programa.positivoNegativo();
        programa.parImpar();
    }
}

