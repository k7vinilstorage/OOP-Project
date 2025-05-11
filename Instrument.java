public abstract class Instrument {
    private String category;
    private String type;
    private String model;
    private String brand;
    private int availability;
    private float price;

    public Instrument() {
        category = "";
        type = "";
        model = "";
        brand = "";
        availability = 0;
        price = 0;
    }

    public Instrument(String category, String type, String model, String brand, int availability, float price) {
        this.category = category;
        this.type = type;
        this.model = model;
        this.brand = brand;
        this.availability = availability;
        this.price = price;
    }


    public String getCategory() {
        return category;
    }

    public String getType() {
        return type;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public int getAvailability() {
        return availability;
    }

    public float getPrice() {
        return price;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
