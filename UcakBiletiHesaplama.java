import java.util.Scanner;

public class UcakBiletiHesaplama {
    public static void main(String[] args) {
        int km,age,select;


        Scanner sc=new Scanner(System.in);
        System.out.print("Mesafeyi km türünden giriniz  :");
        km=sc.nextInt();
        System.out.print("Yaşınızı giriniz  :");
        age=sc.nextInt();
        System.out.print("Yolculuk tipini giriniz  : (1 => Tek Yön  2 => Gidiş Dönüş ):");
        select=sc.nextInt();


        double price= km*0.10;
        double agedis;
        double total;
        double gidisgelisindirimi=0.20;


        if(select==1) {
            if (km<0){
                System.out.println("Hatalı Giriş Yaptınız!");
                return;
            }
            if (age<0)
            {
                System.out.println("Hatalı Giriş Yaptınız!");
                return;
            }
            if (age < 12) {
                agedis = 50;
                agedis = price * agedis / 100;
                System.out.println("Toplam Tutar  :" + (price - agedis));
            }
            if (age > 12 && age < 24) {
                agedis = 10;
                agedis = price * agedis / 100;
                System.out.println("Toplam Tutar  :" + (price - agedis));
            }
            if (age>65){
                agedis = 30;
                agedis = price * agedis / 100;
                System.out.println("Toplam Tutar  :" + (price - agedis));
            }
            if(age>=24 && age<65) {

                System.out.println("Toplam Tutar   :"+price);
            }
        }
        else if(select==2){
            if (km<0){
                System.out.println("Hatalı Giriş Yaptınız!");
                return;
            }
            if(age<0){
                System.out.println("Hatalı Giriş Yaptınız!");
                return;
            }
            if (age<12){
                agedis=50;
                agedis=price*2*agedis/100;
                total=price*2-agedis;
                System.out.println(total-total*gidisgelisindirimi);
            }
                if(age>12 && age<24){
                    agedis=10;
                    agedis=price*2*agedis/100;
                    total=price*2-agedis;
                    System.out.println(total-total*gidisgelisindirimi);


                }
                if (age>65){
                    agedis = 30;
                    agedis = price*2 * agedis / 100;
                    total=price*2-agedis;
                    System.out.println(total-total*gidisgelisindirimi);
                }
                if(age>=24 && age<65) {
                    agedis = 20;
                    agedis = price*2 * agedis / 100;
                    total=price*2-agedis;
                    System.out.println(total-total*gidisgelisindirimi);

                }

        }
        else {
            System.out.println("Hatalı Giriş Yaptınız!");
        }
    }
  }
