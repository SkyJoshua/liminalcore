package xyz.skyjoshua.liminalcore;

import com.mojang.logging.LogUtils;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import xyz.skyjoshua.liminalcore.registry.ModBlocks;
import xyz.skyjoshua.liminalcore.registry.ModCreativeTabs;
import xyz.skyjoshua.liminalcore.registry.ModItems;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(LiminalCore.MODID)
public class LiminalCore {

    public static final String MODID = "liminalcore";
    public static final Logger LOGGER = LogUtils.getLogger();

    public static final boolean HAS_SUPPLEMENTARIES = ModList.get().isLoaded("supplementaries");

    public LiminalCore() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.addListener(this::setup);

        ModBlocks.register(bus);
        ModItems.register(bus);
        ModCreativeTabs.register(bus);
    }

    private void setup(final FMLCommonSetupEvent event) {
        if (HAS_SUPPLEMENTARIES) {
            LOGGER.info("Supplementaries detected and loaded.");
        } else {
            LOGGER.info("Supplementaries not found.");
        }
    }
}
