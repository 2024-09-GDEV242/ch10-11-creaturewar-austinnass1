
/**
 * The CyberDemon class will inherit from the demon class.
 *
 * @author Austin Nass
 * @version 12/03/2024
 */
public class CyberDemon extends Demon {

    // Zero-parameter constructor with default CyberDemon values
    public CyberDemon() {
        super(30, 75);  // CyberDemon base stats (could be adjusted further)
    }

    // Two-parameter constructor with validation
    public CyberDemon(int strength, int hitpoints) {
        super(Math.min(40, Math.max(20, strength)), Math.min(100, Math.max(25, hitpoints)));
    }
}
