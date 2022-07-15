package net.unethicalite.api;

import net.runelite.api.Locatable;

public interface SceneEntity extends Locatable, Identifiable, Interactable, EntityNameable
{
    long getTag();
}
