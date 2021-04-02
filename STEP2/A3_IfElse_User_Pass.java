package STEP2;
import java.util.Scanner;
public class A3_IfElse_User_Pass {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);

        String Kullanici_adi= "Omer", Sifre= "Son1234", User_name, Password;
        System.out.println("kullanici adini giriniz");
        User_name=input.next();
        System.out.println("Sifrenizi giriniz");
        Password=input.next();

        if (Kullanici_adi.equals(User_name)&& Sifre.equals(Password)){
            System.out.println("Sisteme basari ile girdiniz");
        }
        else{
            System.out.println("Kullanici yada sifreyi yanlis giridiniz!!!!!!");
        }




    }
}
