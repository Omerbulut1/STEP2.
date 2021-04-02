package STEP2;

public class A1_IfElse {
    public static void main(String[]args){
        int Sayi_1=2, Sayi_2=5;
        boolean kosul= Sayi_1<Sayi_2;
        if (!kosul){ //! isareti kosulu her seyi tersine cevirir.
            System.out.println("Sayi_1<Sayi_2");
        }
        else { // else ise () gerek yok ama else if ise () bunu kullanmak sart.
            System.out.println("Sayi_1>=Sayiu_2");
        }



        int Sayi_3=10, Sayi_4=20;
        if(Sayi_3<Sayi_4){
            System.out.println("Sayi_3 < Sayi_4");
        }
        else if(Sayi_3==Sayi_4){
            System.out.println("Sayi_3 = Sayi_4");
        }
        else{
            System.out.println("Sayi_3 > Sayi_4");
        }
    }





}
