package com.company;

import java.util.Scanner;

class insertion {
    public int[] insertElement(int [] myArray){   // insert all the elements
        int leng = myArray.length;
        Scanner insert_input = new Scanner(System.in);
        System.out.println("Insert Elements:");
        for (int i = 0; i<leng;i++){
            myArray[i] = insert_input.nextInt();

        }
        return myArray;
    }
}

class deletion {
    public int[] delete_element(int[] myArray) {            // delete a single element
        Scanner delete_input = new Scanner(System.in);
        System.out.println("What number do you wish to delete?: ");
        int wanted = delete_input.nextInt();
        int j;
        for (j = 0; j < myArray.length; j++) {
            if (myArray[j] == wanted) {
                break;
            }
        }
            for (int k = j; k < myArray.length - 1; k++) {
                myArray[k] = myArray[k + 1];

            }

        return myArray;
    }
}
    class search {                                      // search the built array for certain element
        public void find(int[] myArray) {
            int found = 1;
            Scanner search_input = new Scanner(System.in);
            System.out.println("What number do you want to search the array for?: ");
            int key = search_input.nextInt();
            for (int i = 0; i < myArray.length; i++) {
                if (key == myArray[i]) {
                    System.out.println(" Number " + key + " found at index " + i);
                    found = 1;
                    break;
                } else {
                    found = 0;
                }
            }
            if(found == 0){
                System.out.println("Number not found in array!");
            }

        }

    }


    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of the array that is to be created::");  // create array
            int size = sc.nextInt();
            int[] practice_arr = new int[size];

            insertion new_insert = new insertion();
            practice_arr = new_insert.insertElement(practice_arr);              // fill array

            System.out.print("Your Array: ");

            for (int i = 0; i < practice_arr.length; i++) {             // print array
                System.out.print(practice_arr[i] + " ");

            }
            System.out.println();

            search look_for = new search();
            look_for.find(practice_arr);                        // search array

            deletion delete = new deletion();
            practice_arr = delete.delete_element(practice_arr);     // delete single array

            System.out.print("Your Array: ");
            for (int i = 0; i < practice_arr.length - 1; i++) {
                System.out.print(practice_arr[i] + " ");            // print new array

            }


        }
    }

