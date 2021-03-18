package greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution3 {
    public static void main(String[] args) {
        int n;
        ArrayList<Integer> arrayList = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            arrayList.add(sc.nextInt());
        }
        Collections.sort(arrayList);

        int result = 0;
        int count = 0;
        for(int i = 0; i < arrayList.size(); i++) {
            count += 1;
            if(count >= arrayList.get(i)) {
                result += 1;
                count = 0;
            }
        }
        System.out.println(result);
    }
}
