package net.runelite.rs.api;

import net.runelite.api.Actor;
import net.runelite.mapping.Import;

public interface RSActorSpotAnim extends RSRenderable, Actor
{
	@Import("spotAnimationHeight")
	@Override
	int getGraphicHeight();

	@Import("spotAnimationHeight")
	@Override
	void setGraphicHeight(int id);

	@Import("spotAnimationFrame")
	int getSpotAnimFrame();

	@Import("spotAnimationFrame")
	@Override
	void setSpotAnimFrame(int id);

	@Import("spotAnimationFrameCycle")
	int getSpotAnimationFrameCycle();
}