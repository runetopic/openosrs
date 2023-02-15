package net.runelite.api.events;

import lombok.Data;

/**
 * @author Kris | 23/10/2021
 */
@Data
public class ContainerItemChange {
    private final int inventoryId;
    private final int slotId;
    private final int itemId;
    private final int quantity;
}
