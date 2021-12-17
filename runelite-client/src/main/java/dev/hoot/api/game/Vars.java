package dev.hoot.api.game;

import net.runelite.api.VarClientInt;
import net.runelite.api.VarClientStr;
import net.runelite.api.Varbits;

public class Vars {
    public static int getBit(int id) {
        return GameThread.invokeLater(() -> Game.getClient().getVarbitValue(Game.getClient().getVarps(), id));
    }

    public static int getBit(Varbits varbits) {
        return getBit(varbits.getId());
    }

    public static int getVarp(int id) {
        return Game.getClient().getVarpValue(Game.getClient().getVarps(), id);
    }

    public static int getVarcInt(VarClientInt varClientInt) {
        return Game.getClient().getVar(varClientInt);
    }

    public static String getVarcStr(VarClientStr varClientStr) {
        return Game.getClient().getVar(varClientStr);
    }
}
