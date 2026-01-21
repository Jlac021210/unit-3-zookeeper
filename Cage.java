public class Cage {

    // Create a private instance variable of type Animal. Don't instantiate the variable, only declare it
    private Animal animal;
    
    // No-arg constructor:
    // - Instantiates this cage with a random Animal.
    // Hint: Animal() can choose a random type.
    public Cage(){
      this.animal = new Animal();
      }
   public Cage(Animal animal){
      this.animal = animal;
      }
    // Write a Getter/Accessor for returning the Animal instance variable
    public Animal getAnimal(){
      return this.animal;
      }


    // Write a Setter/Mutator for editing the Animal instance variable
   public void setAnimal(Animal animal){
      this.animal = animal;
      }

    // toString():
    // - Friendly cage description including the animal.
    public String toString(){
      return "this cage contains "+this.animal;
      }
}
