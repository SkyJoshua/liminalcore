package xyz.skyjoshua.liminalcore.registry;

import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import xyz.skyjoshua.liminalcore.Liminalcore;
import xyz.skyjoshua.liminalcore.blocks.*;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Liminalcore.MODID);

    public static final RegistryObject<Block> WALLPAPER1 = BLOCKS.register("wallpaper1", Wallpaper1::new);
    public static final RegistryObject<Block> WALLPAPER2 = BLOCKS.register("wallpaper2", Wallpaper2::new);
    public static final RegistryObject<Block> WALLPAPER3 = BLOCKS.register("wallpaper3", Wallpaper3::new);
    public static final RegistryObject<Block> WALLPAPER4 = BLOCKS.register("wallpaper4", Wallpaper4::new);
    public static final RegistryObject<Block> WALLPAPER5 = BLOCKS.register("wallpaper5", Wallpaper5::new);
    public static final RegistryObject<Block> WALLPAPER6 = BLOCKS.register("wallpaper6", Wallpaper6::new);
    public static final RegistryObject<Block> WALLPAPER7 = BLOCKS.register("wallpaper7", Wallpaper7::new);
    public static final RegistryObject<Block> CARPET = BLOCKS.register("carpet", Carpet::new);
    public static final RegistryObject<Block> REDCARPET = BLOCKS.register("redcarpet", Redcarpet::new);
    public static final RegistryObject<Block> CEILING = BLOCKS.register("ceiling", Ceiling::new);
    public static final RegistryObject<Block> CEILING2 = BLOCKS.register("ceiling2", Ceiling2::new);

    public static void register(IEventBus bus) {
        BLOCKS.register(bus);
    }
}
