class Leaf {

    void leafDetails() {
        String type = "Neem";
        String color = "Green";
        int size = 5;
        String shape = "Oval";
        String texture = "Smooth";
        String season = "Summer";
        double weight = 0.02;
        String usage = "Medicine";

        System.out.println(type);
        System.out.println(color);
        System.out.println(size);
        System.out.println(shape);
        System.out.println(texture);
        System.out.println(season);
        System.out.println(weight);
        System.out.println(usage);
    }

    void leafInfo(String type, String color, int size, double weight) {
        System.out.println(type);
        System.out.println(color);
        System.out.println(size);
        System.out.println(weight);
    }

    public static void main(String[] args) {
        Leaf l = new Leaf();
        l.leafDetails();
        l.leafInfo("Mango", "Dark Green", 7, 0.03);

        new Leaf().leafDetails();
        new Leaf().leafInfo("Banana", "Light Green", 12, 0.05);
    }
}