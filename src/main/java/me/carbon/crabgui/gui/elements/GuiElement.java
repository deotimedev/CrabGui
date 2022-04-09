package me.carbon.crabgui.gui.elements;

import lombok.Getter;
import lombok.Setter;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class GuiElement extends ItemStack {
    @Getter @Setter
    private ElementEvent event;
    @Getter @Setter
    private boolean clickable;

    public GuiElement(Material material){

    }

    public GuiElement(Material material, int amount){

    }
}
