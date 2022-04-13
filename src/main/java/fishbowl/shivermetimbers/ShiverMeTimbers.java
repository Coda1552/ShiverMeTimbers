package fishbowl.shivermetimbers;

import fishbowl.shivermetimbers.registry.SMTItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(ShiverMeTimbers.MOD_ID)
public class ShiverMeTimbers {
    public static final String MOD_ID = "shivermetimbers";
    public final static CreativeModeTab GROUP = new CreativeModeTab(MOD_ID) {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(SMTItems.PIRATE_HAT.get());
        }
    };

    public ShiverMeTimbers() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        SMTItems.ITEMS.register(bus);
    }

}