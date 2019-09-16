package net.ukr.tasks.oop.child;

import net.ukr.tasks.oop.parents.Fabric;

public abstract class Clothes implements Fabric {
    boolean gender = false; // false - female, true - male

    public boolean isGender () {
        return gender;
    }
}
