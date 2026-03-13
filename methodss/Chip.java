class Chip {

    void chipDetails() {
        String brand="Intel";
        String type="Processor";
        int cores=8;
        double speed=3.5;
        String generation="12th";
        String usage="Computer";
        int cache=12;
        int price=25000;

        System.out.println(brand);
        System.out.println(type);
        System.out.println(cores);
        System.out.println(speed);
        System.out.println(generation);
        System.out.println(usage);
        System.out.println(cache);
        System.out.println(price);
    }

    void chipInfo(String brand,String type,int cores,double speed){
        System.out.println(brand);
        System.out.println(type);
        System.out.println(cores);
        System.out.println(speed);
    }

    public static void main(String[] args) {
        Chip c=new Chip();
        c.chipDetails();
        c.chipInfo("AMD","Processor",6,3.8);

        new Chip().chipDetails();
        new Chip().chipInfo("Intel","Processor",10,4.0);
    }
}