package net.runelite.client.events;

import lombok.Data;

/**
 * @author Kris | 03/02/2022
 */
@Data
public class SoundEffectReceived {
    private int id;
    private int repetitions;
    private int delay;
}
