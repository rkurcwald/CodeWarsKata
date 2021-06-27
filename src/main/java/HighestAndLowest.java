import java.util.Arrays;
public class HighestAndLowest
{
    public static String highAndLow(String numbers)
    {
        int[] arr = Arrays.stream(numbers.split(" ")).map(String::trim).mapToInt(Integer::parseInt).toArray();
        return Arrays.stream(arr).max().getAsInt()+" "+Arrays.stream(arr).min().getAsInt();
    }
}
