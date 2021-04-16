public class Knight extends Character{

  public Knight(){
    weaponbehavior = new Sword();
    movementbehavior = new SuperVelocity();
    System.out.println("Knight attacks. ");
  }
}