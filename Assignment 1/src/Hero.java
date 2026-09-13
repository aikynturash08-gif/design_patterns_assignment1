public class Hero {
    private final String name;
    private final String heroClass;
    private final String weapon;
    private final String armor;
    private final int health;
    private final int mana;

    Hero(HeroBuilderImpl builder) {
        this.name = builder.name;
        this.heroClass = builder.heroClass;
        this.weapon = builder.weapon;
        this.armor = builder.armor;
        this.health = builder.health;
        this.mana = builder.mana;
    }

    @Override
    public String toString() {
        return "Hero {" +
                "Name='" + name + '\'' +
                ", Class='" + heroClass + '\'' +
                ", Weapon='" + weapon + '\'' +
                ", Armor='" + armor + '\'' +
                ", HP=" + health +
                ", MP=" + mana +
                '}';
    }
}