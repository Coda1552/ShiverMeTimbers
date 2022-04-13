package fishbowl.shivermetimbers.registry;

import fishbowl.shivermetimbers.ShiverMeTimbers;
import fishbowl.shivermetimbers.common.items.PirateHatItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class SMTItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ShiverMeTimbers.MOD_ID);

    public static final RegistryObject<Item> PIRATE_HAT = ITEMS.register("pirate_hat", () -> new PirateHatItem(EquipmentSlot.HEAD, new Item.Properties().tab(ShiverMeTimbers.GROUP).durability(124).rarity(Rarity.UNCOMMON)));
}
