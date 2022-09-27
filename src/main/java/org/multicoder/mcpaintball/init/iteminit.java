package org.multicoder.mcpaintball.init;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.multicoder.mcpaintball.MCPaintball;
import org.multicoder.mcpaintball.item.PistolItem;

public class iteminit
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MCPaintball.MODID);

    public static final RegistryObject<Item> RED_PISTOL = ITEMS.register("weapon/pistol/red_pistol", PistolItem::new);
}
