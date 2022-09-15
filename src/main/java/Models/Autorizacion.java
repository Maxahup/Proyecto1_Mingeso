package Models;

public class Autorizacion {
    private boolean autorizada;
    private int cantidadHoras;

    public Autorizacion(boolean autorizada, int cantidadHoras) {
        this.autorizada = autorizada;
        this.cantidadHoras = cantidadHoras;
    }

    public boolean isAutorizada() {
        return autorizada;
    }

    public void setAutorizada(boolean autorizada) {
        this.autorizada = autorizada;
    }

    public int getCantidadHoras() {
        return cantidadHoras;
    }

    public void setCantidadHoras(int cantidadHoras) {
        this.cantidadHoras = cantidadHoras;
    }
}
