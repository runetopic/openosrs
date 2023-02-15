package net.runelite.client.events;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author Kris | 07/04/2022
 */
@Data
@AllArgsConstructor
public class RunEnergyChangedEvent {
    private int newEnergy;
}
