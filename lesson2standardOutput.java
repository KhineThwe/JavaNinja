package Day1;

//Standard output သင်ခန်းစာ
//နည်း၃မျိုးကို အသုံးပြု၍ console ပေါ်မှာ outputထုတ်ယူနိုင်ပါသည်။
//System.out.println();
//System.out.print();
//System.out.printf();
public class lesson2standardOutput {

    public static void main(String args[])
    {
        //program သည် main ကနေမှ စအလုပ်လုပ်သည်။
        //print ၏ လုပ်ဆောင်ချက်သည် output ကို တစ်လိုင်းမဆင်းစေဘဲ တစ်လိုင်းထဲတွင်ပေါ်စေသည်။
        System.out.print("Hello, World!!!");
        //println ၏ လုပ်ဆောင်ချက်သည် output ကို တစ်လိုင်းဆင်းစေ၍ ပေါ်စေသည်။
        System.out.println("Welcome to NCC");
        //printf ကို format ကျကျပေါ်စေလိုသော အခါမျိုးတွင်အသုံးပြုသည်။
        System.out.printf("Output of data is %d", 3);
        System.out.printf("Hello %s!%n", "World");
    }
}
