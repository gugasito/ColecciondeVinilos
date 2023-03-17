
public class Main {

    public static void main(String[] args) {
        String vinilos[][] = new String[100][3];

        agregarVinilo(vinilos, "Iron maiden", "Iron Maiden", "1980");
        agregarVinilo(vinilos, "Iron maiden", "Killers", "1981");
        agregarVinilo(vinilos, "Iron maiden", "The number of the beast", "1982");
        agregarVinilo(vinilos, "AC-DC", "Back in black", "1980");
        agregarVinilo(vinilos, "AC-DC", "Highway to Hell", "1979");
        agregarVinilo(vinilos, "AC-DC", "Who made who", "1986");
        agregarVinilo(vinilos, "Judas Priest", "British steel", "1980");
        agregarVinilo(vinilos, "Judas Priest", "Painkiller", "1990");
        agregarVinilo(vinilos, "Judas Priest", "Defenders of the faith", "1984");
        agregarVinilo(vinilos, "Kiss", "Destroyer", "1976");

        System.out.println("Espacio máximo colección " + vinilos.length);

        mostrarTotal(vinilos);
        mostrarDisponibles();

        String artista = "AC-DC";
        System.out.println("Buscar artista " + artista);
        mostrarBusquedaArtista(vinilos, artista);

        buscarArtista(vinilos, artista);
        mostrarColeccion(vinilos);

    }

    public static void mostrarColeccion(String[][] vinilos) {
    }

    public static boolean buscarArtista(String[][] vinilos, String artista) {
        return false;
    }

    public static void mostrarBusquedaArtista(String[][] vinilos, String artista) {
    }

    public static void mostrarDisponibles() {
    }

    public static void mostrarTotal(String[][] vinilos) {
    }

    public static String[][] agregarVinilo(String m[][], String grupo, String disco, String año) {

        return null;
    }

    public static int totalVinilos(String m[][]) {
        return 0;
    }

    public static int disponibles(String m[][]) {
        return 0;
    }
}
