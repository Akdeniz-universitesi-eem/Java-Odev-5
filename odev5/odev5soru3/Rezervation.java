public class Rezervation {
    private Customer customer;
    private RezervasyonType tip;

    public Rezervation(Customer customer, RezervasyonType tip) {
        this.customer = customer;
        this.tip = tip;
    }

    public RezervasyonType getTip() {
        return tip;
    }

    public Customer getMusteri() {
        return customer;
    }

    public String getMusteriAdi() {
        return customer.toString();
    }

}
