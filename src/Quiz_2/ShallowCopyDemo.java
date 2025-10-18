package Quiz_2;

import java.util.ArrayList;
import java.util.List;

public class ShallowCopyDemo {
    public static void main(String[] args) {
        List<String> chapters = new ArrayList<>();
        chapters.add("Chapter 1");
        chapters.add("Chapter 2");

        BookShallowCopy original = new BookShallowCopy("Java Lessons", "Jack Morris", chapters);
        BookShallowCopy clone = (BookShallowCopy) original.clone();

        original.getChapters().add("Chapter 3");

        System.out.println("Original: " + original);
        System.out.println("Clone: " + clone);
    }
}
