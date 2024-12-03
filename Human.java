/**
 * The Human class implements a wrapper for the base Creature class with the following additions
 * Implements a maximum/minimum strength for the creature type [20/5]
 * Implements a maximum/minimum hitpoint total for the creature type [25/5]
 * 
 * @author Austin Nass
 * @version 12/03/2024
 */
public class Human extends Creature {

    // Zero-parameter constructor with default Human values
    public Human() {
        super(10, 20);  // default strength and hitpoints for a human
    }

    // Two-parameter constructor to ensure valid strength and hitpoints within range
    public Human(int strength, int hitpoints) {
        super(Math.min(18, Math.max(5, strength)), Math.min(30, Math.max(10, hitpoints)));
    }
}