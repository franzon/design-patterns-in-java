package structural.bridge.weapon;

import structural.bridge.enchantment.Enchantment;

public abstract class Weapon {

    private final Enchantment enchantment;

    protected Weapon(Enchantment enchantment) {
        this.enchantment = enchantment;
    }

    public abstract void wield();
}
