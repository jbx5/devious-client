package dev.hoot.bot.managers;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import dev.hoot.api.events.NPCCompositionChanged;
import dev.hoot.api.game.Game;
import dev.hoot.api.game.Vars;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.*;
import net.runelite.api.events.VarbitChanged;
import net.runelite.client.callback.ClientThread;
import net.runelite.client.eventbus.Subscribe;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.HashMap;
import java.util.Map;

@Singleton
@Slf4j
public class DefinitionManager
{
    @Inject
    private Client client;

    @Inject
    private ClientThread clientThread;

    private static final Multimap<Integer, Integer> VARBITS = HashMultimap.create();
    private static final Map<Integer, Integer> VARBIT_TO_NPCINDEX = new HashMap<>();

    public void init()
    {
        clientThread.invoke(() ->
        {
            IndexDataBase indexVarbits = client.getIndexConfig();
            final int[] varbitIds = indexVarbits.getFileIds(14);
            for (int id : varbitIds)
            {
                VarbitComposition varbit = client.getVarbit(id);
                if (varbit != null)
                {
                    VARBITS.put(varbit.getIndex(), id);
                }
            }
        });
    }

    @Subscribe
    private void onNpcCompositionChanged(NPCCompositionChanged event)
    {
        NPC npc = Game.getClient().getCachedNPCs()[event.getNpcIndex()];
        if (npc == null)
        {
            return;
        }

        NPCComposition composition = npc.getComposition();
        if (composition != null
                && composition.getTransformVarbit() != -1
                && composition.getConfigs() != null)
        {
            VARBIT_TO_NPCINDEX.put(composition.getTransformVarbit(), event.getNpcIndex());

            if (Vars.getBit(composition.getTransformVarbit()) != 0)
            {
                npc.setTransformedComposition(composition.transform());
            }
        }
    }

    @Subscribe
    private void onVarbitChanged(VarbitChanged e)
    {
        var changedVarbits = VARBITS.get(e.getIndex());
        for (int varbitId : changedVarbits)
        {
            if (!VARBIT_TO_NPCINDEX.containsKey(varbitId))
            {
                continue;
            }

            int npcIndex = VARBIT_TO_NPCINDEX.get(varbitId);
            int configValue = Vars.getBit(varbitId);
            NPC npc = client.getCachedNPCs()[npcIndex];
            if (npc == null || npc.getComposition() == null)
            {
                continue;
            }

            if (configValue == 0)
            {
                log.debug("NPC {} reverted to default state", npc);
                npc.setTransformedComposition(null);
            }
            else
            {
                log.debug("NPC {} transformed", npc);
                npc.setTransformedComposition(npc.getComposition().transform());
            }
        }
    }
}
