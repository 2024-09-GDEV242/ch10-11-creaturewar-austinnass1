
/**
 * The Elf class will have special abilitys when there’s 10% chance to deal with double damage.
 *
 * @author Austin Nass
 * @version 12/03/2024
 */
public class Elf extends Creature {

    // Zero-parameter constructor with Elf values
    public Elf() {
        super(10, 20);  // default strength and hitpoints for an elf
    }

    // Two-parameter constructor to ensure valid strength and hitpoints within range
    public Elf(int strength, int hitpoints) {
        super(Math.min(18, Math.max(5, strength)), Math.min(25, Math.max(8, hitpoints)));
    }

    @Override
    public int damage() {
        int baseDamage = super.damage();
        if (randomizer.nextInt(100) < 10) {  // 10% chance to double damage
            return baseDamage * 2;
        }
        return baseDamage;
    }
}
