package ListExample;

import java.util.*;

public class NgurahRestaurant {

    static void lihatBerdasarkanHarga(List<Menu> menu) {
        menu.sort(Comparator.comparingInt(Menu::getHargaMakanan));
        System.out.println("List menu berdasarkan harga terendah : ");
        for(int i = 0; i < menu.size(); i++) {
            System.out.println("=============================================");
            System.out.println("Nama Makanan : " + menu.get(i).getNamaMakanan());
            System.out.println("Harga Makanan : " + menu.get(i).getHargaMakanan());
            System.out.println("Lama Pemesanan Makanan : " + menu.get(i).getLamaPemesanan());
        }
    }

    static void lihatBerdasarkanLamaPemesanan(List<Menu> menu) {
        menu.sort(Comparator.comparingInt(Menu::getLamaPemesanan));
        System.out.println("List menu berdasarkan lama pemesanan : ");
        for(int i = 0; i < menu.size(); i++) {
            System.out.println("=============================================");
            System.out.println("Nama Makanan : " + menu.get(i).getNamaMakanan());
            System.out.println("Harga Makanan : " + menu.get(i).getHargaMakanan());
            System.out.println("Lama Pemesanan Makanan : " + menu.get(i).getLamaPemesanan());
        }
    }

    public static void main(String[] args) {
        Scanner inputan=new Scanner(System.in);
        int pilihan;
        int reRun = 1;
        int ulang;

        List<Menu> menu = new ArrayList<>();
        menu.add(new Menu("Nasi Goreng", 18000, 16));
        menu.add(new Menu("Capcay", 13000, 12));
        menu.add(new Menu("Mie Goreng", 10000, 8));
        menu.add(new Menu("Fuyung Hay", 12000, 15));



        System.out.println("Hai selamat datang di Ngurah Restaurant");
        while(reRun == 1) {
        System.out.println("==========================================");
        System.out.println("1. Lihat Menu");
        System.out.println("2. Urutkan Menu berdasarkan harga terendah");
        System.out.println("3. Urutkan Menu berdasarkan lama pemesanan terendah");
        System.out.println("4. Exit Program");
        System.out.println("==========================================");
        System.out.println("Masukkan pilihan anda ");
        pilihan = inputan.nextInt();
            switch (pilihan) {
                case 1:

                    System.out.println("List Menu : ");
                    int index = 1;
                    for(int i = 0; i < menu.size(); i++) {
                        System.out.println(index + ". "  + menu.get(i).getNamaMakanan());
                        index++;
                    }
                    System.out.println("Kembali ke menu ? (1 = yes/ 2 = no)");
                    ulang = inputan.nextInt();
                    if(ulang != 1) {
                        reRun = 0;
                    }
                    break;
                case 2:
                    lihatBerdasarkanHarga(menu);
                    System.out.println("Kembali ke menu ? (1 = yes/ 2 = no)");
                    ulang = inputan.nextInt();
                    if(ulang != 1) {
                        reRun = 0;
                    }
                    break;

                case 3:
                    lihatBerdasarkanLamaPemesanan(menu);
                    System.out.println("Kembali ke menu ? (1 = yes/ 2 = no)");
                    ulang = inputan.nextInt();
                    if(ulang != 1) {
                        reRun = 0;
                    }
                    break;

                case 4:
                    reRun = 0;
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia");
            }
        }

    }
}

