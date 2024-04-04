import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class insetos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class insetos extends Actor
{
    /**
     * Act - do whatever the insetos wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        
    }
    public boolean bordaDireita(){
        if(getX() > getWorld().getWidth()-20){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean bordaEsquerda(){
        if(getX() < 20){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean bordaCima(){
        if(getY() < 20){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean bordaBaixo(){
        if(getY() > getWorld().getHeight()-20){
            return true;
        }
        else{
            return false;
        }
    }
    public void borda(){
        if(isAtEdge()){
            if(bordaDireita()){
                setLocation(30,getY());
            }
            if(bordaEsquerda()){
                setLocation(1580,getY());
            }
            if(bordaCima()){
                setLocation(getX(),880);
            }
            if(bordaBaixo()){
                setLocation(getX(),30);
            }
        }
    }
}
