package HW10part2;

public class E1Temperatures {
    public static void main(String[] args) {
     /*Create a program that uses an array to store a list of
temperatures for a week, and then uses a loop to find
the highest and lowest temperature for the week.*/
        int[][] temperature = {
                {10, 20},
                {20, 30},
                {30, 40},
                {50, 60},
                {70, 80},
                {80, 90},
                {90, 100},
        };
        int min = temperature[0][0];
        int max = temperature[0][0];

        for (int i = 0; i < temperature.length; i++) {
            for (int j = 0; j < temperature[i].length; j++) {
                if (temperature[i][j] < min) {
               min= temperature[i][j];

                }else if (temperature[i][j] > max) {

                    max=temperature[i][j];
                    }
                }
            }

            System.out.println("The temperature is" + min);
            System.out.println("The temperature is" + max);



    }
}


