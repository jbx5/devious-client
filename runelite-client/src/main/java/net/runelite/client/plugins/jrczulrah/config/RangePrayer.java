package net.runelite.client.plugins.jrczulrah.config;

import com.google.inject.Inject;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import net.runelite.api.Prayer;
import net.runelite.client.plugins.jrczulrah.JRCZulrahConfig;

@RequiredArgsConstructor
public enum RangePrayer
{
    RIGOUR(Prayer.RIGOUR),
    EAGLE_EYE(Prayer.EAGLE_EYE)
    ;
    @Inject
    private JRCZulrahConfig config;
    @Getter
    private final Prayer prayer;
}