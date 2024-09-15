/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library.entity;

/**
 *
 * @author Nawanjana
 */
public class CategoryEntity {
     private String bookId;
      private String name;
      private String author;
      private String categoryName;

    public CategoryEntity() {
    }

    public CategoryEntity(String bookId, String name, String author, String categoryName) {
        this.bookId = bookId;
        this.name = name;
        this.author = author;
        this.categoryName = categoryName;
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

    /**
     * @return the categoryName
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * @param categoryName the categoryName to set
     */
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    @Override
    public String toString() {
        return "CategoryEntity{" + "bookId=" + bookId + ", name=" + name + ", author=" + author + ", categoryName=" + categoryName + '}';
    }
      
       
}
