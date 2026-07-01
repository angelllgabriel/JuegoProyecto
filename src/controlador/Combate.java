public class Combate{
    private Personaje personaje;
    private Enemigo enemigo;

    public Combate(Personaje personaje, Enemigo enemigo){

        this.personaje = personaje;
        this.enemigo = enemigo;
    }


    public void atacarjugador(){

        int dano = personaje.getArma().calculardaño();

        enemigo.setVida(enemigo.getVida() - dano);


    }

    public void atacarEnemigo(){

        int dano2 = enemigo.getArma().calculardaño();

        personaje.setVida(personaje.getVida()-dano2);
    }

    public void iniciarCombate(){

        while (enemigo.getVida > 0 && personaje > 0 ){

            atacarEnemigo();

        if (enemigo.getVida <= 0 ){

            System.out.println("gano el jugador!!");
        break;

        }

        atacarjugador();

        if (personaje.getVida <= 0){

            System.out.println("el enemigo gano, aqui acaba tu historia");

        break;
        }

        }

        
    }
}