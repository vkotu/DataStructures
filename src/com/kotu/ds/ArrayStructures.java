package com.kotu.ds;

public class ArrayStructures {
	private int[] theArray = new int[12];
	private int arraySize = 10;
	
	public void generateRandomArray(){
		for(int i=0; i< arraySize; i++){
			theArray[i] = (int)(Math.random()*10)+10;
		}
	}
	
	public void printArray(){
		System.out.println("----------");
		for(int i = 0; i < arraySize; i++) {
			System.out.print("|"+ i + "|");
			System.out.println(theArray[i]+ "|");
		}
	}
	
	public int getValueAtIndex(int index){
		if(index < arraySize && index >=0) return theArray[index];
		return 0;
	}
	
	public boolean doesArrayContainsThisValue(int val){
		for(int i = 0 ; i< arraySize; i++) {
			if(theArray[i] == val) return true;
		}
		return false;
	}
	public void deleteAtIndex(int index) {
		if(index < arraySize && index >=0) {
			for(int i = index ; i < arraySize - 1  ; i++){
				theArray[i] = theArray[i+1];
			}
			arraySize--;
		}
	}
	public void insertValue(int value) {
		if(arraySize < 50 && arraySize > 0) {
			theArray[arraySize] = value;
		}
		arraySize++;
	}
	public void insertAtIndex(int index,int value) {
//		System.out.println("=>" + theArray.length);
		if(arraySize < theArray.length) {
			for(int i = arraySize; i >= index ; i--) {
				if(i == index) {
					theArray[i] = value;
				}else{
					theArray[i] = theArray[i-1];	
				}
				
			}
			arraySize++;
		}else{
			System.out.println("Array is full cannot add");
		}
	}
	public String linearSearchForValue(int value) {
		String valueIsAtIndexes = "";
		boolean valueFound = false;
		for(int i = 0 ; i < arraySize ; i ++) {
			if(theArray[i] == value) {
				valueFound = true;
				valueIsAtIndexes += i + " ";
			}
		}
		if(!valueFound) { 
			valueIsAtIndexes = "No Value Found in the array";
		}
		return valueIsAtIndexes;
	}
	public static void main(String[] args) {
		ArrayStructures  newArray = new ArrayStructures();
		newArray.generateRandomArray();
		newArray.printArray();
		System.out.println(newArray.getValueAtIndex(9));
		System.out.println(newArray.doesArrayContainsThisValue(16));
		newArray.deleteAtIndex(3);
		newArray.printArray();
		newArray.insertValue(20);
		newArray.printArray();
		newArray.insertAtIndex(7, 700);
		newArray.printArray();
		newArray.insertAtIndex(8, 700);
		newArray.printArray();
		newArray.insertAtIndex(9, 900);
		System.out.println(newArray.linearSearchForValue(700));
//		newArray.printArray();
		
	}

}
