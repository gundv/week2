package package1;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class JavaBeginner {
    private String to_begin;

    public static void main(String[] args){

            System.out.println("Hello World");

            int d=0;
            int f=0;
            f=d+++d-d--;
            f=d+=1;
            System.out.println("F="+f);
            System.out.println("D="+d);

            Date now =new Date();

            final Calendar cal = Calendar.getInstance();
            cal.add(Calendar.DATE, 1);
            Date yesterday = cal.getTime();
            System.out.println("compareTo value="+now.compareTo(yesterday)+"");


            int i=1;
            int j=1;

            int l=i==j?1:i<j?3:i>j?2:0;
            if(i==j)
                l=1;
            else if(i<j)
                l=3;
            else if(i>j){
                l=2;
            }else{
                l=0;
            }
            if(i==1){
                if(j==1) l=1;

            }

            boolean a=true;
            boolean b=!!!a;

            char z = (char)(126|223);

            switch (l) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
            }

            boolean b1=false;
            while(b1){
                System.out.println("RUn while");
            }
            do{
                System.out.println("RUn do");
            }while(b1);

        ArrayList<Float> floats=new ArrayList<>();
        float[]floats1;

        for (Float each:floats) {

        }


        Flight f1=new Flight(125,100);

        //f1.getPassenger();

        Flight f2=new Flight(130,100);

        //f2.getPassenger();

        boolean compare= f1 != f2;


        int passenger=f1.getPassenger()+f2.getPassenger();

    }
}
