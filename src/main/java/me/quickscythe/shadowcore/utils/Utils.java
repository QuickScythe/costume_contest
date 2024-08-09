package me.quickscythe.shadowcore.utils;

import me.quickscythe.shadowcore.CostumeContest;
import me.quickscythe.shadowcore.utils.chat.Logger;
import me.quickscythe.shadowcore.utils.heartbeat.Flutter;
import me.quickscythe.shadowcore.utils.heartbeat.HeartbeatUtils;
import me.quickscythe.shadowcore.utils.heartbeat.runnable.Heartbeat;

public class Utils {

    static CostumeContest plugin;
    static Logger logger;

    public static void init(CostumeContest plugin){
        Utils.plugin = plugin;
        logger = new Logger(plugin);

        HeartbeatUtils.getHeartbeat().addFlutter(()->{
            plugin.onDisable();
            return false;
        });
    }

    public static CostumeContest getPlugin(){
        return plugin;
    }

    public static Logger getLogger(){
        return logger;
    }

}
