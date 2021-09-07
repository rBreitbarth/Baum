public class Main {

    public static void main(String[] args) {
        // Baum wird gebaut
        Baum baum = new Baum();
        // Lösung
        int anzahlKaefer = findeKaeferInBaum(baum);
        System.out.println("Der Baum hat " + anzahlKaefer + " Käfer");
    }

    private static int findeKaeferInBaum(Baum baum) {
        int anzahlKaefer = 0;
        for (Ast ast : baum.getAeste()) {
            anzahlKaefer += findeKaeferInAst(ast);
        }
        return anzahlKaefer;
    }

    private static int findeKaeferInAst(Ast ast) {
        int anzahlKaefer = 0;
        // finde Käfer von weiteren Ästen
        for (Ast unterAst : ast.getAeste()) {
            anzahlKaefer += findeKaeferInAst(unterAst);
        }
        // finde Käfer von diesem Ast
        for (Blatt blatt : ast.getBlaetter()) {
            if (blatt.hatKaefer()) {
                anzahlKaefer++;
            }
        }
        return anzahlKaefer;
    }
}
