package GenericKavramı.VeterinerBirligi;

public class Kedi extends Hayvan {

    private String tur;
    private String cinsi;

    public Kedi(String dogumTarihi, boolean kayitli,String cinsi) {
        super(dogumTarihi, kayitli);
        this.tur ="Kedi";//kullanıcıya bırakılmadı direk kedi yani
        this.cinsi =cinsi;
    }

    @Override
    void bilgileriGoster() {
        System.out.println(toString()+" Kayıtlı mı:"+isKayitli()+" Dogum tarihi:"+getDogumTarihi());
    }

    @Override
    public String toString() {
        return "Kedi{" +
                "tur='" + tur + '\'' +
                ", cinsi='" + cinsi + '\'' +
                '}';
    }
}
