package fishbowl.shivermetimbers.common.items;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import fishbowl.shivermetimbers.ShiverMeTimbers;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;
import net.minecraftforge.common.ForgeMod;
import net.minecraftforge.common.util.Lazy;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;
import software.bernie.geckolib3.item.GeoArmorItem;

public class PirateHatItem extends GeoArmorItem implements IAnimatable {
    public static final ArmorMaterial MATERIAL = new SMTArmorMaterial(ShiverMeTimbers.MOD_ID + ":pirate_hat",  4, new int[]{1, 2, 3, 1}, 12, SoundEvents.ARMOR_EQUIP_LEATHER, 0.0F, () -> Ingredient.of(Items.LEATHER));
    private final AnimationFactory factory = new AnimationFactory(this);

    public PirateHatItem(EquipmentSlot slot, Properties builder) {
        super(MATERIAL, slot, builder.tab(ShiverMeTimbers.GROUP));
    }

    @Override
    public void registerControllers(AnimationData animationData) {}

    @Override
    public AnimationFactory getFactory() {
        return factory;
    }
}
