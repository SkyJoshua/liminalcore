package xyz.skyjoshua.liminalcore;

import com.mojang.logging.LogUtils;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import xyz.skyjoshua.liminalcore.registry.ModBlocks;
import xyz.skyjoshua.liminalcore.registry.ModCreativeTabs;
import xyz.skyjoshua.liminalcore.registry.ModItems;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Liminalcore.MODID)
public class Liminalcore {

    public static final String MODID = "liminalcore";
    public static final Logger LOGGER = LogUtils.getLogger();

    public Liminalcore() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ModBlocks.register(bus);
        ModItems.register(bus);
        ModCreativeTabs.register(bus);
    }
}
