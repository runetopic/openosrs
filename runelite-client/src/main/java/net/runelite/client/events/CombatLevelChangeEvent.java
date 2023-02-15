package net.runelite.client.events;

import lombok.Data;
import net.runelite.api.Actor;

/**
 * @author Kris | 07/01/2022
 */
@Data
public class CombatLevelChangeEvent {
    private final Actor actor;
    private final int oldCombatLevel;
    private final int newCombatLevel;
}
