package Day1;//စက်ဝိုင်း တစ်ခုရဲ့ area ရှာသည့် ပုံသေနည်းသည် are = Pi r2 ဖြစ်သည့် အတွက်
//pi တန်ဘိုးနှင့် r2 ရဲ့မြှောက်ခြင်း ဖြစ်ပါတယ်။
// pi တန်ဘိုးသည် 3.1415 ဖြစ်သည့် အတွက် r တန်ဘိုးကိုသာ လိုအပ်ပါတယ်
// ထို လိုအပ်သော r တန်ဘိုးကို user ဆီမှ တောင်းပြီး ယခု သင်ခန်းစာမှာ area of circle ကို ရှာမှာ ဖြစ်ပါတယ်။
import java.util.Scanner;
public class lesson4areaOfcircle {

    public static void main(String args[])
    {
        System.out.println("Enter radius: ");
        Scanner d_r=new Scanner(System.in);
        double r= d_r.nextDouble();
        double area=3.1415*(r*r);
        System.out.println("Area of Circle is "+area);
    }
}
