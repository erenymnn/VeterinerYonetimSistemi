package GenericKavramı.VeterinerBirligi;

public class Main {
    public static void main(String[] args) {

        /*
        Kedi kedi=new Kedi("01-01-2016",true,"Van kedisi");
        Kedi kedi2=new Kedi("01-04-2016",false,"Siyam kedisi");
        Kedi kedi3=new Kedi("05-04-2016",true,"Tekir");


        System.out.println(kedi);//sadece tostring bolumundeki yer calışır boyle yaparsak.

        Kopek kopek = new Kopek("10-11-2003",true,1,"Golden");
        Kopek kopek2 = new Kopek("02-05-2007",true,3,"Dalmaçyalı");
        Kopek kopek3 = new Kopek("19-12-2008",true,2,"Pitbull");

        kopek.bilgileriGoster();
        System.out.println(kopek);

         */

    ilknesneleriolustur();






    }
    private static void ilknesneleriolustur() {
        Kedi kedi=new Kedi("01-01-2016",true,"Van kedisi");
        Kedi kedi2=new Kedi("01-04-2016",false,"Siyam kedisi");
        Kedi kedi3=new Kedi("05-04-2016",true,"Tekir");


      //  System.out.println(kedi);//sadece tostring bolumundeki yer calışır boyle yaparsak.

        Kopek kopek = new Kopek("10-11-2003",true,1,"Golden");
        Kopek kopek2 = new Kopek("02-05-2007",true,3,"Dalmaçyalı");
        Kopek kopek3 = new Kopek("19-12-2008",true,2,"Pitbull");


        Musteri m1=new Musteri("Eren","14576428298","İstanbul");
        m1.musteriyeHayvanEkle(kedi);
        m1.musteriyeHayvanEkle(kopek);
      //  m1.musteriyeHayvanEkle(v1);// olmaz v1 hayvan olması gerek
        Musteri m2=new Musteri("Sevil","12353552918","Adana");
        m2.musteriyeHayvanEkle(kedi2);
        m2.musteriyeHayvanEkle(kopek2);
        Musteri m3=new Musteri("Ozan","21376428298","İzmir");
        m3.musteriyeHayvanEkle(kedi3);
        m3.musteriyeHayvanEkle(kopek3);
        System.out.println(m3);
        m3.kendiniTanit();

        Veteriner v1=new Veteriner("Sevda","23847523813","ankara",2);
        v1.musteriEkle(m1);
        v1.musteriEkle(m2);

        Veteriner v2=new Veteriner("Eren","19428242734","istanbul teknik",4);
        v2.musteriEkle(m1);
        v2.musteriEkle(m3);
        Veteriner v3=new Veteriner("Erkan","17829385038","Marmara",1);
        v3.musteriEkle(m3);
        v3.kendiniTanit();
        System.out.println(v3);

        v1.musterileriListele();

        ilVeterinerlikleri ankara = new ilVeterinerlikleri("Ankara");
        ankara.sehireVeterinerEkle(v1);
        ankara.sehireVeterinerEkle(v2);

        ilVeterinerlikleri izmir = new ilVeterinerlikleri("izmir");
        izmir.sehireVeterinerEkle(v3);


        ankara.sehirdekiToplamVeterinerSayisiniBul();
        izmir.sehirdekiToplamVeterinerSayisiniBul();
        //alttakinde musteri vb şeyler yazamam hayvan olarak kısıtladık
        System.out.println("Yönetim paneli başlıyorrr....");
        yonetimPaneli<Hayvan> hayvanyonetimPaneli=new yonetimPaneli<>();
        hayvanyonetimPaneli.bilgileriGoster(kedi);
        hayvanyonetimPaneli.bilgileriGoster(kopek);
//alttakinde kopegi kediyi yazamam musteri olarak kısıtladık
        yonetimPaneli<Musteri> musteriyonetimPaneli=new yonetimPaneli<>();
        musteriyonetimPaneli.bilgileriGoster(m1);

        musteriyonetimPaneli.sahipOlduguHayvanlariGoster(m1);


    }
}
