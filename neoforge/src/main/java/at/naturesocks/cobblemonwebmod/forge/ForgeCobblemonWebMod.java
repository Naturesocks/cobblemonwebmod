package at.naturesocks.cobblemonwebmod.forge;

import at.naturesocks.cobblemonwebmod.common.CobblemonWebMod;
import at.naturesocks.cobblemonwebmod.common.ExampleCommandRegistry;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.RegisterCommandsEvent;
import net.neoforged.neoforge.event.server.ServerStartedEvent;
import net.neoforged.neoforge.event.server.ServerStoppingEvent;

@Mod(CobblemonWebMod.MOD_ID)
public class ForgeCobblemonWebMod {

    public ForgeCobblemonWebMod() {
        NeoForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public void onCommandRegistration(RegisterCommandsEvent event) {
        ExampleCommandRegistry.registerCommands(event.getDispatcher(), event.getBuildContext(), event.getCommandSelection());
    }

    @SubscribeEvent
    public void onServerStarted(ServerStartedEvent event)
    {
        CobblemonWebMod.onServerStarting();
    }

    @SubscribeEvent
    public void onServerStopping(ServerStoppingEvent event)
    {
        CobblemonWebMod.onServerStopping();
    }
}
