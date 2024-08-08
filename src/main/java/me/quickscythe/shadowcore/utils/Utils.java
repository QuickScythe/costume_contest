package me.quickscythe.shadowcore.utils;

import me.quickscythe.shadowcore.CostumeContest;

public class Utils {

    static CostumeContest plugin;
    static Logger logger;

    public static void init(CostumeContest plugin){
        Utils.plugin = plugin;
        logger = new Logger(plugin);
    }

    public static CostumeContest getPlugin(){
        return plugin;
    }

    public static Logger getLogger(){
        return logger;
    }

}
