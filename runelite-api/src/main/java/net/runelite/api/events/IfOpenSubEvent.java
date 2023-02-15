package net.runelite.api.events;

import lombok.Data;

/**
 * @author Kris | 24/10/2021
 */
@Data
public class IfOpenSubEvent {
    private final int targetComponent;
    private final int interfaceId;
    private final int walkType;
}
