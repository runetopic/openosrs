package net.runelite.rs.api;

import net.runelite.mapping.Import;

public interface RSCoord
{
	@Import("x")
	int getX();

	@Import("y")
	int getY();

	@Import("plane")
	int getPlane();
}
