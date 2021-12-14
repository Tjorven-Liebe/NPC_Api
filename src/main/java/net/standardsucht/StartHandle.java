package net.standardsucht;

import net.standardsucht.logger.LogType;
import net.standardsucht.logger.Logger;
import org.bukkit.Bukkit;

public class StartHandle extends NPCApi {

    public StartHandle(boolean value) {
        if (value)
            this.enable();
        else
            this.disable();
    }

    public void enable() {
        Logger.getLogger().send(LogType.INFO, "NPC Api enabled");
    }

    public void disable() {
        Logger.getLogger().send(LogType.INFO, "NPC Api disabled");
        if (Bukkit.getPluginManager().isPluginEnabled(this))
            Bukkit.getPluginManager().disablePlugin(this);
    }

}
