package fishbowl.shivermetimbers.common;

import fishbowl.shivermetimbers.ShiverMeTimbers;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.vehicle.Boat;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = ShiverMeTimbers.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class CommonEvents {

    @SubscribeEvent
    public static void iceBreaker(TickEvent.PlayerTickEvent event) {
        Player player = event.player;
        Level level = player.level;

        if (player.getVehicle() != null && player.getVehicle() instanceof Boat boat) {
            BlockPos pos = boat.blockPosition();

            for (int x = -1; x < 2; x++) {
                for (int y = 0; y < 2; y++) {
                    for (int z = -1; z < 2; z++) {
                        if (level.getBlockState(pos.offset(x, y, z)).is(BlockTags.ICE)) {
                            level.setBlock(pos.offset(x, 0, z), Blocks.WATER.defaultBlockState(), 2);
                            level.setBlock(pos.offset(x, 1, z), Blocks.AIR.defaultBlockState(), 2);
                            level.levelEvent(2001, pos.offset(x, y, z), Block.getId(Blocks.ICE.defaultBlockState()));
                        }
                    }
                }
            }
        }
    }
}
