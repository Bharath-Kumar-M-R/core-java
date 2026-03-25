public class Fooditem {
    static String[] getIngredients(String item){
        System.out.println("executing the ingredients:"+item);

        if (item==null) {
            System.out.println("Item is invalid");
            return null;
        }
        if (item=="biryani") {
            String[] ingredients={"water","salt","rice","chicken","biryani masala","pepper","ghee","chilli"};
            return ingredients;
        }
        if (item=="chiken fry") {
            String[] ingredients={"water","salt","chicken","chicken masala","pepper","ghee","chilli"};
            return ingredients;
        }
        if (item=="kabab") {
            String[] ingredients={"water","salt","corn powder","chicken","kabab masala","pepper","ginger","chilli","garlic"};
            return ingredients;
        }
        if (item=="lemon juice") {
            String[] ingredients={"water","sugar","lemon","elache"};
            return ingredients;
        }
        if (item=="dosa") {
            String[] ingredients={"water","rice","soda"};
            return ingredients;
        }
        if (item=="idli") {
            String[] ingredients={"water","rice","soda"};
            return ingredients;
        }
        if (item=="watermelon juice") {
            String[] ingredients={"water","watermelon",};
            return ingredients;
        }
        if (item=="chapathi") {
            String[] ingredients={"water","maida","oil","salt"};
            return ingredients;
        }
        if (item=="tomatobath") {
            String[] ingredients={"water","rice","tomato","oil","masala"};
            return ingredients;
        }
        if (item=="maagi") {
            String[] ingredients={"water","maagi","salt","chilli","masala"};
            return ingredients;
        }
        if (item=="tea") {
            String[] ingredients={"water","milk","sugar"};
            return ingredients;
        }
        if (item=="coffee") {
            String[] ingredients={"water","coffe powder","sugar","milk"};
            return ingredients;
        }
        if (item=="horlicks") {
            String[] ingredients={"water","milk","sugar","horlicks powder"};
            return ingredients;
        }
        if (item=="boost") {
            String[] ingredients={"water","milk","sugar","boost powder"};
            return ingredients;
        }
        if (item=="badam milk") {
            String[] ingredients={"water","milk","sugar","badam powder"};
            return ingredients;
        }
        if (item=="black coffee") {
            String[] ingredients={"water","coffee powder"};
            return ingredients;
        }
        if (item=="chatny") {
            String[] ingredients={"water","nuts","salt","chilli"};
            return ingredients;
        }
        if (item=="puri") {
            String[] ingredients={"water","maida","salt","oil"};
            return ingredients;
        }
        if (item=="butter milk") {
            String[] ingredients={"water","curd"};
            return ingredients;
        }
        if (item=="pallav") {
            String[] ingredients={"water","rice","pallav masala","onion"};
            return ingredients;
        }
        if (item=="masala dosa") {
            String[] ingredients={"water","rice","soda","masala"};
            return ingredients;
        }
        if (item=="mulabagal dosa") {
            String[] ingredients={"water","rice","soda","ghee"};
            return ingredients;
        }
        if (item=="davanagere dosa") {
            String[] ingredients={"water","rice","soda","butter"};
            return ingredients;
        }
        if (item=="pudi dosa") {
            String[] ingredients={"water","rice","soda","chatny","powder"};
            return ingredients;
        }
        if (item=="madderi dosa") {
            String[] ingredients={"water","rice","soda","madderi masala"};
            return ingredients;
        }
        if (item=="kolar dosa") {
            String[] ingredients={"water","rice","soda","koalr masala"};
            return ingredients;
        }
        System.out.println("Item not found");
        return null;
    }
}
