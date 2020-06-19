package com.Prasenjit.Spring.Session6.Models;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.List;

@Entity
//@Table(name = "book_Genre") //this is optional by default this name would have ben choosen
public class BookGenre
{
  @Override public String toString() {
    return "BookGenre{" +
      "id=" + id +
      ", name='" + name + '\'' +
      ", books=" + books +
      '}';
  }

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private String name;
  @OneToMany(mappedBy = "genre", cascade = CascadeType.ALL)
  private List<Books> books;

  public Integer getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<Books> getBooks() {
    return books;
  }

  public void setBooks(List<Books> books) {
    this.books = books;
  }

  public BookGenre()
  {
  }

  public BookGenre(String name, List<Books> books)
  {
    this.name = name;
    this.books = books;
    for(Books b: books)
    {
      b.setGenre(this);
    }
  }

  public BookGenre(String name)
  {
    this.name = name;
  }
}
