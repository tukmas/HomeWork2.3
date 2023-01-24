public class car extends Transport{
    private float engineVolume;
    private String transmission;
    private String bodyType;
    private String registrationNumber;
    private int numberOfSeats;

    public String getTransmission() {
        return transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public float getEngineVolume() {
        return engineVolume;
    }


    public void setEngineVolume(float engineVolume) {
        this.engineVolume = engineVolume;
    }


    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public car(String brand, String model, int productionYear, String productionCountry, String color, int maxTravelSpeed,
               float engineVolume, String transmission, String bodyType, String registrationNumber, int numberOfSeats) {
        super(brand, model, productionYear, productionCountry, color, maxTravelSpeed);
        if (engineVolume >= 0) {
            this.engineVolume = engineVolume;
        } else {
            this.engineVolume = 1.5f;
        }
        if (transmission != null){
            this.transmission = transmission;
        } else {
            this.transmission = "Автоматическая";
        }
        if (bodyType != null){
            this.bodyType = bodyType;
        }else {
            this.bodyType = "default";
        }
        if (registrationNumber != null){
            this.registrationNumber = registrationNumber;
        }else {
            this.registrationNumber = "A001AА01";
        }
        if (numberOfSeats >1){
            this.numberOfSeats = numberOfSeats;
        }else this.numberOfSeats = 5;
    }

    void information() {
        System.out.println("Марка: " + getBrand() + ". Модель: " + getModel() + ". Объем двигателя: " + engineVolume + ". Тип коробки передач: " + transmission
                + ". Тип кузова: " + bodyType + ". Регистрационный номер: " + registrationNumber + ". Количество мест: " + numberOfSeats  + " л. Цвет кузова: "
                + getColor() + ". Год выпуска: " + getProductionYear() + ". Страна-производитель: " + getProductionCountry() + ".");
    }
}
