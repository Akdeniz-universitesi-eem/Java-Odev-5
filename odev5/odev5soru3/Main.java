import java.util.List;

public class Main {
    public static void main(String[] args) {
        Otel otel = new Otel();
        Customer customer = new Customer();
        Rezervation rezervation = customer.yeniRezervasyon(RezervasyonType.ONLINE_YAPILAN, otel);

        RezervationChange degisiklik = new RezervationChange();
        degisiklik.rezervasyonIptal(rezervation, otel);

        List<Rezervation> bulunanRezervasyonlar = otel.rezervasyonlariBul("Müşteri Adı");
        for (Rezervation bulunanRezervation : bulunanRezervasyonlar) {
            System.out.println("Bulunan Rezervasyon: " + bulunanRezervation.getMusteriAdi());
        }
    }
}