/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.decoratorpattern.GameLogic;
import com.mycompany.decoratorpattern.GameObjects.Character;

/**
 *
 * @author tcabato
 */
public class PremiumUpgrade extends UpgradeDecorator {
    public PremiumUpgrade(Character heroOne) {
        super(heroOne);
    }

    @Override
    public String getCharacter() {
        return character.getCharacter() + ", 25 Health Upgrade";
    }

    @Override
    public int getHealth() {
        return character.getHealth() + 100;
    }
    @Override
    public int getAttack() {
        return character.getAttack() + 25;
    }
    
}
