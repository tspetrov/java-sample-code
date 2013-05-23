package mainPackage;

import illustratingOOP.Animal;
import illustratingOOP.Cat;
import illustratingOOP.Dog;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;

import myImplementationsOfSomeAbstractDataStructures.DoublyLinkedList;
import myImplementationsOfSomeAbstractDataStructures.DynamicStack;

import someAlgorithms.Algorithms;
import someStringExamples.*;

public class TryExamples {
	private static final String testString = "Microsoft announced its next generation "
			+ "Java compiler today."
			+ "It uses advanced parser and special optimizer for the Microsoft JVM.";
	
	public static void main(String[] args) {

		// String manipulation examples (check myCustomString class in
		// someStringExamples
		// package for method implementations)
		System.out.println("String examples:");
		System.out.println();
		// reversing string:
		MyCustomString str = new MyCustomString("abcde");
		System.out.println("reverse strng example:");
		System.out.println(str.reverseString().toString()); // edcba

		// reversing word order in string:
		MyCustomString str2 = new MyCustomString("This is a test");
		System.out.println("reverse order of words in string example");
		System.out.println(str2.reverseWordsInString()); // test a is This

		// replaces forbidden words in testString with *
		System.out.println("replacing \"forbidden\" words in sting with *");
		MyCustomString str3 = new MyCustomString(testString);
		String[] forbiddenWords = { "Java", "JVM", "Microsoft", "baba" };
		String fixed = str3.replaceKeyWords(forbiddenWords);
		System.out.println(fixed);

		System.out.println();

		// Text file manipulation example.Method implementation further below
		// in this class.

		// reads from the file "matrix".First row is the matrix size, and the
		// other
		// rows represent the matrix itself.Finds the 2x2 submatrix(or the first
		// one if there
		// are more than one) which has the largest sum of elements.The sum is
		// printed
		// in the file "sumOfMatrix"
		findSubmatrixWithMaxSum();

		// some Algorithm examples

		int[] intArray = { 5, 4, 2, 6, 1, 0, -2, 17 };
		int[] temp = intArray;
		System.out.println("Algorith examples");
		System.out.println();
		// sorting with bubbleSort
		Algorithms.bubbleSort(temp);
		System.out.println("Bubble sort:");
		System.out.println(Arrays.toString(temp)); // [-2, 0, 1, 2, 4, 5, 6, 17]

		// sorting with selectionSort
		temp = intArray;
		Algorithms.selectionSort(temp);
		System.out.println("Selection sort");
		System.out.println(Arrays.toString(temp)); // [-2, 0, 1, 2, 4, 5, 6, 17]

		// Binary search in an integer array.Returns true if elem(second
		// argument) exists
		// in the array and false otherwise.It can be tweaked to return the
		// position of
		// elem in the array if it exists there.The array has to be sorted
		// beforehand
		// for the algorithm to work
		System.out.println("binary search:");
		System.out
				.println(Algorithms.binarySearch(temp, 4) ? "The element exists in the array\n"
						: "The element does not exists in the array\n");

		// A very simple example using ArrayList.The method
		// NumberOfOccurrencesOfElem(implementation located below in this class)
		// returns the number of occurrences of the given element in the
		// ArrayList
		System.out.println("ArrayList<Integer> example:");
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		arrList.add(3);
		arrList.add(2);
		arrList.add(3);
		arrList.add(1);
		arrList.add(0);
		arrList.add(7);
		System.out.println(NumberOfOccurrencesOfElem(arrList, 3)); // 2

		// Testing my implementations of the doubly linked list and dynamic
		// stack
		// Classes located in the package
		// myImplementationsOfSomeAbstractDataStructures
		System.out.println();
		System.out.println("Dynamic Stack examples");
		DynamicStack stack = new DynamicStack() ;
		stack.add(5) ;
		stack.add("four") ;
		stack.add(4) ;
		stack.add(13);
		System.out.println(stack.pop()); //returns top element and deletes it //13
		System.out.println(stack.peek()); //returns top element without deleting it //4
		System.out.println(stack.size()); //returns stack size //3
		System.out
		.println(stack.contains("four") ? "The element exists in the stack"
				: "The element does not exists in the stack");//checks if the element given
		//as argument exists in the stack
		System.out.println(Arrays.toString(stack.toArray()));//returns array of the elements
		stack.printInfo() ; //prints the remaining elements in the stack and destroys it
		
		
		System.out.println();
		System.out.println("Double Linked List Examples");
		DoublyLinkedList dList = new DoublyLinkedList();
		dList.add(12) ; //adds at the end of the list
		dList.add(4) ;
		dList.add(5) ;
		dList.add(100, 1) ; //inserts 100 at first position(positions are starting from 0)
		//cannot insert in empty list!
		dList.printInfo() ; //prints list
		System.out
		.println(dList.contains(6) ? "The element exists in the list"
				: "The element does not exists in the list");//checks if list contains value
		dList.delElemAt(1) ; //deletes this element at index (starts from 0)
		dList.printInfo();
		System.out.println(dList.getElemAt(1)) ;//returns the element on the given
		//index , indexes start from 0
		Object[] arrayForList ;
		arrayForList = dList.getArray();  // returns the list in the form of Array
		System.out.println(Arrays.toString(arrayForList));
		 
		System.out.println();
		// some examples of Inheritance and polymorphism
		//check the package illustratingOOP for implementations of these and some other classes
		System.out.println("OOP examples:");
		Animal animal = new Animal(); // using default constructor
		animal.printAnimalInfo();
		Animal otherAnimal = new Animal("Djoni", "white");// using constructor with parameters
		otherAnimal.printAnimalInfo();
		Cat cat = new Cat(); //using inherited class Cat default constructor
		cat.printAnimalInfo();
		Cat otherCat = new Cat("Maca", "green", "Manks");//using inherited class cat constructor with parameters
		otherCat.printAnimalInfo();

		//polymorphism example
		System.out.println();
		System.out.println("Polymorphism example");
		Animal theDog = new Dog("Djeki", "brown", 80);
		theDog.printAnimalInfo(); //uses Dog.printAnimalInfo()

		
		//And one final, more complex example using a combination of file manipulation,
		//string manipulation and HashMap usage.The implementations of this and the other
		//helper methods are down below
		
		//The method finalExample first reads the words from the file "words" and for every word
		//it checks how many times this word occurs in the file "text".The result is printed
		//in the file "result".I used HashMap<String, Integer>, where String represents one word
		//and Integer represents the number of times it appears in "text".You can tweak the 
		//"words" and "text" files for different outcome.
		//Note: the implementation doesn't allow equal words in the file "words" and also
		//the delimiters in "text" could only be some from ' ' , '.' , ',' and ':'.
		finalExample();
	
	}

