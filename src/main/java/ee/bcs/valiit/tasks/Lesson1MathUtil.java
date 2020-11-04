package ee.bcs.valiit.tasks;

import java.util.Scanner;

public class Lesson1MathUtil {
    private String test;

    public Lesson1MathUtil(String test) {
        this.test = test;
    }

    public static void main(String[] args) {
        /*java.util.Scanner scanner = new java.util.Scanner(System.in);
        Lesson1MathUtil lesson1MathUtil1 = new Lesson1MathUtil("test");
        Lesson1MathUtil lesson1MathUtil2 = new Lesson1MathUtil("test2");
        lesson1MathUtil1.test();
        lesson1MathUtil2.test();

        int[][] twoArray = new int[3][4];*/
        //System.out.println(min(3,6));
        //System.out.println(max(3,6));
        //System.out.println(abs(-9));
        //System.out.println(isEven(5));
        //System.out.println(min(5,6,4));
        //System.out.println(max(7,6,8));

        Scanner scan = new Scanner(System.in);
        System.out.println("Millist funktsiooni soovid esile kutsuda? Valikus on min, max, abs, isEven");
        String q = scan.nextLine();

        if (q.equalsIgnoreCase("min")) {
            System.out.println("Kas soovid 2 või 3 muutujat kasutada. Sisesta 2 või 3 vastvalt soovile");
            int w = scan.nextInt();
                if (w==2) {
                    System.out.println("Sisesta esimene muutuja");
                    int a = scan.nextInt();
                    System.out.println("Sisesta teine muutuja muutuja");
                    int b = scan.nextInt();
                    System.out.println("Tulemus on:");
                    System.out.println(min(a, b));
                }
                else
                    System.out.println("Sisesta esimene muutuja");
                    int a = scan.nextInt();
                    System.out.println("Sisesta teine muutuja");
                    int b = scan.nextInt();
                    System.out.println("Sisesta kolmas muutuja");
                    int c = scan.nextInt();
                    System.out.println("Tulemus on:");
                    System.out.println(min(a, b, c));
        }
        else if (q.equalsIgnoreCase("max")) {
            System.out.println("Kas soovid 2 või 3 muutujat kasutada. Sisesta 2 või 3 vastvalt soovile");
            int w = scan.nextInt();
            if (w == 2) {
                System.out.println("Sisesta esimene muutuja");
                int a = scan.nextInt();
                System.out.println("Sisesta teine muutuja");
                int b = scan.nextInt();
                System.out.println("Tulemus on:");
                System.out.println(max(a, b));
            }
            else
                System.out.println("Sisesta esimene muutuja");
                int a = scan.nextInt();
                System.out.println("Sisesta teine muutuja");
                int b = scan.nextInt();
                System.out.println("Sisesta kolmas muutuja");
                int c = scan.nextInt();
                System.out.println("Tulemus on:");
                System.out.println(max(a, b, c));
        }
        else if (q.equalsIgnoreCase("abs")) {
            System.out.println("Sisesta muutuja");
            int a = scan.nextInt();
            System.out.println("Tulemus on:");
            System.out.println(abs(a));

        }
        else
            System.out.println("Sisesta muutuja");
            int a = scan.nextInt();
            System.out.println("Tulemus on:");
            System.out.println(isEven(a));


    }



    public void test(){
        System.out.println(test);
    }

    public static int min(int a, int b)
    {
        // TODO tagasta a ja b väikseim väärtus

        if(a<b) {
          return a;
        }
        return b;

    }

    public static int max(int a, int b) {
        // TODO tagasta a ja b suurim väärtus
        if(a<b) {
            return b;
        }
        return a;

    }

    public static int abs(int a) {
        // TODO tagasta a absoluut arv
        return Math.abs(a);  // ei ole õigem lahendust hajrutamiseks, muidu math.min jne on fain
        /*
        if(a<0){
            return -a;
        }
        else
            return a;

         */
    }
    //f2 viib veani
    public static boolean isEven(int a) {
        // TODO tagasta true, kui a on paaris arv
        // tagasta false kui a on paaritu arv
        return (a%2)==0;
    }

    public static int min(int a, int b, int c) {
        // TODO tagasta a, b ja c väikseim väärtus
        if(a<=b&&a<=c) {
            return a;
        }
        else if (b<=a&&b<=c) {
            return b;
        }
        else return c;

        //return min(min(a,b),c);

        //int sisemine=min(a,b);
        // return min(sisemine, c);


    }

    public static int max(int a, int b, int c) {
        // TODO tagasta a, b ja c suurim väärtus
        if(a>=b&&a>=c) {
            return a;
        }
        else if (b>=a&&b>=c) {
            return b;
        }
        else return c;

        //return max(max(a,b),c);
    }

}
