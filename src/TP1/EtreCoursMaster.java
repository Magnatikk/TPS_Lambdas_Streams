package TP1;

public class EtreCoursMaster implements PropriétéCours{
    @Override
    public boolean estVraieDe(Cours c) {
        return c.getNiveau().equals(Niveau.M1) || c.getNiveau().equals(Niveau.M2);
    }
}
