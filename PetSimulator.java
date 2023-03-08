/*
 * Activity 3.6.3
 */
public class PetSimulator
{
  public static void main(String[] args)
  {
    // create an array that can hold up to 10 pets (does not require looping)
    Pet[] pets = new Pet[10];
    // adopt (create and name) four pets, two cats, two dogs (does not require looping)
    pets[0] = new Pet("Princess", 1);
    pets[1] = new Pet("Watson", 1);
    pets[2] = new Pet("Dolores", 2);
    pets[3] = new Pet("Chewey", 2);
    // first things first, feed your pets

    for (Pet pet : pets) {
      if (!(pet == null)) {
        pet.feed();
      }
    }
    // next, make yourself the owner of all of your new pets
    for (Pet pet : pets) {
      if (!(pet == null)) {
        pet.setOwner("Luna");
      }
    }
    // your dogs make some noise, take them for a walk
    for (Pet pet : pets) {
      if (!(pet == null)) {
        if (pet.getType() == 2) {
            pet.makeNoise();
            pet.walk();
        }
      }
    }
    // when you get back, your cats make some noise
    for (Pet pet : pets) {
      if (!(pet == null)) {
        if (pet.getType() == 1) {
          pet.makeNoise();
        }
      }
    }  
    // give all of your pets a treat
    for (Pet pet : pets) {
      if (!(pet == null)) {
        pet.giveTreat();
      }
    }
    // groom your cats
    for (Pet pet : pets) {
      if (!(pet == null)) {
        if (pet.getType() == 1) {
          pet.groom();
        }
      }
    }
    // grooming is done, play with all pets
    for (Pet pet : pets) {
      if (!(pet == null)) {
        pet.play();
      }
    }
    // whew, that was tiring, all pets nap and get fed
    for (Pet pet : pets) {
      if (!(pet == null)) {
        pet.sleep();
        pet.feed();
      }
    }

    System.out.println("--- MY PETS ---");
    // show the state of all of your pets
    for (Pet pet : pets) {
      if (!(pet == null)) {
        System.out.println(pet);
      }
    }
    // You decide to get a couple of pets for your friend (does not require looping)
    pets[4] = new Pet("Bandit", 2);
    pets[5] = new Pet("Daisy", 2);
    // set the owner of the new pets to your friends name
    for (Pet pet : pets) {
      if (!(pet == null)) {
        if (pet.getOwner() == null) {
          pet.setOwner("Andrew");
        }
      }
    }
    
    System.out.println("--- MY PETS ---");
    // show the state of all of your pets
    for (Pet pet : pets) {
      if (!(pet == null)) {
        if (pet.getOwner().equals("Luna")) {
          System.out.println(pet);
        }
      }
    }
  }
}