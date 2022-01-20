package org.example;

/**
 * What is inheritence?
 * we can extend on class into an other (all attributes and method from
 * parent class are inherited by the child class)
 * Dry - dont have to write the same code again
 */
public class App 
{
    public static void main( String[] args )
    {
       MyChildClass child = new MyChildClass(200f);
       MyParentClass  parents = new MyParentClass(123.123f);

        child.parentMethod();
       child.childMethod();
       parents.parentMethod();


       Song myFav= new Song (2.45f, "mp3", "I Put A Spell On You", "Someone");
       myFav.printTrackInfo();
        System.out.println(myFav.filename());

        String[] guest = {"Robert Parker", "James Halliday"};

        Podcast wineForNormalPeople = new Podcast(65, "Bordeaux", "mp3", new String[]{"Robert Parker", "James Halliday"});
        wineForNormalPeople.printTrackInfo();
        wineForNormalPeople.printGuest();

    }
}
