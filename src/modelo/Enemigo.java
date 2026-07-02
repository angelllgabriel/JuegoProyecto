public class Enemigo {
    private String nombre;
    private int vida;
    private Arma arma;

    public Enemigo(String nombre, int vida, Arma arma){
        this.nombre = nombre;
        this.vida = vida;
        this.arma = arma;
    }

        public String getNombre(){
            return nombre;
        }
        public int getVida(){
            return vida;
        }
        public Arma getArma(){
            return arma;
        }
        

        public void setNombre(String nombre){
            this.nombre = nombre;
        }
        public void setVida(int vida){
            this.vida = vida;
        }
        public void setArma(Arma arma){
            this.arma = arma;
        }

}
