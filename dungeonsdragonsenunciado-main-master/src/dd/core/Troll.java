package dd.core;

public class Troll extends Personaje{
    String nombre;
    int ataque;
    int vida=1000;
    public Troll(String nombre) {
        super(nombre);
    }
    @Override
    public
    int ataca(Personaje enemigo) {
        int tipoAtaque=(int)(Math.random()*3-0);
        
        return 2;  
    }
    @Override
    public double lanzaAtaque(Personaje enemigo) {
        
        return 0.0;
    }
}