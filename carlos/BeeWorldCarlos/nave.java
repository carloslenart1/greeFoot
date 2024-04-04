import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class nave here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class nave extends space

{
    int moveVal = 5;
    /**
     * Act - do whatever the nave wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move();
        borda();
        come();
        perderVida();
        gameOver();
    }
    public void move(){
            if(Greenfoot.isKeyDown("left")){
                setLocation(getX() -moveVal,getY());
            }
            if(Greenfoot.isKeyDown("right")){
                setLocation(getX() +moveVal,getY());
            }
            if(Greenfoot.isKeyDown("up")){
                setLocation(getX() ,getY() -moveVal);
            }
            if(Greenfoot.isKeyDown("down")){
                setLocation(getX() ,getY() +moveVal);
            }
            
        }
    
}
