package model;

import java.time.LocalDate;

public class Blog {
    private static int counter=0;
    private int b_id;
    private String b_title;
    private String b_author;
    private String b_content;
    private String b_description;
    private LocalDate postedDate;

    public Blog(String b_title, String b_author, String b_content, String b_description, LocalDate postedDate) {
        b_id =++counter;
        this.b_title = b_title;
        this.b_author = b_author;
        this.b_content = b_content;
        this.b_description = b_description;
        this.postedDate = postedDate;
    }

    public int getB_id() {
        return b_id;
    }

    public String getB_title() {
        return b_title;
    }

    public void setB_title(String b_title) {
        this.b_title = b_title;
    }

    public String getB_author() {
        return b_author;
    }

    public void setB_author(String b_author) {
        this.b_author = b_author;
    }

    public String getB_content() {
        return b_content;
    }

    public void setB_content(String b_content) {
        this.b_content = b_content;
    }

    public String getB_description() {
        return b_description;
    }

    public void setB_description(String b_description) {
        this.b_description = b_description;
    }

    public LocalDate getPostedDate() {
        return postedDate;
    }

    public void setPostedDate(LocalDate postedDate) {
        this.postedDate = postedDate;
    }

    @Override
    public String toString() {
        return "Blog{" +
                "b_id=" + b_id +
                ", b_title='" + b_title + '\'' +
                ", b_author='" + b_author + '\'' +
                ", b_content='" + b_content + '\'' +
                ", b_description='" + b_description + '\'' +
                ", postedDate=" + postedDate +
                '}';
    }
}