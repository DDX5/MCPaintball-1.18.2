package org.multicoder.mcpaintball.init;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.multicoder.mcpaintball.MCPaintball;
import org.multicoder.mcpaintball.item.BluePistolItem;
import org.multicoder.mcpaintball.item.RedPistolItem;

public class iteminit
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MCPaintball.MODID);

    public static final RegistryObject<Item> RED_PISTOL = ITEMS.register("weapon/pistol/red_pistol", RedPistolItem::new);
    public static final RegistryObject<Item> BLUE_PISTOL = ITEMS.register("weapon/pistol/blue_pistol", BluePistolItem::new);
}
