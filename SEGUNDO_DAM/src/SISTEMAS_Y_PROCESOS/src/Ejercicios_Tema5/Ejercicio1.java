package Ejercicios_Tema5;

public class Ejercicio1 {

    public static void main(String[] args) {
        Buffer b = new Buffer(10);
        Productor p = new Productor(b);
        Productor p2 = new Productor(b);
        Productor p3 = new Productor(b);
        Productor p4 = new Productor(b);
        Productor p5 = new Productor(b);
        Consumidor c = new Consumidor(b);
        
        p.start();
        p2.start();
        p3.start();
        p4.start();
        p5.start();
        c.start();
    }
}