package edu.monmouth.grade;

public class ProblemSet1 {

	
	public static void main(String[] args) {
		Grade grade1 = new Grade();
		System.out.println(grade1.getGradeLetter());
		/* The print statement in line 9 calls on the getter method .getGradeLetter to access the grade 
		 * assigned to the grade1 object. The grade printed is "U" which is the default char assigned to
		 * the gradeLetter variable in the class Grade */
		
		grade1.setGradeLetter('A');
		System.out.println(grade1.getGradeLetter());
		/* The same print statement used in line 9 is repeated in line 15 and now prints char 'A'. 
		 * This is because line 14 uses the setter method, setGradeLetter(), which allows the user to 
		 * manipulate the gradeLetter variable within the grade1 object and replace char'U' with char 'A'*/
		
		Grade grade2 = new Grade('&');
		/* As demonstrated in line 20, the user is able to use the grade() method in lieu of the default 
		 * Grade constructor. This also allows for the user to assign a char to the gradeLetter variable. 
		 * It can also be noted that any char can be assigned to gradeLetter rather than the expected
		 *  grade letters of A - F */
		System.out.println(grade2.getGradeLetter());
		
		grade2.setGradeLetter('C');
		System.out.println(grade2.getGradeLetter());
		
		
		
