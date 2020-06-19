package com.Prasenjit.Spring.Session6.Models;

import net.bytebuddy.dynamic.loading.InjectionClassLoader;
import org.springframework.boot.autoconfigure.web.ResourceProperties;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.*;

@Entity
public class Books
{
  @Id
  @GeneratedValue(strategy= GenerationType.IDENTITY)
  private Integer id;
  private int price;
  private String name;
  private String authorName;

  @ManyToOne
  @JoinColumn
  private BookGenre genre;

  @Override public String toString() {
    return "Books{" +
      "id=" + id +
      ", price=" + price +
      ", name='" + name + '\'' +
      ", authorName='" + authorName + '\'' +
      '}';
  }

  public Books(int price, String name, String authorName)
  {
    this.price = price;
    this.name = name;
    this.authorName = authorName;
  }

  public Books(int price, String name, String authorName, int bookCategoryId)
  {
    this.price = price;
    this.name = name;
    this.authorName = authorName;
    this.genre= new BookGenre();
    this.genre.setId(bookCategoryId);
  }

  public Books()
  {
  }

  public Integer getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public BookGenre getGenre() {
    return genre;
  }

  public void setGenre(BookGenre genre) {
    this.genre = genre;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAuthorName() {
    return authorName;
  }

  public void setAuthorName(String authorName) {
    this.authorName = authorName;
  }
}
