
public class Prog{
    public static void main(String[] args) {
        if(args.length == 0){
            System.out.println("Falta parâmetro.");
            System.exit(0);
        }
        char pl[] = args[0].toLowerCase().toCharArray();
        int contV=0;
        for(int i=0; i< pl.length; i++){
            if(pl[i] == 'a' || pl[i] == 'e' || pl[i] == 'i' ||
            pl[i] == 'o' || pl[i] == 'u')
                contV++;
        }

        System.out.println("Na palavra "+args[0] + " existem " + contV + " vogais");
    }
}
