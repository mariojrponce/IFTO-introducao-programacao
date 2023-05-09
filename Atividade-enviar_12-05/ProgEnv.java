public class ProgEnv {
    public static void main(String[] args) {
        // Vetor de entrada
        int[] vetor = {1, 6, 3, 2, 7};

        // Realiza a ordenação do vetor sem utilizar o método sort
        int n = vetor.length;
        int temp;
        for(int i = 0; i < n; i++) {
            for(int j = 1; j < (n-i); j++) {
                if(vetor[j-1] > vetor[j]) {
                    temp = vetor[j-1];
                    vetor[j-1] = vetor[j];
                    vetor[j] = temp;
                }
            }
        }

        // Imprime o vetor ordenado
        for(int i = 0; i < n; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println("");
    }
}
