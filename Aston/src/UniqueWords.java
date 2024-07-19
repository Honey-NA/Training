import java.util.Collections;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Set;

public class UniqueWords {

    public void getWords(String[] arr1){
        Set<String> set1 = new HashSet<>(Arrays.asList(arr1));
        System.out.println(set1);
    }
    public void countWords(String[] arr1){
        Set<String> set2 = new HashSet<>(Arrays.asList(arr1));
        for (String s : set2) {
            System.out.println(s + " " + Collections.frequency(Arrays.asList(arr1), s));
        }
    }
}


