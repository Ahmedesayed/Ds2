package sort;


import java.util.ArrayList;
import java.util.Scanner;

public class controller {

	private static Scanner sc;
	private static parent p;


	public static void main(String[] args) {
		System.out.println("*******Welcome to Binary heap :)***********");
		sc = new Scanner(System.in);
		p = new parent();
		long time1 ;
		long time ;
		ArrayList<Integer> elements = new ArrayList<Integer>();     //For binary heap
		ArrayList<Integer> sort = new ArrayList<Integer>();			//for sortings
		ArrayList<Object> parents = new ArrayList<Object>();		
		System.out.println("Enter no of elements to sort :");
		int a = sc.nextInt();
		elements.add(a);     				  //no of elements you want to add in tree
		int element ;
		System.out.println("Enter each value then press enter :");
		for(int i=1;i<=a;i++){				//to add elements in array of sortings and binary heap
			element = sc.nextInt();
			elements.add(element);	
			sort.add(element);
		}
		System.out.println("The elements you entered before sorting :");
		System.out.println(sort);
		System.out.print("For insertion sort Enter 1 \nFor bubble sort Enter 2 \nFor quick sort Enter 3 \nFor merge sort Enter 4 \n");
		int cases=sc.nextInt();
		time=System.currentTimeMillis();
		switch(cases){
		case 1:
			 
			sort=insertionSort(sort);
			 
		case 2:
	
			sort=bubbleSort(sort);
			
		case 3:
			
			sort=quickSort(sort);
		
		case 4:
		
			sort=mergeSort(sort);
			
		}
		time1=System.currentTimeMillis();
		long diff=time1-time;
		System.out.println("The elements you entered after sorting :");
		System.out.println(sort);
		System.out.println("The sorting takes : "+diff+" milliseconds");
		for(int i=1;i<=a/2;i++){          //to add elements in binary tree
			p.setParent(elements.get(i));
			p.setLeft(elements.get(2*i));
			if(i==a/2){
											// this condition to avoid overflow in array
					p.setRight(-8888);
			}
				else
					p.setRight(elements.get(2*i+1));
			parents.add(p);
			p = new parent();
		}
		System.out.println("Your tree :");
		System.out.println(parents);
		

	}
	
	public static ArrayList<Integer> insertionSort(ArrayList <Integer> A){
		int size= A.size()-1;
		for(int i=1;i<=size;i++){
			int value = A.get(i);
			int position=i;
			while(position>0&&A.get(position-1)>value){
				A.set(position, A.get(position-1));
				
				position=position-1;
			}
			A.set(position, value);
		}
	
		return A;
		
	}
	
	public static ArrayList<Integer> bubbleSort(ArrayList <Integer> A){
		int size= A.size();
		for(int i=0;i<size-1;i++){
			for(int j=0;j<size-1;j++){
				if(A.get(j)>A.get(j+1)){
					int a=A.get(j);
					A.set(j, A.get(j+1));
					A.set(j+1, a);
				}
			}
			
		}
		return A;
		
	}
	
	public static ArrayList<Integer> mergeSort(ArrayList <Integer> A){
		
		return A;
		
	}
	
	public static ArrayList<Integer> quickSort(ArrayList <Integer> A){
		
		return A;
		
	}

}
