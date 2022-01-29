import  ajedrez.piezas.*;
public class Tablero {
    private Escaque [][] casillas;
    
    public Tablero(){
        casillas = new Escaque[6][6];
        for (int i=0; i<6; i++){
            for(int j=0;j<6;j++){
                casillas[i][j] = new Escaque();
            }
        }
        for (Escaque[] escaques : casillas) {
            for (Escaque escaque : escaques) {
                escaque.setPieza( new NoPieza());
            }
        }
    }

    public Escaque[][] getCasillas() {
        return casillas;
    }

    public void setCasillas(Escaque[][] casillas) {
        this.casillas = casillas;
    }
    
    
}
