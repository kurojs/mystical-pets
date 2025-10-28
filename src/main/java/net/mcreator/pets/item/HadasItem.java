/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.network.chat.Component
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.LivingEntity
 *  net.minecraft.world.food.FoodProperties$Builder
 *  net.minecraft.world.item.CreativeModeTab
 *  net.minecraft.world.item.Item
 *  net.minecraft.world.item.Item$Properties
 *  net.minecraft.world.item.ItemStack
 *  net.minecraft.world.item.Rarity
 *  net.minecraft.world.item.TooltipFlag
 *  net.minecraft.world.item.UseAnim
 *  net.minecraft.world.level.Level
 */
package net.mcreator.pets.item;

import java.util.List;
import net.mcreator.pets.procedures.AguadeuwuProcedure;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.level.Level;
import net.mcreator.pets.init.PetsModTabs;

public class HadasItem
extends Item {
    public HadasItem() {
        super(new Item.Properties().tab(PetsModTabs.PETS).stacksTo(1).rarity(Rarity.UNCOMMON).food(new FoodProperties.Builder().nutrition(4).saturationMod(0.3f).alwaysEat().build()));
    }

    public UseAnim m_6164_(ItemStack itemstack) {
        return UseAnim.DRINK;
    }

    public int m_8105_(ItemStack itemstack) {
        return 2;
    }

    public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
        super.appendHoverText(itemstack, world, list, flag);
        list.add((Component)Component.literal((String)"Un poco salado pero muy revitalizador"));
    }

    public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
        ItemStack retval = super.finishUsingItem(itemstack, world, entity);
        double x = entity.getX();
        double y = entity.getY();
        double z = entity.getZ();
        AguadeuwuProcedure.execute((Entity)entity, itemstack);
        return retval;
    }
}

