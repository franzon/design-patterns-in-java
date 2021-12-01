package structural.bridge.weapon;

import structural.bridge.enchantment.Enchantment;

public class Sword extends Weapon {

    public Sword(Enchantment enchantment) {
        super(enchantment);
    }

    @Override
    public void wield() {
        System.out.println("Sword wielded");
    }
}
