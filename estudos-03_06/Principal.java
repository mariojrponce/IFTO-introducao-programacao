class SuaClasse {
    Integer pos;
    String palavra;
    Float numero;
    Boolean condicao;
}

public class Principal {
    public static SuaClasse lerDados() {
        SuaClasse suaClasse = new SuaClasse();

        // Ler os dados da classe do usuário
        // Exemplo:
        suaClasse.pos = 1;
        suaClasse.palavra = "Exemplo";
        suaClasse.numero = 3.14f;
        suaClasse.condicao = true;

        return suaClasse;
    }

    public static void imprimirMatriz(SuaClasse[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                imprimir(matriz[i][j]);
            }
            System.out.println(); // Pula para a próxima linha após imprimir uma linha completa
        }
    }

    public static void imprimir(SuaClasse suaClasse) {
        System.out.print("pos: " + suaClasse.pos + " ");
        System.out.print("palavra: " + suaClasse.palavra + " ");
        System.out.print("numero: " + suaClasse.numero + " ");
        System.out.print("condicao: " + suaClasse.condicao + " ");
    }

    public static void main(String[] args) {
        SuaClasse[][] matriz = new SuaClasse[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = lerDados();
            }
        }

        imprimirMatriz(matriz);
    }
}
