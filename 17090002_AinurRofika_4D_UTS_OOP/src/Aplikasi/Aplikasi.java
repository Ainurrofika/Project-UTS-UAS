package Aplikasi;
import entity.*;
import services.*;
import java.util.*;

public class Aplikasi {

    private static Scanner scanner;
    private static final BukuperpusServices service = new BukuperpusServices();

    public static void main(String[] args) {
        int opsi = 5;
        do {
            tampilkanMenu();
            scanner = new Scanner(System.in);
            try{
            opsi = scanner.nextInt();}
            catch(Exception e) {
                System.err.println("Ada kesalahan input");
            }
            proses(opsi);
        } while(opsi != 5);
    }

    private static void proses(int opsi) {
        switch(opsi) {
            case 1:
                TampilkanFormTambahData();
                break;
            case 2:
                tampilkanFormUbahData();
                break;
            case 3:
                tampilkanFormHapusData();
                break;
            case 4:
                service.tampilkanData();
                break;
        }
    }
    private static void TampilkanFormTambahData() {
        scanner = new Scanner(System.in);
        String no_buku, nama_buku, penerbit,kategori,jumlah,rak;

        System.out.println("\n--= Form Tambah Data");
        System.out.print  ("No_buku : ");
        no_buku = scanner.nextLine();
        System.out.print("Nama_buku : ");
        nama_buku = scanner.nextLine();
        System.out.print("Penerbit : ");
        penerbit = scanner.nextLine();
        System.out.print  ("Kategori : ");
        kategori = scanner.nextLine();
        System.out.print("Jumlah : ");
        jumlah = scanner.nextLine();
        System.out.print("Rak : ");
        rak = scanner.nextLine();
        service.tambahData(new Bukuperpus(no_buku,nama_buku,penerbit,kategori,jumlah,rak));
    }
   
    private static void tampilkanFormUbahData() {
        scanner = new Scanner(System.in);
        String no_buku, nama_buku, penerbit,kategori,jumlah,rak;

        System.out.println("\n--= Form Ubah Data");
        System.out.print  ("No_buku : ");
        no_buku = scanner.nextLine();
        System.out.print("Nama_buku : ");
        nama_buku = scanner.nextLine();
        System.out.print("Penerbit : ");
        penerbit = scanner.nextLine();
        System.out.print  ("Kategori : ");
        kategori= scanner.nextLine();
        System.out.print("Jumlah : ");
        jumlah = scanner.nextLine();
        System.out.print("Rak : ");
        rak = scanner.nextLine();
        service.ubahData(new Bukuperpus(no_buku,nama_buku,penerbit,kategori,jumlah,rak));
    }

   private static void tampilkanFormHapusData() {
        scanner = new Scanner(System.in);
        String no_buku;

        System.out.println("\n--= Form Hapus Data");
        System.out.print  ("No_buku: ");
        no_buku = scanner.nextLine();
        service.hapusData(no_buku);
    }

    private static void tampilkanMenu() {
        System.out.println("\n--= Menu Aplikasi =--");
        System.out.println("1. Tambah Data");
        System.out.println("2. Ubah Data");
        System.out.println("3. Hapus Data");
        System.out.println("4. Tampilkan Data");
        System.out.println("5. KELUAR");
        System.out.println("----------------");
        System.out.print  ("opsi > ");
    }

}
