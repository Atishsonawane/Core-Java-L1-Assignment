/******************************************************************************

Write a program to create a class Book with the following
- attributes: -isbn, title, author, price
- methods :
 i.   Initialize the data members through parameterized constructor
 ii.  displaydetails() to display the details of the book
 iii. discountedprice() : pass the discount percent, calculate the discount on price and find
the amount to be paid after discount
 - task :
 Create an object book, initialize the book and display the details along with the discounted
price

*******************************************************************************/

public class Main
{
	public static void main(String[] args) 
	{
		Book obj = new Book(1234567890, "Namesake", "Jhumpa Lahiri", 160);
		obj.displaydetails();
		obj.discountedprice(12);
	}
}
