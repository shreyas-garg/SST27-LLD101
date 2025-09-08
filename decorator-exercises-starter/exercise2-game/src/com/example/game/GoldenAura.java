package com.example.game;

public class GoldenAura extends CharacterDecorator {
    public GoldenAura(Character inner) {
        super(inner);
    }

    @Override
    public String getSprite() {
        return "golden_" + inner.getSprite();
    }

    @Override
    public int getSpeed() {
        return inner.getSpeed() + 2; // small buff
    }

    @Override
    public int getDamage() {
        return inner.getDamage() + 2; // small buff
    }

    @Override
    public void move() {
        System.out.println("[Golden Aura] Moving at speed " + getSpeed() + " with sprite " + getSprite());
    }

    @Override
    public void attack() {
        System.out.println("[Golden Aura] Attacking with damage " + getDamage() + " using sprite " + getSprite());
    }
}
