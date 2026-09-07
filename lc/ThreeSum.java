package lc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    void threeSum(int ar[]) {

        List<List<Integer>> list = new ArrayList<>();

        Arrays.sort(ar);

        int n = ar.length;

        for (int i = 0; i < n - 2; i++) {

            // Skip duplicate first elements
            if (i > 0 && ar[i] == ar[i - 1])
                continue;

            int low = i + 1;
            int high = n - 1;

            while (low < high) {

                int sum = ar[i] + ar[low] + ar[high];

                if (sum == 0) {

                    List<Integer> l = new ArrayList<>();

                    l.add(ar[i]);
                    l.add(ar[low]);
                    l.add(ar[high]);

                    list.add(l);

                    low++;
                    high--;

                    // Skip duplicate low values
                    while (low < high && ar[low] == ar[low - 1])
                        low++;

                    // Skip duplicate high values
                    while (low < high && ar[high] == ar[high + 1])
                        high--;
                }

                else if (sum < 0) {
                    // Need a bigger sum
                    low++;
                }

                else {
                    // Need a smaller sum
                    high--;
                }
            }
        }

        System.out.println(list);
    }

    public static void main(String[] args) {

        int ar[] = {1, 2, 3, 4, 5, -1, 0, 2, 0, -2, -3};

        ThreeSum t = new ThreeSum();

        t.threeSum(ar);
    }
}