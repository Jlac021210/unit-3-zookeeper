public class Tester{
   public static void main(String[] args){
      Animal Gorilla = new Animal("Gorilla");
      Animal Tiger = new Animal("Tiger");
      Animal Lion = new Animal("Lion");
      Zoo woodlandpark = new Zoo(Gorilla, Tiger, Lion);
      System.out.println(woodlandpark);
      woodlandpark.putAnimalInCage(woodlandpark.getCage(3),Tiger);
      System.out.println(woodlandpark);

      }
      }