package pl.pja.s28201.tpo_06.model;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public enum Language {
    PL("Polish", Locale.forLanguageTag("pl")),
    EN("English", Locale.ENGLISH),
    DE("Deutsche", Locale.GERMANY),
    UA("Ukrainian", Locale.forLanguageTag("ua")),
    FR("French", Locale.FRANCE),
    ES("Spanish", Locale.forLanguageTag("es")),
    IT("Italian", Locale.ITALY),
    CS("Czech", Locale.forLanguageTag("cs")),
    ET("Estonian", Locale.forLanguageTag("et")),
    ZH("Chinese", Locale.CHINA);

    private static final Map<String, Language> BY_LANG = new HashMap<>();
    private static final Map<Locale, Language> BY_LOCALE = new HashMap<>();

    static {
        for (Language type : values()) {
            BY_LANG.put(type.lang, type);
            BY_LOCALE.put(type.locale, type);
        }
    }

    private final String lang;
    private final Locale locale;

    Language(String lang, Locale locale) {
        this.lang = lang;
        this.locale = locale;
    }

    public static Language fromLanguageString(String langStr) {
        return BY_LANG.get(langStr);
    }

    public static String toLanguageCode(String langStr) {
        return fromLanguageString(langStr).toString();
    }

    public static Locale toLocale(String langStr) {
        return fromLanguageString(langStr).locale;
    }

    @Override
    public String toString() {
        return lang;
    }
}
