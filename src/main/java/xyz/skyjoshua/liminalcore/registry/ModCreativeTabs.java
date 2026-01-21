package xyz.skyjoshua.liminalcore.registry;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import xyz.skyjoshua.liminalcore.LiminalCore;

@Mod.EventBusSubscriber(
        modid = LiminalCore.MODID,
        bus = Mod.EventBusSubscriber.Bus.MOD
)
public class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, LiminalCore.MODID);

    public static final RegistryObject<CreativeModeTab> LIMINAL_TAB = TABS.register("liminal_core", () -> CreativeModeTab.builder()
            .title(Component.translatable("creativetab.liminalcore"))
            .icon(() -> ModBlocks.WALLPAPER.get().asItem().getDefaultInstance())
            .displayItems((params, output) -> {
                output.accept(ModBlocks.WALLPAPER.get());
                output.accept(ModBlocks.WALLPAPER_BIGSQUARES.get());
                output.accept(ModBlocks.WALLPAPER_SQUARES.get());
                output.accept(ModBlocks.WALLPAPER_BLANK.get());
                output.accept(ModBlocks.WALLPAPER_WHITE.get());
                output.accept(ModBlocks.WALLPAPER_WAVEY.get());
                output.accept(ModBlocks.WALLPAPER_PINK.get());
                output.accept(ModBlocks.CARPET.get());
                output.accept(ModBlocks.RED_CARPET.get());
                output.accept(ModBlocks.CEILING.get());
                output.accept(ModBlocks.CEILING_WHITE.get());
                output.accept(ModBlocks.FALSE_CARPET.get());
                output.accept(ModBlocks.FALSE_WALLPAPER.get());


                if (!LiminalCore.HAS_SUPPLEMENTARIES) {
                    output.accept(ModBlocks.TIMBER_FRAME.get());
                }

            })
            .build()
    );

    public static void register(IEventBus bus) {
        TABS.register(bus);
    }
}
