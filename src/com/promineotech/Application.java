package com.promineotech;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Application {

	

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] ages= {3,9,23,64,2,8,28,93};
				int subA = ages[ages.length -1];
				int subB = ages[0];
		System.out.println(subA - subB);
	//I took the first index (0) and subtracted that from the last index.
	//To do this I took the length of the array ages which is 8 long and 
	//subtracted 1 to get index 7 since arrays start at 0.
		
		int[] reps= {5,30,15,20,10,25,15,20,5};
		int less = (reps[reps.length -1] - reps[0]);
System.out.println(less);

int result = 0;
for(int i =0; i < reps.length; i++) {
	result += reps[i];
}
System.out.println(result / reps.length);
	
//I used a for loop and a variable named result to keep track of 
//the iterations. Each iteration adds and equals to result, I then printed out 
//result divided by the array length which gave me the average.



String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck" ,"Bob"};

int letters = 0;
for (String name : names) {
	letters += name.length();
}
System.out.println(letters / names.length);

//I used a for loop and a variable named letters to keep track of 
//the iterations. Each iteration adds and equals to letters, I then printed out 
//result divided by the array length which gave me the average.

StringBuilder con = new StringBuilder();
for (int i = 0; i < 6 ; i++) {
con.append(names[i] + " ");
}
System.out.println(con.toString());

//I made a StringBuilder called con and a for loop to concatenate
//the names array. Using .append and a white space to concatenate 
// at each iteration.

//To access the first element of an array you can select it by it's index (0).
//To access the last element of an array you take the length of the array and 
//subtract 1 to get since arrays start at 0.

int[] nameLengths = new int [names.length];
for (int i = 0; i < names.length ; i++) {
	nameLengths[i] = names[i].length();
}
int namesum = 0;
for(int i = 0; i < names.length ; i++) {
	namesum += nameLengths[i];
}
System.out.println(namesum);

//A for loop was created that takes the length of element in
//names array at each iteration and that is what namesLength consists of.
//then another for loop was created to iterate through nameslength
// and add the length to namesum variable.

String tripleHello = conCat("Hello", 3);
System.out.println(tripleHello);

//I created a method called conCat that adds to a StringBuilder
// called result after every iteration and then prints out
//the string concatenated to itself n number of times.

String fullName = whole("Post", "Malone");
System.out.println(fullName);

//I used a String method called whole that adds a first name and last name with a 
//white space between.

int[] rocks = {2,6,4,8};
boolean big = isSumGreaterThan100(rocks);
System.out.println(big);
//I wrote a method adding up elements in a array and if the sum is greater than 100
//it would print true

double[] decimal = {2.8,9.9,2.4,7.2};
double deci = average(decimal);
System.out.println(deci); 
//used the same method as before and instead of > 100 
// I divided by the length of the array

double[] point1 = {3.1,6.9,5.4,7.2};
double[] point2 = {2.8,1.9,2.4,5.2};
boolean isBiggerOrNo = compare(point1, point2);
System.out.println(isBiggerOrNo);
//did the same average method twice and combined, then at the 
//return compared then divided each by length.


boolean hot = willBuyDrink(true, 20.00);
System.out.println(hot);
//I wrote a method using && for if it is hot && if there is
//more than 10.50 in the wallet

boolean gym = goToGym(true, 6);
System.out.println(gym);



	}
public static String conCat(String word, int n) {
	StringBuilder result = new StringBuilder();
	for (int i = 0; i < n; i++) {
	result.append(word);
	}
	return result.toString();
}
public static String whole(String firstName, String lastName) {
	String formal= firstName + " " + lastName;	

return formal;

}

public static boolean isSumGreaterThan100(int[] arr) {
    int sum = 0;
    for (int i : arr) {
        sum += i;
    }
    return sum > 100;
		
	}
	
public static double average(double[] arr) {
    int sum = 0;
    for (double i : arr) {
        sum += i;
    }
    return sum / arr.length;
		
	}
public static boolean compare(double[] arr1, double[] arr2) {
    double sum1 = 0;
    double sum2 = 0;
    for (double i : arr1) {
      sum1 += i;
       
    }
    for (double i : arr2) {
        sum2 += i;
         
      }
    
    return sum1 / arr1.length > sum2 / arr2.length;
		
	}
public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
	return (isHotOutside && moneyInPocket > 10.50);
		
	
}

public static boolean goToGym(boolean noErrands, int hoursofSleep ) {
return (noErrands && hoursofSleep > 4);	

}





	
}



		
		
 


	
	
