package com.corejava;
import java.util.Arrays;
import java.util.Scanner;

public class RearrangeArrayElements {
	public static void main(String[] args) {
		   new RearrangeArrayElements().inputAcceptor();
		}
	private Object inputArray;


		  public void inputAcceptor() {
		     Scanner sc = new Scanner(System.in);
		     System.out.println("Enter the Size of the array:");
		     int size = sc.nextInt();
		     if(!inputArraySizeValidator(size)){
		       System.out.println("Give Proper input");
		       return;
		}
		int[] inputArray = new int[size];
		System.out.println("Enter the elements of the array:");
		for(int i=0;i<size;i++){
		inputArray[i] = sc.nextInt();
		}
		if(!inputArrayValidator(inputArray)){
		System.out.println("Array is not sorted");
		return;
		}
		int[] outputArray = ComputeRearrangedArray(inputArray);
		displayResult(outputArray);
		}
		 public boolean inputArraySizeValidator(int size){
		return size>0;
		}
		public boolean inputArrayValidator(int[] input){

		for(int i = 0;i<input.length-1;i++){
		    if(input[i]>input[i+1]){
		        return false;
		    }
		}
		    return true;
		}
		public int[] ComputeRearrangedArray(int[] inputArray){
		int[] result = new int[inputArray.length];
		int start = 0,end = inputArray.length-1;
		boolean flag = true;
		for(int i = 0;i<inputArray.length;i++){
		if(flag)
		  result[i] = inputArray[end--];
		else
		  result[i] = inputArray[start++];
		flag=!flag;
		}
		return result;
		}
		public void displayResult(int[] outputArray){
		System.out.println(Arrays.toString(outputArray));
		}
		}


