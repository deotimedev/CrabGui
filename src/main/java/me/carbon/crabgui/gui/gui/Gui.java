package me.carbon.crabgui.gui.gui;

import me.carbon.crabgui.gui.CrabGui;
import me.carbon.crabgui.gui.elements.GuiElement;
import me.carbon.crabgui.gui.util.PluginUtils;
import org.bukkit.craftbukkit.v1_18_R2.inventory.CraftInventoryCustom;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class Gui extends CraftInventoryCustom {

    private final GuiElement[] ELEMENTS;

    public Gui(String name, int size) {
        super(null, size, name);
        this.ELEMENTS = new GuiElement[size];
    }

    private void onInventoryClick(InventoryClickEvent event){
        event.setCancelled(true);
        GuiElement element = ELEMENTS[event.getSlot()];
        if(element == null) return;
        event.setCancelled(element.isClickable());
        if(element.getEvent() != null){

        }
    }

    static Listener CLICK_LISTENER = new Listener() {
        @EventHandler
        public void click(InventoryClickEvent event){
            if(!(event.getClickedInventory() instanceof Gui gui)) return;
            gui.onInventoryClick(event);
        }
    };

    static{
        PluginUtils.registerListener(CLICK_LISTENER);
    }

}
