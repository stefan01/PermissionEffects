package de.freemine.permissioneffects;

import de.freemine.permissioneffects.Listener.Mainlistener;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * @author LPkkjHD
 */
public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new Mainlistener(), this);
        getCommand("PermissionEffects").setExecutor(new command(this));
    }

    @Override
    public void onDisable() {
        getLogger().info("Disabling PermissionEffects by LPkkjHD");
    }
}
