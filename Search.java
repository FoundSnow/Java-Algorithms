package com.company;


public class Search {

    public void linear(int Array[], int target){
        int truth = 0;
        for( int i= 0 ;i < Array.length ; i++ ){
            if( Array[i] == target){
                System.out.println("Number Found at index "+ i);
                break;
            } else {
                truth = 1;
            }

        }
        if (truth == 0){
            System.out.println("Number Not Found");
        }

    }

    public void binary(int Array[], int target ){
        int truth = 0;
        int begin = 0;
        int end = Array.length - 1;
        while (begin <= end) {
            int middle = begin + (end - begin) / 2;

                                                                    // Check to see if x is present at middle position
            if (Array[middle] == target) {
                System.out.println("Number Found at index: " + middle);
                truth = 1;
                break;
            }
                                                                        // If x greater, ignore left half
            if (Array[middle] < target) {
                begin = middle + 1;

                                                                        // If x is smaller, ignore right half
            }else {
                end = middle - 1;
            }
        }
           if (truth == 0)
                System.out.println("Number Not Found");

    }



}
