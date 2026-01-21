package xyz.skyjoshua.liminalcore.registry;

import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import xyz.skyjoshua.liminalcore.Liminalcore;
import xyz.skyjoshua.liminalcore.blocks.Wallpaper1;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Liminalcore.MODID);

    public static final RegistryObject<Block> WALLPAPER1 = BLOCKS.register("wallpaper1", Wallpaper1::new);

    public static void register(IEventBus bus) {
        BLOCKS.register(bus);
    }
}
