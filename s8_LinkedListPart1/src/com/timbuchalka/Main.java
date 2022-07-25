package com.timbuchalka;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    Customer customer = new Customer("Tim", 54.96);
        Customer anotherCustomer;
        anotherCustomer = customer;
        anotherCustomer.setBalance(12.18);
        // The second class affect the first class
        // Because it relates to the memory
        // save a memory address and didn't create a new class.
        // Second are pointing to the same memory
        System.out.println("Balance for customer " + customer.getName() + " is " + customer.getBalance());

        ArrayList<Integer> intList = new ArrayList<Integer>();

        intList.add(1);
        intList.add(3);
        intList.add(4);

        for(int i=0; i<intList.size(); i++) {
            System.out.println(i +": " + intList.get(i));
        }

        intList.add(1, 2);

        for(int i=0; i<intList.size(); i++) {
            System.out.println(i +": " + intList.get(i));
        }

    }
}
//Linked list is an alternative to arrays
//actually store the actual link to the next item.
// in the list as well as the acutal data
// each element in the list actually holds a link to the item that
// as well as actual value you are wanting to actually store as well.
// So in another words, whether its linking to anything.
// it will link to the next item.


//if lets say brisbane points to perth , and perth points to canberaa
// then we can make brisbane point to where perth is pointing to which is canberaa

/*Balance for customer Tim is 12.18
0: 1
1: 3
2: 4
0: 1
1: 2
2: 3
3: 4
*/