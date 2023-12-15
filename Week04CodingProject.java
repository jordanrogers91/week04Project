package com.promineotech;

import java.util.Arrays;

public class Week04CodingProject {

	public static void main(String[] args) {
		// 1) Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93}; // declared an array (ages) and initialized it by setting the elements to the values given 
		// 1 part a.) Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.  
		int difference = ages[ages.length - 1] - ages[0]; //subtracted the first element in the array from the last element using their index locations.
		System.out.println(difference); // printed the calculation to the console
		//1 part b) Create a new array of int called ages2 with 9 elements (ages2 will be longer than the ages array, and have more elements). 
		int[] ages2 = {15, 45, 86, 43, 71, 23, 28, 35, 57}; // declared a new array (ages2) and initialized it with 9 elements.
		int difference2 = ages2[ages2.length -1] - ages2[0]; // performed the same calculation to find the difference between the first and last elements.
		System.out.println(difference2); // printed it to the console
		/* as you can see you can use the same formula for finding the difference between the first element and last elements in the array by just switching the names of the array and keeping everything else the same. An index at 0 will always give you the first value in any array (ages2[0]) and and index at length-1 will always give you the last element ages2[ages2.length].*/
		//1 part c) Use a loop to iterate through the array and calculate the average age. Print the result to the console.
		double sum = 0; // created a variable called sum of type double and set it to 0
		for (int i = 0; i < ages.length; i++) { //used a loop to iterate through the ages array adding the age at index i to the sum each iteration.
		sum += ages[i];
		}
		double average = sum / ages.length; // calculated the average of all the ages
		System.out.println(average); // printed the average calculated to the console
		//2) Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"}; // created a String Array and initialized it with the names given.
		//2 part a) a. Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
		double totalAmountOfLetters = 0; // created a variable of type double to hold the sum of the total amount of letters and set it equal to 0. 
		for (String name : names) { //created a loop to iterated through each name in the String names array
			totalAmountOfLetters += name.length(); //added the length of each name together to get the total amount of letters
		}
		double averageNumberOfLetters = totalAmountOfLetters/names.length; // calculated the average number of letters in each name by taking the total amount of letters divided by the names length
		System.out.println(averageNumberOfLetters); // printed the average number of letters in each name to the console
		//2 part b) Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
		String result = ""; //created a variable result of type String and set it to an empty String
		for (String name : names) { //performed a loop to iterate through each name in the names array and added each name together with a space between.
			result += name + " ";
		} 
		System.out.println(result); // printed all the names to the console
		//Q3) the last element in an array can be found by using at the index length-1 (the last index of the array). arrayName[arrayName[length-1]
		//Q4) the first element in an array can by found by at index 0. arrayname[0]
		
		//5) Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
		int[] nameLengths = new int[names.length]; //created a new array called namesLength using the length of the names array
		for (int i = 0; i < names.length; i++) { // used a for loop to iterate through names array to get the length of each name
			nameLengths[i] = names[i].length();
		} 
		System.out.println(Arrays.toString(nameLengths)); // printed the length of each name to the console
		//6) Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
		int sumNameLengths = 0; // created a variable sumNameLengths of type int to hold the sum of all the elements in the array and set it equal to 0
		for (int i = 0; i < nameLengths.length; i++) { // created a for loop and iterated through the length of the elements in nameLenghts Arrray and added them together 
			sumNameLengths += nameLengths[i];
		} 
		System.out.println(sumNameLengths); // printed the total length to the console
		//calling on my isAverage1Greater method to check it and printed it to the console
		double[] arr1 = {22.6, 56.54, 43.21, 90.34, 87.12, 12.22, 5.07};
		double[] arr2 = {16.15, 45.44, 75.67, 59.34, 61.09, 8.11, 17.00, 9.23, 2.98, 4000};
		System.out.println("Is arr1 average greater than arr2 average? " + isAverage1Greater(arr1, arr2));	
	} // end of main
	
		//7) Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
	public static String multiplyWord(String word, int numberOfTimes) { // declared a method called multiplyWord that returns a String and takes in a String and Integer as parameters
		StringBuilder result = new StringBuilder(); // used a StringBuilder to build onto the String to be able to add onto the String without storing a bunch of different String types in the heap memory.
		for (int i = 0; i < numberOfTimes; i++) { // used a for loop to iterate over the String word and add it to itself the value of int numberOfTimes
			result.append(word);
		}
		return result.toString(); // returned the String concatenated to itself intNumberOfTimes
	}
		//8) Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
	public static String createFullName(String firstName, String lastName) { // declared a method called createFullName that returns a String and takes in two String parameters (firstName and lastName)
		return firstName + " " + lastName; // and returns the 2 strings concatenated with a space between
	} 
		//9)Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
	public static boolean sumIsOver100(int[] arrOfInt) { // declared a method called sumIsOver100 that returns a boolean value (true or false) and takes in an integer Array as a parameter
		int sumArr = 0; // initialized a integer variable called sumArr and set it to 0 to hold the sum.
		for (int i = 0; i < arrOfInt.length; i++) { // used a for loop to iterated over the length of the arrOfInt Array and the elements together
			sumArr += arrOfInt[i];
		} 
		return (sumArr > 100); // returned a true if the sum of the Array is greater than 100.
		
	}
		//10)Write a method that takes an array of double and returns the average of all the elements in the array.
	public static double averageOfArray(double[] arrOfDouble) { //created a method called averageOfArray that returns a double and takes in a double Array (arrOfDouble) as a parameter
		double sum = 0; // initialized a double variable to hold the sum and set it equal to 0
		for (int i = 0; i < arrOfDouble.length; i++) { //used a for loop to iterated through the length of the arrOfDouble Array and add each element in the Array
			sum += arrOfDouble[i];
		}
			return sum / arrOfDouble.length; // returned the average of type double of all the elements in the Array
		
		}
		//11)Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
	public static boolean isAverage1Greater(double[] arr1, double[] arr2) { // created a method called isAverage1Greater that returns a boolean and takes in two arrays (arr1 and arr2) as parameters
		return (averageOfArray(arr1) > averageOfArray(arr2)); //returns true if the average of arr1 > average of arr2
	}
		//12)Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) { // created a method called willBuyDrinks that returns a boolean value and takes in a boolean value and a double as parameters
		return (isHotOutside && moneyInPocket > 10.50);	// returns true if it is hot outside AND the money in the pocket is greater than $10.50
		}
	
		//13)Write my own method that solves a problem.
	public static boolean goingToItaly(int flightPrice, int savingsAccountTotal) { //wrote a method called goingToItaly that returns a boolean value and takes in two integers (flightPrice and savingsAccountTotal). In order to go to Italy the flightPrice has to be less than 1000 dollars and savingsAccountTotal has to be over 10,000 dollars.
		return (flightPrice < 1000 && savingsAccountTotal > 10000);
			
	}
		
	} // end of class
	 
		

	
	
	


