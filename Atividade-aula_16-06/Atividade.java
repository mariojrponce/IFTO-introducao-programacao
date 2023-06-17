/*
Faça uma aplicação que receba do usuário duas palavras, via instrução contida no método main ou parâmetro via parâmetro 
do método main. O método main deve chamar um método que intercadei os caracteres dessa palavra. 
A nova palavra formada deverá ser apresentada na tela via instrução contida no método main. 
Ex: 
palavra1: casa
palavra2: mesa
Resultado:
cmaessaa 
*/

public class Atividade{

    public static void validarEntrada(String args[]){
        if(args.length !=2){
            System.out.println("Ausência de parâmetros (informe as palavras)");
            System.exit(0);
        }
    }

    public static String intercalar(String args[]){
        int lim;
        String nv="";
        if(args[0].length() > args[1].length())
            lim = args[0].length();
        else 
            lim = args[1].length();
        for (int i = 0; i < lim; i++) {
            if(i < args[0].length())
                nv +=args[0].charAt(i);
            if(i < args[1].length())
                nv +=args[1].charAt(i);
        }
        return nv;
    }
    public static void main(String[] args) {
        validarEntrada(args);
        String res = intercalar(args);
        System.out.println("Nova palavra: "+res);
    }
}