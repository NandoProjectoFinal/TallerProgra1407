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

    public static void seleccionDesastre(){
        mostrarLista();
        listaDesastres();
    }

    private static String[] listaDesastres() {
        GestorArchivo a  = new GestorArchivo();
        String ruta = "C:\\Users\\HP\\Documents\\NetBeansProjects\\TallerProgra\\Desastres";
        String[] lista = a.leerArchivo(ruta).split("\n");
        return lista;
    }

    private static void mostrarLista() {
        GestorArchivo a  = new GestorArchivo();
        String ruta = "C:\\Users\\HP\\Documents\\NetBeansProjects\\TallerProgra\\Desastres";
        String[] lista = a.leerArchivo(ruta).split("\n");
        for (int i=0; i<lista.length; i++){
            System.out.println("["+(i)+"]" + " " + lista[i]);
        }
    }

    public static void main(String[] args) {
        mostrarLista();
    }
}
