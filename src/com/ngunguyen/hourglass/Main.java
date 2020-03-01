package com.ngunguyen.hourglass;

public class Main {

    public static void main(String[] args) {
        //This is the HackerRank 2D challenge.
        //Get the largest value of the hourglass.
        int[][] arr = {{3, 2, 6, 5, 6, 7},
                       {9, 3, 5, 7, 3, 5},
                       {7, 2, 5, 8, 8, 3},
                       {3, 3, 7, 7, 2, 2},
                       {4, 7, 3, 3, 1, 1},
                       {6, 6, 5, 5, 1, 2}};

        getGreatestValueOfTheHourglass(arr);
    }

    private static void getGreatestValueOfTheHourglass(int[][] arr) {
        Integer result = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length-2; i++){
            for(int j = 0; j < arr[i].length-2; j++){
                Integer currentValue = arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1] + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
                result = Math.max(result, currentValue);
            }
        }
        System.out.println(result);
    }
}
