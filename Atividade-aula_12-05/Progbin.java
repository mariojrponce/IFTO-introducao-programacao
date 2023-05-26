import java.util.Scanner;

/*
    Faça um programa que ao receber um valor decimal
    inteiro e positivo calcule o valor binario referente
    ao número recebido e o apresenta na tela do computador.
*/

public class Progbin{
    public static void main(String[] args) {
        if(args.length == 0){
            System.out.println("Informe número a ser convertido em binário: ");
            return; 
        }

        char v[] = args[0].toCharArray();
        for(int i=0; i< v.length; i++){
            if(v[i] < '0' || v[i] > '9'){
                System.out.println("Informe apenas números:");

            }
        }

        int num = Interger.par
    }
}