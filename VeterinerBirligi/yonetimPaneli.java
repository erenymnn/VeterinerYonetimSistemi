package GenericKavramı.VeterinerBirligi;
//t yazma sebebimiz hepsine ulaşmak icin
public class yonetimPaneli <T> {
//butun sınıflara oldugu için tek tek busssuru olusturmak yerine generic kullandık.
    public void bilgileriGoster(T nesne){
        System.out.println(nesne);
    }
//sadece musterilere calışır
    public <T extends Musteri>void sahipOlduguHayvanlariGoster(T musteri) {
        musteri.musteriHayvanlariniListele();
    }

//sadece veterinerlere ozel
    public void veterinerlerinMusterileriniListele(T veteriner) {
        ((Veteriner)veteriner).musterileriListele();
    }
}
