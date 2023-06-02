package Review2;

public class review {
    public static void main(String[] args) {
        boolean[][] arr2D = {
                {true, false, true, true, false},
                {true, false, false, false, false},
        };
        int sum = 0;
        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[i].length; j++)
                if (arr2D[i][j] == true)
                    sum++;
            {
            }
        }
        System.out.println(sum);
    }
}