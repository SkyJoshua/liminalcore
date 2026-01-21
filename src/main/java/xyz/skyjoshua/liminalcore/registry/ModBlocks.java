package xyz.skyjoshua.liminalcore.registry;

import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import xyz.skyjoshua.liminalcore.LiminalCore;
import xyz.skyjoshua.liminalcore.blocks.*;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, LiminalCore.MODID);

    public static final RegistryObject<Block> WALLPAPER = BLOCKS.register("wallpaper", Wallpaper::new);
    public static final RegistryObject<Block> WALLPAPER_BIGSQUARES = BLOCKS.register("wallpaper_bigsquares", Wallpaper_Bigsquares::new);
    public static final RegistryObject<Block> WALLPAPER_SQUARES = BLOCKS.register("wallpaper_squares", Wallpaper_Squares::new);
    public static final RegistryObject<Block> WALLPAPER_BLANK = BLOCKS.register("wallpaper_blank", Wallpaper_Blank::new);
    public static final RegistryObject<Block> WALLPAPER_WHITE = BLOCKS.register("wallpaper_white", Wallpaper_White::new);
    public static final RegistryObject<Block> WALLPAPER_WAVEY = BLOCKS.register("wallpaper_wavey", Wallpaper_Wavey::new);
    public static final RegistryObject<Block> WALLPAPER_PINK = BLOCKS.register("wallpaper_pink", Wallpaper_Pink::new);
    public static final RegistryObject<Block> CARPET = BLOCKS.register("carpet", Carpet::new);
    public static final RegistryObject<Block> RED_CARPET = BLOCKS.register("red_carpet", Red_Carpet::new);
    public static final RegistryObject<Block> CEILING = BLOCKS.register("ceiling", Ceiling::new);
    public static final RegistryObject<Block> CEILING_WHITE = BLOCKS.register("ceiling_white", Ceiling_White::new);
    public static final RegistryObject<Block> FALSE_CARPET = BLOCKS.register("false_carpet", False_Carpet::new);
    public static final RegistryObject<Block> FALSE_WALLPAPER = BLOCKS.register("false_wallpaper", False_Wallpaper::new);
    public static final RegistryObject<Block> FALSE_CEILING = BLOCKS.register("false_ceiling", False_Ceiling::new);
    public static final RegistryObject<Block> FAKE_CARPET = BLOCKS.register("fake_carpet", Fake_Carpet::new);
    public static final RegistryObject<Block> FAKE_WALLPAPER = BLOCKS.register("fake_wallpaper", Fake_Wallpaper::new);
    public static final RegistryObject<Block> FAKE_CEILING = BLOCKS.register("fake_ceiling", Fake_Ceiling::new);
    public static RegistryObject<Block> TIMBER_FRAME;

    static {
        if (!LiminalCore.HAS_SUPPLEMENTARIES) {
            TIMBER_FRAME = BLOCKS.register("timber_frame", Timber_Frame::new);
        }
    }
    public static void register(IEventBus bus) {
        BLOCKS.register(bus);
    }
}