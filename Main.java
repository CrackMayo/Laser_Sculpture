import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int h = in.nextInt();
        int l;

        while(h != 0){
            l= in.nextInt();
            in.nextLine();
            int[] vector= new int [l];
            for (int i = 0; i < vector.length; i++) {
                vector[i]=in.nextInt();
            }
            int contador=0;
            int actual = h;
            for (int i = 0; i < vector.length; i++) {
                if(vector[i]<actual){
                    contador += actual - vector[i];
                }
                actual = vector[i];
            }
            System.out.println(contador);
            h = in.nextInt();
        }
    }

}
