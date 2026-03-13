class Screw {

    void screwDetails() {
        String material="Iron";
        int length=5;
        String color="Black";
        double weight=0.1;
        String type="Wood";
        String brand="Bosch";
        String usage="Furniture";
        int price=5;

        System.out.println(material);
        System.out.println(length);
        System.out.println(color);
        System.out.println(weight);
        System.out.println(type);
        System.out.println(brand);
        System.out.println(usage);
        System.out.println(price);
    }

    void screwInfo(String material,int length,String color,double weight){
        System.out.println(material);
        System.out.println(length);
        System.out.println(color);
        System.out.println(weight);
    }

    public static void main(String[] args) {
        Screw s=new Screw();
        s.screwDetails();
        s.screwInfo("Steel",6,"Silver",0.2);

        new Screw().screwDetails();
        new Screw().screwInfo("Iron",4,"Gray",0.15);
    }
}