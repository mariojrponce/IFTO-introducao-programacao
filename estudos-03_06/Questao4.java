import java.util.Scanner;

class Aluno {
    String nome;
    String disciplina;
    float notaA1;
    float notaA2;
}

public class Questao4 {
    public static float media(Aluno aluno) {
        return (aluno.notaA1 + aluno.notaA2) / 2;
    }
    
    public static String aprovado(Aluno aluno) {
        float media = media(aluno);
        
        if (media >= 7.0) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }
    
    public static void imprimir(Aluno aluno) {
        System.out.println("Nome: " + aluno.nome);
        System.out.println("Disciplina: " + aluno.disciplina);
        System.out.println("Nota A1: " + aluno.notaA1);
        System.out.println("Nota A2: " + aluno.notaA2);
        System.out.println("Média: " + media(aluno));
        System.out.println("Situação: " + aprovado(aluno));
        System.out.println();
    }
    
    public static float mediaTurma(Aluno[] vetorAlunos) {
        float somaMedias = 0;
        int quantidadeAlunos = vetorAlunos.length;
        
        for (int i = 0; i < quantidadeAlunos; i++) {
            somaMedias += media(vetorAlunos[i]);
        }
        
        return somaMedias / quantidadeAlunos;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Aluno[] vetorAlunos = new Aluno[10];
        
        // Preencher os dados dos alunos
        for (int i = 0; i < 10; i++) {
            Aluno aluno = new Aluno();
            
            System.out.println("Digite o nome do aluno " + (i + 1) + ":");
            aluno.nome = scanner.nextLine();
            
            System.out.println("Digite a disciplina do aluno " + (i + 1) + ":");
            aluno.disciplina = scanner.nextLine();
            
            System.out.println("Digite a nota A1 do aluno " + (i + 1) + ":");
            aluno.notaA1 = Float.parseFloat(scanner.nextLine());
            
            System.out.println("Digite a nota A2 do aluno " + (i + 1) + ":");
            aluno.notaA2 = Float.parseFloat(scanner.nextLine());
            
            vetorAlunos[i] = aluno;
            System.out.println();
        }
        
        // Imprimir os dados dos alunos
        for (int i = 0; i < 10; i++) {
            imprimir(vetorAlunos[i]);
        }
        
        // Calcular e imprimir a média geral da turma
        float mediaGeral = mediaTurma(vetorAlunos);
        System.out.println("Média geral da turma: " + mediaGeral);
        
        scanner.close();
    }
}