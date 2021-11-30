package TP3;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TPStream1 {
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
        gens.add(new Gens("Al", 28));

        //EXERCICE 1

        Predicate<Integer> p1 = x -> x % 2 == 0;
        long nbPair = nbs.stream().filter(p1).count();

        System.out.println(nbPair);

        //EXERCICE 2

        List<Integer> nbPairListe = nbs.stream().filter(p1).collect(Collectors.toList());
        System.out.println(nbPairListe);

        Set<String> nomsQuatre = noms.stream().filter(x -> x.length() == 4).collect(Collectors.toSet());
        System.out.println(nomsQuatre);

        //EXERCICE 3

        List<Integer> Age_gens = gens.stream().map(x -> x.getAge()).collect(Collectors.toList());
        System.out.println(Age_gens);

        List<Integer> TailleNomGens = gens.stream().map(x -> x.getNom().length()).collect(Collectors.toList());
        System.out.println(TailleNomGens);

        /*

         */

        List<Integer> m1 = nbs.stream().map(x -> x * 2).collect(Collectors.toList());
        System.out.println(m1);

        //EXERCICE 4

        List<Gens> nomsEnL = gens.stream().filter(x -> x.getNom().toLowerCase().charAt(0) == 'l').collect(Collectors.toList());
        System.out.println(nomsEnL);

        List<Gens> Ont20Ans = gens.stream().filter(x -> x.getAge() == 20).collect(Collectors.toList());
        System.out.println(Ont20Ans);

        List<Integer> nomSupA3 = gens.stream().filter(x -> x.getNom().length() > 3).map(x -> x.getNom().length()).collect(Collectors.toList());
        System.out.println(nomSupA3);
    }

}
