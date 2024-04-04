import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class pedra here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pedra extends space
{
    /**
     * Act - do whatever the pedra wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        borda();
        removeClick();
        if(Greenfoot.getRandomNumber(2) < 10){
            move(-Greenfoot.getRandomNumber(12));
        }
    }
}
