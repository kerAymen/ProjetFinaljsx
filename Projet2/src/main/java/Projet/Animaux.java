package Projet;

import java.util.ArrayList;

public class Animaux {

    protected int age;
    protected int esperanceVie;
    protected String type;
    protected boolean reproductionFiniPourannee = false;

    public boolean isReproductionFiniPourannee() {
        return reproductionFiniPourannee;
    }

    public void setReproductionFiniPourannee(boolean reproductionFiniPourannee) {
        this.reproductionFiniPourannee = reproductionFiniPourannee;
    }

    public boolean reproduction() {
        if (age > 2) {
            return true;
        } else {
            return false;
        }
    }

    public void augmentationAge() {
       if (age <= esperanceVie) {
           age++;
       }
    };


    public Animaux(int age, int esperanceVie, String type, boolean reproductionFiniPourannee) {
        this.age = age;
        this.esperanceVie = esperanceVie;
        this.type = type;
        this.reproductionFiniPourannee = reproductionFiniPourannee;
    }

    public void manger(ArrayList<Animaux> animaux){

    }
    public void manger(Herbe  herbe){

    }
    public void reproduire(ArrayList<Animaux> animaux){

    }

    public boolean estMort(){
        if (age > esperanceVie){
            return true;
        }
        else {
            return false;
        }
    }


    public boolean estMangeable() {
        return false;
    }

    public int getAge() {
        return age;
    }

    public int getEsperanceVie() {
        return esperanceVie;
    }

    public String getType() {
        return type;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEsperanceVie(int esperanceVie) {
        this.esperanceVie = esperanceVie;
    }

    public void setType(String type) {
        this.type = type;
    }

}
