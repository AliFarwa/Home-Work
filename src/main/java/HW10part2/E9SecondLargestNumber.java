package HW10part2;

public class E9SecondLargestNumber {
    public static void main(String[] args) {
//Write a java program to find the second largest
//number in the array?
        int[] num = {20, 30, 40, 50};

        int largest = 0;//30
        int secondLargest = 1;// 20

        if (num[0] > num[1]) {
            {
                largest = num[1];
                secondLargest = num[0];
            }
        } else {
            largest = num[0];
            secondLargest = num[1];

        } for (int i = 2; i <num.length ; i++) {

            if(num[i]>largest){
               secondLargest=largest;
                largest=num[i];
            }
         else if (num[i] >secondLargest) {
             secondLargest = num[i];
            // largest=num[i];
            }
            //System.out.println("The Second largest number is" + secondLargest);
        }
        System.out.println("The Second largest number is " + secondLargest);
    }
}