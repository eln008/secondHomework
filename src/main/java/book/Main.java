package bookClass;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Book[] books = new Book[3];
        books[0] = new Book("it ends with us", "colleen hoover",301);
        books[1] = new Book("грозовой перевал", "эмили бронте",357);
        books[2] = new Book("джейн эйр", "шарлотта бронте",298);

//        System.out.println(Arrays.toString(books));

        for(Book book: books){
            book.displayInfo();
        }



    }
}