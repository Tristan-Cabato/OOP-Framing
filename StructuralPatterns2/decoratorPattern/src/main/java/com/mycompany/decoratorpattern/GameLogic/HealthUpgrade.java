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
public class HealthUpgrade extends UpgradeDecorator {
    public HealthUpgrade(Character heroOne) {
        super(heroOne);
    }

    @Override
    public String getCharacter() {
        return character.getCharacter() + ", 1 Health Upgrade";
    }

    @Override
    public int getHealth() {
        return character.getHealth() + 25;
    }

    @Override
    public int getAttack() {
        return character.getAttack();
    }
    
}
