/*
 * Activity 3.6.3
 */
public class CatCollection2
{
  public static void main(String[] args)
  {
    Cat[] cats = {new Cat("Fluffy"), new Cat("Freckles"),new Cat("Boots")};
    
    for (Cat c : cats)
    {
      if (c.getName().equals("Boots"))
        c = new Cat("Kitty"); 
    }
    
    // confirm array is unchanged
    for (Cat c : cats)
    {
      System.out.println(c);
    }
    

  }
}