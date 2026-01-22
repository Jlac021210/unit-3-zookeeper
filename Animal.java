import java.util.Random;

public class Animal {
    private String animalType;
    private static int amountOfAnimals;
    
    public Animal(){
      animalType=randomAnimalType();
      amountOfAnimals++;
      }

    public Animal(String type){
        this.animalType=type;
        amountOfAnimals++;
    }
    
    public static int getCount(){
         return amountOfAnimals;
      }

    public String getAnimalType(){
      return this.animalType;
      }

    public void updateAnimalType(String type){
      this.animalType=type;
      }
      
    public String speak(){
      if(this.animalType.equals("Tiger")){
         return "rawr";
         }else if(this.animalType.equals("Lion")){
         return "ROAR";
         }else if(this.animalType.equals("Gorilla")){
         return "ummmmm-ummmm";
         }else if(this.animalType.equals("Giraffe")){
         return "hisssss";
         }else{
         return "ROOOAAAARRR";
         }
    }

    public String speakBackward(){
      String sound=speak();
      String newSound="";
      for(int i=sound.length()-1;i>=0;i+=-1){
         newSound+=sound.substring(i,i+1);
      }
      return newSound;
      }
         


    // Create the toString() method which returns friendly description of the animal
    public String toString(){
     if(this.animalType.equals("Tiger")){
         return "a Tiger it is from Asia";
         }else if(this.animalType.equals("Lion")){
         return "a Lion it is from Africa";
         }else if(this.animalType.equals("Gorilla")){
         return "a Gorilla it is from the Central Forest of Africa";
         }else if(this.animalType.equals("Giraffe")){
         return "a Giraffe it is from Africa";
         }else{
         return " a "+this.animalType+" it lives somewhere in the world";
         }
}
    private String randomAnimalType(){
      Random random = new Random();
      int randomInt= random.nextInt(5);
      if(randomInt==1){
         return "Tiger";
         }else if(randomInt==2){
         return "Lion";
         }else if(randomInt==3){
         return "Gorilla";
         }else if(randomInt==4){
         return "Giraffe";
         }else{
         return "Bear";
         }
    }
}
