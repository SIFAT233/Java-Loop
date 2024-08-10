import java.util.Scanner;
public class Q4 {
    public static void main(String args[])
    {
        Scanner src=new Scanner(System.in);
        System.out.println("Tell us how many numbers ypou want to input : ");
        int a =src.nextInt();
        float sum=0;
        for(int s=1;s<=a;s++){
        System.out.println("Input ");
        float x=src.nextFloat();
        sum+=x;
        }
        System.out.println("AVG is : "+(sum/a));
        
    }
    
}
