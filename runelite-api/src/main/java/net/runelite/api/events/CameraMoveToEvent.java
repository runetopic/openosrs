package net.runelite.api.events;

import lombok.Data;

/**
 * @author Kris | 23/10/2021
 */
@Data
public class CameraMoveToEvent {
    private final int cameraMoveToX;
    private final int cameraMoveToY;
    private final int cameraMoveToHeight;
    private final int cameraMoveToSpeed;
    private final int cameraMoveToAcceleration;
}
