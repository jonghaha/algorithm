package hackerRank;

public class Staircase {
    static void staircase(int n) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(j >= n-i-1) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // intput
        // 6
        // output
        //      #
        //     ##
        //    ###
        //   ####
        //  #####
        // ######
    }
}
