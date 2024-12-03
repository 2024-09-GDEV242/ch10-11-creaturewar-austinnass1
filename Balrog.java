
/**
 * The Balrog class will override attack() method to form two attacks per round.
 *
 * @author Austin Nass
 * @version 12/03/2024
 */
public class Balrog extends Demon {

    // Zero-parameter constructor with default Balrog values
    public Balrog() {
        super(50, 150);  // default strength and hitpoints for a Balrog
    }

    // Two-parameter constructor with validation
    public Balrog(int strength, int hitpoints) {
        super(Math.min(100, Math.max(50, strength)), Math.min(200, Math.max(80, hitpoints)));
    }

    @Override
    public int attack() {
        // Balrog attacks twice per round
        int damage1 = super.attack();
        int damage2 = super.attack();
        return damage1 + damage2;
    }
}
