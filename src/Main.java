
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

        System.out.println("Espacio máximo colección: " + vinilos.length);

        mostrarTotal(vinilos);
        mostrarDisponibles(vinilos);

        String artista = "AC-DC";
        System.out.println("Buscar artista " + artista);
        mostrarBusquedaArtista(vinilos, artista);

        buscarArtista(vinilos, artista);
        mostrarColeccion(vinilos);

    }

    public static void mostrarColeccion(String[][] vinilos) {
        for (int i = 0; i < vinilos.length - 1; i++) {
            if (vinilos[i][0] == null) {
                break;
            }
            System.out.print("Fila " + (i + 1) + ": ");
            for (int j = 0; j < 3; j++) {
                System.out.print(vinilos[i][j] + " - ");
            }
            System.out.println("");
        }
    }

    public static boolean buscarArtista(String[][] vinilos, String artista) {
        boolean caso = false;
        String busqueda;
        for (int i = 0; i < totalVinilos(vinilos) - 1; i++) {
            busqueda = vinilos[i][0];
            if (busqueda.equals(artista)) {
                caso = true;
            }
        }
        return caso;
    }

    public static void mostrarBusquedaArtista(String[][] vinilos, String artista) {
        if (buscarArtista(vinilos, artista) == true) {
            System.out.println("El artista " + artista + " si está en la colección");
        }

    }

    public static void mostrarDisponibles(String m[][]) {
        System.out.println("Hay un total de: " + disponibles(m) + " espacios disponibles en la colección");
    }

    public static void mostrarTotal(String[][] vinilos) {
        System.out.println("Hay " + totalVinilos(vinilos) + " vinilos en la colección");
    }

    public static String[][] agregarVinilo(String m[][], String grupo, String disco, String año) {
        int count = 0;
        for (int i = 0; i < 10; i++) {
            if (m[i][0] == null) {
                break;
            }
            count++;
        }

        m[count][0] = grupo;
        m[count][1] = disco;
        m[count][2] = año;

        return m;
    }

    public static int totalVinilos(String m[][]) {
        int count = 0;
        for (int i = 0; i < 10; i++) {
            if (m[i][0] == null) {
                break;
            }
            count++;
        }
        return count;
    }

    public static int disponibles(String m[][]) {
        int count = 0;
        for (int i = 0; i < 10; i++) {
            if (m[i][0] == null) {
                break;
            }
            count++;
        }
        int total = m.length - count;
        return total;
    }
}
