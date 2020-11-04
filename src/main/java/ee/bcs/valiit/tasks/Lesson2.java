package ee.bcs.valiit.tasks;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Lesson2 {

    public static void main(String[] args) {


        //ül3
        /*Scanner scan = new Scanner(System.in);
        System.out.println("Mitmendat Fibonacci elementi soovid?");
        Integer n = scan.nextInt();
        System.out.println("Vastus on:");
        System.out.println(fibonacci(n));*/

        //Ül 5
        exercise5();
        //ül 7
        //exercise7();
    }

    public static void exercise1() {
        // TODO loo 10 elemendile täisarvude massiv
        // TODO loe sisse konsoolist 10 täisarvu
        // TODO trüki arvud välja vastupidises järiekorras

        Scanner scan = new Scanner(System.in);
//option+f6 muutmiseks
        //int [] nimekiri; //defineerib massi tüüpi muutuja
        //nimekiri = new int[10]; // loob 10 elenemdiga massiivi
        //int[] nimekiri=new int [10] võimalus kaks eelnevat kokku panna

        int[] nimekiri = new int[10];
        System.out.println("Sisesta 10 arvu");
        for (int i = 0; i < nimekiri.length; i++) {
            nimekiri[i] = scan.nextInt(); //koodi tohib kirjutada ühe korra
        }
            for (int i = 9; i >= 0; --i) {
            System.out.print(nimekiri[i]);
            }
        //System.out.println(Arrays.toString(nimekiri));

        //List<Integer> nimekiri=new ArrayList<>();
        //nimekiri.add(i);
        //for(int x:numbrid)


    }

    public static void exercise2() {
        // TODO prindi välja x esimest paaris arvu
        // Näide:
        // Sisend 5
        // Väljund 2 4 6 8 10
        System.out.println("Palun sisesta üks täisarv");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int k = 0;
        for (int i = 0; i <= x; i++) {
            k = k + 2;
            System.out.println(k);
        }


    }

    public static void exercise3() {
        // TODO trüki välja korrutustabel mis on x ühikut lai ja y ühikut kõrge
        // TODO näiteks x = 3 y = 3
        // TODO väljund
        // 1 2 3
        // 2 4 6
        // 3 6 9
        Scanner scan = new Scanner(System.in);
        System.out.println("Palun sisesta korrutustabeli laius");
        int ridadeArv = scan.nextInt();
        System.out.println("Palun sisesta korrutustabeli pikkus");
        int veergudeArv = scan.nextInt();


        for (int i = 1; i <= veergudeArv; i++) {
            System.out.println();
            for (int j = 1; j <= ridadeArv; j++)

                System.out.print(i * j + " ");

        }


        //Console.WriteLine();*/
    }


    public static int fibonacci(int n)
    {
        // TODO
        // Fibonacci jada on fib(n) = fib(n-1) + fib(n-2);
        // 0, 1, 1, 2, 3, 5, 8, 13, 21
        // Tagasta fibonacci jada n element
        //Scanner scan = new Scanner(System.in);
        //System.out.println("Mitmendat elementi soovid?");
        //int  n =scan.nextInt();

        int n1 = 0;
        int n2 = 1;
        int n3 = 0;

        //System.out.print(n1 + " " + n2);
        if (n==1){
            n3=0;
            return n3;
        }
        else if (n==2) {
            n3=1;
            return n3;
        }
        else
            for (int i = 2; i < n; ++i)
            {
                n3 = n1 + n2;
                //System.out.print(" " + n3);
                n1 = n2;
                n2 = n3;

            } return n3;
    }

    public static void exercise5() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Palun sisestage esimene muutuja");
        Integer i = scan.nextInt();
        System.out.println("Palun sisestage teine muutuja");
        Integer j = scan.nextInt();
        int n=Math.max(i,j);
        int jadaKOIKPikkused = 0;

        for (int k = n; k>=Math.min(i,j);k--){
            exerciseLisa5(n);
            //jadaKOIKPikkused = exerciseLisa5(n);
            n--;
        } //System.out.println(jadaKOIKPikkused);








    }
    public static int exerciseLisa5(int n) {
        // https://onlinejudge.org/index.php?option=onlinejudge&Itemid=8&page=show_problem&problem=36
        //Todo1 (tee alamfunktsioon), mis leiab 3n+1 sequenci pikkuse
        //TODO 2 tee tsükkel, mis leiab  i->j kõige suurema tsükkli pikkuse
        //int n = 22;
        int jadaPikkus = 1;
        int vastus = 0;
        int jadaKoguPikkus = 0;
        //System.out.println("Jada näeb välja selline");
        //System.out.print(n + " ");
        System.out.print(n + " ");

        while (n!=1) {
            if (n == 1) {
                vastus = 1;
                jadaPikkus = 1;
                //System.out.print(vastus +" ");
                break;
            }
            if (n % 2 == 0) {
                vastus = n / 2;
                //System.out.print(vastus+" ");
                n = vastus;
                jadaPikkus++;
            }
            else {
                vastus = 3 * n + 1;
                //System.out.print(vastus+" ");
                n = vastus;
                jadaPikkus++;
            }
        }
        System.out.println("      Jada pikkus "+jadaPikkus);
        //return jadaPikkus;
        //System.out.println( "\nJadapikkus on\n" + jadaPikkus);

        //System.out.println("Korretkne vastus\n" + jadaPikkus);
        //input n
        //print n
        //if n = 1 then STOP
        //if n is odd then n ←− 3n + 1
        //else n ←− n/2 GOTO 2
        int[] nimekiri = new int[jadaPikkus];
        for (int i = 0; i <= nimekiri.length; i++);

        return jadaPikkus;
    }

    public static void exercise6() {
        /*
            Kirjutada Java programm, mis loeb failist visits.txt sisse looduspargi külastajad erinevatel jaanuari päevadel ning
            a) sorteerib külastuspäevad külastajate arvu järgi kasvavalt ning prindib tulemuse konsoolile;
            b) prindib konsoolile päeva, mil külastajaid oli kõige rohkem.
            Faili asukoht tuleb programmile ette anda käsurea parameetrina.
         */
    }
    //hiljem

    public static void exercise7() {
        // TODO arvuta kasutades BigDecimali 1.89 * ((394486820340 / 15 ) - 4 )
        BigDecimal a = new BigDecimal("1.89");
        BigDecimal b = new BigDecimal("394486820345");
        BigDecimal c = new BigDecimal("15");
        BigDecimal d = new BigDecimal("4");

        System.out.println(b.divide(c, 4, RoundingMode.HALF_UP));
    }



    public static void exercise8() {

        //Failis nums.txt on üksteise all 150 60-kohalist numbrit.

        //Kirjuta programm, mis loeks antud numbrid failist sisse ja liidaks need arvud kokku ning kuvaks ekraanil summa.
        //Faili nimi tuleb programmile ette anda käsurea parameetrina.

        //VASTUS:
        //Õige summa: 77378062799264987173249634924670947389130820063105651135266574

     }
     //hiljem
    public static void exercise9() {
        /* TODO
        Sama mis eelmises ülesandes aga ära kasuta BigInt ega BigDecimal klassi
         */
    }
    //hiljem
}
