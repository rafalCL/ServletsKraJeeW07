package pl.coderslab.servletskrajeew07.servlet.form.zad2;

import java.util.Collections;

public class Censor {
    private static final String[] NOT_ALLOWED_WORDS = {"kurde", "motyla noga", "kota"};

    public static String doCensor(String toCensor) {
        for (String word : NOT_ALLOWED_WORDS){
            String stars = String.join("", Collections.nCopies(word.length(), "*"));
            toCensor = toCensor.replaceAll(word, stars);
        }

        return toCensor;
    }
}
