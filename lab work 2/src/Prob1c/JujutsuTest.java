package Prob1c;

import java.util.HashSet;

public class JujutsuTest {

    public static void main(String[] args) {

        HashSet<Sorcerer> sorcerers = new HashSet<>();

        Sorcerer gojo1 = new SpecialGradeSorcerer(
                "Gojo Satoru",
                "Special Grade",
                "Limitless",
                "Infinite Void"
        );

        Sorcerer gojo2 = new SpecialGradeSorcerer(
                "Gojo Satoru",
                "Special Grade",
                "Limitless",
                "Infinite Void"
        );

        Sorcerer yuta = new SpecialGradeSorcerer(
                "Yuta Okkotsu",
                "Special Grade",
                "Copy Technique",
                "Authentic Mutual Love"
        );

        sorcerers.add(gojo1);
        sorcerers.add(gojo2);
        sorcerers.add(yuta);

        for (Sorcerer s : sorcerers) {
            System.out.println(s);
        }

        System.out.println("Total sorcerers: " + sorcerers.size());
    }
}
