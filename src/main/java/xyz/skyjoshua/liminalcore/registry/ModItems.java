package xyz.skyjoshua.liminalcore.registry;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import xyz.skyjoshua.liminalcore.Liminalcore;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Liminalcore.MODID);

    public static final RegistryObject<Item> Wallpaper1 = ITEMS.register("wallpaper1", () -> new BlockItem(ModBlocks.WALLPAPER1.get(), new Item.Properties()));
    public static final RegistryObject<Item> Wallpaper2 = ITEMS.register("wallpaper2", () -> new BlockItem(ModBlocks.WALLPAPER2.get(), new Item.Properties()));
    public static final RegistryObject<Item> Wallpaper3 = ITEMS.register("wallpaper3", () -> new BlockItem(ModBlocks.WALLPAPER3.get(), new Item.Properties()));
    public static final RegistryObject<Item> Wallpaper4 = ITEMS.register("wallpaper4", () -> new BlockItem(ModBlocks.WALLPAPER4.get(), new Item.Properties()));
    public static final RegistryObject<Item> Wallpaper5 = ITEMS.register("wallpaper5", () -> new BlockItem(ModBlocks.WALLPAPER5.get(), new Item.Properties()));
    public static final RegistryObject<Item> Wallpaper6 = ITEMS.register("wallpaper6", () -> new BlockItem(ModBlocks.WALLPAPER6.get(), new Item.Properties()));
    public static final RegistryObject<Item> Wallpaper7 = ITEMS.register("wallpaper7", () -> new BlockItem(ModBlocks.WALLPAPER7.get(), new Item.Properties()));
    public static final RegistryObject<Item> Carpet = ITEMS.register("carpet", () -> new BlockItem(ModBlocks.CARPET.get(), new Item.Properties()));
    public static final RegistryObject<Item> RedCarpet = ITEMS.register("redcarpet", () -> new BlockItem(ModBlocks.REDCARPET.get(), new Item.Properties()));
    public static final RegistryObject<Item> Ceiling = ITEMS.register("ceiling", () -> new BlockItem(ModBlocks.CEILING.get(), new Item.Properties()));
    public static final RegistryObject<Item> Ceiling2 = ITEMS.register("ceiling2", () -> new BlockItem(ModBlocks.CEILING2.get(), new Item.Properties()));

    public static void register(IEventBus bus) {
        ITEMS.register(bus);
    }
}
