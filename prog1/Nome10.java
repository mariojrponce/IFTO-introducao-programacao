import java.util.Scanner;

public class Nome10 {
    public static void main(String[] args) {
        int x=0, soma=0, y=0;
        Scanner dd = new Scanner(System.in);
        for(;x<=11;){
            System.out.println("Digite um numero inteiro: ");
            y = dd.nextInt();
            x +=3;
            soma = soma+y;
            break;
        }
        System.out.println("A soma de todos os numeros digitados foi: "+soma);
    }
}
