package structural.bridge.weapon;

import structural.bridge.enchantment.Enchantment;

public class Hammer extends Weapon {

    protected Hammer(Enchantment enchantment) {
        super(enchantment);
    }

    @Override
    public void wield() {
        System.out.println("Hammer wielded");
    }
}
