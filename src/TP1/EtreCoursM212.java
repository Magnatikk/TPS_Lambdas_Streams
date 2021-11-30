package TP1;

public class EtreCoursM212 implements PropriétéCours{

    @Override
    public boolean estVraieDe(Cours c) {
        return c.getIntitule().equals("M212");
    }
}

