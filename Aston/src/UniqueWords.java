import java.util.Collections;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Set;

public class UniqueWords {
    public void getWords(String[] arr1) {
        Set<String> set = new HashSet<>(Arrays.asList(arr1));
        System.out.println(set);
        for (String s : set) {
            System.out.println(s + " " + Collections.frequency(Arrays.asList(arr1), s));
        }
    }
}

