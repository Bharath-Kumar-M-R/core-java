public class CountryRunner {
    public static void main(String[] args) {
        String[] name=Country.getPresidentByCountry("India");
        if (name!=null) {
            System.out.println("The ingrients length:"+name.length);
        for(String ref:name){
                System.out.println("The item of Ingredients:"+ref);
            }
        }  
    }
    
}
