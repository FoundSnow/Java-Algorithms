package com.company;
import java.util.Random;

class ShellSortMain{
    public static void main(String[] args){
        Random rand = new Random();
        int upper = 100;
        int size = 15;
        arraySh working_array;
        working_array = new arraySh(size);

        for(int i = 0; i<size;i++){
            int n =rand.nextInt(upper);
            working_array.insert(n);
        }
        working_array.display();
        working_array.shellSort();
        working_array.display();
    }

}


