package at.naturesocks.cobblemonwebmod.fabric;

import at.naturesocks.cobblemonwebmod.common.CobblemonWebMod;
import at.naturesocks.cobblemonwebmod.common.ExampleCommandRegistry;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;

public class FabricCobblemonWebMod implements ModInitializer {

    @Override
    public void onInitialize() {
        CommandRegistrationCallback.EVENT.register(ExampleCommandRegistry::registerCommands);

        ServerLifecycleEvents.SERVER_STARTED.register((server) -> CobblemonWebMod.onServerStarting());
        ServerLifecycleEvents.SERVER_STOPPING.register((server) -> CobblemonWebMod.onServerStopping());
    }

}
