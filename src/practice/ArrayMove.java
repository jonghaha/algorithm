package practice;

public class ArrayMove {
    static int[] row;
    static int standing;

    public ArrayMove(int n, int position) {
        row = new int[n];
        for(int i = 0; i < n; i++) {
            row[i] = i;
        }

        standing = position;
    }

    public void left() {
        if(row.length > standing) {
            for(int i = standing; i < row.length - 1; i++) {
                row[i] = row[i+1];
            }
            int [] temp = new int[row.length - 1];
            for(int i = 0; i < temp.length; i++) {
                temp[i] = row[i];
            }
            row = new int[temp.length];
            for(int i = 0; i < temp.length; i++) {
                row[i] = temp[i];
            }

            standing = standing - 2;
        }
    }

    public void right() {
        if(row.length > standing) {
            for(int i = standing; i < row.length - 1; i++) {
                row[i] = row[i+1];
            }
            int [] temp = new int[row.length - 1];
            for(int i = 0; i < temp.length; i++) {
                temp[i] = row[i];
            }
            row = new int[temp.length];
            for(int i = 0; i < temp.length; i++) {
                row[i] = temp[i];
            }
            standing = standing + 1;
        }
    }

    public int position() {
        return row[standing];
    }

    public static void main(String[] args) {
        ArrayMove arrayMove = new ArrayMove(6, 3);
        System.out.println(arrayMove.position());

        arrayMove.left();
        System.out.println(arrayMove.position());

        arrayMove.right();
        System.out.println(arrayMove.position());
    }
}
