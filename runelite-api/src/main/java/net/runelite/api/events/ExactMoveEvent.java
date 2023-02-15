package net.runelite.api.events;

import lombok.Data;
import net.runelite.api.Actor;

/**
 * @author Kris | 22/10/2021
 */
@Data
public class ExactMoveEvent {
    private final Actor actor;
    private final int exactMoveDeltaX1;
    private final int exactMoveDeltaX2;
    private final int exactMoveDeltaY1;
    private final int exactMoveDeltaY2;
    private final int exactMoveArrive1Cycle;
    private final int exactMoveArrive2Cycle;
    private final int exactMoveDirection;
    private final int cycle;
}
