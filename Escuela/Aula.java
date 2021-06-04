package Escuela;

public class Aula {
    private int bancos_total = 0;
    private String nombre = "";
    private boolean disponibilidad = true;

    public int getBancos_total(){
        return this.bancos_total;
    }

    public String getNombre(){
        return this.nombre;
    }

    public boolean getDisponibilidad() {
        return this.disponibilidad;
    }

    public void setDisponibilidad(boolean valor) {
        this.disponibilidad = valor;
    }

    //Constructor
    public Aula(String nombre, int bancos_total){
        this.bancos_total = bancos_total;
        this.nombre = nombre;
    }

}
