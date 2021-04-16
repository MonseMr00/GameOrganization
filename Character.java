public abstract class Character{
  WeaponBehavior weaponbehavior;
  MovementBehavior movementbehavior;

  public Character(){
  }

  public void fight(){
    weaponbehavior.useWeapon();
  }

  public void move(){
    movementbehavior.move();
  }

  public void setWeaponBehavior(WeaponBehavior wb){
    weaponbehavior = wb;
  }

  public void setMoveBehavior(MovementBehavior mb){
    movementbehavior = mb;
  }
}