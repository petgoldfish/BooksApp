package com.petgoldfish.books.BooksModels;

public class Books {
    private String created_date;

    private String article_chapter_link;

    private int book_image_height;

    private String sunday_review_link;

    private String first_chapter_link;

    private String primary_isbn10;

    private String book_review_link;

    private String primary_isbn13;

    private int book_image_width;

    private String publisher;

    private String weeks_on_list;

    private String author;

    private String book_image;

    private String title;

    private String rank;

    private String updated_date;

    private String price;

    private String contributor;

    private String description;

    private String age_group;

    private String contributor_note;

    private String rank_last_week;

    private String amazon_product_url;

    public String getCreated_date() {
        return created_date;
    }

    public void setCreated_date(String created_date) {
        this.created_date = created_date;
    }

    public String getArticle_chapter_link() {
        return article_chapter_link;
    }

    public void setArticle_chapter_link(String article_chapter_link) {
        this.article_chapter_link = article_chapter_link;
    }

    public int getBook_image_height() {
        return book_image_height;
    }

    public void setBook_image_height(int book_image_height) {
        this.book_image_height = book_image_height;
    }

    public String getSunday_review_link() {
        return sunday_review_link;
    }

    public void setSunday_review_link(String sunday_review_link) {
        this.sunday_review_link = sunday_review_link;
    }

    public String getFirst_chapter_link() {
        return first_chapter_link;
    }

    public void setFirst_chapter_link(String first_chapter_link) {
        this.first_chapter_link = first_chapter_link;
    }

    public String getPrimary_isbn10() {
        return primary_isbn10;
    }

    public void setPrimary_isbn10(String primary_isbn10) {
        this.primary_isbn10 = primary_isbn10;
    }

    public String getBook_review_link() {
        return book_review_link;
    }

    public void setBook_review_link(String book_review_link) {
        this.book_review_link = book_review_link;
    }

    public String getPrimary_isbn13() {
        return primary_isbn13;
    }

    public void setPrimary_isbn13(String primary_isbn13) {
        this.primary_isbn13 = primary_isbn13;
    }

    public int getBook_image_width() {
        return book_image_width;
    }

    public void setBook_image_width(int book_image_width) {
        this.book_image_width = book_image_width;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getWeeks_on_list() {
        return weeks_on_list;
    }

    public void setWeeks_on_list(String weeks_on_list) {
        this.weeks_on_list = weeks_on_list;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBook_image() {
        return book_image;
    }

    public void setBook_image(String book_image) {
        this.book_image = book_image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getUpdated_date() {
        return updated_date;
    }

    public void setUpdated_date(String updated_date) {
        this.updated_date = updated_date;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getContributor() {
        return contributor;
    }

    public void setContributor(String contributor) {
        this.contributor = contributor;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAge_group() {
        return age_group;
    }

    public void setAge_group(String age_group) {
        this.age_group = age_group;
    }

    public String getContributor_note() {
        return contributor_note;
    }

    public void setContributor_note(String contributor_note) {
        this.contributor_note = contributor_note;
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


    @Override
    public String toString() {
        return "ClassPojo [created_date = " + created_date + ", article_chapter_link = " + article_chapter_link + ", book_image_height = " + book_image_height + ", sunday_review_link = " + sunday_review_link + ", first_chapter_link = " + first_chapter_link + ", primary_isbn10 = " + primary_isbn10 + ", book_review_link = " + book_review_link + ", primary_isbn13 = " + primary_isbn13 + ", book_image_width = " + book_image_width + ", publisher = " + publisher + ", weeks_on_list = " + weeks_on_list + ", author = " + author + ", book_image = " + book_image + ", title = " + title + ", rank = " + rank + ", updated_date = " + updated_date + ", price = " + price + ", contributor = " + contributor + ", description = " + description + ", age_group = " + age_group + ", contributor_note = " + contributor_note + ", rank_last_week = " + rank_last_week + ", amazon_product_url = " + amazon_product_url + "]";
    }
}