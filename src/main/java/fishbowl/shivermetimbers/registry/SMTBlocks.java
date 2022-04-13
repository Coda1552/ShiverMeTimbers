package fishbowl.shivermetimbers.registry;

import fishbowl.shivermetimbers.ShiverMeTimbers;
import fishbowl.shivermetimbers.common.items.PirateHatItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class SMTBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ShiverMeTimbers.MOD_ID);

    public static final RegistryObject<Block> CODY_BLOCK = BLOCKS.register("cody_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL)));
}
