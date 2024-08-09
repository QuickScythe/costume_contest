package me.quickscythe.shadowcore.utils;

import me.quickscythe.shadowcore.CostumeContest;
import me.quickscythe.shadowcore.utils.chat.Logger;
import me.quickscythe.shadowcore.utils.heartbeat.Flutter;
import me.quickscythe.shadowcore.utils.heartbeat.HeartbeatUtils;
import me.quickscythe.shadowcore.utils.heartbeat.runnable.Heartbeat;
import me.quickscythe.shadowcore.utils.team.Team;
import me.quickscythe.shadowcore.utils.team.TeamManager;
import net.kyori.adventure.text.format.NamedTextColor;

public class Utils {

    static CostumeContest plugin;
    static Logger logger;

    public static void init(CostumeContest plugin){
        Utils.plugin = plugin;
        logger = new Logger(plugin);
        Team team = TeamManager.registerTeam("red");
        team.setColor(NamedTextColor.AQUA);

    }

    public static CostumeContest getPlugin(){
        return plugin;
    }

    public static Logger getLogger(){
        return logger;
    }

}
