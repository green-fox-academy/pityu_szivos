package Hero;

public abstract class BaseHero implements Punchable {

  private String name;

  public BaseHero(){

  }

  BaseHero(String name) {
    this.name = name;
  }

  public abstract void punch(Hero Hero);

  public abstract int getMotivationLevel();

  public String getName() {
    return name;
  }

  public abstract void bePunched(double damage);

}