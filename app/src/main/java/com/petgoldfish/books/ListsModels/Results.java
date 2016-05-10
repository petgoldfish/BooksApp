package com.petgoldfish.books.ListsModels;

public class Results {
    private String published_date;

    private String asterisk;

    private String dagger;

    private String display_name;

    private String weeks_on_list;

    private String rank;

    private Book_details[] book_details;

    private String list_name;

    private String rank_last_week;

    private String amazon_product_url;

    private String bestsellers_date;

    public String getPublished_date() {
        return published_date;
    }

    public void setPublished_date(String published_date) {
        this.published_date = published_date;
    }

    public String getAsterisk() {
        return asterisk;
    }

    public void setAsterisk(String asterisk) {
        this.asterisk = asterisk;
    }

    public String getDagger() {
        return dagger;
    }

    public void setDagger(String dagger) {
        this.dagger = dagger;
    }

    public String getDisplay_name() {
        return display_name;
    }

    public void setDisplay_name(String display_name) {
        this.display_name = display_name;
    }

    public String getWeeks_on_list() {
        return weeks_on_list;
    }

    public void setWeeks_on_list(String weeks_on_list) {
        this.weeks_on_list = weeks_on_list;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public Book_details[] getBook_details() {
        return book_details;
    }

    public void setBook_details(Book_details[] book_details) {
        this.book_details = book_details;
    }

    public String getList_name() {
        return list_name;
    }

    public void setList_name(String list_name) {
        this.list_name = list_name;
    }

    public String getRank_last_week() {
        return rank_last_week;
    }

    public void setRank_last_week(String rank_last_week) {
        this.rank_last_week = rank_last_week;
    }

    public String getAmazon_product_url() {
        return amazon_product_url;
    }

    public void setAmazon_product_url(String amazon_product_url) {
        this.amazon_product_url = amazon_product_url;
    }

    public String getBestsellers_date() {
        return bestsellers_date;
    }

    public void setBestsellers_date(String bestsellers_date) {
        this.bestsellers_date = bestsellers_date;
    }

    @Override
    public String toString() {
        return "ClassPojo [published_date = " + published_date + ", isbns = " + ", reviews = " + ", asterisk = " + asterisk + ", dagger = " + dagger + ", display_name = " + display_name + ", weeks_on_list = " + weeks_on_list + ", rank = " + rank + ", book_details = " + book_details + ", list_name = " + list_name + ", rank_last_week = " + rank_last_week + ", amazon_product_url = " + amazon_product_url + ", bestsellers_date = " + bestsellers_date + "]";
    }
}