package fishbowl.shivermetimbers.client.render.armor;

import fishbowl.shivermetimbers.client.model.armor.PirateHatModel;
import fishbowl.shivermetimbers.common.items.PirateHatItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class PirateHatRenderer extends GeoArmorRenderer<PirateHatItem> {

    public PirateHatRenderer() {
        super(new PirateHatModel());

        //These values are what each bone name is in blockbench. So if your head bone is named "bone545",
        // make sure to do this.headBone = "bone545";

        // The default values are the ones that come with the default armor template in the geckolib blockbench plugin.
        this.headBone = "armorHead";
    }
}