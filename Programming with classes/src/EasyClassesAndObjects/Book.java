package EasyClassesAndObjects;

public class Book {

    int id;
    String name;
    String authors;
    String publisher;
    int yearOfPublication;
    int countOfPages;
    int price;
    String aBookCover;


    public Book(int id, String name, String authors, String publisher,
                int yearOfPublication, int countOfPages, int price, String aBookCover) {
        this.id = id;
        this.name = name;
        this.authors = authors;
        this.publisher = publisher;
        this.yearOfPublication = yearOfPublication;
        this.countOfPages = countOfPages;
        this.price = price;
        this.aBookCover = aBookCover;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public int getCountOfPages() {
        return countOfPages;
    }

    public void setCountOfPages(int countOfPages) {
        this.countOfPages = countOfPages;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getaBookCover() {
        return aBookCover;
    }

    public void setaBookCover(String aBookCover) {
        this.aBookCover = aBookCover;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", authors='" + authors + '\'' +
                ", publisher='" + publisher + '\'' +
                ", yearOfPublication=" + yearOfPublication +
                ", countOfPages=" + countOfPages +
                ", price=" + price +
                ", aBookCover='" + aBookCover + '\'' +
                '}';
    }
}
