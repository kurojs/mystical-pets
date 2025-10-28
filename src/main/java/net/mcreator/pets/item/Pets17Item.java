/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.network.chat.Component
 *  net.minecraft.world.InteractionHand
 *  net.minecraft.world.InteractionResultHolder
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.player.Player
 *  net.minecraft.world.item.CreativeModeTab
 *  net.minecraft.world.item.Item
 *  net.minecraft.world.item.Item$Properties
 *  net.minecraft.world.item.ItemStack
 *  net.minecraft.world.item.Rarity
 *  net.minecraft.world.item.TooltipFlag
 *  net.minecraft.world.level.ItemLike
 *  net.minecraft.world.level.Level
 *  net.minecraft.world.level.LevelAccessor
 */
package net.mcreator.pets.item;

import java.util.List;
import net.mcreator.pets.procedures.GoblinsProcedure;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.mcreator.pets.init.PetsModTabs;

public class Pets17Item
extends Item {
    public Pets17Item() {
        super(new Item.Properties().tab(PetsModTabs.PETS).fireResistant().rarity(Rarity.UNCOMMON));
    }

    public boolean m_41470_() {
        return true;
    }

    public ItemStack getCraftingRemainingItem(ItemStack itemstack) {
        return new ItemStack((ItemLike)this);
    }

    public boolean isRepairable(ItemStack itemstack) {
        return false;
    }

    public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
        super.appendHoverText(itemstack, world, list, flag);
        list.add((Component)Component.literal((String)"\u00bfviste goblin slayer?"));
        list.add((Component)Component.literal((String)"mucho cuidado"));
    }

    public InteractionResultHolder<ItemStack> m_7203_(Level world, Player entity, InteractionHand hand) {
        InteractionResultHolder ar = super.use(world, entity, hand);
        ItemStack itemstack = (ItemStack)ar.getObject();
        double x = entity.getX();
        double y = entity.getY();
        double z = entity.getZ();
        GoblinsProcedure.execute((LevelAccessor)world, x, y, z, (Entity)entity, itemstack);
        return ar;
    }
}

