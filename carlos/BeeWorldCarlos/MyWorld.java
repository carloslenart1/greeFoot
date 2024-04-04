import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1600, 900, 1); 
        prepare();
        int pontos = 0;
        int vida = 3;
        showText("Pontos: "+pontos, 50, 25);
        showText("Vida: "+vida, 1530, 25);
    }
    
    /**
     * Prepara o mundo para o início do programa.
     * Ou seja: criar os objetos iniciais e adicioná-los ao mundo.
     */
    private void prepare()
    {
        nave nave = new nave();
        addObject(nave,200,450);
        mosca mosca = new mosca();
        addObject(mosca,794,215);
        mosca mosca2 = new mosca();
        addObject(mosca2,1159,409);
        mosca mosca3 = new mosca();
        addObject(mosca3,691,411);
        mosca mosca4 = new mosca();
        addObject(mosca4,1021,200);
        mosca mosca5 = new mosca();
        addObject(mosca5,892,578);
        mosca mosca6 = new mosca();
        addObject(mosca6,1348,251);
        mosca mosca7 = new mosca();
        addObject(mosca7,1276,647);
        mosca mosca8 = new mosca();
        addObject(mosca8,1011,333);
        mosca mosca9 = new mosca();
        addObject(mosca9,1082,740);
        mosca mosca10 = new mosca();
        addObject(mosca10,1213,136);
        mosca mosca11 = new mosca();
        addObject(mosca11,1361,505);
        mosca mosca12 = new mosca();
        addObject(mosca12,768,764);
        mosca mosca13 = new mosca();
        addObject(mosca13,838,89);
        mosca mosca14 = new mosca();
        addObject(mosca14,922,441);
        mosca13.turn(180);
        mosca.turn(180);
        mosca4.turn(180);
        mosca3.turn(180);
        mosca14.turn(180);
        mosca8.turn(180);
        mosca5.turn(180);
        mosca12.turn(180);
        mosca2.turn(180);
        mosca10.turn(180);
        mosca6.turn(180);
        mosca11.turn(180);
        mosca7.turn(180);
        mosca9.turn(180);
        pedra pedra = new pedra();
        addObject(pedra,683,217);
        pedra pedra2 = new pedra();
        addObject(pedra2,665,308);
        pedra pedra3 = new pedra();
        addObject(pedra3,586,477);
        pedra pedra4 = new pedra();
        addObject(pedra4,688,548);
        pedra pedra5 = new pedra();
        addObject(pedra5,552,703);
        pedra pedra6 = new pedra();
        addObject(pedra6,1010,789);
        pedra pedra7 = new pedra();
        addObject(pedra7,1123,519);
        pedra pedra8 = new pedra();
        addObject(pedra8,1420,758);
        pedra pedra9 = new pedra();
        addObject(pedra9,1202,825);
        pedra pedra10 = new pedra();
        addObject(pedra10,1447,567);
        pedra pedra11 = new pedra();
        addObject(pedra11,1492,396);
        pedra pedra12 = new pedra();
        addObject(pedra12,1345,325);
        pedra pedra13 = new pedra();
        addObject(pedra13,1465,75);
        pedra pedra14 = new pedra();
        addObject(pedra14,1269,60);
        pedra pedra15 = new pedra();
        addObject(pedra15,1205,273);
        pedra pedra16 = new pedra();
        addObject(pedra16,1046,86);
        pedra pedra17 = new pedra();
        addObject(pedra17,896,185);
        pedra pedra18 = new pedra();
        addObject(pedra18,725,120);
        pedra14.setLocation(1267,70);
        addObject(pedra18,952,682);
        pedra pedra19 = new pedra();
        addObject(pedra19,875,842);
        pedra pedra20 = new pedra();
        addObject(pedra20,662,587);
        pedra pedra21 = new pedra();
        addObject(pedra21,605,783);
        removeObject(pedra20);
        removeObject(pedra3);
        removeObject(pedra5);
        removeObject(pedra);
        removeObject(pedra15);
        pedra12.setLocation(1339,320);
        removeObject(pedra12);
        removeObject(pedra6);
        //Nome do Jogador
        //String nome = Greenfoot.ask("Digite seu nome: ");

    }
    
}


