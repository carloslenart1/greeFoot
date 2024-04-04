import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class mosca here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class mosca extends insetos
{
    /**
     * Act - do whatever the mosca wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        borda();
        if(Greenfoot.getRandomNumber(100) < 10){
            //início do if
            move(Greenfoot.getRandomNumber(90));
            turn(Greenfoot.getRandomNumber(90)-45);
        }
    }
}
