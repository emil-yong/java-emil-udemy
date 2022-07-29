package com.timbuchalka;

/**
 * Created by dev on 27/09/15.
 */
public class Gearbox {

    private boolean clutchIsIn;

    public void operateClutch(boolean inOrOut) {
        this.clutchIsIn = inOrOut;
    }
    
    /*
     * right now, the first parameter is a string 
     * and if in furture other argument is not string,
     * it will be a problem.
     * 
     * if in large code it is goign to be a problem
     * 
     * So a interface is like a contract where the condition 
     * will not change
     */
}
