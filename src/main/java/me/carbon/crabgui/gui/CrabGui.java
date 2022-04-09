package me.carbon.crabgui.gui;

import lombok.Getter;
import net.minecraft.world.level.material.Material;
import org.bukkit.plugin.java.JavaPlugin;

public class CrabGui extends JavaPlugin {

    @Getter
    private static CrabGui instance;

    @Override
    public void onEnable(){
        instance = this;
    }

}
