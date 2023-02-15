package net.runelite.api.events;

import lombok.Data;

/**
 * @author Kris | 24/10/2021
 */
@Data
public class ServerPacketReadCompleteEvent {
    public static final ServerPacketReadCompleteEvent INSTANCE = new ServerPacketReadCompleteEvent();
}
