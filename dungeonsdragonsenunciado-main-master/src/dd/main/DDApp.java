package dd.main;
import dd.core.Ataque;
import dd.core.AtaqueArco;
import dd.core.AtaqueChuchillo;
import dd.core.AtaqueEspada;
import dd.core.Personaje;
import dd.core.Rey;
import dd.core.Troll;
import dd.core.Caballero;


class DDApp {
    public String presentacionJuego() {
        return "Tal día como hoy, en una húmeda y fría mañana de finales de primavera,\t la partida formada por: [[Rey Arturo], [Lancelot], [Percival]]\t hallándose en los frondosos bosques del sitio de Deorham, se topó con una \t patrulla de 3 de esas sanguinarias e inhumanas criaturas popularmente \t conocidas como trolls. \t De la batalla que aconteció, dejo aquí testimonio:\t";
    }
    public void CreacionDeEjercitos(Ataque AtaqueEspada, Ataque AtaqueArco,Ataque AtaqueChuchillo){
        Personaje realeza1=new Rey("EL BICHO");
        realeza1.setAtaque(AtaqueEspada);
        Personaje realeza2=new Caballero("GOKU");
        realeza2.setAtaque(AtaqueEspada);
        Personaje realeza3=new Caballero("VEGETA");
        realeza3.setAtaque(AtaqueArco);
        Personaje[] buenos={realeza1,realeza2,realeza3};

        int numeroTrolls=(int)(Math.random()*10-2);
        for (int i = 0; i < numeroTrolls; i++) {
            Personaje Troll=new Troll("Troll"+i);
            Personaje[] malos={Troll};

            int armaTroll=(int)(Math.random()*3-1);
            if (armaTroll==1) {
                Troll.setAtaque(AtaqueEspada);
            }else if (armaTroll==2) {
                Troll.setAtaque(AtaqueArco);
            }else{
                Troll.setAtaque(AtaqueChuchillo);
            }
        }
    }
    public void luchar(){
        int ganador=0;
        while(ganador!=0){

        }
    }
    public static void main(String[] args) {
        // pruebas sin ejercitos ni victorias
       
    }

}