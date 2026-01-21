package xyz.skyjoshua.liminalcore.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.MapColor;

public class Timber_Frame extends Block {
    public Timber_Frame() {
        super(Properties.of()
                .mapColor(MapColor.COLOR_BROWN)
                .strength(0.0f, 3.0f)
                .sound(SoundType.WOOL)
        );
    }
}
