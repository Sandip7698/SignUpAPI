package com.example.SpringProject.Model;

import javax.persistence.*;

@Entity
@Table
public class Books {

        @Id
        @Column(name="BookID")
        @GeneratedValue (strategy = GenerationType.IDENTITY)
        private int bookid;
        @Column(name="Book_Name")
        private String bookname;

        @Column(name="Book_Author")
        private String author;

        @Column(name = "Price")
        private int price;

        public int getBookid() {
            return bookid;
        }

        public void setBookid(int bookid) {
            this.bookid = bookid;
        }

        public String getBookname() {
            return bookname;
        }

        public void setBookname(String bookname) {
            this.bookname = bookname;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }




    }

