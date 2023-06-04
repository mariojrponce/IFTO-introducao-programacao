class Aluno {
    String nome;
    String disciplina;
    float notaA1;
    float notaA2;
}

public class ProgramaAlunos {
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
    
    public static void main(String[] args) {
        Aluno[] vetorAlunos = new Aluno[10];
        
        // Preencher os dados dos alunos
        for (int i = 0; i < 10; i++) {
            Aluno aluno = new Aluno();
            aluno.nome = "Aluno " + (i + 1);
            aluno.disciplina = "Disciplina " + (i + 1);
            aluno.notaA1 = (float) (Math.random() * 10); // Gerar uma nota aleatória de 0 a 10
            aluno.notaA2 = (float) (Math.random() * 10); // Gerar uma nota aleatória de 0 a 10
            vetorAlunos[i] = aluno;
        }
        
        // Imprimir os dados dos alunos
        for (int i = 0; i < 10; i++) {
            imprimir(vetorAlunos[i]);
        }
    }
}
