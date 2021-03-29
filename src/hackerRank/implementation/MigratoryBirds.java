package hackerRank.implementation;

import java.util.List;

public class MigratoryBirds {
    static int solution(List<Integer> arr) {
        int[] birdTypeCount = new int[5];

        for(int i = 0; i < arr.size(); i++) {
            birdTypeCount[arr.get(i)-1]++;
        }

        int frequency = 0;
        int frequencyType = 0;

        for(int i = 0; i < birdTypeCount.length; i++) {
            if(birdTypeCount[i] > frequency){
                frequency = birdTypeCount[i];
                frequencyType = i + 1;
            }
        }

        return frequencyType;
    }

    public static void main(String[] args) {
        // input
        // 6
        // 1 4 4 4 5 3
        // output
        // 4
    }
}
