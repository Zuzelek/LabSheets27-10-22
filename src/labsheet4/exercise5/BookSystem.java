package labsheet4.exercise5;


import javax.swing.*;

public class BookSystem {
    public static void main(String[] args) {

        String output = "";

        //QUESTIONS FOR THE FAVOURITE BOOK
        String bookFav = JOptionPane.showInputDialog("Please enter the title of your favourite book: ");

        String priceFavAsString = JOptionPane.showInputDialog("Please enter the price of your favourite book");
        double priceFav = Double.parseDouble(priceFavAsString);

        String ISBNFav = JOptionPane.showInputDialog("Please enter the ISBN of your facvourite book: ");

        String pagesFavAsString = JOptionPane.showInputDialog("Please enter the number of pages in your favourite book: ");
        int pagesFav = Integer.parseInt(pagesFavAsString);

        Book b1 = new Book(bookFav,priceFav,ISBNFav, pagesFav);

        output += b1.toString();

        //QUESTIONS FOR THE LEAST FAVOURITE BOOK
        String bookLeast = JOptionPane.showInputDialog("Please enter the title of your favourite book: ");

        String priceLeastAsString = JOptionPane.showInputDialog("Please enter the price of your favourite book");
        double priceLeast = Double.parseDouble(priceLeastAsString);

        String ISBNLeast = JOptionPane.showInputDialog("Please enter the ISBN of your facvourite book: ");

        String pagesLeastAsString = JOptionPane.showInputDialog("Please enter the number of pages in your favourite book: ");
        int pagesLeast = Integer.parseInt(pagesLeastAsString);

        Book b2 = new Book(bookLeast, priceLeast, ISBNLeast, pagesLeast);

        output += "\n\n"+ b2.toString();

        JTextArea area = new JTextArea();

        area.setSize(300,300);
        area.setVisible(true);


        JOptionPane.showMessageDialog(null, output, "Book Object Data",JOptionPane.INFORMATION_MESSAGE);

    }
}
