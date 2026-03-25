public class FooditemRunner {
    public static void main(String[] args) {
        String[] ingredients=Fooditem.getIngredients("dosa");
        if (ingredients!=null) {
            System.out.println("The ingrients length:"+ingredients.length);

            for(String ref:ingredients){
                System.out.println("The item of Ingredients:"+ref);
            }
        }
    }
}
