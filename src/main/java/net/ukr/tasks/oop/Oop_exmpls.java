package net.ukr.tasks.oop;

import net.ukr.tasks.oop.child.Dictionary;
import net.ukr.tasks.oop.child.Laser;
import net.ukr.tasks.oop.child.Suite;

public class Oop_exmpls {

 public static void main (String[] args) {
     Dictionary dctnr = new Dictionary ();
     dctnr.getAuthor ();
     dctnr.setAuthor ("Ну не знаю, Пушкин там, наверн");
     dctnr.getAuthor ();
     System.out.println ("Кто автор? "  + dctnr.getAuthor ());

     dctnr.setCirculation (100000);
     System.out.println ("Какой тираж? " + dctnr.getCirculation ());

     Suite st = new Suite ();
     st.isGender ();
     System.out.println ("Костюм мужской? " + st.isGender ());
     st.getOriginal ();
     System.out.println ("Костюм новый? " + st.getOriginal ());



     Laser la = new Laser ();
     la.getMadeIn ();
     System.out.println ("Сделано в США? " + la.getMadeIn ());


     la.isMoney ();
     System.out.println ("На нём можно печатать денюжки? " + la.isMoney());

    la.setColour ("красный");
    la.getColour ();
     System.out.println ("Какого цвета? " + la.getColour ());
 }

}
