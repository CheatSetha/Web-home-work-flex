class drinks {
    static int beer = 10;
    int abc =10;
   static class energyDrink{
      int cocaCola =100;
      

       public void stock(){
           System.out.println("drink in stock: Coca Cola :"+cocaCola);

       }
       static public void beerInstock(){
           System.out.println("beer available : "+beer);
       }

   }
}
public class Main {
   public static void main(String[] args) {
       // create an object of the static nested class
       // using the name of the outer class
       drinks.energyDrink drinkInstock = new drinks.energyDrink();
       drinkInstock.stock();
       
       drinks.energyDrink.beerInstock();

   }
}