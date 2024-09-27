package ebc;

public class Main {
    public static void main(String[] args) {
        Lutadores l[] = new Lutadores[6];

        l[0] = new Lutadores("Pretty Boy", "França", 31, 1.75f, 68.91f, 11, 2, 1);
        l[1] = new Lutadores("Putscript", "Brasil", 29, 1.68f, 57.81f, 14, 2, 3);
        l[2] = new Lutadores("Snapshadow", "EUA", 35, 1.65f, 80.9f, 12, 2, 1);
        l[3] = new Lutadores("Dead Code", "Australia", 28, 1.93f, 81.6f, 13, 0, 2);
        l[4] = new Lutadores("UFOŁobol", "Brasil", 37, 1.70f, 119.31f, 5, 4, 3);
        l[5] = new Lutadores("Nerdaart", "EUA", 30, 1.81f, 105.7f, 12, 2, 4);

        Luta UEC01 = new Luta();
        UEC01.marcarLuta(l[0], l[1]);
        UEC01.lutar();
    }
}