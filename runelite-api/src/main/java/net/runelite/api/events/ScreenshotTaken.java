package net.runelite.api.events;

import lombok.Data;

/**
 * An event that is fired when a screenshot is taken
 */
@Data
public class ScreenshotTaken
{
    private final String fileName;
    private final String directory;
}
