import java.util.Scanner;

/*
*Steven Allen
*ITSE-1302
*3/14/2017
*Exercise 12
*Code creates book info, including title, author, publisher, and copyright date.
*/

public class Book {
    private String strTitle = "";
    private String strAuthor = "";
    private String strPublisher = "";
    private int intCopyrightDate;
    Scanner objInput = new Scanner(System.in);

    public Book(){
        inputTitle();
        inputAuthor();
        inputPublisher();
        inputCopyrightDate();
    }
    public String getStrTitle() {
        return strTitle;
    }
    public void setStrTitle(String pstrTitle){
        strTitle =  pstrTitle;
    }
    public String getStrAuthor(){
        return strAuthor;
    }
    public void setStrAuthor(String pstrAuthor){
        strAuthor = pstrAuthor;
    }
    public String getStrPublisher(){
        return strPublisher;
    }
    public void setStrPublisher(String pstrPublisher){
        strPublisher = pstrPublisher;
    }
    public int getIntCopyrightDate(){
        return intCopyrightDate;
    }
    public void setIntCopyrightDate(int pintCopyrightDate){
        intCopyrightDate = pintCopyrightDate;
    }
    public void inputTitle(){
        System.out.println("Title: ");
        setStrTitle(objInput.next().toUpperCase());
    }
    public void inputAuthor(){
        System.out.print("Author: ");
        setStrAuthor(objInput.next().toUpperCase());
    }
    public void inputPublisher(){
        System.out.print("Publisher: ");
        setStrPublisher(objInput.next().toUpperCase());
    }
    public void inputCopyrightDate() {
        System.out.print("Copyright Date: ");
        setIntCopyrightDate(objInput.nextInt());
    }
    public String toString(){
        return "Data--------- | Book Info\n" +
         "         Title: " + this.getStrTitle() + "\n" +
         "        Author: " + this.getStrAuthor() + "\n" +
         "     Publisher: " + this.getStrPublisher() + "\n" +
         "Copyright Date: " + this.getIntCopyrightDate() + "\n";
     }
}




 public class BookShelf {

    public static void main(String [] strArgs){

 System.out.println("Book One= ");
        Book objBookOne = new Book();

        System.out.println("Book Two= ");
        Book objBookTwo = new Book();

        System.out.println("Book Three= ");
        Book objBookThree = new Book();

        System.out.print(objBookOne.toString());
        System.out.print(objBookTwo.toString());
        System.out.print(objBookThree.toString());
    }
}