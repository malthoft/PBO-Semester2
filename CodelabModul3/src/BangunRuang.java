public class BangunRuang {
    private String name;

    BangunRuang(String name) {
        this.name = name;
    }

    public void inputNilai() {
        System.out.println("\nInput nilai untuk " + name);
    }

    public void luasPermukaan() {
        System.out.println(ANSI_GREEN + "\nMenghitung luas permukaan bangun " + name + ANSI_RESET);
    }

    public void volume() {
        System.out.println(ANSI_YELLOW + "\nMenghitung volume bangun " + name + ANSI_RESET);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";

    public static void main(String[] args) {
        Tabung tabung = new Tabung("Tabung");
        Kubus kubus = new Kubus("Kubus");
        Balok balok = new Balok("Balok");

        System.out.println(ANSI_BLUE + "\n=== Program Menghitung Bangun Ruang ===" + ANSI_RESET);

        kubus.inputNilai();
        kubus.luasPermukaan();
        kubus.volume();

        balok.inputNilai();
        balok.luasPermukaan();
        balok.volume();

        tabung.inputNilai();
        tabung.luasPermukaan();
        tabung.volume();
    }
}
