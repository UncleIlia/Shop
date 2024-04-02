import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LengthSorter implements Sorter {
    @Override
    public void sort(List<String> list) {
        Collections.sort(list, byLength);
    }

    Comparator<String> byLength = new Comparator<String>() {
        @Override
        public int compare(String s1, String s2) {
            return s1.length() - s2.length();
        }
    };
}
