package net.runelite.client.plugins.jrczulrah.data.phases;

import com.google.inject.Inject;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import net.runelite.client.plugins.jrczulrah.JRCZulrahConfig;

@Getter
@RequiredArgsConstructor
public class ZulrahTree
{
    @Inject
    private JRCZulrahConfig config;
    private final ZulrahNode root;
}