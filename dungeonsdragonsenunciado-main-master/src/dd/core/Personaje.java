package dd.core;

public abstract class Personaje implements Ataque{
    String nombre;
    Ataque ataque;
    int vida;
    public Personaje(String nombre){
        this.nombre=nombre;
    }
    public void setAtaque(Ataque ataque){
        this.ataque=ataque;
    }
    public void setSalud(int vida){
        this.vida=vida;
    }
    public int ataca(Personaje enemigo){
        return enemigo.getSalud();
    }
    public Ataque getAtaque() {
        return ataque;
    }
    public int getSalud(){
        return this.vida;
    }
    public String getNombre(){
        return this.nombre;
    }
}

