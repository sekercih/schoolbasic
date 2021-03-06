public class Ogrenci extends Kisi {

    private String numara;
    private String sinif;

    @Override
    public String toString() {
        return "Ogrenci{" +
                "adSoyad='" + adSoyad + '\'' +
                ", kimlikNo='" + kimlikNo + '\'' +
                ", yas=" + yas +
                ", numara='" + numara + '\'' +
                ", sinif='" + sinif + '\'' +
                '}';
    }

    public String getNumara() {
        return numara;
    }

    public void setNumara(String numara) {
        this.numara = numara;
    }

    public Ogrenci(String adSoyad, String kimlikNo, int yas, String numara, String sinif) {
        super(adSoyad, kimlikNo, yas);
        this.numara = numara;
        this.sinif = sinif;
    }

    public String getSinif() {
        return sinif;
    }

    public void setSinif(String sinif) {
        this.sinif = sinif;
    }
}
