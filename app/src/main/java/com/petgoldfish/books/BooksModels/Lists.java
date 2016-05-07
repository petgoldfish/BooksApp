package com.petgoldfish.books.BooksModels;

public class Lists {
    private Books[] books;

    private int list_image_width;

    private String display_name;

    private int list_image_height;

    private String updated;

    private String list_name_encoded;

    private String list_name;

    private String list_image;

    private String list_id;

    public Books[] getBooks() {
        return books;
    }

    public void setBooks(Books[] books) {
        this.books = books;
    }

    public int getList_image_width() {
        return list_image_width;
    }


    public String getDisplay_name() {
        return display_name;
    }

    public void setDisplay_name(String display_name) {
        this.display_name = display_name;
    }

    public int getList_image_height() {
        return list_image_height;
    }


    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public String getList_name_encoded() {
        return list_name_encoded;
    }

    public void setList_name_encoded(String list_name_encoded) {
        this.list_name_encoded = list_name_encoded;
    }

    public String getList_name() {
        return list_name;
    }

    public void setList_name(String list_name) {
        this.list_name = list_name;
    }

    public String getList_image() {
        return list_image;
    }


    public String getList_id() {
        return list_id;
    }

    public void setList_id(String list_id) {
        this.list_id = list_id;
    }

    @Override
    public String toString() {
        return "ClassPojo [books = " + books + ", list_image_width = " + list_image_width + ", display_name = " + display_name + ", list_image_height = " + list_image_height + ", updated = " + updated + ", list_name_encoded = " + list_name_encoded + ", list_name = " + list_name + ", list_image = " + list_image + ", list_id = " + list_id + "]";
    }
}