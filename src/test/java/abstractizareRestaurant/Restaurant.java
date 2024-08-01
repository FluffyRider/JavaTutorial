package abstractizareRestaurant;

public class Restaurant {
    private String numeRestaurant;
    private String adresa;
    private Boolean delivery;

    public void setTipRestaurant(String tipRestaurant) {
        this.tipRestaurant = tipRestaurant;
    }

    public void setDelivery(Boolean delivery) {
        this.delivery = delivery;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public void setNumeRestaurant(String numeRestaurant) {
        this.numeRestaurant = numeRestaurant;
    }

    private String tipRestaurant;
}

