/******************************************************************************

Define a class named Document that contains a member variable of type String named text that
stores any textual content for the document. Create a method named toString that returns the text
field and also include a method to set this value.

Next, define a class for Email that is derived from Document and includes member variables for
the sender, recipient, and title of an email message. Implement appropriate accessor and mutator
methods. [An accessor is a member function that accesses the contents of an object but does not
modify that object; eg: int getX(return x;)A mutator is a member function that can modify an
object void setX(int x){this.x=x;} ]The body of the email message should be stored in the
inherited variable text. Redefine the toString method to concatenate all text fields.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) 
	{
	     String sample1 = "The last book I read was Alchemist. It was a fun read.";
         String sample2 = "We need more staunch supporter to fight against government.";
         Document email1 = new Email(sample1, "Atish", "Riya", "Book");
         Document email2 = new Email(sample2, "Arvind", "Sonia", "Protests");
         
         System.out.println("---------------------");
         System.out.println(email1.toString());
         System.out.println("---------------------");
         System.out.println(email2.toString());
         System.out.println("---------------------");
	}
}
