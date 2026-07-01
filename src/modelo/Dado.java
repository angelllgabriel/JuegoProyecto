public class Dado{
    private int caras;
    private int CaraDado;

    public Dado(){
        this.caras = 6;
        this.CaraDado = 0;

    }

    public int getCaras() {
        return caras;
    }

    public void setCaras(int caras) {
        this.caras = caras;
    }

    public int getCaraDado() {
        return CaraDado;
    }

    public void setCaraDado(int CaraDado) {
        this.CaraDado = CaraDado;
    }

    public int lanzarDado(){
        int CaraDado = (int)(Math.random() * caras) + 1;
        
        return CaraDado;
    }

    

}