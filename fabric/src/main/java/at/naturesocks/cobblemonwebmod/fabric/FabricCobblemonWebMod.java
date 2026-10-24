package at.naturesocks.cobblemonwebmod.fabric;

import at.naturesocks.cobblemonwebmod.common.ExampleCommandRegistry;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;

public class FabricCobblemonWebMod implements ModInitializer {

    @Override
    public void onInitialize() {
        CommandRegistrationCallback.EVENT.register(ExampleCommandRegistry::registerCommands);
    }

}
