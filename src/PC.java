public class PC {
    private String name;
    private int RAM;
    private double price;

    public PC() {
    }

    public PC(String name, int RAM, double price) {
        this.name = name;
        this.RAM = RAM;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Name=" + name +
                " RAM=" + RAM +
                " price=" + price;
    }
}
