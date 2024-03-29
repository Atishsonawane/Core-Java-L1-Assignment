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

public class Email extends Document
{
    private String sender;
    private String recipient;
    private String title;

    public Email(String textDoc, String senderMsg, String recipientMsg, String titleMsg)
    {
        super(textDoc);
        sender = senderMsg;
        recipient = recipientMsg;
        title = titleMsg;
    }

    public String getSender()
    {
         return sender;
    }

    public String getRecipient()
    {
         return recipient;
    }

    public String getTitle()
    {
         return title;
    }

    public String gettext()
    {
         return super.toString();
    }

    public void setSender(String newSenderMsg)
    {
         sender = newSenderMsg;
    }

    public void setRecipient(String newRecMsg)
    {
         recipient = newRecMsg;
    }

    public void setTitle(String newTitleMsg)
    {
         title = newTitleMsg;
    }

    public String toString()
    {
         return "From : " + sender + "\nTo : " + recipient + "\nTitle : " + title + "\n\n" + super.toString();
    }
}
