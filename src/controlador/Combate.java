public class Combate{
    private Personaje personaje;
    private Enemigo enemigo;

    public Combate(Personaje personaje, Enemigo enemigo){

        this.personaje = personaje;
        this.enemigo = enemigo;
    }


    public void atacarjugador(Dado dado){

        int dano = personaje.getArma().ejecutar(dado);

        enemigo.setVida(enemigo.getVida() - dano);


    }

    public void atacarEnemigo(Dado dado){

        int dano2 = enemigo.getArma().ejecutar(dado);

        personaje.setVida(personaje.getVida()-dano2);
    }

    public void iniciarCombate(){
        Dado dado = new Dado(); 
        while (enemigo.getVida() > 0 && personaje.getVida() > 0 ){

            atacarEnemigo(dado);

        if (enemigo.getVida() <= 0 ){

            System.out.println("gano el jugador!!");
        break;

        }

        atacarjugador(dado);

        if (personaje.getVida() <= 0){

            System.out.println("el enemigo gano, aqui acaba tu historia");

        break;
        }

        }

        
    }
}