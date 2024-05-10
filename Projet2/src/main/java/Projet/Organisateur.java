package Projet;

import java.util.ArrayList;

public class Organisateur {
    public void setAnimaux(ArrayList<Animaux> animaux) {
        this.animaux = animaux;
    }

    public ArrayList<Animaux> getAnimaux() {
        return animaux;
    }

    ArrayList<Animaux> animaux = new ArrayList<Animaux>();
    ArrayList<Animaux> vivant = new ArrayList<Animaux>();

    public void vieillir() {
        vivant.clear();
        for (Animaux animal : animaux) {
            animal.augmentationAge();
            if (!animal.estMort()) {
                vivant.add(animal);
            }
        }
        animaux = vivant;
        vivant.clear();
    }

    public void reproductionAnimaux() {
        for (Animaux animal : animaux) {
            if (animal.getType().equals("Lion") && (!animal.isReproductionFiniPourannee()) && animal.reproduction()) {
                for (Animaux animal2 : animaux) {
                    animal2.reproduire(animaux);
                }
            } else if (animal.getType().equals("Antilope") && (!animal.isReproductionFiniPourannee()) && animal.reproduction()) {
                for (Animaux animal2 : animaux) {
                    animal2.reproduire(animaux);
                }
            }
        }
    }


        public void mangerLion(){
            vivant.clear();
            int compteur = 0;
            for (Animaux animal : animaux) {
                if (animal.getType().equals("Lion")) {
                    animal.manger(animaux);
                    vivant.add(animal);
                    compteur++;

                } else {
                    animal.manger(animaux);
                    vivant.add(animal);
                }

            }
            animaux = vivant;
            vivant.clear();
        }
    }
