package TP4;
import TP3.Gens;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TPStream2 {
    public static void main(String[] args) {
        ArrayList<Integer> nbs = new ArrayList<>();
        nbs.add(2);
        nbs.add(4);
        nbs.add(7);
        nbs.add(8);

        ArrayList<String> noms = new ArrayList<>();
        noms.add("toto");
        noms.add("Lulu");
        noms.add("bidule");
        noms.add("truc");
        noms.add("lolo");

        ArrayList<Gens> gens = new ArrayList<>();
        gens.add(new Gens("Toto", 123));
        gens.add(new Gens("tutu", 20));
        gens.add(new Gens("lolol", 25));
        gens.add(new Gens("Lulu", 55));
        gens.add(new Gens("Al", 17));

        //EXERCICE 1
        boolean moinsDe20Ans = gens.stream().anyMatch(x -> x.getAge() < 20);
        boolean moinsDe15Ans = gens.stream().anyMatch(x -> x.getAge() < 15);

        System.out.println(moinsDe20Ans);
        System.out.println(moinsDe15Ans);

        boolean tousMajeursAllMatch = gens.stream().allMatch(x -> x.getAge() > 18);
        System.out.println(tousMajeursAllMatch);

        boolean tousMajeursNoneMatch = gens.stream().noneMatch(x -> x.getAge() < 18);
        System.out.println(tousMajeursNoneMatch);

        //EXERCICE 2


    }
}
