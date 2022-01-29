import ajedrez.juego.Tablero;
public class NoPieza extends Pieza {
    public NoPieza(){
        this(-1,-1);
    }
    public NoPieza(int x, int y){
        Posicion pos = new Posicion();
        pos.setPosicion(x, y);
        setPosicion(pos);
    }
    

    @Override
    boolean[][] posicionesPosibles() {
        return new boolean[6][6]; 
    }
    @Override
    boolean movimientoPosible( Posicion posicionNueva, Tablero tablero){
        return false;
    }

    
}
