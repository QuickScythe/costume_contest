package me.quickscythe.shadowcore;

import me.quickscythe.shadowcore.utils.Utils;
import org.bukkit.plugin.java.JavaPlugin;

public final class CostumeContest extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Utils.init(this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
