package net.ukr.tasks.oop.child;

import net.ukr.tasks.oop.parents.Device;

abstract class Printer implements Device
{
boolean money = false;
public boolean isMoney() {
    return false;
};
    public String madeIn = "в китае";

    public String getMadeIn () {
        return madeIn;
    }


}
