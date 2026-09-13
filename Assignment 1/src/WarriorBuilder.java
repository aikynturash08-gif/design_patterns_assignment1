public class WarriorBuilder extends HeroBuilderImpl {

    public WarriorBuilder() {
        this.heroClass = "Warrior";
        this.weapon = "Greatsword";
        this.armor = "Heavy Plate Armor";
        this.health = 150;
        this.mana = 10;
    }

    @Override
    public Hero build() {
        if (health <= 0) {
            throw new IllegalStateException("warrior cant have 0<");
        }
        return new Hero(this);
    }
}