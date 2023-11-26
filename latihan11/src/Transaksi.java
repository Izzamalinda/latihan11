public class Transaksi implements Pembayaran{
    private String noFaktur;
    private String namaPelanggan;
    private String namaBarang;

    public Transaksi (String noFaktur, String namaPelanggan, String namaBarang){
        this.noFaktur = noFaktur;
        this.namaPelanggan = namaPelanggan;
        this.namaBarang = namaBarang;
    }

    public double hitungTotalBayar(long harga,int jumlah ){
        return harga *jumlah;
    }

    public String getNoFaktur(){
        return noFaktur;
    }

    public String getNamaPelanggan(){
        return namaPelanggan;
    }

    public String getNamaBarang(){
        return namaBarang;
    }
}