package Articles2;

public class ArticleTwo {
    private String title;
    private String content;
    private String author;

    public ArticleTwo(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return String.format("%s - %s: %s",title,content,author);
    }
}


