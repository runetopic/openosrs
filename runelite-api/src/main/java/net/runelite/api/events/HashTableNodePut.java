package net.runelite.api.events;

import lombok.Data;
import net.runelite.api.HashTable;
import net.runelite.api.Node;

/**
 * @author Kris | 23/10/2021
 */
@Data
public class HashTableNodePut {
    private final HashTable<? extends Node> hashTable;
    private final Node node;
    private final long value;
}
