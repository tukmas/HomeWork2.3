public class Transport {
    private String brand;
    private String model;
    private int productionYear;
    private String productionCountry;
    private String color;
    private int maxTravelSpeed;

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxTravelSpeed() {
        return maxTravelSpeed;
    }

    public void setMaxTravelSpeed(int maxTravelSpeed) {
        this.maxTravelSpeed = maxTravelSpeed;
    }

    public Transport(String brand, String model, int productionYear, String productionCountry, String color, int maxTravelSpeed) {
        if (brand != null) {
            this.brand = brand;
        } else {
            this.brand = "default";
        }
        if (model != null) {
            this.model = model;
        } else {
            this.model = "default";
        }
        if (color != null) {
            this.color = color;
        } else {
            this.color = "Белый";
        }
        if (productionYear >= 0) {
            this.productionYear = productionYear;
        } else {
            this.productionYear = 2000;
        }
        if (productionCountry != null) {
            this.productionCountry = productionCountry;
        } else {
            this.productionCountry = "default";
        }
        if (maxTravelSpeed >= 0) {
            this.maxTravelSpeed = maxTravelSpeed;
        } else {
            this.maxTravelSpeed = 150;
        }
    }
}
