import java.util.Scanner;
public class Q1 {
    public static void main(String args[])
    {
        Scanner src=new Scanner(System.in);
        int sifat=src.nextInt();
        for(int p=1;p<=sifat;p++)
        { 
            System.out.printf(" %d ",+p);
            if(p<sifat)
            {
                System.out.printf(",");
            }
        }
    }
}
