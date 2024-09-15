/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library.Dto;

/**
 *
 * @author Nawanjana
 */
public class BookDto {
     private String bookId;
    private String name;
    private String author;

    public BookDto() {
    }

    public BookDto(String bookId, String name, String author) {
        this.bookId = bookId;
        this.name = name;
        this.author = author;
    }

    /**
     * @return the bookId
     */
    public String getBookId() {
        return bookId;
    }

    /**
     * @param bookId the bookId to set
     */
    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * @param author the author to set
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "BookDto{" + "bookId=" + bookId + ", name=" + name + ", author=" + author + '}';
    }
    
    
}
