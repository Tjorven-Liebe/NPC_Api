package net.standardsucht;

import org.bukkit.plugin.java.JavaPlugin;

public class NPCApi extends JavaPlugin {

    @Override
    public void onEnable() {
        new StartHandle(true);
        super.onEnable();
    }

    @Override
    public void onDisable() {
        new StartHandle(false);
        super.onDisable();
    }
}
