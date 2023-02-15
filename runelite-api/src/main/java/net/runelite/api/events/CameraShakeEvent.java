package net.runelite.api.events;

import lombok.Data;

/**
 * @author Kris | 23/10/2021
 */
@Data
public class CameraShakeEvent {
    private final int type;
    private final int shakeIntensity;
    private final int movementIntensity;
    private final int speed;
}
