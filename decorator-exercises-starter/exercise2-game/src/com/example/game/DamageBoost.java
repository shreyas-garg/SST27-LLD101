package com.example.game;

public class DamageBoost extends CharacterDecorator {
    private int boost;

    public DamageBoost(Character inner, int boost) {
        super(inner);
        this.boost = boost;
    }

    @Override
    public int getDamage() {
        return inner.getDamage() + boost;
    }

    @Override
    public void attack() {
        System.out.println("Attacking with boosted damage " + getDamage() + " using sprite " + getSprite());
    }
}
