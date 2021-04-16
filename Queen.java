public class Queen extends Character{

  public Queen(){
    weaponbehavior = new BowAndArrow();
    movementbehavior = new Run();
    System.out.println("Queen attacks. ");
  }
}