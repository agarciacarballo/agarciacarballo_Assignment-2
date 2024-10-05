/*
 * Class: CMSC201 
 * Instructor: Mr. Tanveer
 * Description: Write a program that asks the user to enter 10 numbers and takes those numbers 
 * to first find the mean and then find the standard deviation
 * Due: 10/06/2024
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Alejandro Garcia Carballo
*/


package statistics;
import java.util.Scanner;

public class Statistics 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in); // create a scanner
		double[] numbers = new double[10]; // declare a double variable to hold an array of 10 numbers
		
		System.out.println("*****************************************************************");
		System.out.println("***Project 2: Statistics - compute mean and standard deviation***");
		System.out.println("*****************************************************************");
		System.out.print("Enter numbers: "); // ask user for ten numbers
		for(int i = 0; i < numbers.length && input.hasNextDouble(); i++) // check if the length is less than numbers and the input is a double
		{
			numbers[i] = input.nextDouble(); // get the input and store in an array
		}
		
		double mean = mean(numbers); // hold the mean method in a double variable and pass numbers as an argument
		double deviation = deviation(numbers, mean); // hold the deviation method in a double variable and pass mean and numbers as arguments
		
		printResults(mean, deviation); // call the printResults method to print the mean, deviation, student name, and due date

	}
	
	public static double mean(double[] numbers)
	{
		double sum = 0; // create a variable called sum to hold the sum of the array of integers
		
		for(double number: numbers) // iterate through the array until the condition is false
		{
			sum += number; // add each number with another
		}
		
		return sum; // return the sum
	}
	
	
	public static double deviation(double[] numbers, double mean)
	{
		double variance = 0; // create a variable called variance to hold the sum of the squared deviations of the mean
        for (double number : numbers) // iterate through the array of numbers until condition is false
        {
            variance += Math.pow(number, 2); // find the power of 2 for each number then add it with the next number in the array
        }
        variance = (variance - (Math.pow(mean, 2) / numbers.length)) / (numbers.length - 1); // calculate the variance
        return Math.sqrt(variance); // return the final deviation
	}
	
	public static void printResults(double mean, double deviation)
	{	
		System.out.println("The mean is " + mean / 10); // divide the mean and print it
		System.out.println("The deviation is " + deviation); // print the deviation
		System.out.println("Student: Alejandro Garcia Carballo"); // print the student's name
		System.out.println("Date: 10-06-2024"); // print the due date
	}
}
