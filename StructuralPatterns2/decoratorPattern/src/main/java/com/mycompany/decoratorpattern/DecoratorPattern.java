/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.decoratorpattern;
import com.mycompany.decoratorpattern.GameLogic.*;
import com.mycompany.decoratorpattern.GameObjects.Character;
import com.mycompany.decoratorpattern.GameObjects.Player;

/**
 *
 * @author tcabato
 */
public class DecoratorPattern {
    // Structural Pattern
    // Adding new behaviors to existing objects dynamically
    public static void main(String[] args) {
        Character heroOne = new Player("Alejandro");
        Character healthOne = new HealthUpgrade(heroOne);
        Character healthTwo = new HealthUpgrade(healthOne);
        Character attack = new AttackUpgrade(healthTwo);
        Character premium = new PremiumUpgrade(attack);
        System.out.println("""
                Character Description
                Name: %s
                Health: %d
                Attack: %d""".formatted(premium.getCharacter(), premium.getHealth(), premium.getAttack()));
    }
}
