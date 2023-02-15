package net.runelite.api.events;

import lombok.Data;
import net.runelite.api.Player;

/**
 * @author Kris | 23/10/2021
 */
@Data
public class PlayerAnimationPlayed {
    private final Player player;
    private final int id;
    private final int delay;
}
