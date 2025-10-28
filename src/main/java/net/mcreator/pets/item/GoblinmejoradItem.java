/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.network.chat.Component
 *  net.minecraft.world.entity.LivingEntity
 *  net.minecraft.world.entity.player.Player
 *  net.minecraft.world.food.FoodProperties$Builder
 *  net.minecraft.world.item.CreativeModeTab
 *  net.minecraft.world.item.Item
 *  net.minecraft.world.item.Item$Properties
 *  net.minecraft.world.item.ItemStack
 *  net.minecraft.world.item.Items
 *  net.minecraft.world.item.Rarity
 *  net.minecraft.world.item.TooltipFlag
 *  net.minecraft.world.level.ItemLike
 *  net.minecraft.world.level.Level
 */
package net.mcreator.pets.item;

import java.util.List;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.mcreator.pets.init.PetsModTabs;

public class GoblinmejoradItem
extends Item {
    public GoblinmejoradItem() {
        super(new Item.Properties().tab(PetsModTabs.PETS).stacksTo(1).rarity(Rarity.RARE).food(new FoodProperties.Builder().nutrition(6).saturationMod(1.0f).alwaysEat().meat().build()));
    }

    public int m_8105_(ItemStack itemstack) {
        return 2;
    }

    public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
        super.appendHoverText(itemstack, world, list, flag);
        list.add((Component)Component.literal((String)"Muy LLenador y Energizante"));
    }

    public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
        ItemStack retval = new ItemStack((ItemLike)Items.BOWL);
        super.finishUsingItem(itemstack, world, entity);
        if (!itemstack.isEmpty()) {
            return retval;
        }
        if (entity instanceof Player) {
            Player player = (Player)entity;
            if (player.getInventory().selected == 0 && !player.getInventory().add(retval)) {
                player.drop(retval, false);
            }
        }
        return itemstack;
    }
}

