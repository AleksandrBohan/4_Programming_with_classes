package EasyClassesAndObjects;

import java.util.Scanner;

public class ArrayBook extends Book{
    Book book = new Book();
    Book [] books = new Book[5];

    ArrayBook(int id, String name, String authors,
                     String publisher, int yearOfPublication,
                     int countOfPages, int price, String aBookCover) {

        setId(id);
        setName(name);
        setAuthors(authors);
        setPublisher(publisher);
        setYearOfPublication(yearOfPublication);
        setCountOfPages(countOfPages);
        setPrice(price);
        setaBookCover(aBookCover);



    }

    public void addArray(int index){


    }

    public  void choiceOfAuthor(String authors){
        for (int i = 0; i < books.length; i++){
            if (books[i].authors == authors){
                System.out.println(books[i] + "  ");
            } else System.out.println("Author not found!!");
        }
    }

    public  void choiceOfPublisher(String publisher){
        for (int i = 0; i < books.length; i++){
            if (books[i].publisher == publisher){
                books[i].toString();
            } else System.out.println("Publisher not found!!");
        }
    }

    public  void choiceAfterYear(int year){
        for (int i = 0; i < books.length; i++){
            if (books[i].yearOfPublication > year){
                books[i].toString();
            } else System.out.println("This year too many!!");
        }
    }

    public static void main(String[] args) {
        Book book = new Book(123, "Perl", "A.V. Lunn, C.V. Gunn",
                "Rise", 2004, 1000, 100, "dflk");
      /*  ArrayBook arrayBook = new ArrayBook(0, 123, "Perl", "A.V. Lunn, C.V. Gunn",
                "Rise", 2004, 1000, 100, "dflk");


        ArrayBook arrayBook1 = new ArrayBook(1, 233, "SQL", "Z.V. Gup",
                "Norway", 2000, 400, 75, "awes");


        ArrayBook arrayBook2 = new ArrayBook(2, 222, "Scala", "R.W. Zyt, P.O. Mild",
                "BlueSide", 2009, 1700, 120, "kn");


        ArrayBook arrayBook3 = new ArrayBook(3, 324, "C#", "K.J. Bekker",
                "RedSide", 2013, 1500, 110, "plmk");


        ArrayBook arrayBook4 = new ArrayBook(4, 444, "Java", "B.Ackel",
                "HotSide", 2019, 1300, 105, "imao");

        arrayBook.choiceOfPublisher("HotSide");*/
        //TODO разобраться какой конструктор для заполнения массива Book!!

    }
}
