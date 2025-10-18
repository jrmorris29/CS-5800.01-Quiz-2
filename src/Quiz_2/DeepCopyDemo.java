package Quiz_2;

import java.util.ArrayList;
import java.util.List;

public class DeepCopyDemo {
    public static void main(String[] args) {
        List<String> chapters = new ArrayList<>();
        chapters.add("Intro");
        chapters.add("Design Patterns");

        BookDeepCopy original = new BookDeepCopy("Design Patterns in Java", "Adrian Bagro", chapters);
        BookDeepCopy clone = (BookDeepCopy) original.clone();

        original.getChapters().add("Singleton Pattern");

        System.out.println("Original: " + original);
        System.out.println("Clone: " + clone);
    }
}
