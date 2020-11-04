package ee.bcs.valiit.tasks;

import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Lesson3 {

    public static void main(String[] args) {



        //Ül 2 Jada summa leidmine
        /*System.out.println("Jada summa on "+sum(new int [] {}));*/

        //Ül 3 faktoriaal
        /*Scanner scan = new Scanner(System.in);
        System.out.println("Sisestage arv faktoriaalis");
        Integer x = scan.nextInt();
        System.out.println("Sisestatud arv "+x+" faktoriaalis on");
        System.out.println(factorial(x));*/

        //Ül 4 Jada sorteerimine leidmine
        /*System.out.println("Sorteeritud jada on ");
        System.out.print(sort(sort(new int [] {})));*/

        //Ül 5 nimetagurpidi keeramine
        /*Scanner scan = new Scanner(System.in);
        System.out.println("Sisestage sõna");
        String a = scan.nextLine();
        System.out.println("Sisestatud sõna "+a+" tagurpidi kirjutatult on ");
        System.out.println(reverseString(a));*/

        //Ül 6
        /*Scanner scan = new Scanner(System.in);
        System.out.println("Sisestage arv");
        Integer x = scan.nextInt();

        System.out.println("Sisestatud arv "+x+" on primaararv kui vastuseks on TRUE");
        System.out.println(isPrime(x));*/

    }

    private static void test(Map<String, String> testMap) { testMap.put("test", "test"); }

    public static int uusSumma(int x, int y) {
        // TODO liida kokku ja tagasta x ja y väärtus

        return x+y;
    }

    public static int sum(int[] x){
        // Todo liida kokku kõik numbrid massivis x
        int [] nimekiri = {10,25,15,5};
        int sum = 0;

        for(int i=0;i<nimekiri.length;i++) {//length is the property of array
            int num = (nimekiri[i]);
            sum = num + sum;
        } return sum;

    }

    public static int factorial(int x) {
        // TODO tagasta x faktoriaal.
        // Näiteks
        // x = 5
        // return 4*3*2*1 = 24
        int k=1;
        int m=2;
        int n=3;
        if (x==0) {
            n=1;
        }
        else if (x==1){
            n=1;
        }
        else
            for (int i= 1; i<x; i++) {
                n=m*k;
                k=n;
                m++;
            } return n;

    }

    public static int[] sort(int[] a) {
        // TODO sorteeri massiiv suuruse järgi
        // Näiteks {2, 6, 8, 1}
        // Väljund {1, 2, 6, 8}
        //käime rea läbi esimest korda ning leiame kõige pisema numbri, siis vahetame kohad ära

        int [] nimekiri = {10,25,15,5};
        int uueJadaPikkus = nimekiri.length;
        int vanaJadaVahenemine = 0;
        int [] nimlist = new int [uueJadaPikkus];
        int number = 0;
        int vaikseimarv = nimekiri[0];



        for (int i = 0; i < uueJadaPikkus; i++)
        {
            //nimekiri[i] -=vaikseimarv;
            //System.out.println(nimekiri);
            for (int j=i+1;i<uueJadaPikkus;i++) {
                if (nimekiri[i] < vaikseimarv) {
                    vaikseimarv=nimekiri[i];
                    System.out.println(vaikseimarv);

                }
            }

        }

        return new int [0];


    }



    public static String reverseString(String a) {
        // TODO tagasta string tagurpidi
        // Näiteks:
        // a = "Test";
        // return tseT";

        //charat, substring

        int tahtedeArv = a.length();

        String tagurpidiSona = "";


        for (int i = tahtedeArv-1; i>=0; i--) {
            tagurpidiSona += a.charAt(i);
        } return tagurpidiSona;

        /*String [] sonad = a.split(" ");
        String tagurpidiString = "";

        for (int i = 0; i < sonad.length; i++)
        { //panna uus sõna kokku
            String sona = sonad[i];
            String tagurpidiSona="";
            for (int j = sona.length()-1; j >= 0; j--) ; // uus täht saada
            {
                int j = sona.length()-1;
                tagurpidiSona = tagurpidiSona + sona.charAt(j);
                System.out.println(tagurpidiSona);

            }
            tagurpidiString = tagurpidiString + tagurpidiSona;
            System.out.println(tagurpidiString);
        } return tagurpidiString;*/
    }

    public static boolean isPrime(int x){
        // TODO tagasta kas sisestatud arv on primaar arv (jagub ainult 1 ja iseendaga)

        for (int i =2; i<x;i++) {
            int kasOnArvP = x%i;
                if (kasOnArvP==0){
                    return false;
                }
        } return true;
    }

}
