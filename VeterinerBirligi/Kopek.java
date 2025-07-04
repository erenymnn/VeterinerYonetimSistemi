package GenericKavramı.VeterinerBirligi;

public class Kopek extends Hayvan {
    private int asiSayisi;
    private String tur;
    private String cins;

// dışarıya açmış oluyoruz getter setter yapmaya gerek duymuyoruz - girmesin diye getter setter da ayar yapabilirsin
    public Kopek(String dogumTarihi, boolean kayitli, int asiSayisi, String cins) {
        super(dogumTarihi, kayitli);
        this.asiSayisi = asiSayisi;
        this.tur = "Kopek";
        this.cins = cins;
    }

    @Override
    public String getDogumTarihi() {
        return super.getDogumTarihi();
    }

    @Override
    void bilgileriGoster() {
        System.out.println(toString()+" "+ super.toString());
    }

    @Override
    public String toString() {
        return "Kopek{" +
                "asiSayisi=" + asiSayisi +
                ", tur='" + tur + '\'' +
                ", cins='" + cins + '\'' +
                '}';
    }
}
