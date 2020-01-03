/*******************************************************************************
 
Write a program to create a class Book with the following data members: isbn, title and price.
Inherit the class Book to two derived classes : Magazine and Novel with the following data
members:
Magazine: type
Novel : author
Populate the details using constructors.
Create a magazine and Novel and display the details.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) 
	{
		Magazine obj1 = new Magazine(1234567890, "World cup 2020", 90, "Sports");
	    obj1.displayDetails();
	    
	    System.out.println("-----------------------------------------------");
	    
	    Novel obj2 = new Novel(1234568790, "Norwegian Wood", 360, "Murakami");
	    obj2.displayDetails();
	}
}
