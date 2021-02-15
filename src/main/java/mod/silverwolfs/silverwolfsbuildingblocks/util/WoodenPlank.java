package mod.silverwolfs.silverwolfsbuildingblocks.util;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;

public enum WoodenPlank {
    ACACIA(Blocks.ACACIA_PLANKS),
    BIRCH(Blocks.BIRCH_PLANKS),
    DARK_OAK(Blocks.DARK_OAK_PLANKS),
    JUNGLE(Blocks.JUNGLE_PLANKS),
    OAK(Blocks.OAK_PLANKS),
    SPRUCE(Blocks.SPRUCE_PLANKS);


    public Block plank;
    WoodenPlank(Block block) {
        this.plank = block;
    }

}
