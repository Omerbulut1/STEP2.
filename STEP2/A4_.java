package STEP2;
import java.util.Scanner;


public class A4_ {
    public static void main(String [] args){
        Scanner input= new Scanner(System.in);

        int kok1,kok2,b,c;

        System.out.println("kokleri giriniz");
        kok1=input.nextInt();
        kok2=input.nextInt();

        kok1*=(-1);
        kok2*=(-1);

        b=kok1+kok2;
        c=kok1*kok2;

        System.out.println("Denklem= X^2 +(  " + b + "x ) + (" + c + " )");

    }
}
