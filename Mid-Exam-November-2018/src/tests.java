import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class tests {
    public static void main(String[] args) {
        List<String> test = new ArrayList<>(Arrays.asList("a","b","c","d"));

        test.add(1,"t");

        System.out.println(test.toString());
    }
}
