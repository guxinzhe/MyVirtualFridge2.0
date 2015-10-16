/**
 * Created by Felix on 16.10.15.
 */
public class binaerBaum {

    public int anzahl;
    public static String name;
    public boolean firstTimeUse;

    public void main (String[] args) {
        System.out.print("lol");
        System.out.print("PETER LUSTIG :)");

    }

    public binaerBaum () {
        this(5, "default");
    }

    public binaerBaum (int zahl, String name) {
        anzahl = zahl;
        this.name = name;
        firstTimeUse = false;
    }

}
