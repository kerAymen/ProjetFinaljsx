package Projet;


import java.util.ArrayList;

public class Antilopes extends Animaux {
    public Antilopes() {
        super(0, 10, "Antilope",false);
    }

    @Override
    public boolean estMangeable() {
        if (estMort()) {
            return false;
        }
        return true;
    }

    @Override
    public void manger(Herbe herbe) {
        if (!estMort()){
            if (herbe.getMetreCarre() >= 100){
                herbe.setMetreCarre(herbe.getMetreCarre() - 100);
            }
            else {
                herbe.setMetreCarre(0);
                this.age = 100;
            }
        }
    }
    @Override
    public boolean estMort(){
        if (age > esperanceVie){
            return true;
        }
        else {
            return false;
        }

    }

    @Override
    public void reproduire(ArrayList<Animaux> animaux){
        if (reproduction() && !isReproductionFiniPourannee()) {
            animaux.add(new Antilopes());
            setReproductionFiniPourannee(true);
            setReproductionFiniPourannee(true);
        }
    }
}
