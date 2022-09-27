package org.multicoder.mcpaintball.item;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.projectile.Arrow;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class PistolItem extends Item
{

    public PistolItem()
    {
        super(new Properties().tab(CreativeModeTab.TAB_MISC));
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand)
    {
        if(!level.isClientSide())
        {
            AbstractArrow AAE = new Arrow(level,player);
            AAE.shootFromRotation(player,player.getXRot(),player.getYRot(),0.0f,3.0f,1.0f);
            level.addFreshEntity(AAE);
            player.getCooldowns().addCooldown(player.getItemInHand(hand).getItem(),40);
        }
        return InteractionResultHolder.pass(player.getItemInHand(hand));
    }
}
