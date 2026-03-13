class Cell {

    void cellDetails() {
        String brand = "Samsung";
        String model = "Galaxy";
        String color = "Black";
        int storage = 128;
        int ram = 8;
        double price = 25000;
        String battery = "5000mAh";
        String camera = "64MP";

        System.out.println(brand);
        System.out.println(model);
        System.out.println(color);
        System.out.println(storage);
        System.out.println(ram);
        System.out.println(price);
        System.out.println(battery);
        System.out.println(camera);
    }

    void cellInfo(String brand, String model, int storage, double price) {
        System.out.println(brand);
        System.out.println(model);
        System.out.println(storage);
        System.out.println(price);
    }

    public static void main(String[] args) {
        Cell c = new Cell();
        c.cellDetails();
        c.cellInfo("Apple", "iPhone", 256, 90000);

        new Cell().cellDetails();
        new Cell().cellInfo("OnePlus", "Nord", 128, 30000);
    }
}