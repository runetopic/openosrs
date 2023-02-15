package net.runelite.client.events;

import lombok.Data;
import net.runelite.api.NPC;
import net.runelite.api.Player;

/**
 * @author Kris | 27/10/2021
 */
@Data
public class NPCMoved {
    private final NPC npc;
    private final int x;
    private final int y;
    private final int type;
}
