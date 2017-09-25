
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class DangerousBot extends Robot
{
    public int beepers;
    public DangerousBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    public void choosePile() {
        beepers = 0;
        pickPile();
        findPile();
        pickCorrectPile();
    }
    public void pickPile() {
        while (nextToABeeper()){
            pickBeeper();
            beepers = beepers + 1;
        }
        for (int i = 0; i < beepers; i++){
            putBeeper();
        }
    }
    public void findPile() {
        if (beepers % 2 > 0){
            turnLeft();
        }
        else{
            turnLeft();
            turnLeft();
            turnLeft();
        }
        move();
    }
    public void pickCorrectPile() {
        while (nextToABeeper()){
            pickBeeper();
        }
    }
}

