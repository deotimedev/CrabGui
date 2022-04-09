package me.carbon.crabgui.gui.util;

import lombok.experimental.UtilityClass;
import me.carbon.crabgui.gui.CrabGui;
import org.bukkit.event.Listener;

@UtilityClass
public class PluginUtils {
    public static void registerListener(Listener listener){
        CrabGui.getInstance().getServer().getPluginManager().registerEvents(listener, CrabGui.getInstance());
    }
}
