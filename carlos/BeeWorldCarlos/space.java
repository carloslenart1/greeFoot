import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class space here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class space extends Actor
{
    int pontos = 0;
    int vida = 3;
    public void act()
    {
        getWorld().showText("Pontos: " + pontos, 50, 25);
        getWorld().showText("Vida: " + vida, 1530, 25);
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
    public void come(){
        if(isTouching(mosca.class)){
            removeTouching(mosca.class);
            //Greenfoot.playSound("comeMosca.wav");
            pontos++;
            getWorld().showText("Pontos: " + pontos, 50, 25);
            getWorld().addObject(new mosca(),Greenfoot.getRandomNumber(1600),Greenfoot.getRandomNumber(900));
        }
    }
    public void perderVida(){
        if(isTouching(pedra.class)){
            //setLocation(getX() -1,getY() -1);
            removeTouching(pedra.class);
            vida--;
            getWorld().addObject(new pedra(),Greenfoot.getRandomNumber(1600),Greenfoot.getRandomNumber(900));
            getWorld().showText("Vida: " + vida, 1530, 25);
        }
    }
    public void removeClick(){
        if(Greenfoot.mouseClicked(this)){
            getWorld().removeObject(this);
        }
    }
    public void gameOver(){
        if(vida<=0){
            Greenfoot.stop();
            //Greenfoot.playSound("gameOver.wav");
            getWorld().showText("Você perdeu!!",800,450);
        }
    }
    
}
