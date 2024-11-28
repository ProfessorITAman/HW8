package kg.geeks.game.template;

public class Magic extends Hero {
    private int currentRound = 1;
    private final int bonusAttackAmount = 10;
    private final int maxBuffRounds = 4;

    public Magic(String name, int health, int damage) {
        super(name, health, damage, SuperAbility.BOOST);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        // TODO Here will be implementation of BOOSTING
        if (currentRound <= maxBuffRounds) {
            System.out.println(this.getName() + " увеличивает атаку всех героев на " + bonusAttackAmount);
            for (Hero hero : heroes) {
                if (hero != this && hero.getHealth() > 0) {
                    hero.setDamage(hero.getDamage() + bonusAttackAmount);
                }
            }
        }
        currentRound++;
    }
}