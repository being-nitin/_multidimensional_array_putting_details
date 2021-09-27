package com.nitincodes;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        int maxAge = arr[0][0];
        int maxHeight = arr[0][0];
        for(int rollNo=0;rollNo<arr.length;rollNo++){
            for(int age=0;age<arr[rollNo].length;age++){
                arr[rollNo][age] = sc.nextInt();
                }
            System.out.println(arr);
            }
        for(int i =0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]>maxAge){
                    System.out.println();
                }
            }
        }


    }
}


