package fishbowl.shivermetimbers.client.model.armor;

import fishbowl.shivermetimbers.ShiverMeTimbers;
import fishbowl.shivermetimbers.common.items.PirateHatItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class PirateHatModel extends AnimatedGeoModel<PirateHatItem> {

    @Override
    public ResourceLocation getModelLocation(PirateHatItem object) {
        return new ResourceLocation(ShiverMeTimbers.MOD_ID, "geo/armor/pirate_hat.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(PirateHatItem object) {
        return new ResourceLocation(ShiverMeTimbers.MOD_ID, "textures/armor/pirate_hat.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(PirateHatItem animatable) {
        return null;
    }
}
