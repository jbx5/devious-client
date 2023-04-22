package net.runelite.rs.api;

import net.runelite.api.ActorSpotAnim;
import net.runelite.mapping.Import;

public interface RSActorSpotAnim extends ActorSpotAnim
{
	@Import("spotAnimation")
	@Override
	int getId();

	@Import("spotAnimation")
	@Override
	void setId(int id);

    @Import("spotAnimationHeight")
    @Override
	int getHeight();

    @Import("spotAnimationHeight")
    @Override
	void setHeight(int id);

    @Import("spotAnimationFrame")
	@Override
	int getFrame();

    @Import("spotAnimationFrame")
    @Override
	void setFrame(int id);

    @Import("spotAnimationFrameCycle")
	@Override
    int getSpotAnimationFrameCycle();
}