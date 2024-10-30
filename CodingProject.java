package week04;

public class CodingProject {
// Method for question 7:
	public static String repeatWord(String word, int n) { 
		String result = ""; 
		for (int i = 0; i <= n; i++) {
			result += word;
		}
		return result;
	}
// Method for question 8:	
	public static String showFullName(String firstName, String lastName) {
		return firstName + " " + lastName;
	}
// Method for question 9:	
	public static boolean greaterThan100 (int[] numbers) {
		int sum = 0;
		for (int number : numbers) {
			sum += number;
		}
		return sum > 100;
		}
// Method for question 10:	
	public static double calculateAverage(double[] newNumbers) {
		double sum = 0;
		for (double number : newNumbers) {
			sum += number;
		}
		return sum / newNumbers.length;
	}
	
// Method for question 11:	
	public static boolean isFirstBetter(double[] array1, double[] array2) {
		double sum1 = 0;
		double sum2 = 0;
		
		for (double num : array1) {
			sum1 += num;
		}
		double average1 = sum1 / array1.length;
		for (double num: array2) {
			sum2 += num;
		}
		double average2 = sum2 / array2.length;
		
		return average1 > average2;
	}
// Method for question 12:	
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		return isHotOutside && moneyInPocket > 10.50;
	}

	
// Method for question 13:
	public static String shouldIWatch(String mood, double movieRating) {
		if (mood.equals("excited") && movieRating >= 7.0) {
			return "Sounds good lets watch it!";
		} else if (mood.equals("excited") && movieRating >= 5.0) {
			return "Ay I'm in the mood let's do it!";
		} else {
			return "Nahhh maybe another time.";
		}
	}
	
	public static void main(String[] args) {
// 1.
       int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
// a.
       int result = ages[ages.length - 1] - ages[0];
       System.out.println(result);
// b.
       int[] ages2 = {4, 35, 26, 87, 25, 78, 98, 36, 109};
// i.
       System.out.println(ages2.length);
// ii. 
       int newResult = ages2[ages2.length - 1 ] - ages2[0];
       System.out.println(newResult);
// iii. Elements in an array are dynamic no matter how long an array is. The final element can be accessed with the length() method. For example these will print different values:
       System.out.println(ages[2]);
       System.out.println(ages2[2]);
// c.
       double sum = 0;
       for (int age : ages) {
    	  sum += age;
       }
       double average = (double) sum / ages.length;  
       System.out.println(average);

       
       
// 2. 
      String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
// a.      
      double allLetters = 0;
      for (String name : names) {
    	  allLetters += name.length();
      }
      double averageLetters = allLetters / names.length;
      System.out.println("The average is: " + averageLetters);
// b.       
      StringBuilder concatenatedNames = new StringBuilder();
      for (String name : names) {
          concatenatedNames.append(name).append(" ");
      }
      System.out.println("Concatenated names: " + concatenatedNames);

      
// 3. You would access the last element of an array with the (.length -1) method. For example:
      System.out.println(ages[ages.length - 1]);
      
// 4. The first element of an array is accessed with [0]. This is because arrays indexes start at 0 and that would be the first element of an array. 

// 5.       
      int [] nameLengths = new int[names.length];
      for (int i = 0; i < names.length; i++) {
    	  nameLengths[i] = names[i].length();
      }
// 6. 
      int totalNameLength = 0;
      for (int length : nameLengths) {
    	  totalNameLength += length;
      }
      System.out.println("The sum of names is: " + totalNameLength);
// 7.
      String repeatedWord = repeatWord("Difficult", 5);
      System.out.println(repeatedWord);
// 8.
      String fullName = showFullName("Penny", "Wise");
      System.out.println(fullName);

// 9. 
      int[] numbers = {18, 14, 43};
      boolean greaterThan = greaterThan100(numbers);
      System.out.println(greaterThan);
      
// 10. 
      double[] newNumbers= {97.0, 48.0, 61.0, 52.9, 92.0};
      double newAverage = calculateAverage(newNumbers);
      System.out.println(newAverage);
      
      
// 11.
      double[] array1 = {24.6, 6.9, 78.2, 11.0};
      double[] array2 = {19999.0, 3.0, 2.4};
      
      boolean arrayResult = isFirstBetter (array1, array2);
      System.out.println(arrayResult);
      
      
// 12.
      boolean isHotOutside = false;
      double moneyInPocket = 4.56;
      
      boolean isItWorth = willBuyDrink (isHotOutside, moneyInPocket);
      System.out.println(isItWorth);
	
// 13. 	
	System.out.println(shouldIWatch("excited", 8.0));
	System.out.println(shouldIWatch("not excited", 8.0));
	
	
	
	
	}
	
}

