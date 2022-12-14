package org.multicoder.mcpaintball.item;

import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.multicoder.mcpaintball.entity.RedPaintballArrowEntity;
import org.multicoder.mcpaintball.init.soundinit;

public class RedPistolItem extends Item
{

    public RedPistolItem()
    {
        super(new Properties().tab(CreativeModeTab.TAB_MISC));
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand)
    {
        if(level.isClientSide())
        {
            player.playSound(soundinit.SINGLE_SHOT.get(),1.0f,1.0f);
        }
        else
        {
            AbstractArrow AAE = new RedPaintballArrowEntity(level,player);
            AAE.shootFromRotation(player,player.getXRot(),player.getYRot(),0.0f,3.0f,1.0f);
            level.addFreshEntity(AAE);
            player.getCooldowns().addCooldown(player.getItemInHand(hand).getItem(),20);
        }
        return InteractionResultHolder.pass(player.getItemInHand(hand));
    }

}
