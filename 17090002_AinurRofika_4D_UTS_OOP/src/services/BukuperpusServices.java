
package services;
import java.util.*;
import entity.*;


public class BukuperpusServices {
   private static final List<Bukuperpus> data = new LinkedList<Bukuperpus>();

    public void tambahData(Bukuperpus buku) {
        data.add(buku);
        System.out.println("Data sudah tersimpan");
    }

    public void ubahData(Bukuperpus buku) {
        int idx = data.indexOf(buku);
        if(idx >= 0) data.set(idx, buku);
        System.out.println("Data sudah berubah");
    }

    public void hapusData(String no_buku) {
        int idx = data.indexOf(new Bukuperpus(no_buku, "", "","", "", ""));
        if(idx >= 0) data.remove(idx);
        System.out.println("Data telah terhapus");
    }

    public void tampilkanData() {
        System.out.println("\n--= Isi Data =--");
        int urutan = 1;
        for(Bukuperpus buku : data) {
            System.out.println("data ke-" + urutan++);
            System.out.println("  No_buku : " + buku.getNo_buku());
            System.out.println("  Nama_buku : " + buku.getNama_buku());
            System.out.println("  Penerbit : " + buku.getPenerbit());
            System.out.println("  Kategori : " + buku.getKategori());
            System.out.println("  Jumlah : " + buku.getJumlah());
            System.out.println("  Rak : " + buku.getRak());
        }
    }

}
