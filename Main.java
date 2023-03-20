import java.util.*;

public class Main {
    public static void main(String[] args) {
        /**
         * Есть тест. Нужно извлечь из него все слова и отсортировать по длине.
         * Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись
         *
         * и
         * ты
         * Еще
         * день друг Пора
         * ..
         *
         */
        String text = "Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись";
        String[] splitText = text.split(" ");
        Map<Integer, Collection<String>> collText = new TreeMap<>();
        for (int i = 0; i < splitText.length; i++) {
            ArrayList<String> lenText = new ArrayList<>();
            for (String s : splitText) {
                if (splitText[i].length() == s.length()) {
                    lenText.add(s);
                }
            }
            collText.put(splitText[i].length(), lenText);
        }
        for (Collection<String> s : collText.values()) {
            System.out.println(s);
        }
    }
}