package labsheet4.exercise5;

public class Book {
    private String title;
    private double price;
    private String ISBN;
    private int pages;

    public Book(){

        title = "Not available";
        price = 0;
        ISBN = "Not Available";
        pages = 0;
    }

    public Book(String title, double price, String ISBN, int pages){
        setTitle(title);
        setPrice(price);
        setISBN(ISBN);
        setPages(pages);
    }

    public String getTitle(){
        return title;
    }

    public double getPrice(){
        return price;
    }

    public String getISBN(){
        return ISBN;
    }

    public int getPages(){
        return pages;
    }

    public void setTitle(String title){
        if(title.equals("") || title.equals("X")) {
            title = "No Valid Title Supplied";
        }
        this.title = title;
    }public void setPrice(double price){
        if(price < 0 || price > 50.000) {
            price = 0.00;
        }
        this.price = price;
        }
    public void setISBN(String ISBN){
        if(ISBN.equals("") || ISBN.equals("X")) {
            ISBN = "No Valid ISBN Supplied";
        }
        this.ISBN = ISBN;
        }


    public void setPages(int pages){
        if(pages < 0 || pages > 4000) {
            pages = 0;
        }
        this.pages = pages;
    }
    public String toString(){
        return "Title: "+getTitle() + "  Price: "+getPrice() + "  ISBN: "+getISBN()
                + "  Number of pages: "+getPages();
    }
}
