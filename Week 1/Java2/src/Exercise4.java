class library{
    String [] books;
    int no_of_books;

    library(){
        this.books = new String[100];
        this.no_of_books = 0;
    }

    public void addBook(String book){
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println(book + ", has been added");
    }

    public void showAvailableBoo(){
        System.out.println("Available books are : ");
        for (String book: this.books){
            if (book == null ){
                continue;
            }
            System.out.println("* " + book);
        }
    }
    void issueBook(String book){
        for (int i = 0; i<this.books.length; i++){
            if (this.books[i].equals(book)){
                System.out.println(book+",  book has been issued.");
                this.books[i] = null;
                return ;
            }
        }
        System.out.println("This book is not available.");
    }

    void returnBook(String book){
        addBook(book);
    }
}

public class Exercise4 {
    public static void main(String[] args) {
        library centralLibrary = new library();

        centralLibrary.addBook("Think and Grow");
        centralLibrary.addBook("Think and grow Rich");
        centralLibrary.addBook("C++");
        centralLibrary.addBook("Algorithm");
        centralLibrary.showAvailableBoo();

        centralLibrary.issueBook("C++");
        centralLibrary.showAvailableBoo();

        centralLibrary.returnBook("C++");
        centralLibrary.showAvailableBoo();

    }
}
