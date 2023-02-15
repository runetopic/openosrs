package net.runelite.api.events;

import lombok.Value;
import net.runelite.api.Actor;

/**
 * @author Kris | 22/10/2021
 */
@Value
public class FacedDirectionChanged
{
    private final Actor source;
    private final int direction;
    private final boolean instant;
}

