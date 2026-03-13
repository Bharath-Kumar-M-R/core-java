class Bat {

    static void batDetails() {
        String brand = "MRF";
        String material = "Wood";
        int length = 85;
        String color = "Brown";
        double weight = 1.2;
        String type = "Cricket";
        String player = "Virat";
        int price = 10000;

        System.out.println(brand);
        System.out.println(material);
        System.out.println(length);
        System.out.println(color);
        System.out.println(weight);
        System.out.println(type);
        System.out.println(player);
        System.out.println(price);
    }

    static void batInfo(String brand, String material, int length, double weight) {
        System.out.println(brand);
        System.out.println(material);
        System.out.println(length);
        System.out.println(weight);
    }

    public static void main(String[] args) {
        Bat.batDetails();
        Bat.batInfo("SG", "Wood", 82, 1.1);

        Bat.batDetails();
        Bat.batInfo("Kookaburra", "English Willow", 83, 1.3);
    }
}