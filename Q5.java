import java.util.Scanner;
public class Q5 {
    public static void main(String args[])
    {
        Scanner src=new Scanner(System.in);
        int x;
        int a=src.nextInt();
        int b=src.nextInt();
        for( ; a!=b ; ){
            System.out.print(",");
        if (a<b) {
            System.out.print(""+(a*a));
            a++;
        }
        else {
        System.out.print(""+(b*b));
        b++;
    }
    }
    if(a==b)
    {
        System.out.println(",Reached.");
    }
}
}
