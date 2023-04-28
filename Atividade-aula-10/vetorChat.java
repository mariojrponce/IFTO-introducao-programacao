import java.util.Scanner;

public class vetorChat {
    public static void main(String[] args) {
        // Cria um objeto da classe Scanner para ler a entrada do usuário
        Scanner entrada = new Scanner(System.in);

        // Solicita ao usuário que digite uma palavra de 4 caracteres
        System.out.print("Digite uma palavra de 4 caracteres: ");

        // Lê a palavra digitada pelo usuário
        String palavra = entrada.nextLine();

        // Verifica se a palavra tem exatamente 4 caracteres
        if (palavra.length() != 4) {
            // Caso contrário, exibe uma mensagem de erro
            System.out.println("A palavra deve ter exatamente 4 caracteres!");
        } else {
            // Cria um vetor para armazenar os valores ASCII dos caracteres da palavra
            int[] valores_ascii = new int[4];

            // Preenche o vetor com os valores ASCII dos caracteres da palavra
            for (int i = 0; i < 4; i++) {
                valores_ascii[i] = (int) palavra.charAt(i);
                // Exibe o valor ASCII do caractere atual
                System.out.printf("pl[%d] == %c == %d%n", i, palavra.charAt(i), valores_ascii[i]);
            }

            // Calcula a soma dos valores ASCII
            int soma = 0;
            for (int i = 0; i < 4; i++) {
                soma += valores_ascii[i];
            }

            // Exibe o resultado da soma
            System.out.printf("Soma == %d%n", soma);
        }

        // Fecha o objeto da classe Scanner
        entrada.close();
    }
}
