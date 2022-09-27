package org.multicoder.mcpaintball;


import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.multicoder.mcpaintball.init.iteminit;

@Mod(MCPaintball.MODID)
public class MCPaintball
{
    public static final String MODID = "mcpaintball";
    public static final Logger LOG = LogManager.getLogger(MODID);
    public MCPaintball()
    {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.register(this);

        iteminit.ITEMS.register(bus);
    }
}
