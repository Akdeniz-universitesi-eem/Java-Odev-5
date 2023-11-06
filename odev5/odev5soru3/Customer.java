public class Customer {
    public Rezervation yeniRezervasyon(RezervasyonType tip, Otel otel) {
        Rezervation rezervation = new Rezervation(this, tip);
        otel.yeniRezervasyon(rezervation);
        return rezervation;
    }
}