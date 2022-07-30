package net.runelite.api.events;

import lombok.Data;

/**
 * An event that is fired when a screenshot is taken
 */
@Data
public class ImageCaptured
{
    private final String fileName;
    private final String directory;
}
