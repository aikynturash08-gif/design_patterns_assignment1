public abstract class HeroBuilderImpl implements HeroBuilder {
    protected String name = "Unknown Hero";
    protected String heroClass = "Basic";
    protected String weapon = "Fists";
    protected String armor = "Cloth";
    protected int health = 100;
    protected int mana = 0;

    @Override
    public HeroBuilder setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public HeroBuilder setWeapon(String weapon) {
        this.weapon = weapon;
        return this;
    }

    @Override
    public HeroBuilder setArmor(String armor) {
        this.armor = armor;
        return this;
    }

    @Override
    public HeroBuilder setHealth(int health) {
        this.health = health;
        return this;
    }

    @Override
    public HeroBuilder setMana(int mana) {
        this.mana = mana;
        return this;
    }
}