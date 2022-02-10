package com.company;

public class Sort {
    public void Selection_Sort(int Array[]){
        int pos;
        int temp;
        for (int i = 0; i < Array.length; i++)            // index of the array in which we place the elements
        {
            pos = i;
            for (int j = i+1; j < Array.length; j++) {
                if (Array[j] < Array[pos])                  //find the index of the smallest element
                {                                           // if element already in proper spot nothing happens
                    pos = j;
                }
            }

            temp = Array[pos];            //swap the current element with the smallest element
            Array[pos] = Array[i];
            Array[i] = temp;
        }

    }


    public void Bubble_sort(int Array[], int size){
        if (size == 1)                     // once this is equal to 1 it's been sorted and finishes
        {
            return;
        }

        for (int i=0; i<size-1; i++)       // goes through elements from start to finish
        {
            if (Array[i] > Array[i+1])      //check to see i elements to the right are in order
            {                           // change position if they aren't in order
                int temp = Array[i];
                Array[i] = Array[i+1];
                Array[i+1] = temp;
            }
        }

        Bubble_sort(Array, size-1);


    }

    public void display(int Array[]){

        for (int j : Array) {
            System.out.print(j + " ");
        }

    }


}
