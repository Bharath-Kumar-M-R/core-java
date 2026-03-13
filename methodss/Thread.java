class Thread {

    void threadDetails() {
        String type="Cotton";
        int length=50;
        String color="Red";
        double weight=0.5;
        String brand="Coats";
        String usage="Stitching";
        String quality="Strong";
        int price=20;

        System.out.println(type);
        System.out.println(length);
        System.out.println(color);
        System.out.println(weight);
        System.out.println(brand);
        System.out.println(usage);
        System.out.println(quality);
        System.out.println(price);
    }

    void threadInfo(String type,int length,String color,double weight){
        System.out.println(type);
        System.out.println(length);
        System.out.println(color);
        System.out.println(weight);
    }

    public static void main(String[] args) {
        Thread t=new Thread();
        t.threadDetails();
        t.threadInfo("Silk",60,"Blue",0.7);

        new Thread().threadDetails();
        new Thread().threadInfo("Cotton",40,"Green",0.4);
    }
}