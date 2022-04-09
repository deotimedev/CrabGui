package me.carbon.crabgui.gui.util;

import lombok.experimental.UtilityClass;
import me.carbon.crabgui.gui.elements.ElementEvent;
import me.carbon.crabgui.gui.elements.GuiElement;
import me.carbon.crabgui.gui.elements.Trigger;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.event.inventory.InventoryClickEvent;

@UtilityClass
public class GuiUtils {
    public static void triggerCorrectEvent(GuiElement element, InventoryClickEvent event){
        if(element.getEvent() == null) return;
        ElementEvent elementEvent = element.getEvent();
        Trigger trigger = elementEvent.getTrigger();
        ClickType clickType = event.getClick();
        if(trigger == Trigger.ANY_CLICK && clickType == ClickType.LEFT) elementEvent.getEvent().accept(event);
    }
}
