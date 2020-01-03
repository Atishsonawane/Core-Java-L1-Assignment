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

class Book
{
    // attributes: -isbn, title, author, price
    long isbn;
    String title;
    String author;
    double price;
    
    // method to initialize the data members through parameterized constructor
    Book(long isbn, String title, String author, double price)
    {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.price = price;
    }
    
    // method to display the details of the book
    public void displaydetails()
    {
        System.out.println("International Standard Book Number (ISBN) : " + isbn);
        System.out.println("Title of the book : " + title);
        System.out.println("Author of the book : " + author);
        System.out.println("Price of the book : Rs." + price);
    }
    
    // method to  pass the discount percent, calculate the discount on price and find 
    // the amount to be paid after discount
    public void discountedprice(double discountPercent)
    {
        if(discountPercent < 0 || discountPercent > 100)
        {
            System.out.println("Entered discount percent is either less than 0 or more than 100. Please enter discount percent between 0 to 100");
        }
        else
        {
            System.out.println("Amount to be paid after discount is Rs." + (price-price*(discountPercent/100)));
        }
    }
    
}
