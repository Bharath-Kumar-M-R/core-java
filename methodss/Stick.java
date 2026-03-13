class Stick {

    void stickDetails() {
        String material = "Wood";
        String color = "White";
        int length = 100;
        double weight = 0.8;
        String type = "Walking";
        String brand = "Local";
        String usage = "Support";
        int price = 300;

        System.out.println(material);
        System.out.println(color);
        System.out.println(length);
        System.out.println(weight);
        System.out.println(type);
        System.out.println(brand);
        System.out.println(usage);
        System.out.println(price);
    }

    void stickInfo(String material, String color, int length, double weight) {
        System.out.println(material);
        System.out.println(color);
        System.out.println(length);
        System.out.println(weight);
    }

    public static void main(String[] args) {
        Stick s = new Stick();
        s.stickDetails();
        s.stickInfo("Bamboo", "Yellow", 120, 0.6);

        new Stick().stickDetails();
        new Stick().stickInfo("Wood", "Dark Brown", 110, 0.7);
    }
}