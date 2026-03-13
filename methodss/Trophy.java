class Trophy {

    void trophyDetails() {
        String material = "Gold Plated";
        String color = "Golden";
        int height = 30;
        String shape = "Cup";
        String event = "Cricket";
        String brand = "SportsWorld";
        double weight = 1.5;
        int price = 5000;

        System.out.println(material);
        System.out.println(color);
        System.out.println(height);
        System.out.println(shape);
        System.out.println(event);
        System.out.println(brand);
        System.out.println(weight);
        System.out.println(price);
    }

    void trophyInfo(String material, String color, int height, double weight) {
        System.out.println(material);
        System.out.println(color);
        System.out.println(height);
        System.out.println(weight);
    }

    public static void main(String[] args) {
        Trophy t = new Trophy();
        t.trophyDetails();
        t.trophyInfo("Silver", "Silver", 25, 1.2);

        new Trophy().trophyDetails();
        new Trophy().trophyInfo("Bronze", "Brown", 20, 1.0);
    }
}