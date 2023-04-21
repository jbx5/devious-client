package net.runelite.client.plugins.jrcbirdhouses.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import net.runelite.api.ItemID;

import javax.annotation.Nullable;

@RequiredArgsConstructor
@Getter
public enum BirdHouseType
{
    NORMAL("Bird House", ItemID.BIRD_HOUSE, ItemID.LOGS),
    OAK("Oak Bird House", ItemID.OAK_BIRD_HOUSE, ItemID.OAK_LOGS),
    WILLOW("Willow Bird House", ItemID.WILLOW_BIRD_HOUSE, ItemID.WILLOW_LOGS),
    TEAK("Teak Bird House", ItemID.TEAK_BIRD_HOUSE, ItemID.TEAK_LOGS),
    MAPLE("Maple Bird House", ItemID.MAPLE_BIRD_HOUSE, ItemID.MAPLE_LOGS),
    MAHOGANY("Mahogany Bird House", ItemID.MAHOGANY_BIRD_HOUSE, ItemID.MAHOGANY_LOGS),
    YEW("Yew Bird House", ItemID.YEW_BIRD_HOUSE, ItemID.YEW_LOGS),
    MAGIC("Magic Bird House", ItemID.MAGIC_BIRD_HOUSE, ItemID.MAGIC_LOGS),
    REDWOOD("Redwood Bird House", ItemID.REDWOOD_BIRD_HOUSE, ItemID.REDWOOD_LOGS);

    private final String name;
    private final int itemId;
    private final int logItemId;

    @Nullable
    public static BirdHouseType fromVarpValue(int varp)
    {
        int index = (varp - 1) / 3;

        if (varp <= 0 || index >= values().length)
        {
            return null;
        }

        return values()[index];
    }
}