package Day1;//Standard input သင်ခန်းစာ
//user ရိုက်ထည့်လိုက်သော data များကို input အနေနဲ့ဖတ်ရန် Scanner ကို အသုံးပြုရပါသည်။
// java.util.Scanner ဆိုသည့် java library ကို import  လုပ်ပေးရန်လိုအပ်ပါသည်။
import java.util.Scanner;
public class lesson3standardInput {

    public static void main(String args[])
    {
        Scanner name=new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String myName= name.next();

        Scanner age=new Scanner(System.in);
        System.out.print("Please enter your age: ");
        String myAge= age.next();

        System.out.println("Your name is "+myName);
        System.out.println("Your age is "+myAge);
    }
}