	public static void findSubmatrixWithMaxSum() {
		int[][] matrix;
		String fileName = "matrix";
		Scanner fileReader = null;
		PrintStream fileWriter = null;
		try {
			fileReader = new Scanner(new File(fileName), "UTF-8");
			fileWriter = new PrintStream("sumOfMatrix", "UTF-8");
			int size = fileReader.nextInt();
			matrix = new int[size][size];
			for (int i = 0; i < size; i++)
				for (int j = 0; j < size; j++)
					matrix[i][j] = fileReader.nextInt();
			int sum = findSumHelper(matrix);
			fileWriter.println(sum);
		} catch (FileNotFoundException fnf) {

			fnf.printStackTrace();
		} catch (UnsupportedEncodingException uee) {
			uee.printStackTrace();
		} finally {
			if (fileReader != null)
				fileReader.close();
			if (fileWriter != null)
				fileWriter.close();
		}
	}

	public static int findSumHelper(int[][] matrix) {
		int sum = 0;
		for (int i = 0; i < matrix.length - 1; i++)
			for (int j = 0; j < matrix[i].length - 1; j++) {
				int currSum = matrix[i][j] + matrix[i + 1][j]
						+ matrix[i][j + 1] + matrix[i + 1][j + 1];
				if (currSum > sum)
					sum = currSum;
			}

		return sum;
	}

	public static int NumberOfOccurrencesOfElem(ArrayList<Integer> arrList,
			int elem) {
		int count = 0;
		for (Integer each : arrList) {
			if (each.equals(elem))
				count++;
		}
		return count;
	}

	public static void finalExample() {
		Scanner fileReader = null;
		PrintStream fileWriter = null;
		try {
			fileReader = new Scanner(new File("words"), "UTF-8");
			fileWriter = new PrintStream("result", "UTF-8");
			HashMap<String, Integer> table = new HashMap<String, Integer>();
			fillHashMap(fileReader, table);
			fileReader = new Scanner(new File("text"), "UTF-8");
			findNumberOfOccurrencesForEachWord(fileReader, table);
			for (Map.Entry<String, Integer> each : table.entrySet())
				fileWriter.printf("Key: %s , Value: %d\n", each.getKey(),
						each.getValue());

		} catch (FileNotFoundException fnf) {
			fnf.printStackTrace();
		} catch (UnsupportedEncodingException uee) {
			uee.printStackTrace();
		} finally {
			if (fileReader != null)
				fileReader.close();
			if (fileWriter != null)
				fileWriter.close();
		}
	}

	public static void fillHashMap(Scanner sc, HashMap<String, Integer> table) {
		StringBuilder allWords = new StringBuilder();
		while (sc.hasNextLine()) {
			allWords.append(sc.nextLine());
		}
		String temp = allWords.toString();
		String[] arrayOfAllWords = temp.split("[ ,.:]+");
		for (int i = 0; i < arrayOfAllWords.length; i++) {
			table.put(arrayOfAllWords[i], 0);
		}
	}

	public static void findNumberOfOccurrencesForEachWord(Scanner sc,
			HashMap<String, Integer> table) {
		StringBuilder allWordsInText = new StringBuilder();
		while (sc.hasNextLine()) {
			allWordsInText.append(sc.nextLine());
		}
		String temp = allWordsInText.toString();
		String[] arrayOfAllWordsInText = temp.split("[ ,.:]+");

		for (Map.Entry<String, Integer> each : table.entrySet()) {
			for (int i = 0; i < arrayOfAllWordsInText.length; i++) {
				if (each.getKey().equals(arrayOfAllWordsInText[i])) {
					each.setValue(each.getValue() + 1);
				}
			}
		}
	}

}