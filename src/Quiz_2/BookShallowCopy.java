package Quiz_2;

import java.util.List;
import java.lang.Cloneable;

public class BookShallowCopy implements Cloneable {
    private String title;
    private String author;
    private List<String> chapters;

    public BookShallowCopy(String title, String author, List<String> chapters) {
        this.title = title;
        this.author = author;
        this.chapters = chapters;
    }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public List<String> getChapters() { return chapters; }
    public void setChapters(List<String> chapters) { this.chapters = chapters; }

    @Override
    public Object clone() {
        try {
            return super.clone(); 
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    @Override
    public String toString() {
        return "BookShallowCopy{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", chapters=" + chapters +
                '}';
    }
}
