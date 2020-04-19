package sorting;

import java.util.Random;

public class SortingTest<E extends Comparable<? super E>> implements Sorting<E>
{

	public static void main(String[] args) 
	{
		// sce 1 random list
		// sce 2 scending order
		// sce 3 descending order


		//int[] testCases = {10, 50, 100, 150, 300, 500, 1000, 1500};
		int[] testCases = {10, 50, 100};
		for(int i = 0 ; i < testCases.length; i++)
		{
			int testNum = testCases[i];
			System.out.println("\n\nRunning tests for n = " + testNum);
			SortingTest<Integer> sorting = new SortingTest<Integer>();
			LinkedList<Integer> list;

			//Test insertion sort
//			list  = sorting.GetNewLisWithNumbers(testNum);
//			System.out.println("\nLinked List (random) before Insertion Sort:");
//			list.printlist(list.head);
//			sorting.insertionSort(list, 0, testNum - 1, false);
//			System.out.println("\n\nLinked List (random) After Insertion Sort:");
//			list.printlist(list.head);
//
//			list  = sorting.GetAscendingOrderList(testNum);
//			System.out.println("\n\nLinked List (ascending) before Insertion Sort:");
//			list.printlist(list.head);
//			sorting.insertionSort(list, 0, testNum - 1, false);
//			System.out.println("\n\nLinked List (ascending) After Insertion Sort:");
//			list.printlist(list.head);
//
//
//			list  = sorting.GetDescendingOrderList(testNum);
//			System.out.println("\n\nLinked List (decending) before Insertion Sort:");
//			list.printlist(list.head);
//			sorting.insertionSort(list, 0, testNum - 1, false);
//			System.out.println("\n\nLinked List (decending) After Insertion Sort:");
//			list.printlist(list.head);

			System.out.println("\n");

			//Test quick sort
			 list = sorting.GetNewLisWithNumbers(testNum);
			 System.out.println("\nLinked List (random) before Quick Sort:");
			 list.printlist(list.head);
			 sorting.quicksort(list, 0, testNum - 1, false);
			 System.out.println("\n\nLinked List (random) After Quick Sort:");
			 list.printlist(list.head);

			 list = sorting.GetAscendingOrderList(testNum);
			 System.out.println("\n\nLinked List (ascending) before Quick Sort:");
			 list.printlist(list.head);
			 sorting.quicksort(list, 0, testNum - 1, false);
			 System.out.println("\n\nLinkedList (ascending) After Quick Sort:");
			 list.printlist(list.head);

			 list = sorting.GetDescendingOrderList(testNum);
			 System.out.println("\n\nLinked List (descending) before Quick Sort:");
			 list.printlist(list.head);
			 sorting.quicksort(list, 0, testNum - 1, false);
			 System.out.println("\n\nLinked List (descending) After Quick Sort:");
			 list.printlist(list.head);

//			System.out.println("\n");
//
//			//Test merge sort
//			list = sorting.GetNewLisWithNumbers(testNum);
//			System.out.println("Linked List (random) before Merge Sort:");
//			list.printlist(list.head);
//			sorting.mergeSortLL(list, false);
//			System.out.println("\n\nLinked List (random) After  Merge Sort:");
//			list.printlist(list.head);
//
//			list = sorting.GetDescendingOrderList(testNum);
//			System.out.println("\n\nLinked List (ascending) before Merge Sort:");
//			list.printlist(list.head);
//			sorting.mergeSortLL(list, false);
//			System.out.println("\n\nLinked List (ascending) After Merge Sort:");
//			list.printlist(list.head);
//			
//			list = sorting.GetAscendingOrderList(testNum);
//			System.out.println("\n\nLinked List (descending) before Merge Sort:");
//			list.printlist(list.head);
//			sorting.mergeSortLL(list, false);
//			System.out.println("\n\nLinked List (descending) After Merge Sort:");
//			list.printlist(list.head);		
					
		}
	}	
	
	// get a linked list with n elements
	private LinkedList<Integer> GetNewLisWithNumbers(int n) 
	{

		int temp_number = n;
		LinkedList<Integer> list = new LinkedList<Integer>();
		Random r = new Random();
		while (n > 0) 
		{
			list.push(r.nextInt(temp_number));
			n--;
		}

		return list;
	}

	private LinkedList<Integer> GetDescendingOrderList(int n)
	{
		int temp_number = 0;
		LinkedList<Integer> list = new LinkedList<Integer>();
		while (n > 0) 
		{
			list.push(temp_number++);
			n--;
		}

		return list;
	}

	private LinkedList<Integer> GetAscendingOrderList(int n){
		LinkedList<Integer> list = new LinkedList<Integer>();
		while (n > 0) 
		{
			list.push(n);
			n--;
		}

		return list;
	}

	@Override
	public void insertionSort(LinkedList<E> list, int lowindex, int highindex, boolean reversed) 
	{
		list.insertionSort(list.head);
	}

	@Override
	public void quicksort(LinkedList<E> list, int lowindex, int highindex, boolean reversed) 
	{
		list.quicksort(list.head, list.getLastNode());
	}

	@Override
	public void mergeSortLL(LinkedList<E> list, boolean reversed) 
	{	
		list.head = list.mergeSort(list.head);
	}
}
