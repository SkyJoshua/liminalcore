package xyz.skyjoshua.liminalcore.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.MapColor;

public class Fake_Ceiling extends Block {
    public Fake_Ceiling() {
        super(Properties.of()
                .mapColor(MapColor.COLOR_YELLOW)
                .strength(3.0f, 3.0f)
                .sound(SoundType.WOOL)
        );
    }
}
