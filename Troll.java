public class Troll extends Character{

  public Troll() {
    weaponbehavior = new Knife();
    movementbehavior = new Crawl();
    System.out.println("Troll attacks. ");
  }
}