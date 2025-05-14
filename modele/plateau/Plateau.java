package modele.plateau;


import java.util.Observable;
import java.util.Observer;
import modele.jeu.*;



public class Plateau extends Observable{
    final public int SIZE_X = 8, SIZE_Y = 8;

    Case[][] tabCase;






    public Case[][] getCases() {
        return tabCase;
    }


    
}
