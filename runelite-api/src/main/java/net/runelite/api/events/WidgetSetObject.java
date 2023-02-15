package net.runelite.api.events;

import lombok.Data;

/**
 * @author Kris | 24/10/2021
 */
@Data
public class WidgetSetObject {
    private final int itemId;
    private final int itemQuantityOrModelZoom;
    // if new type, use item quantity, else model zoom
    private final boolean newType;
}
