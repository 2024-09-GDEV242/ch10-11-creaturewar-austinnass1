import java.util.Random;

/**
 * Abstract class Creature - 
 * The creature is the main class from which all other battling creatures derive.
 * It is the creature's job to maintain current health values in response to 
 * requests to takeDamage. It also must report if
 * the creature is alive or knocked out. The creature is also responsible for calculating
 * damage delivered based on the creature's strength (1 to str) 
 * 
 * @author Austin Nass
 * @version 12/03/2024
 */
// we will learn what the abstract keyword does in a later chapter
public class Creature {
    private int hitpoints;
    private int strength;

    // Randomizer for generating values for hitpoints and strength
    public static Random randomizer = new Random();

    // Zero-parameter constructor with default values
    public Creature() {
        this.hitpoints = 10;
        this.strength = 10;
    }

    // Two-parameter constructor for setting specific values for hitpoints and strength
    public Creature(int strength, int hitpoints) {
        this.strength = strength;
        this.hitpoints = hitpoints;
    }

    // Damage method: returns a random damage between 1 and strength
    public int damage() {
        return randomizer.nextInt(strength) + 1;
    }

    // Attack method: calculates the amount of damage done in one attack
    public int attack() {
        return damage();
    }

    // Take damage method: reduce health by a certain amount
    public void takeDamage(int damage) {
        this.hitpoints -= damage;
    }

    // Check if creature is still alive
    public boolean isAlive() {
        return this.hitpoints > 0;
    }

    // Check if creature is knocked out
    public boolean isKnockedOut() {
        return this.hitpoints <= 0;
    }

    // Get health method
    public int getHealth() {
        return this.hitpoints;
    }
}
