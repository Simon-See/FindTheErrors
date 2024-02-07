public class SearchForErrors_Hints extends SearchForErrors_Abstract{

    static int l;
    /**
     * Diese Methode soll das Maximum der Zahlen im Array zurück geben
     */
    public int findMax(int[] numbers) {
        int max = 0; //errors:if all array elements are negative the method will falsely return 0
        for(int i = 0; i < numbers.length - 1; l++) { //errors:usage of l instead of i, not getting the last number because of the -1
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
        int min = 0; //errors: if all elements are greater than 0 the retuned minimum will be 0 but it should be the smallest element of the array
        int i = 0;
        //errors:find the minimum of the even elements of the array
        while (i != numbers.length){ //errors: use < instead of !=
            numbers[i] = Math.min(numbers[i],min); //errors: do not override the values of the numbers array it will affect the caller
            i+=2;
        }
        int j = 1;
        //errors:find the minimum of the even elements of the array
        while (j != numbers.length){ //errors:use < instead of !=
            numbers[i] = Math.min(numbers[j],min); //errors:do not use i as the index, do not override the values of the numbers array it will affect the caller
            j+=2;
        }

        return Math.min(numbers[numbers.length-1],numbers[numbers.length]); //errors: one should return min after one actually sets it in the loops
    }

    /**
     * Diese Methode soll zurück geben, ob eine Zahl gerade oder nicht ist
     */
    public boolean dividableByTwo(int number) {
        boolean result = false;
        switch(number%2) {
            case 0:
                result =  true; //errors:add the break otherwise false will always be returned
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
            if(s == arr[i]){ //errors:use .equals for string comparison
                index = i; //errors:one should return i here because otherwise the last apperance of the String will be returned
            }
            else
            {
                index = -1;
                return index; //errors:get rid of the else completly if not -1 will be returned if the array is not equal to s for every element
            }
        }
        return index;
    }

    /**
     * Diese Methode zurückgeben, ob ein Wort gleich 12passwort23 ist
     */
    public boolean isItPassword(String s)
    {
        return (1 +2 +"passwort23" +3 + 4).equals(s); //errors:one should not add the 1 and 2 when they are not strings because the String we compare it to should be 12passwort34 not 3passwort2334
    }

}
