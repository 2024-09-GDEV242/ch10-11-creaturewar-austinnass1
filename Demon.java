/**
 * The Demon class is a base class for all demon creatures. 
 *
 * @author Austin Nass
 * @version 12/03/2024
 */
public class Demon extends Creature {

    // Zero-parameter constructor with default Demon values
    public Demon() {
        super(30, 75);  // default strength and hitpoints for a demon
    }

    // Two-parameter constructor to ensure valid strength and hitpoints within range
    public Demon(int strength, int hitpoints) {
        super(Math.min(40, Math.max(20, strength)), Math.min(100, Math.max(25, hitpoints)));
    }

    @Override
    public int damage() {
        int baseDamage = super.damage();
        if (randomizer.nextInt(100) < 5) {  // 5% chance for magical damage
            return baseDamage + 50;  // Magical damage bonus
        }
        return baseDamage;
    }
}
