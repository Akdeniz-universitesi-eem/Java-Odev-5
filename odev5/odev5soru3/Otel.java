import java.util.ArrayList;
import java.util.List;

public class Otel {
    private List<Rezervation> rezervasyonlar = new ArrayList<>();

    public void yeniRezervasyon(Rezervation rezervation) {
        rezervasyonlar.add(rezervation);
    }

    public void rezervasyonIptal(Rezervation rezervation) {
        rezervasyonlar.remove(rezervation);
    }

    public List<Rezervation> rezervasyonlariBul(String isim) {
        List<Rezervation> bulunanRezervasyonlar = new ArrayList<>();
        for (Rezervation rezervation : rezervasyonlar) {
            if (rezervation.getMusteriAdi().equals(isim)) {
                bulunanRezervasyonlar.add(rezervation);
            }
        }
        return bulunanRezervasyonlar;
    }

}