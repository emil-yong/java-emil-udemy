package com.timbuchalka;

import java.util.HashSet;
import java.util.Set;

/*
 * A Set is meant to be unique but if two objects are pointing in the different reference then it will allows duplicates
 * To check we just see if it is equal.
 */
/**
 * Created by dev on 12/01/2016.
 */
public final class HeavenlyBody {
    private final String name;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;

    public HeavenlyBody(String name, double orbitalPeriod) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public boolean addMoon(HeavenlyBody moon) {
        return this.satellites.add(moon);
    }

    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(this.satellites);
    }

    // Check if the object is equal
    // referencing to the same thing.
    // Need to override equal and hashcode
    
    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }

        System.out.println("obj.getClass() is " + obj.getClass());
        System.out.println("this.getClass() is " + this.getClass());
        if ((obj == null) || (obj.getClass() != this.getClass())) {
            return false;
        }

        //Cast this obj as the HeavenlyBody Class.
        String objName = ((HeavenlyBody) obj).getName();
        return this.name.equals(objName);
    }
    
    @Override
    public int hashCode() {
        System.out.println("hashcode called");
        return this.name.hashCode() + 57;
    }
 

















}
