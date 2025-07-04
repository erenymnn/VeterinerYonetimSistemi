package GenericKavramı.VeterinerBirligi;

import java.util.ArrayList;
//her zaman olan müşteriye kampanya tarzı bir ekleme yapabilirsin fiyat listesi vb
public class ilVeterinerlikleri {
    private String sehir;
    private int toplamVeterinerSayisi;
    private ArrayList<Veteriner> sehirdekiVeterinerler;

    public ilVeterinerlikleri(String sehir) {
        this.sehir = sehir;
        sehirdekiVeterinerler = new ArrayList<>();
        toplamVeterinerSayisi = 0;
    }

    public void sehireVeterinerEkle(Veteriner veteriner) {
        sehirdekiVeterinerler.add(veteriner);
    }
   public void sehirdekiToplamVeterinerSayisiniBul(){
       System.out.println("Toplam veterriner sayısı: "+sehirdekiVeterinerler.size());
   }
}
