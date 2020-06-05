
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la distancia que recorrera el coche  #1");

        int d1 = sc.nextInt();


        System.out.println("Ingrese la distancia que recorrera el coche #2");
        int d2 = sc.nextInt();


        System.out.println("Ingrese la distancia que recorrera el auto #3");
        int d3 = sc.nextInt();

        Hilo hilo1 =new Hilo(d1,1);
        Hilo hilo2 =new Hilo(d2,2);
        Hilo hilo3 =new Hilo(d3,3);

        hilo1.start();
        hilo2.start();
        hilo3.start();
        
    }


}
