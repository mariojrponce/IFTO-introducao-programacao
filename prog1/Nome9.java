public class Nome9 {
    public static void main(String[] args) {
        int x[] = {1,2,3,5,6,7,8};
        int aux=0;

        for(int i=1; i<=5; i+=2){
            aux = x[i];
            x[i] = x[6-i+1];
            x[6-i+1] = aux;
        }
        for(int i=0; i<=6; i++){
            System.out.print(x[i]+" ");
        }
        System.out.println();
    }
}
