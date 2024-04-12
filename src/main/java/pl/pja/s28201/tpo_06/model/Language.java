package pl.pja.s28201.tpo_06.model;

import java.util.HashMap;
import java.util.Map;

public enum Language {
    PL("Polish"),
    EN("English"),
    DE("Deutsche"),
    UA("Ukrainian"),
    FR("French"),
    ES("Spanish"),
    IT("Italian"),
    CS("Czech"),
    ET("Estonian"),
    FI("Finnish");

    private static final Map<String, Language> BY_LANG = new HashMap<>();

    static {
        for (Language type : values()) {
            BY_LANG.put(type.lang, type);
        }
    }

    private final String lang;

    Language(String lang) {
        this.lang = lang;
    }

    public static Language fromString(String langStr) {
        return BY_LANG.get(langStr);
    }


    @Override
    public String toString() {
        return lang;
    }
}
