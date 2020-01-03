/*******************************************************************************
 
Write a program to create a class Book with the following data members: isbn, title and price.
Inherit the class Book to two derived classes : Magazine and Novel with the following data
members:
Magazine: type
Novel : author
Populate the details using constructors.
Create a magazine and Novel and display the details.

*******************************************************************************/

class Book
{
    long isbn;
    String title;
    int price;
    
    Book(long isbn, String title, int price)
    {
        this.isbn = isbn;
        this.title = title;
        this.price = price;
    }
}
