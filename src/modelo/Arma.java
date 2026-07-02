package modelo;
public class Arma {
    private String nombre;
    private int danoMaximo;
    private int danoMinimo;

    public Arma(String nombre, int danoMaximo, int danoMinimo){
        this.nombre = nombre;
        this.danoMaximo = danoMaximo;
        this.danoMinimo = danoMinimo;
    }
    public String getNombre(){
        return nombre;
    }

    public int getDanoMaximo(){
        return danoMaximo;
    }

    public int getDanoMinimo(){
        return danoMinimo;
    }

    public void setDanoMinimo(int danoMinimo){
        this.danoMinimo = danoMinimo;
    }
    public void setDanoMaximo(int danoMaximo){
        this.danoMaximo = danoMaximo;
    }
    public int ejecutar(Dado dado) {
        return dado.lanzar(danoMinimo, danoMaximo);

}

}



