class Main {
  public static void main(String[] args) {
    Character king, queen, knight, troll;
    //King with axe
    king = new King();
    king.fight();
    king.move();
    System.out.println("-------------------------------------");
    //Queen with bow and arrow
    queen = new Queen();
    queen.fight();
    queen.move();
    System.out.println("-------------------------------------");
    //Knight with sword
    knight = new Knight();
    knight.fight();
    knight.move();
    System.out.println("-------------------------------------");
    //Troll with knife
    troll = new Troll();
    troll.fight();
    troll.move();
    System.out.println("-------------------------------------");
    
    
    
  }
}


