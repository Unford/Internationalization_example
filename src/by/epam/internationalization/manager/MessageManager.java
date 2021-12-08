package by.epam.internationalization.manager;

import java.util.Locale;
import java.util.ResourceBundle;

public enum MessageManager {
    EN(ResourceBundle.getBundle("property.text", new Locale("en", "US"))),
    BY(ResourceBundle.getBundle("property.text", new Locale("be", "BY"))),
    RU(ResourceBundle.getBundle("property.text", new Locale("", "")));

    private ResourceBundle bundle;
    MessageManager(ResourceBundle bundle) {
        this.bundle = bundle;
    }

    public String getString(String key) { return bundle.getString(key);
    }
}
