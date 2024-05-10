package Projet;

import java.util.ArrayList;

public class Lion extends Animaux{
    public Lion() {
        super(0,12,"Lion",false);
    }

    private int appetit = 2 ;

    @Override
    public void manger(ArrayList<Animaux> animaux){
        for (Animaux animal : animaux){
            if(animal.estMangeable()){
                animaux.remove(animal);
                appetit--;
                if(appetit==0){
                    break;
                }
            }
        }
    }

    @Override
    public void reproduire(ArrayList<Animaux> animaux) {
        if (reproduction() && !isReproductionFiniPourannee()) {
            animaux.add(new Lion());
            setReproductionFiniPourannee(true);
            setReproductionFiniPourannee(true);
        }
    }
}
