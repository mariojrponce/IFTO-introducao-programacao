import java.util.Scanner;

public class Cripto {
    
    public static void main(String[] args) {
        // declaração e inicialização das variáveis (obs: a variável criptografia é inicializada com " " pois conta como 0)
        String palavra, criptografia = " ";

        // leitura
        Scanner dd = new Scanner(System.in);
        // impressão
        System.out.print("Informe uma palavra: ");
        // atribuição
        palavra = dd.nextLine();

        // laço de repetição
        for(int i = 0; i <palavra.length(); i++){
            char letra = palavra.charAt(i);

            /*condicional que fará a seguinte execução:
             * caso a letra inserida esteja entre a e z ou A e Z, o programa fará a soma de criptografia (que antes era vazio) com a letra inserida
             * sendo essa executada conforme o laço
             */
            if(letra == 'z'){
                criptografia += 'a';
            }else if(letra == 'Z'){
                criptografia += 'A';
            }else{
                /*
                 * senao, os caracteres inteiros realizarão a soma continua de cada caracter introduzido pelo usuário
                 * sendo feito, até o fim do programa, a soma de cada caracter convertido de int para char, a próxima letra para a criptografia
                 */
                int caracter = (int)letra;
                int prox_caracter = caracter + 1;
                criptografia += (char)prox_caracter;
            }
        }

        System.out.println("Saida: " + criptografia);
    }
}