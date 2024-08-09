import java.util.Scanner;
public class Q2 {
    public static void main(String args[])
    {
        Scanner src=new Scanner(System.in);
        int sifat=src.nextInt();
        for(int p=1;p<=2*sifat-1;p+=2)
        { 
            System.out.printf(" %d ",p);
            if(p<2*sifat-1)
            {
                System.out.printf(",");
            }
        }
    }
}
