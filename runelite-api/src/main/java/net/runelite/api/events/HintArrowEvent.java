package net.runelite.api.events;

import lombok.Data;

/**
 * @author Kris | 23/10/2021
 */
@Data
public class HintArrowEvent {
    private final int playerIndex;
    private final int npcIndex;
    private final int hintArrowX;
    private final int hintArrowY;
    private final int hintArrowHeight;
}
