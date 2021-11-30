package TP2;

import java.util.ArrayList;
import java.util.Locale;
import java.util.function.Function;
import java.util.function.Predicate;

public class LancementLambdas {

    public static void main(String[] args) {
        Gens a, b, c, d;
        a = new Gens("lulu", 18);
        b = new Gens("toto", 17);
        c = new Gens("lulu", 20);
        d = new Gens("bibi", 20);

        ArrayList<Gens>lesGens = new ArrayList<>();
        lesGens.add(a);
        lesGens.add(b);
        lesGens.add(c);
        lesGens.add(d);

        Produit p112et30 = new Produit(112, 30);
        Produit p150et15 = new Produit(150, 15);
        Produit p120et30 = new Produit(120, 30);
        Produit p112et40 = new Produit(112, 40);
        Produit p120et30Bis = new Produit(120, 30);

        // completez avec des lambdas expressions et eventuellement le type de
        // la variable.:
        // 1: p est une fonction qui prend un gens et teste s'il a plus de 18
        // ans.
         Predicate<Gens> p = x -> x.getAge() > 18;
         System.out.println(p.test(a));
         System.out.println(p.test(b));
         System.out.println(p.test(c));

        // 2 :p2 est une fonction qui prend un gens et teste s'il s'appelle
        // "lulu".
         Predicate<Gens> p2 = x -> x.getNom().equals("lulu");
         System.out.println(p2.test(a));
         System.out.println(p2.test(b));
         System.out.println(p2.test(c));
        //
        // // 3 :p3 est une fonction qui prend un gens et teste si son nom
        // commence
        // // par l..
         Predicate<Gens> p3 = x -> x.getNom().charAt(0) == 'l';
         System.out.println(p3.test(a));
         System.out.println(p3.test(b));
         System.out.println(p3.test(c));
        //
        // // 4 : p4 est une fonction prenant un produit et testant si son prix
        // est sup
        // // a 35
         Predicate<Produit> p4 = (Produit x) -> x.getPrix() > 35;
         System.out.println(p4.test(p112et40));
         System.out.println(p4.test(p112et30));
        //
        // // 5 : utiliser and or negate (cf javadoc Predicate) pour que p5
        // teste si un
        // // Gens s'appelle "lulu" et a plus de 18 ans.
         Predicate<Gens> p5 = x -> x.getNom().equals("lulu") && x.getAge() > 18;
         System.out.println(p5.test(a));
         System.out.println(p5.test(b));
         System.out.println(p5.test(c));

        // 6 : // sur qui p6 repondra t il true ?
         Predicate<Gens> p6 = p5.or(p3.negate());
        System.out.println(p6.test(d));

        // Sur b et c, car l'écriture du prédicat se traduit par : (P5 || (-P3)) (Reflechir à ca, c'est tout con)

        // // f1 est une fonction prenant une String et retournant sa longueur.
        Function<String, Integer> f1 = (x -> x.length());
        // // L'unique methode abstraite de l'interface fonctionnelle
        // Function<S,T>
        // // T apply(S x);
        // // appliquée à "bonjour" f1 retourne donc 6
        System.out.println(f1.apply("bonjour"));
        //
        // // 7 : typer f11.
         Function<Integer, Integer> f11 = x-> x+2;
         System.out.println(f11.apply(2));
         System.out.println(f11.apply(4));
        //
        // // 8 : f2 est une fonction qui prend un gens et retourne son age
         Function<Gens, Integer> f2 = x -> x.getAge();
         System.out.println(f2.apply(a));
         System.out.println(f2.apply(b));
        //
        // // 9 : f3 est une fonction qui prend un gens et retourne la premiere
        // lettre de son
        // // nom.
         Function<Gens, Character> f3 = x -> x.getNom().charAt(0);
         System.out.println(f3.apply(a));
         System.out.println(f3.apply(b));
        //
        // // 10 : utiliser andThen pour que f4 prenne un gens et retourne le
        // double de
        // // son age.
         Function<Gens, Integer> f4 = f2.andThen(x -> x * 2);
         System.out.println(f4.apply(b));
        //
        // // 11 typer :
        Function<Gens, Character> f5 = ((Function<Gens, String>) x -> x.getNom()).andThen(y -> y.charAt(0));
        System.out.println(f5.apply(b));


        System.out.println(appliquerAChacun(lesGens, g -> new Gens(g.getNom(), g.getAge() + 2)));
        System.out.println(appliquerAChacun(lesGens, g -> new Gens(g.getNom().toUpperCase(), g.getAge())));
    }
    public static ArrayList<Gens> appliquerAChacun(ArrayList<Gens> l, Function<Gens, Gens> f) {
        ArrayList<Gens> ouga = new ArrayList<>();
        for (Gens g: l) {
            ouga.add(f.apply(g));
        }
        return ouga;
    }
}

