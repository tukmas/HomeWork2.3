public class Bus extends Transport {
    private int weight;
    private  int numberOfWheels;
    private String equipment;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public String getEquipment() {
        return equipment;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    public Bus(String brand, String model, int productionYear, String productionCountry, String color,
               int maxTravelSpeed, int weight, int numberOfWheels, String equipment) {
        super(brand, model, productionYear, productionCountry, color, maxTravelSpeed);
        if (weight >= 3000) {
            this.weight = weight;
        } else {
            this.weight = 15000;
        }
        if (numberOfWheels >= 4) {
            this.numberOfWheels = numberOfWheels;
        } else {
            this.numberOfWheels = 8;
        }
        if (equipment != null) {
            this.equipment = equipment;
        } else {
            this.equipment = "Базовая";
        }

    }
    void information() {
        System.out.println("Марка: " + getBrand() + ". Модель: " + getModel() + ". Цвет кузова: "
                + getColor() + ". Год выпуска: " + getProductionYear() + ". Страна-производитель: " + getProductionCountry()
                + ". Масса автобуса: " + weight + ". Количество колес: " + numberOfWheels + ". Комлектация: " + equipment + ".");
    }
}
