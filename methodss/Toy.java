class Toy {

    void toyDetails() {
        String name="Car";
        String color="Red";
        int price=200;
        String brand="HotWheels";
        double weight=0.5;
        String material="Plastic";
        int size=10;
        String usage="Kids";

        System.out.println(name);
        System.out.println(color);
        System.out.println(price);
        System.out.println(brand);
        System.out.println(weight);
        System.out.println(material);
        System.out.println(size);
        System.out.println(usage);
    }

    void toyInfo(String name,String color,int price,double weight){
        System.out.println(name);
        System.out.println(color);
        System.out.println(price);
        System.out.println(weight);
    }

    public static void main(String[] args) {
        Toy t=new Toy();
        t.toyDetails();
        t.toyInfo("Doll","Pink",300,0.8);

        new Toy().toyDetails();
        new Toy().toyInfo("Train","Blue",250,0.7);
    }
}