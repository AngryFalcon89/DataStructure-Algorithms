import java.util.ArrayList;

public class Sorting {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(8);
        a.add(5);
        a.add(7);
        a.add(3);
        a.add(2);
        // BubbleSortAlgorithm b = new BubbleSortAlgorithm(a);
        // b.PrintResult(a);
        InsertionSortAlgorithm c = new InsertionSortAlgorithm(a);
        c.PrintResult(a);
    }
}