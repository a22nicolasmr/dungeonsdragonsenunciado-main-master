package dd.core;

public class Caballero extends Personaje{
    String nombre;
    int ataque;
    int vida=1500;
    public Caballero(String nombre) {
        super(nombre);
    }
    @Override
    public
    int ataca(Personaje enemigo) {
        
        return 2;
    }
    @Override
    public double lanzaAtaque(Personaje enemigo) {
        return 0.0;
    }
}