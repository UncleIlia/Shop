import java.util.Collections;
import java.util.List;

public class AlphabeticalSorter implements Sorter{

    @Override
    public void sort(List<String> list) {
        Collections.sort(list);
    }
}
