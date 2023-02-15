package net.runelite.api.events;

import lombok.Data;
import net.runelite.api.Model;
import net.runelite.api.Player;

/**
 * @author Kris | 22/10/2021
 */
@Data
public class AttachedModelEvent {
    private final Player player;
    private final int minX;
    private final int minY;
    private final int maxX;
    private final int maxY;
    private final int animationCycleStart;
    private final int animationCycleEnd;
    private final Model attachedModel;
}
