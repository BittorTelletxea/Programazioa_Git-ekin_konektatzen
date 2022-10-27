import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int nota;

        Scanner sarrera = new Scanner(System.in);
        System.out.println("Sartu azterketako nota");
        nota = sarrera.nextInt();

            if(nota<5){
                System.out.println("Gainditu gabe");
            }if ((5<=nota )&&(nota<7)) {
                System.out.println("Ondo");}
            if ((7<=nota)&&(nota<9)){
                System.out.println("oso ondo");}
            if ((7<=nota)&&(nota<10)){
                System.out.println("bikain"); }
    }

    public static void bilatuLehenak (int haserakoZenb, int bukaerako){


    }
}
