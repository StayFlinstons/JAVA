package ebc;

import java.util.Random;

public class Luta {
    private Lutadores desafiado;
    private Lutadores desafiante;
    private int rounds;
    private boolean aprovada;

    public void marcarLuta(Lutadores l1, Lutadores l2){
        if (l1.getCategoria() == l2.getCategoria() & l1 != l2) {
            setAprovada(true);
            setDesafiado(l1);
            setDesafiante(l2);
        } else {
            setAprovada(false);
            setDesafiado(null);
            setDesafiante(null);
        }
    }

    public void lutar(){
        if (isAprovada()) {
            System.out.println("$$$ DESAFIADO $$$");
            desafiado.apresentar();
            System.out.println("$$$ DESAFIANTE $$$");
            desafiante.apresentar();

            Random random = new Random();
            int vencedor = random.nextInt(3);
            
            System.out.println("===== RESULTADO DA LUTA =====");
            
            switch (vencedor) {
                case 0:
                    System.out.println("Empatou!");
                    desafiado.empatarLutar();
                    desafiante.empatarLutar();
                    break;
                case 1:
                    System.out.println("Vitoria do: " + desafiado.getNome());
                    desafiado.ganharLutar();
                    desafiante.perderLuta();
                    break;
                case 2:
                    System.out.println("Vitoria do: " + desafiante.getNome());
                    desafiante.ganharLutar();
                    desafiado.perderLuta();
                    break;
            }
        } else {
            System.out.println("Está luta não pode acontecer");
        }
    }

    public Lutadores getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutadores desafiado) {
        this.desafiado = desafiado;
    }

    public Lutadores getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutadores desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}
