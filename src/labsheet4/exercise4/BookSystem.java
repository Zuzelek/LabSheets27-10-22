package labsheet4.exercise4;

import labsheet4.exercise3.Book;

import javax.swing.*;
import java.awt.*;

public class BookSystem {
    public static void main(String[] args) {

        String output = "";

        //QUESTIONS FOR THE FAVOURITE BOOK
        String bookFav = JOptionPane.showInputDialog("Please enter the title of your favourite book: ");

        String price1AsString = JOptionPane.showInputDialog("Please enter the price of your favourite book");
        double priceFav = Double.parseDouble(price1AsString);

        String ISBNFav = JOptionPane.showInputDialog("Please enter the ISBN of your facvourite book: ");

        String pages1AsString = JOptionPane.showInputDialog("Please enter the number of pages in your favourite book: ");
        int pagesFav = Integer.parseInt(pages1AsString);

        Book b1 = new Book(bookFav,priceFav,ISBNFav, pagesFav);

        output += b1.toString();

        //QUESTIONS FOR THE LEAST FAVOURITE BOOK
        String bookLeast = JOptionPane.showInputDialog("Please enter the title of your favourite book: ");

        String priceLeastAsString = JOptionPane.showInputDialog("Please enter the price of your favourite book");
        double priceLeast = Double.parseDouble(price1AsString);

        String ISBNLeast = JOptionPane.showInputDialog("Please enter the ISBN of your facvourite book: ");

        String pagesLeastAsString = JOptionPane.showInputDialog("Please enter the number of pages in your favourite book: ");
        int pagesLeast = Integer.parseInt(pages1AsString);

        Book b2 = new Book(bookLeast, priceLeast, ISBNLeast, pagesLeast);

        output += "\n\n"+ b2.toString();

        JTextArea area = new JTextArea();

        area.setSize(300,300);
        area.setVisible(true);


        JOptionPane.showMessageDialog(null, output, "Book Object Data",JOptionPane.INFORMATION_MESSAGE);

    }
}
