package me.quickscythe.shadowcore;

import me.quickscythe.shadowcore.commands.CommandManager;
import me.quickscythe.shadowcore.commands.ContestCommand;
import me.quickscythe.shadowcore.utils.Utils;
import org.bukkit.plugin.java.JavaPlugin;

public final class CostumeContest extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Utils.init(this);
        new CommandManager.CommandBuilder("contest", new ContestCommand()).setAliases("cc").register(this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
