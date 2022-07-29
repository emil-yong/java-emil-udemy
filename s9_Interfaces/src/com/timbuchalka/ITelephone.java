package com.timbuchalka;

/**
 * Created by dev on 27/09/15.
 */
public interface ITelephone {
	// by default, interface is with CAPITAL I
	// just need to declare the interface method,
	// thats all.
	
	//So here is like the contract
	// where we define the overall valid class and methods.
    void powerOn();
    void dial(int phoneNumber);
    void answer();
    boolean callPhone(int phoneNumber);
    boolean isRinging();
}
