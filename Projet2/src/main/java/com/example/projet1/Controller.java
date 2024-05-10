package com.example.projet1;

import Projet.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import sun.awt.windows.WLabelPeer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Controller {
    @FXML
    private TextField lion;

    @FXML
    private TextField antilope;

    @FXML
    private TextField herbe;

    @FXML
    private Label anneeEnCours;

    @FXML
    private Label lionsEnVies;

    @FXML
    private Label antilopesEnVies;

    @FXML
    private Label herbesRestantes;

    @FXML
    private Label lionsNes;

    @FXML
    private Label lionsMorts;
    @FXML
    private Label antilopesNes;
    @FXML
    private Label antilopesMorts;

    Herbe herbe1 = new Herbe();
    Organisateur org = new Organisateur();
    Antilopes antilope1 = new Antilopes();
    private int annee = 0;
    private int nesLion = 0;
    private int mortsLion = 0;
    private int nesAntilope = 0;
    private int mortsAntilope = 0;


    public void compteurAZero() {
        nesLion = 0;
        mortsLion = 0;
        nesAntilope = 0;
        mortsAntilope = 0;
    }

    public void affichage() {
        int lionsVivants = 0;
        int antilopesVivants = 0;
        for (Animaux animal : org.getAnimaux()) {
            if (!animal.estMort()) {
                if (animal.getType().equals("Lion")) {
                    lionsVivants++;
                } else if (animal.getType().equals("Antilope")) {
                    antilopesVivants++;
                }
            } else{
                if (animal.getType().equals("Lion")) {
                    mortsLion++;
                } else if (animal.getType().equals("Antilope")) {
                    mortsAntilope++;
                }
            }

        }

        lionsEnVies.setText(String.valueOf(lionsVivants));
        antilopesEnVies.setText(String.valueOf(antilopesVivants));
        lionsMorts.setText(String.valueOf(mortsLion));
        antilopesMorts.setText(String.valueOf(mortsAntilope));
        herbesRestantes.setText(String.valueOf(herbe1.getMetreCarre()));
    }

    @FXML
    public void onClickEnvoyer(ActionEvent actionEvent) {
        int nbrLion = Integer.parseInt(lion.getText());
        int nbrAntilope = Integer.parseInt(antilope.getText());
        int nbrHerbe = Integer.parseInt(herbe.getText());

        herbe1.setMetreCarre(nbrHerbe);
        org.getAnimaux().clear();

        for (int i = 0; i < nbrLion; i++) {
            org.getAnimaux().add(new Lion());
        }
        for (int i = 0; i < nbrAntilope; i++) {
            org.getAnimaux().add(new Antilopes());
        }


        affichage();
        annee = 0;
        anneeEnCours.setText(String.valueOf(annee));
    }

    @FXML
    public void onClickPlus1An(ActionEvent actionEvent) {
        org.vieillir();
        org.mangerLion();
        antilope1.manger(herbe1);
        org.reproductionAnimaux();
        herbe1.reproductionHerbe();
        ArrayList<Animaux> animaux = org.getAnimaux();
        Random rand = new Random();
        Collections.shuffle(animaux, rand);
        org.setAnimaux(animaux);
        annee++;
        affichage();
        anneeEnCours.setText(String.valueOf(annee));
    }



}



