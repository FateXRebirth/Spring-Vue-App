package example.Request;

public class CarEdit {

    private Integer transmission;
    private Integer geartype;
    private Integer gastype;
    private Integer enginedisplacement;
    private Integer passenger;
    private Integer color;
    private Integer mileage;
    private Integer price;
    private Integer equipment;
    private Integer safety;
    private String name;
    private String phone;
    private Integer city;
    private Integer area;
    private String address;

    public Integer getTransmission() {
        return transmission;
    }

    public void setTransmission(Integer transmission) {
        this.transmission = transmission;
    }

    public Integer getGeartype() {
        return geartype;
    }

    public void setGeartype(Integer geartype) {
        this.geartype = geartype;
    }

    public Integer getGastype() {
        return gastype;
    }

    public void setGastype(Integer gastype) {
        this.gastype = gastype;
    }

    public Integer getEnginedisplacement() {
        return enginedisplacement;
    }

    public void setEnginedisplacement(Integer enginedisplacement) {
        this.enginedisplacement = enginedisplacement;
    }

    public Integer getPassenger() {
        return passenger;
    }

    public void setPassenger(Integer passenger) {
        this.passenger = passenger;
    }

    public Integer getColor() {
        return color;
    }

    public void setColor(Integer color) {
        this.color = color;
    }

    public Integer getMileage() {
        return mileage;
    }

    public void setMileage(Integer mileage) {
        this.mileage = mileage;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getEquipment() {
        return equipment;
    }

    public void setEquipment(Integer equipment) {
        this.equipment = equipment;
    }

    public Integer getSafety() {
        return safety;
    }

    public void setSafety(Integer safety) {
        this.safety = safety;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getCity() {
        return city;
    }

    public void setCity(Integer city) {
        this.city = city;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "CarEdit{" +
                "transmission=" + transmission +
                ", geartype=" + geartype +
                ", gastype=" + gastype +
                ", enginedisplacement=" + enginedisplacement +
                ", passenger=" + passenger +
                ", color=" + color +
                ", mileage=" + mileage +
                ", price=" + price +
                ", equipment=" + equipment +
                ", safety=" + safety +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", city=" + city +
                ", area=" + area +
                ", address='" + address + '\'' +
                '}';
    }
}
