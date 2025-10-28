package net.mcreator.pets.init;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class PetsModTabs {
    public static final CreativeModeTab PETS = new CreativeModeTab("pets_main") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(PetsModItems.YOKAICAN.get());
        }
    };
}
