public interface HeroBuilder {
    HeroBuilder setName(String name);
    HeroBuilder setWeapon(String weapon);
    HeroBuilder setArmor(String armor);
    HeroBuilder setHealth(int health);
    HeroBuilder setMana(int mana);
    Hero build();
}