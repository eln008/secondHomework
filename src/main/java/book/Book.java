package bookClass;

public class Book {
    String title;
    String author;
    int pages;

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public void displayInfo(){
        System.out.println(" title: "+ title);
        System.out.println(" author: "+ author);
        System.out.println(" pages: "+ pages);
    }

//    @Override
//    public String toString() {
//        return "Book{" +
//                "title='" + title + '\'' +
//                ", author='" + author + '\'' +
//                ", pages=" + pages +
//                "}\n";
//    }
}
