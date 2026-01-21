package xyz.skyjoshua.liminalcore.registry;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import xyz.skyjoshua.liminalcore.LiminalCore;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, LiminalCore.MODID);

    public static final RegistryObject<Item> WALLAPPER = ITEMS.register("wallpaper", () -> new BlockItem(ModBlocks.WALLPAPER.get(), new Item.Properties()));
    public static final RegistryObject<Item> WALLPAPER_BIGSQUARES = ITEMS.register("wallpaper_bigsquares", () -> new BlockItem(ModBlocks.WALLPAPER_BIGSQUARES.get(), new Item.Properties()));
    public static final RegistryObject<Item> WALLPAPER_SQUARES = ITEMS.register("wallpaper_squares", () -> new BlockItem(ModBlocks.WALLPAPER_SQUARES.get(), new Item.Properties()));
    public static final RegistryObject<Item> WALLPAPER_BLANK = ITEMS.register("wallpaper_blank", () -> new BlockItem(ModBlocks.WALLPAPER_BLANK.get(), new Item.Properties()));
    public static final RegistryObject<Item> WALLPAPER_WHITE = ITEMS.register("wallpaper_white", () -> new BlockItem(ModBlocks.WALLPAPER_WHITE.get(), new Item.Properties()));
    public static final RegistryObject<Item> WALLPAPER_WAVEY = ITEMS.register("wallpaper_wavey", () -> new BlockItem(ModBlocks.WALLPAPER_WAVEY.get(), new Item.Properties()));
    public static final RegistryObject<Item> WALLPAPER_PINK = ITEMS.register("wallpaper_pink", () -> new BlockItem(ModBlocks.WALLPAPER_PINK.get(), new Item.Properties()));
    public static final RegistryObject<Item> CARPET = ITEMS.register("carpet", () -> new BlockItem(ModBlocks.CARPET.get(), new Item.Properties()));
    public static final RegistryObject<Item> RED_CARPET = ITEMS.register("red_carpet", () -> new BlockItem(ModBlocks.RED_CARPET.get(), new Item.Properties()));
    public static final RegistryObject<Item> CEILING = ITEMS.register("ceiling", () -> new BlockItem(ModBlocks.CEILING.get(), new Item.Properties()));
    public static final RegistryObject<Item> CEILING_WHITE = ITEMS.register("ceiling_white", () -> new BlockItem(ModBlocks.CEILING_WHITE.get(), new Item.Properties()));
    public static final RegistryObject<Item> FALSE_CARPET = ITEMS.register("false_carpet", () -> new BlockItem(ModBlocks.FALSE_CARPET.get(), new Item.Properties()));
    public static final RegistryObject<Item> FALSE_WALLPAPER = ITEMS.register("false_wallpaper", () -> new BlockItem(ModBlocks.FALSE_WALLPAPER.get(), new Item.Properties()));

    public static RegistryObject<Item> TIMBER_FRAME;

    static {
        if (!LiminalCore.HAS_SUPPLEMENTARIES) {
            TIMBER_FRAME = ITEMS.register("timber_frame", () -> new BlockItem(ModBlocks.TIMBER_FRAME.get(), new Item.Properties()));
        }
    }

    public static void register(IEventBus bus) {
        ITEMS.register(bus);
    }
}