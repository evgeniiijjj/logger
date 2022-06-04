import java.util.ArrayList;
import java.util.List;

public class Filter {
    private int f;

    public Filter(int f) {
        this.f = f;
    }

    public List<Integer> filterOut(List<Integer> list) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        for (int i : list) {
            if (i > f) {
                result.add(i);
                logger.log(String.format("Элемент %d %s", i, "проходит"));
            } else {
                logger.log(String.format("Элемент %d %s", i, "не проходит"));
            }
        }
        return result;
    }
}
