package net.ukr.tasks.oop.child;


import net.ukr.tasks.oop.parents.*;

abstract class Book implements Editions {

   int circulation;
    public int getCirculation () {
        return circulation;
    }

    public void setCirculation (int circulation) {
        this.circulation = circulation;
    }

    public boolean electronic () {
        return electronic;
    }
    @Override
    public void printType () {

    }
}
