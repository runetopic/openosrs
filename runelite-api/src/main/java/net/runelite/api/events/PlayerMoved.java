package net.runelite.api.events;

import lombok.Data;
import net.runelite.api.Player;

/**
 * @author Kris | 27/10/2021
 */
@Data
public class PlayerMoved {
    private final Player player;
    private final int x;
    private final int y;
    private final int type;
}
