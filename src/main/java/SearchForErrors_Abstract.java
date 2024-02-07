public abstract class SearchForErrors_Abstract {
    public abstract int findMax(int[] numbers);


    /**
     * Diese Methode soll das Minimum der Zahlen im Array zurück geben
     */
    public abstract int   findMin(int[] numbers);

    /**
     * Diese Methode soll zurück geben, ob eine Zahl gerade oder nicht ist
     */
    public abstract boolean dividableByTwo(int number);

    /**
     * Diese Methode soll die Stelle im Array zurückgeben, bei der das Wort zum ERSTEN mal vorkommt und -1 wenn es nicht vorkommt
     */
    public abstract int getFirstIndexOfString(String s, String[] arr);

    /**
     * Diese Methode zurückgeben, ob ein Wort gleich 12passwort23 ist
     */
    public abstract boolean isItPassword(String s);
}
