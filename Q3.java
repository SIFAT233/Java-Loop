import java.util.Scanner;
public class Q3 {
    public static void main(String args[]){
        Scanner src=new Scanner(System.in);
        int ok=src.nextInt();
        for(int sifat=1;sifat<=ok;sifat++){
        System.out.printf(" %d",sifat%2);
        }
    }
    
}
