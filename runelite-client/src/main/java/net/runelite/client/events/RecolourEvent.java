package net.runelite.client.events;

import lombok.Data;
import net.runelite.api.Actor;

/**
 * @author Kris | 07/01/2022
 */
@Data
public class RecolourEvent {
    private final Actor actor;
    private final int recolourStartCycle;
    private final int recolourEndCycle;
    private final int recolourHue;
    private final int recolourSaturation;
    private final int recolourLuminance;
    private final int recolourAmount;
    private final int currentCycle;
}
