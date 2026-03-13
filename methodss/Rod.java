class Rod {

    void rodDetails() {
        String material = "Steel";
        int length = 10;
        String color = "Silver";
        double weight = 2.5;
        String shape = "Round";
        String usage = "Construction";
        String brand = "TATA";
        int price = 500;

        System.out.println(material);
        System.out.println(length);
        System.out.println(color);
        System.out.println(weight);
        System.out.println(shape);
        System.out.println(usage);
        System.out.println(brand);
        System.out.println(price);
    }

    void rodInfo(String material, int length, String color, double weight) {
        System.out.println(material);
        System.out.println(length);
        System.out.println(color);
        System.out.println(weight);
    }

    public static void main(String[] args) {
        Rod r = new Rod();  
        r.rodDetails();
        r.rodInfo("Iron",12,"Gray",3.2);

        new Rod().rodDetails(); 
        new Rod().rodInfo("Steel",15,"Silver",4.0);
    }
}