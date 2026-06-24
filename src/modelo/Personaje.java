public class Personaje{
    private String nombre;
    private int vida;

    public Personaje(String nombre, int vida){
        this.nombre = nombre;
        this.vida = vida;
    }

    public String getNombre(){
        return nombre;
    }

    public int getVida(){
        return vida;
    }

    public void mostrarInformacion(){
        System.out.println("Nombre del personaje: "+ nombre);
        System.out.println("Vida del personaje: "+ vida);
    }
}