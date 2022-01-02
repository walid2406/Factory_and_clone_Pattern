package com.company;


import com.company.Creator.ShapeFactory;
import com.company.Product.Carre;
import com.company.Product.Shape;
import com.company.clonnageFactory.CloneFactory;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //factoring process
        ShapeFactory factory=new ShapeFactory();
        factory.getShape("cercle").dessiner();
        factory.getShape("carre").dessiner();
        factory.getShape("").dessiner();

        //clonning process
        CloneFactory cloneFactory=new CloneFactory();
        Shape origine=factory.getShape("carre");
        Shape copied=(Shape) cloneFactory.getClone((Carre) origine);
        copied.dessiner();


    }
}
