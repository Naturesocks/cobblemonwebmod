package at.naturesocks.cobblemonwebmod.common;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CobblemonWebMod {

    public static final String MOD_ID = "cobblemonwebmod";

    public static List<HttpServer> ACTIVE_SERVERS = new ArrayList<>();

    public static void onServerStarting()
    {
        try {
            ACTIVE_SERVERS.add(new HttpServer());
        } catch (IOException e) {
            // TODO: fix exception
        }
    }

    public static void onServerStopping()
    {
        ACTIVE_SERVERS.forEach(HttpServer::stop);
    }
}
