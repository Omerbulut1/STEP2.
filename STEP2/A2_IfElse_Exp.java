package STEP2;
import java.util.Scanner;

public class A2_IfElse_Exp {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        int Sayi1, Sayi2, Secim, Sonuc;
        System.out.println("1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme");
        System.out.println("islem tipi seciniz");
        Secim=input.nextInt();
        System.out.println("birinci sayiyi giriniz");
        Sayi1=input.nextInt();
        System.out.println("ikinci sayiyi giriniz");
        Sayi2=input.nextInt();
        if (Secim==1){
            Sonuc=Sayi1+Sayi2;
            System.out.println("toplama isleminiz sonucu=" + Sonuc);
        }
        else if(Secim==2){
            Sonuc=Sayi1-Sayi2;
            System.out.println("cikarma isleminizin sonucu="+Sonuc);
        }
        else if (Secim==3){
            Sonuc=Sayi1*Sayi2;
            System.out.println("Carpma isleminizin Sonucu="+ Sonuc);
        }
        else if (Secim==4){
            Sonuc=Sayi1/Sayi2;
            System.out.println("Bolme isleminizin sonucu="+ Sonuc);
        }
        else{
            System.out.println("4 Islemden birini seciniz!!!!!");
        }



    }





}
