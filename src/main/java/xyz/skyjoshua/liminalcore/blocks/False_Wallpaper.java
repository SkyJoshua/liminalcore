package xyz.skyjoshua.liminalcore.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.MapColor;

public class False_Wallpaper extends Block {
    public False_Wallpaper() {
        super(Properties.of()
                .mapColor(MapColor.COLOR_YELLOW)
                .noCollission()
                .strength(-1.0f, 3600000.0f)
                .sound(SoundType.CHERRY_WOOD)
        );
    }
}
