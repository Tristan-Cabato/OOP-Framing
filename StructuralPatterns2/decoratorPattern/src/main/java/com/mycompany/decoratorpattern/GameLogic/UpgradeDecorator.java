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
public abstract class UpgradeDecorator extends Character {
    protected Character character;

    public UpgradeDecorator(Character character) {
        this.character = character;
    }

    @Override
    public abstract String getCharacter();
}
