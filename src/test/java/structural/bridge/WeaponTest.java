package structural.bridge;

import org.junit.jupiter.api.Test;
import structural.bridge.enchantment.FireEnchantment;
import structural.bridge.weapon.Sword;
import structural.bridge.weapon.Weapon;

class WeaponTest {

    @Test
    void shouldCreateASwordWithFireEnchantment() {
        Weapon sword = new Sword(new FireEnchantment());
        sword.wield();
    }
}
