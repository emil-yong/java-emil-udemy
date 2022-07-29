package com.timbuchalka;
/*
 * interface we are creating there is no actual code for it
 * you only supply the acutal method and the parameters to call it
 * Actual code only goes in the acutal class you are creating.
 * 
 * 
 * Interface is used by several classes by having them all implementing the same 
 * behaviour/ standardize all the classes!
 * 
 * 
 * LinkedList<string> = new LinkedList<string>();
 * with interface it can change to
 * List<string> = new LinkedLIst<string>() this is because of Java Using interface.
 * so it can change to generic List
 * 
 * Look at the list interface, Public list interface 
 * 
 * So it is advisible to first initialised a basic type (list) then when you want to initalised, you specify the actual type Arraylist , linked list etc
 */
public class Main {

    public static void main(String[] args) {
        ITelephone timsPhone;
        timsPhone = new DeskPhone(123456);
        timsPhone.powerOn();
        timsPhone.callPhone(123456);
        timsPhone.answer();

    }
}
