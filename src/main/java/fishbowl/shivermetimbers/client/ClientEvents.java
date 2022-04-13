package fishbowl.shivermetimbers.client;

import fishbowl.shivermetimbers.ShiverMeTimbers;
import fishbowl.shivermetimbers.client.render.armor.PirateHatRenderer;
import fishbowl.shivermetimbers.common.items.PirateHatItem;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

@Mod.EventBusSubscriber(modid = ShiverMeTimbers.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientEvents {

    @SubscribeEvent
    public static void clientSetup(FMLClientSetupEvent event) {

    }

    @SubscribeEvent
    public static void renderLayers(EntityRenderersEvent.AddLayers event) {
        GeoArmorRenderer.registerArmorRenderer(PirateHatItem.class, new PirateHatRenderer());
    }
}
