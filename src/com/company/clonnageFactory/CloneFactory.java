package com.company.clonnageFactory;

import com.company.Product.Carre;
import com.company.Product.Shape;

public class CloneFactory {

    public Carre getClone(Carre anyshape){

       return  anyshape.makeCopy();

    }
}
