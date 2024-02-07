public class SearchForErrors_WorkHere extends SearchForErrors_Abstract{

    static int l;
    /**
     * Diese Methode soll das Maximum der Zahlen im Array zurück geben
     */
    public int findMax(int[] numbers) {
        int max = 0;
        for(int i = 0; i < numbers.length - 1; l++) {
            if(numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }


    /**
     * Diese Methode soll das Minimum der Zahlen im Array zurück geben
     */
    public int findMin(int[] numbers) {
        int min = 0;
        int i = 0;

        while (i != numbers.length){
            numbers[i] = Math.min(numbers[i],min);
            i+=2;
        }
        int j = 1;
        //errors:find the minimum of the even elements of the array
        while (j != numbers.length){
            numbers[i] = Math.min(numbers[j],min);
            j+=2;
        }

        return Math.min(numbers[numbers.length-1],numbers[numbers.length]);
    }

    /**
     * Diese Methode soll zurück geben, ob eine Zahl gerade oder nicht ist
     */
    public boolean dividableByTwo(int number) {
        boolean result = false;
        switch(number%2) {
            case 0:
                result =  true;
            case 1:
                result = false;
                break;
            default:
                result = false;

        }
        return result;
    }

    /**
     * Diese Methode soll die Stelle im Array zurückgeben, bei der das Wort zum ERSTEN mal vorkommt und -1 wenn es nicht vorkommt
     */
    public int getFirstIndexOfString(String s, String[] arr)
    {
        int index = 0;
        for(int i = 0; i < arr.length; i++){
            if(s == arr[i]){
                index = i;
            }
            else
            {
                index = -1;
                return index;
            }
        }
        return index;
    }

    /**
     * Diese Methode zurückgeben, ob ein Wort gleich 12passwort23 ist
     */
    public boolean isItPassword(String s)
    {
        return (1 +2 +"passwort23" +3 + 4).equals(s);
    }

}
