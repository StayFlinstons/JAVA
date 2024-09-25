package aula06;

public class ControleRemoto implements Controlador {
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean isTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    @Override
    public void abrirMenu() {
        System.out.println("---- MENU -----");
        System.out.println("Está ligado? " + this.isLigado());
        System.out.println("Está tocando? " + this.isTocando());
        System.out.printf("Volume: " + this.getVolume() + " ");
        for (int i = 1; i <= this.getVolume(); i += 10) {
            System.out.printf("|");
        }
        System.out.println("\n---------------");
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void desligarMudo() {
        if (this.isLigado() && this.getVolume() == 0) {
            this.setVolume(50);
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu...");
    }

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void ligarMudo() {
        if (this.isLigado() && this.getVolume() > 0) {
            this.setVolume(0);
        }
    }

    @Override
    public void maisVolume() {
        if (this.isLigado()) {
            this.setVolume(this.getVolume() + 10);
        } else {
            System.out.println("Não está ligado.");
        }
    }

    @Override
    public void menosVolume() {
        if (this.isLigado()) {
            this.setVolume(this.getVolume() - 10);
        } else {
            System.out.println("Não está ligado.");
        }
    }

    @Override
    public void pause() {
        if (this.isLigado() && this.isTocando()) {
            setTocando(false);
        } else {
            System.out.println("Não está ligado.");
        }
    }

    @Override
    public void play() {
        if (this.isLigado() && !this.isTocando()) {
            this.setTocando(true);
        } else {
            System.out.println("Não está ligado.");
        }
    }

}
