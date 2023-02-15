package net.runelite.api.events;

import lombok.Data;

/**
 * @author Kris | 24/10/2021
 */
@Data
public class WidgetZoomChanged {
    private final int zoom;
    private final int angleX;
    private final int angleY;
}
