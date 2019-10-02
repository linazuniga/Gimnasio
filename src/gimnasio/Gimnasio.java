package gimnasio;

import java.util.Date;

public class Gimnasio {

    private int numeroDeMaquinas;
    private Date fechasDeInscripcion;
    private String colorDeLasMaquinas;
    private boolean fisioterapeutas;
    private int numeroDeEntrenadores;

    public Gimnasio(int numeroDeMaquinas, Date fechasDeInscripcion, String colorDeLasMaquinas, boolean fisioterapeutas, int numeroDeEntrenadores) {
        this.numeroDeMaquinas = numeroDeMaquinas;
        this.fechasDeInscripcion = fechasDeInscripcion;
        this.colorDeLasMaquinas = colorDeLasMaquinas;
        this.fisioterapeutas = fisioterapeutas;
        this.numeroDeEntrenadores = numeroDeEntrenadores;
    }

    public int getNumeroDeMaquinas() {
        return numeroDeMaquinas;
    }

    public void setNumeroDeMaquinas(int numeroDeMaquinas) {
        this.numeroDeMaquinas = numeroDeMaquinas;
    }

    public Date getFechasDeInscripcion() {
        return fechasDeInscripcion;
    }

    public void setFechasDeInscripcion(Date fechasDeInscripcion) {
        this.fechasDeInscripcion = fechasDeInscripcion;
    }

    public String getColorDeLasMaquinas() {
        return colorDeLasMaquinas;
    }

    public void setColorDeLasMaquinas(String colorDeLasMaquinas) {
        this.colorDeLasMaquinas = colorDeLasMaquinas;
    }

    public boolean isFisioterapeutas() {
        return fisioterapeutas;
    }

    public void setFisioterapeutas(boolean fisioterapeutas) {
        this.fisioterapeutas = fisioterapeutas;
    }

    public int getNumeroDeEntrenadores() {
        return numeroDeEntrenadores;
    }

    public void setNumeroDeEntrenadores(int numeroDeEntrenadores) {
        this.numeroDeEntrenadores = numeroDeEntrenadores;
    }

}
