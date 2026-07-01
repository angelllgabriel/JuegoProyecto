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

    //metodo para lanzar el dado en un rango personalizado para ataques
    public int lanzar(int minimo, int maximo){
        return(int) (Math.random()*(maximo - minimo + 1)) + minimo;
    }

}