/*
 * Faça uma aplicação Java, que no método main seja
 *  digitada uma palavra e que este chame um método que
 *  retorne:
 * a quantidade de vogais 
 * e outro método que retorne a quanitade de consoantes. 
 * O método main deve  apresentar esses dados na tela.
 * EXEMPLO DE COMO FAZER TUDO DENTRO DO MÉTODO MAIN
*/

import java.util.Scanner;

public class Prog1 {

    public static int contVogais(char p[]){
        int contV=0;
        for(char x: p)
            if(x== 'a'|| x == 'e' || x== 'i' || x=='o' || x== 'u' )
                contV++;
        return contV; 
    }

    public static int contCons(char p[]){
        int contC=0;
        for(char x: p)
            if(x!= 'a'&& x != 'e' && x!= 'i' && x!='o' && x!= 'u' )
                contC++;
        return contC;
    }

    public static void main(String[] args) {
        Scanner dd = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        char p[] = dd.next().toLowerCase().toCharArray();
        System.out.print("Na palavra ");
        System.out.print(p);
        System.out.println(" "+ "existem "+contVogais(p)+ " vogais e " + contCons(p) + " consoantes.");
    }
}