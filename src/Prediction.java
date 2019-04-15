import java.util.Scanner;

public class Prediction {
    public static void main(String[]args){
        //variables
        boolean loop=true;
        Scanner equinox;
        equinox=new Scanner(System.in);
        int m;
        int q;
        int year;
        int J;
        int K;
        int h;
        int a, b, c, d, e, f;

        //rhyme
        System.out.println("There's an old nursery rhyme tht goes like this...\n"+" ");
        System.out.println("Monday's child is fair of face,\n" +
                "Tuesday's child is full of grace,\n" +
                "Wednesday's child is full of woe,\n" +
                "Thursday's child has far to go.\n" +
                "Friday's child is loving and giving,\n" +
                "Saturday's child works hard for a living,\n" +
                "But the child born on the Sabbath Day,\n" +
                "Is fair and wise and good in every way.");
        System.out.println(" ");
        //input
        System.out.println("Lets see what day you were born on.");
        while(loop){
            //month and day and year
            System.out.println("What month were you born in? Enter as a number (ex. January=1, February=2...) ");
            m = equinox.nextInt();

            System.out.println("What day were you born on?");
            q = equinox.nextInt();

            System.out.println("What year were you born in?");
            year = equinox.nextInt();

            if(m<3){
                m=m+12;
                year=year-1;
            }
            //written month
            switch(m){
                case 13:System.out.println("There are 31 days in January."); break;
                case 14:System.out.println("There are 28 days in February."); break;
                case 3:System.out.println("There are 31 days in March."); break;
                case 4:System.out.println("There are 30 days in April."); break;
                case 5:System.out.println("There are 31 days in May."); break;
                case 6:System.out.println("There are 30 days in June."); break;
                case 7:System.out.println("There are 31 days in July."); break;
                case 8:System.out.println("There are 31 days in August."); break;
                case 9:System.out.println("There are 30 days in September."); break;
                case 10:System.out.println("There are 31 days in October."); break;
                case 11:System.out.println("There are 30 days in November."); break;
                case 12:System.out.println("There are 31 days in December."); break;
            }

            //Equation
            K= year%100;
            J=year/100;

            a = m+1;
            b = 13*a;
            c = b/5;
            d = K/4;
            e = J/4;
            f = J*5;

            h = q + c + K + d + e +f;
            h = h%7;

            //poem line
            switch(h){
                case 0: System.out.println("You were born on a Saturday.\nAccording to the poem you work hard for a living."); break;
                case 1:System.out.println("You were born on a Sunday.\nAccording to the poem you are fair and wise and good in every way."); break;
                case 2:System.out.println("You were born on a Monday. \nAccording to the poem you are fair of face."); break;
                case 3:System.out.println("You were born on a Tuesday. \nAccording to the poem you are full of grace."); break;
                case 4:System.out.println("You were born on a Wednesday. \nAccording to the poem you are full of woe."); break;
                case 5:System.out.println("You were born on a Thursday. \nAccording to the poem you have far to go. "); break;
                case 6:System.out.println("You were born on a Friday. \nAccording to the poem you are loving and giving. "); break;
            }
            System.out.println(" ");
            System.out.println("Try another date.");

        }

    }



    }

