public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void mudarCanal(int novoCanal) {
        canal = 1;
    }

    public void aumentarCanal() {
        // canal = canal + 1;
        canal++;
    }

    public void diminuirCanal() {
        // canal = canal - 1;
        canal--;
    }

    public void aumentarVolume() {
        // volume = volume + 1;
        volume++;

        System.out.println("Ajustando o Volume para:" + " " + volume);
    }

    public void diminuirVolume() {
        // volume = volume - 1;
        volume--;

        System.out.println("Ajustando o Volume para:" + " " + volume);
    }

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

}
