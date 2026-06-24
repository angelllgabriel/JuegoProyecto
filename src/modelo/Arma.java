public class Arma {
    private String nombre;
    private int danoMaximo;

public Arma(String nombre, int danoMaximo){
    this.nombre = nombre;
    this.danoMaximo = danoMaximo;
}
    public String getNombre(){
        return nombre;
    }

    public int getDanoMaximo(){
        return danoMaximo;
    }
}

