package com.tm;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

class Author{
    String name;
    Author(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
}

class Book{
    String name;
    int year;
    Author author;
    Book(String name,int year,Author author){
        this.name=name;
        this.year=year;
        this.author=author;
    }
    public Author getAuthor(){
        return this.author;
    }
}
// Print all authors in a books collection who wrote a book after 2005

public class stream1 {
    public static void main(String gg[]){
        Author authorShivam=new Author("shivam");
        Author authorRahul=new Author("rahul");
        Author authorBob=new Author("bob");
        List<Book> books= Arrays.asList(new Book("abc",2008,authorShivam),new Book("xyz",2002,authorRahul),new Book("def",2007,authorBob));
        //Before Java 8
        for (Book book : books) {
            if (book.author != null && book.year > 2005){
                System.out.println(book.author.name);
            }
        }
        // Streams-Java 8
        books.stream().filter((book)->book.year>2005).map(Book::getAuthor).filter(Objects::nonNull).map(Author::getName).sorted().forEach((name)->System.out.println(name));
    }
}
