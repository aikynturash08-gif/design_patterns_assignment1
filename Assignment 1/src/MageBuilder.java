public class MageBuilder extends HeroBuilderImpl {

    public MageBuilder() {
        this.heroClass = "Mage";
        this.weapon = "Arcane Staff";
        this.armor = "Magic Robe";
        this.health = 80;
        this.mana = 200;
    }

    @Override
    public Hero build() {
        if (mana < 50) {
            throw new IllegalStateException("Mage need to >=50");
        }
        return new Hero(this);
    }
}