package net.runelite.api.events;

import lombok.Data;

/**
 * @author Kris | 22/10/2021
 */
@Data
public class PendingSpawnUpdated {
    private final int plane;
    private final int x;
    private final int y;
    private final int type;
    private final int id;
    private final int var5;
    private final int orientation;
    private final int var7;
    private final int delay;
    private final int hitpoints;
}
