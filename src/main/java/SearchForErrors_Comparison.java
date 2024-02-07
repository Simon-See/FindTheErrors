import java.util.Arrays;

public class SearchForErrors_Comparison extends SearchForErrors_Abstract{
    @Override
    public int findMax(int[] numbers) {
        return Arrays.stream(numbers).max().getAsInt();
    }

    @Override
    public int findMin(int[] numbers) {
        return  Arrays.stream(numbers).min().getAsInt();
    }

    @Override
    public boolean dividableByTwo(int number) {
        return (number %2 ==0);
    }

    @Override
    public int getFirstIndexOfString(String s, String[] arr) {
        for (int i = 0; i < arr.length; i++)
        {
            if(s.equals(arr[i]))
                return i;
        }
        return -1;
    }

    @Override
    public boolean isItPassword(String s) {
        return s.equals("12passwort23");
    }

}
