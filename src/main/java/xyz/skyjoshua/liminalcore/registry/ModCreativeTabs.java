package xyz.skyjoshua.liminalcore.registry;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import xyz.skyjoshua.liminalcore.Liminalcore;

@Mod.EventBusSubscriber(
        modid = Liminalcore.MODID,
        bus = Mod.EventBusSubscriber.Bus.MOD
)
public class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Liminalcore.MODID);

    public static final RegistryObject<CreativeModeTab> LIMINAL_TAB = TABS.register("liminal_core", () -> CreativeModeTab.builder()
            .title(Component.translatable("creativetab.liminalcore"))
            .icon(() -> ModBlocks.WALLPAPER1.get().asItem().getDefaultInstance())
            .displayItems((params, output) -> {
                output.accept(ModBlocks.WALLPAPER1.get());
            })
            .build()
    );

    public static void register(IEventBus bus) {
        TABS.register(bus);
    }
}
