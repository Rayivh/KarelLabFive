
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class DemocracyBot extends Robot
{
    public DemocracyBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void fixBallots() {
        while (true) {
        
        
            if (nextToABeeper()){
                turnLeft();
                moveBallotsPositive();
                moveBallotsPositive();
            }
            else if (!nextToABeeper()){
                turnLeft();
                moveBallotsNegative();
                moveBallotsNegative();
            }
            faceEast();
            move();
            
        }
    }
    public void moveBallotsPositive() {
        move();
        checkBallotsPositive();
        turnLeft();
        turnLeft();
        move();
    }
    public void checkBallotsPositive() {
        if (!frontIsClear()&& nextToABeeper()){
            
        }
        else if(frontIsClear()&& nextToABeeper()){
            pickAllBeepers();
        }
        else if(!frontIsClear()&& !nextToABeeper()){
            putBeeper();
        }
    }
    public void moveBallotsNegative() {
        move();
        checkBallotsNegative();
        turnLeft();
        turnLeft();
        move();
    }
    public void checkBallotsNegative() {
        if (!frontIsClear()&& nextToABeeper()){
            pickAllBeepers();
        }
        else if(frontIsClear()&& nextToABeeper()){
            pickAllBeepers();
        }
        else if(!frontIsClear()&& !nextToABeeper()){
                
        }
    }
    public void pickAllBeepers() {
        while (nextToABeeper()){
            pickBeeper();
            if (nextToABeeper()){
                pickBeeper();
                turnLeft();
                turnLeft();
                move();
                faceEast();
                turnOff();
            }
        }
    }
    public void faceEast() {
        while (!facingEast()){
            turnLeft();
        }
    }
}

