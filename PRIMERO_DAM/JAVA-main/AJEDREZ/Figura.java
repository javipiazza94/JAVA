package AJEDREZ;

abstract class Figura {

    //atributos
    protected String nombre;
    protected int x;
    protected int y;
    protected boolean prioridad;
    protected int id;
    protected String Color;

    public Figura() {
        this.x = 0;
        this.y = 0;
        this.prioridad = true;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean isPrioridad() {
        return prioridad;
    }

    public void setPrioridad(boolean prioridad) {
        this.prioridad = prioridad;
    }



    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "ifiguras [x=" + x + ", y=" + y + ", prioridad=" + prioridad + ", negx=" + ", negy=" + "]";
    }


    //abstract void mover(tablero tabla);
    //abstract void comer(Casilla casilla);
}
