public class Desastres {
    private String Hora;
    private String Daños;
    private String Dia;
    private String epicentro;
    private int cantidad;

    public Desastres(String hora, String daños, String dia, String epicentro, int cantidad) {
        Hora = hora;
        Daños = daños;
        Dia = dia;
        this.epicentro = epicentro;
        this.cantidad = cantidad;
    }

    public String getHora() {
        return Hora;
    }

    public void setHora(String hora) {
        Hora = hora;
    }

    public String getDaños() {
        return Daños;
    }

    public void setDaños(String daños) {
        Daños = daños;
    }

    public String getDia() {
        return Dia;
    }

    public void setDia(String dia) {
        Dia = dia;
    }

    public String getEpicentro() {
        return epicentro;
    }

    public void setEpicentro(String epicentro) {
        this.epicentro = epicentro;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
