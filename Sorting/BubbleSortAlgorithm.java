import java.util.ArrayList;

public class BubbleSortAlgorithm {
    BubbleSortAlgorithm(ArrayList<Integer> a) {
        int flag = 0;
        int n = a.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (a.get(j) > a.get(j + 1)) {
                    int temp = a.get(j);
                    a.set(j, a.get(j + 1));
                    a.set(j + 1, temp);
                    flag = 1;
                }
            }
            if (flag == 0) {
                break;
            }
        }
    }
    public void PrintResult(ArrayList<Integer> a){
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
};