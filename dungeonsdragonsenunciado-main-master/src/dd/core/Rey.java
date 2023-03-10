package dd.core;

public class Rey extends Personaje{
    String nombre;
    int ataque;
    int vida=2000;
    public Rey(String nombre) {
        super(nombre);
        nombre="Arturo";
    }
    @Override
    public
    int  ataca(Personaje enemigo) {
        
        return 2;
    }
    @Override
    public double lanzaAtaque(Personaje enemigo) {
        //enemigo.vida=enemigo.vida-dañoAtaque;
        return 0.0;
    }
}
