package model;

import java.io.Serializable;

public class Quote implements Serializable {
  private int id;

  private String text;

  private Author author;

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Quote() {
    }

    public Quote(String text, Author author) {
        this.text = text;
        this.author = author;
    }
}
