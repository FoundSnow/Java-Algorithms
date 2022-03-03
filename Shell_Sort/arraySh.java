package com.company;

public class arraySh {
    private long[] my_array;
    private int element_count;

    public arraySh(int max) {
        my_array = new long[max];
        element_count = 0;
    }

    public void insert(long element) {
        my_array[element_count] = element;
        element_count++;
    }

    public void display() {
        System.out.print("My Array:");
        for (int j = 0; j < element_count; j++)
            System.out.print(my_array[j] + " ");
        System.out.println(" ");

    }
public void shellSort(){
        int inner,outer;
        long temp;

        int h = 1;

        while(h <= element_count/3)
            h=h*3 + 1;

        while(h>0){

            for (outer =h;outer<element_count;outer++){
                temp =my_array[outer];
                inner=outer;

                while (inner>h-1 && my_array[inner-h]>=temp){
                    my_array[inner] = my_array[inner-h];
                    inner-=h;
                }
                my_array[inner] = temp;
            } // end for loop
            h = (h-1)/3;
        }




}
}