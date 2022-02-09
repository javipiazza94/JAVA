package AJEDREZ;

import java.util.ArrayList;

public class tablero2 {

    //atributos
    
    protected ArrayList<Figura> tablero;
    
    //constructor
    
    public tablero2() {this.tablero = new ArrayList<Figura>();}

    //gets&sets
    
    public ArrayList<Figura> getTablero() {
        return tablero;
    }

    public void setTablero(ArrayList<Figura> tablero) {
        this.tablero = tablero;
    }
    
    //metodos
    
    @Override
    public String toString() {
        return "tablero [tablero=" + tablero + "]";
    }
    
    public void crearTablero()
    {
        for(int i = 0; i<tablero.size();i++){
            if(i==0 || i==7 || i== 56||i==63){
                tablero.add(new Torre());
                int cont = 0;
                this.tablero.get(i).id=cont;
                cont++;}
            
            else if(i==1 || i==6 || i==57|| i==62){
                tablero.add(new Caballo());
                int cont = 0;
                this.tablero.get(i).id=cont;
                cont++;}
            
            else if(i==2 || i==5 || i==58|| i==61){
                tablero.add(new Alfil());
                int cont = 0;
                this.tablero.get(i).id=cont;
                cont++;}
            
            else if(i>=8 && i<=51 || i>=48 && i<=55){
                tablero.add(new Peon());
                int cont = 0;
                this.tablero.get(i).id=cont;
                cont++;}
            
            else if(i==3|| i==60){
                tablero.add(new Reina());
                int cont = 0;
                this.tablero.get(i).id=cont;
                cont++;}
            
            else if(i==4 || i== 59){
                tablero.add(new Rey());
                int cont = 0;
                this.tablero.get(i).id=cont;
                cont++;}
            
            else {tablero.add(new Vacio());}
    }       
    
    }public void Mover(int posinicial, int posfinal){
        switch(this.tablero.get(posinicial).nombre){
        case "Torre":{}
      
        }
    
    }
 
}


