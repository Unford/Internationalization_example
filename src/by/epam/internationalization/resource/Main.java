package by.epam.internationalization.resource;
import by.epam.internationalization.manager.MessageManager;

import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;

public class Main {
    public static void ten(){
        System.out.println("1 — eng\n 2 — bel\n any — default");
        char i = 0;
        try {
            i = (char)System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String country = "";
        String language = "";
        switch (i) {
            case '1':
                country = "US"; language = "en"; break;
            case '2':
                country = "BY"; language = "be";
        }
        Locale current = new Locale(language, country);
        ResourceBundle rb = ResourceBundle.getBundle("property.text", current);

        String s1 = rb.getString("str1");
        System.out.println(s1);
        String s2 = rb.getString("str2");
        System.out.println(s2);
    }

    public static void main(String[] args) {
       ten();
        System.out.println("_________________");
        String s1 = MessageManager.BY.getString("str1");
        System.out.println(s1);
        String s2 = MessageManager.BY.getString("str2");
        System.out.println(s2);

        s1 = MessageManager.EN.getString("str1");
        System.out.println(s1);
        s2 = MessageManager.EN.getString("str2");
        System.out.println(s2);

        s1 = MessageManager.RU.getString("str1");
        System.out.println(s1);
        s2 = MessageManager.RU.getString("str2");
        System.out.println(s2);
    }
}
