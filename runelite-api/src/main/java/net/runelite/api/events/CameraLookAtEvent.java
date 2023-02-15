package net.runelite.api.events;

import lombok.Data;

/**
 * @author Kris | 23/10/2021
 */
@Data
public class CameraLookAtEvent {
    private final int cameraLookAtX;
    private final int cameraLookAtY;
    private final int cameraLookAtHeight;
    private final int cameraLookAtSpeed;
    private final int cameraLookAtAcceleration;
}
