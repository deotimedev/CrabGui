package me.carbon.crabgui.gui.elements;

import lombok.Data;
import org.bukkit.event.inventory.InventoryClickEvent;

import java.util.function.Consumer;

@Data
public class ElementEvent {
    private Consumer<InventoryClickEvent> event;
    private Trigger trigger;
}
