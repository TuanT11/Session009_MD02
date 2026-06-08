import java.util.Scanner;

class Book{
    private String author;
    private String title;
    private double price;

    public Book(String author, String title, double price){
        this.author = author;
        this.title = title;
        this.price = price;
    }

    public void printInfor(){
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.printf("Price: %.1f\n\n", this.price);
    }
}

public class Bai2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Book[] list = new Book[3];
        list[0] = new Book("James", "C++", 100.0d);
        list[1] = new Book("Khoa", "Java", 123.9d);
        list[2] = new Book("Nguyen Tuan", "Van", 344.0d);
        for(var x : list){
            x.printInfor();
        }
    }
}
