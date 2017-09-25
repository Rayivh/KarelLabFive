
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class TreasureBot extends Robot
{
    public int beepers = 0;
    public TreasureBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void findTreasure() {
        while (1 == 1){
            moveToBeeper();
            findDirection();
        }
    }
    public void findDirection() {
        if (beepers == 1){
            faceNorth();
        }
        else if (beepers == 2){
            faceEast();
        }
        else if (beepers == 3){
            faceSouth();
        }
        else if (beepers == 4){
            faceWest();
            }
        else {
            turnOff();
        }
        beepers = 0;
        move();
    }
    public void moveToBeeper() {
        while (!nextToABeeper()){
            move();
        }
        while (nextToABeeper()){
            pickBeeper();
            beepers = beepers + 1;
        }
        for (int i = 0; i < beepers; i++){
            putBeeper();
               
        }
    }
    public void faceNorth() {
        while (!facingNorth()){
            turnLeft();
        }
    }
    public void faceEast() {
        while (!facingEast()){
            turnLeft();
        }
    }
    public void faceSouth() {
        while (!facingSouth()){
            turnLeft();
        }
    }
    public void faceWest() {
        while (!facingWest()){
            turnLeft();
        }
    }
}
