public class Hilo {

    private int d;
    private int numero;

    public Hilo(int d , int numero){
        super();
        this.d = d;
        this.numero = numero;

    }

    public void run (){

        for (int i =1 ;i<=n;i++){

            System.out.println("El coche "+numero+" recorrio "+i+" km");

        }


        System.out.println("El coche "+numero+" finalizo el recorrido");
    }
}
