import java.util.Scanner;

public class Atv1 {
    public static void main(String[] args) {
        //Declaração da variável
        String palavra;
        int numero = 0, outros = 0, letras = 0;

        //instancia para leitor
        Scanner dd = new Scanner(System.in);

        //Apresenta na tela para usuario digitar a palavra
        System.out.println("Informe uma palavra ou frase? ");
        palavra = dd.nextLine();

        //Verifica se tem 4 caracteres
        if(palavra.length() > 4){
            System.out.println("Entrada maior que permitido");
        }
        else{
            //Laço de repetição para percorrer o tamanho da palavra por meio do lenght()
            for(int i = 0; i<palavra.length(); i++){
                char array[] = new char[palavra.length()];
                array[i] = palavra.charAt(i);
    
                int caracterAscii = palavra.charAt(i);
    
                if(caracterAscii >= 32 && caracterAscii <= 47 || caracterAscii >= 58 && caracterAscii <= 64 || caracterAscii >= 91 && caracterAscii <= 96 || caracterAscii >= 123 && caracterAscii <= 127){
                    outros++;
                }else if(caracterAscii >= 48 && caracterAscii <= 57){
                    numero++;
                }else if(caracterAscii >= 65 && caracterAscii <= 90 || caracterAscii >= 97 && caracterAscii <= 122){
                    letras++;
                }else{
                    System.out.println("A palavra ou frase digitada é invalida!");
                }
            }
    
            System.out.println(palavra);
            System.out.println("Caracter(es): "+letras+"\nNúmero(s): "+numero+"\nOutros: "+outros);

        }
    }
}