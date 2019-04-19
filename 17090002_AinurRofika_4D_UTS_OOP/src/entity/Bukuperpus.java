
package entity;

public class Bukuperpus {
    private String no_buku;
    private String nama_buku;
    private String penerbit;
    private String kategori;
    private String jumlah;
    private String rak;

    public boolean equals(Object obj) {
        Bukuperpus buku = (Bukuperpus) obj;
        return no_buku.equals(buku.getNo_buku());
    }

    public Bukuperpus(String no_buku, String nama_buku, String penerbit,String kategori,
            String jumlah,String rak) {
        this.no_buku = no_buku;
        this.nama_buku = nama_buku;
        this.penerbit = penerbit;
        this.kategori = kategori;
        this.jumlah = jumlah;
        this.rak = rak;
    }

    public String getNo_buku() {
        return no_buku;
    }

    public void setNo_buku(String no_buku) {
        this.no_buku = no_buku;
    }

    public String getNama_buku() {
        return nama_buku;
    }

    public void setNama_buku(String nama_buku) {
        this.nama_buku = nama_buku;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }
    
    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public String getJumlah() {
        return jumlah;
    }

    public void setJumlah(String jumlah) {
        this.jumlah = jumlah;
    }

    public String getRak() {
        return rak;
    }

    public void setRak(String rak) {
        this.rak = rak;
    }
}
