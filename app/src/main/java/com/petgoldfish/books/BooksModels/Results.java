package com.petgoldfish.books.BooksModels;

public class Results {
    private String published_date;

    private String previous_published_date;

    private String next_published_date;

    private String published_date_description;

    private Lists[] lists;

    private String bestsellers_date;

    public String getPublished_date() {
        return published_date;
    }

    public void setPublished_date(String published_date) {
        this.published_date = published_date;
    }

    public String getPrevious_published_date() {
        return previous_published_date;
    }

    public void setPrevious_published_date(String previous_published_date) {
        this.previous_published_date = previous_published_date;
    }

    public String getNext_published_date() {
        return next_published_date;
    }

    public void setNext_published_date(String next_published_date) {
        this.next_published_date = next_published_date;
    }

    public String getPublished_date_description() {
        return published_date_description;
    }

    public void setPublished_date_description(String published_date_description) {
        this.published_date_description = published_date_description;
    }

    public Lists[] getLists() {
        return lists;
    }

    public void setLists(Lists[] lists) {
        this.lists = lists;
    }

    public String getBestsellers_date() {
        return bestsellers_date;
    }

    public void setBestsellers_date(String bestsellers_date) {
        this.bestsellers_date = bestsellers_date;
    }

    @Override
    public String toString() {
        return "ClassPojo [published_date = " + published_date + ", previous_published_date = " + previous_published_date + ", next_published_date = " + next_published_date + ", published_date_description = " + published_date_description + ", lists = " + lists + ", bestsellers_date = " + bestsellers_date + "]";
    }
}