package ListExample;

public class Menu {
    private String namaMakanan;
    private int hargaMakanan;
    private int lamaPemesanan;

    public Menu(String namaMakanan, int hargaMakanan, int lamaPemesanan) {
        this.namaMakanan = namaMakanan;
        this.hargaMakanan = hargaMakanan;
        this.lamaPemesanan = lamaPemesanan;
    }

    public String getNamaMakanan() {
        return namaMakanan;
    }

    public void setNamaMakanan(String namaMakanan) {
        this.namaMakanan = namaMakanan;
    }

    public int getHargaMakanan() {
        return hargaMakanan;
    }

    public void setHargaMakanan(int hargaMakanan) {
        this.hargaMakanan = hargaMakanan;
    }

    public int getLamaPemesanan() {
        return lamaPemesanan;
    }

    public void setLamaPemesanan(int lamaPemesanan) {
        this.lamaPemesanan = lamaPemesanan;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "namaMakanan='" + namaMakanan + '\'' +
                ", hargaMakanan=" + hargaMakanan +
                ", lamaPemesanan=" + lamaPemesanan +
                '}';
    }
}
