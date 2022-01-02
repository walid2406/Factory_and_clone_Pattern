package com.company.Product;

import com.company.clonnageFactory.ShapeClone;

public class Carre implements Shape, ShapeClone {
    @Override
    public void dessiner() {
        System.out.println("je dessine un carre");
    }

    @Override
    public Carre makeCopy() {

       Carre copie=null;
        try {
            copie=(Carre) super.clone();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }


        return copie;
    }
}
