package Projet;

public class Herbe {
    protected int metreCarre;

    public int getMetreCarre() {
        return metreCarre;
    }

    public void setMetreCarre(int metreCarre) {
        this.metreCarre = metreCarre;
    }

    public void reproductionHerbe(){
        metreCarre = (int) (metreCarre * 2.2);
        if (metreCarre > 4000000){
            metreCarre = 1000000;
        }
    }
}
