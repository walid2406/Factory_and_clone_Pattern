package com.company.Creator;

import com.company.Product.Carre;
import com.company.Product.Cercle;
import com.company.Product.Shape;
import com.company.Product.Triangle;

public class ShapeFactory {
    public Shape getShape(String shape)
    {
        if (shape.equals("cercle")) {
            return new Cercle();
        }
        else if (shape.equals("carre")){
            return new Carre();
        }
        return new Triangle();


    }
}
