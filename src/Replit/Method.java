package Replit;

import com.sun.tools.javac.Main;

public class Method {

    static int sumArray(){
        int sum=0;
        int[][] a = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
        };
        for(int i=0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++){
                sum=sum+a[i][j];
            }
        }
       return sum;
        }

    public static void main(String[] args) {
        Method obj=new Method();
        System.out.println(sumArray());
    }
}