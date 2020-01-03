/*******************************************************************************
 
Write a program to create a class Book with the following data members: isbn, title and price.
Inherit the class Book to two derived classes : Magazine and Novel with the following data
members:
Magazine: type
Novel : author
Populate the details using constructors.
Create a magazine and Novel and display the details.

*******************************************************************************/

class Novel extends Book
{
    String author;
    Novel(long isbnn, String titlen, int pricen, String author)
    {
        super(isbnn, titlen, pricen);
        this.author = author;
    }
    
    void displayDetails()
    {
        System.out.println("International Standard Book Number (ISBN) : " + isbn);
        System.out.println("Title : " + title);
        System.out.println("Price : Rs." + price);
        System.out.println("Author : " + author);  
    }
}
