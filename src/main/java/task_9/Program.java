package task_9;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {

        List<String> words = new ArrayList<>();
        words.add("String");
        words.add("chr");
        words.add("int");
        words.add("byt");
        words.add("Array");

        System.out.println(words);

        List<String> shortWords = words.stream().filter(s -> s.length() < 4).collect(Collectors.toList());
        System.out.println(shortWords);


    }
}
