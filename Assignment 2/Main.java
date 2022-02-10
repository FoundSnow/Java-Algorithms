package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner size = new Scanner(System.in);
    System.out.println("Size of array:");
    int size1 = size.nextInt();
    System.out.println("Filling array with random int");
    int[] array = new int[size1];

		Random random = new Random();
    for (int i = 0;i<size1;i++){
		array[i] = random.nextInt(1000);

	}

	Sort Bubble_obj = new Sort();
    long Ssort1 = System.nanoTime();
	Bubble_obj.Bubble_sort(array,array.length);
	long Esort1 = System.nanoTime();
	long time  = Esort1-Ssort1;
	System.out.println("Bubble Sort sorted the array in "+time+" nanoseconds");
	Bubble_obj.display(array);

	System.out.println();

	Sort Selection_obj = new Sort();
	long Ssort2 = System.nanoTime();
	Selection_obj.Selection_Sort(array);
	long Esort2 = System.nanoTime();
	long time2 = Esort2-Ssort2;
	System.out.println("Selection Sort sorted the array in "+time2+" nanoseconds");
	Selection_obj.display(array);

	System.out.println();
	Scanner wanted = new Scanner(System.in);
	System.out.println("What integer do you want to look for: ");
	int Wantedint = wanted.nextInt();
	Search look = new Search();
	long startTime1 = System.nanoTime();
	look.linear(array,Wantedint);
	long endTime1 = System.nanoTime();
	System.out.println("Linear " + (endTime1 - startTime1) + " nanoseconds");
	long finish1 = endTime1 - startTime1;

	long startTime2 = System.nanoTime();
	look.binary(array,Wantedint);
	long endTime2 = System.nanoTime();
	System.out.println("Binary " + (endTime2 - startTime2) + " nanoseconds");
	long finish2 = endTime2 - startTime2;

	if(finish1 < finish2)
		System.out.println("Linear Was Faster");
	else
		System.out.println("Binary Was Faster");

    }
}
