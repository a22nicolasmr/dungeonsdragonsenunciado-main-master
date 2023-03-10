package dd.core;

public class AtaqueChuchillo implements Ataque{
    @Override
    public double lanzaAtaque(Personaje enemigo){
        double dañoAtaque=(int)(Math.random()*1-0)*(double)(Math.random()*1-0)*25;
        return dañoAtaque;
    }
}
