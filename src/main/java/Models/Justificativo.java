package Models;

public class Justificativo {
    private boolean justificadorAusencia;
    private int diasJustificados;

    public Justificativo(boolean justificadorAusencia, int diasJustificados) {
        this.justificadorAusencia = justificadorAusencia;
        this.diasJustificados = diasJustificados;
    }

    public boolean isJustificadorAusencia() {
        return justificadorAusencia;
    }

    public void setJustificadorAusencia(boolean justificadorAusencia) {
        this.justificadorAusencia = justificadorAusencia;
    }

    public int getDiasJustificados() {
        return diasJustificados;
    }

    public void setDiasJustificados(int diasJustificados) {
        this.diasJustificados = diasJustificados;
    }
}
