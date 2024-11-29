package aula13;

public class Main {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Marcos", 21, "M");
        p[1] = new Pessoa("Maria", 25, "F");

        l[0] = new Livro("POO na pratica", "Allan Stieg", 300, p[1]);
        l[1] = new Livro("Web Designer", "Marcos Pasquim", 500, p[1]);
        l[2] = new Livro("A volta sem ir", "Jonas Confuso", 800, p[0]);
 
        l[0].abrir();
        l[0].folhear(299);
        l[0].avancarPag();

        System.out.println(l[0].detalhes());
    }
}
