


import kareltherobot.*;

/**
 * Write a description of class Template here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DoubleBot extends Robot
{
    // instance variables - replace the example below with your own
    public int beepers;
    /**
     * Constructor for objects of class Template
     */
     public DoubleBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void doubleBeepers()
    {
        // put your code here
        beepers = 0;
        checkBeepers();
        replaceBeepers();
        newBeepers();
        }
    public void checkBeepers(){
        move();
        while (nextToABeeper()){
            pickBeeper();
            beepers = beepers + 1;
        }
    }
    public void replaceBeepers(){
        for (int i = 0; i < beepers; i++){
            putBeeper();
        }
        move();
    }
    public void newBeepers(){
        for (int i = 0; i < beepers; i++){
            putBeeper();
            putBeeper();
        }
        move();
    }
    }
