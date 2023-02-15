package net.runelite.api.events;

import lombok.Data;

/**
 * @author Kris | 26/10/2021
 */
@Data
public class PlayerMenuOptionChanged {
    private final int index;
    private final String option;
    private final boolean priority;
}
