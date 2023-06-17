/*
Faça um programa que imprima o somatório de todos os números iguais ou inferiores
ao informado pelo usuário 
*/

import java.util.Scanner;

public class Prog1 {
    static int x;
    static long soma;

    public static void somar(){
        soma=0;
        for (int i = x; i >0; i--) {
            soma +=i;
        }
    }

    public static void main(String[] args) {

        Scanner dd = new Scanner(System.in);
        System.out.print("Informe o número: ");
        x = dd.nextInt();


        System.out.println(soma);
      
    }
}