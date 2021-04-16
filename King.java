public class King extends Character{

  public King(){
    weaponbehavior = new Axe();
    movementbehavior = new Walk();
    System.out.println("King attacks.");
  }
}