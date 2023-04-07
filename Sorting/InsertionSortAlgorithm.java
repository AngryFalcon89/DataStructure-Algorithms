import java.util.ArrayList;

public class InsertionSortAlgorithm {
    InsertionSortAlgorithm(ArrayList<Integer> a) {
        int n = a.size();
        for (int i = 1; i < n; i++) {
            int j = i - 1;
            int x = a.get(i);
            while (j > -1 && a.get(j) > x) {
                a.set(j + 1, a.get(j));
                j--;
            }
            a.set(j + 1, x);
        }
    }

    public void PrintResult(ArrayList<Integer> a) {
        for (int e : a) {
            System.out.print(e + " ");
        }
    }
}
