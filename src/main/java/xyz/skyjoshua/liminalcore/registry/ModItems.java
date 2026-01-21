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

    public static void register(IEventBus bus) {
        ITEMS.register(bus);
    }
}
