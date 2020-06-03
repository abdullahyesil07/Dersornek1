

package dersörnekk;

//Kişiler hakkında İsim,Oturduğu şehirKangrubu bilgisini veren program yapıyoruz

public class Dersörnekk {

    
    public static void main(String[] args) 
    {
        for(bilgi kisi: bilgi.values())
            System.out.printf("%s\t%s\t%s\t%s\n", kisi,kisi.getSehir(),kisi.getKang(),kisi.getSoyad()); //Bilgileri Gösteriyoruz
        
        
    }
    
public enum bilgi {
    Abdullah("YEŞİL","Antalya","O Rh-pozitif"),  //Kişi Bilgileri
    Elif("YEŞİL","Antalya","A Rh-negatif"),
    Ahmet("ÜNAL","İstanbul","AB Rh-negatif");
private final String soyad;
private final String sehir;
private final String kang;
bilgi(String il, String kangrubu,String soyisim){
 soyad=soyisim;     //kişi bilgileri aktarıldı.
sehir = il;
kang = kangrubu;
}
public String getSehir(){   //Privateden çekip geri yansıtır
return sehir;
}
public String getKang(){
return kang;
}
public String getSoyad(){
return soyad;
}
}
}
