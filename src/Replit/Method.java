package Replit;

import com.sun.tools.javac.Main;

class Mains {

    static int sumArray(){
        int sum=0;
        int[][] a = {

                { 1, 2, 3 },

                { 4, 5, 6 },

                { 7, 8, 9 }

        };
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a.length; j++){
                sum=sum+a[i][j];
            }

        }
        return sum;
    }
}

class Method extends Mains{
    public static void main(String[] args) {
        //System.out.println("hello world");
        Method obj = new Method();
        System.out.println(obj.sumArray());
    }
}
