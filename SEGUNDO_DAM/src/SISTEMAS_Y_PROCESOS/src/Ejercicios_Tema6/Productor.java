package Ejercicios_Tema6;

public class Productor extends Thread {

    private Buffer_semaforo almacen;

    public Productor(Buffer_semaforo almacen) {
        this.almacen = almacen;
    }

    @Override
    public void run() {
        while (true) {
            almacen.producir();
        }
    }

}