package net.runelite.api.events;

import lombok.Data;
import net.runelite.api.Actor;

/**
 * @author Kris | 22/10/2021
 */
@Data
public class AnimationFrameIndexChanged
{
    /**
     * The actor that has entered a new animation.
     */
    private Actor actor;
}
