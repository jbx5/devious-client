package dev.hoot.bot.managers;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import dev.hoot.api.events.NPCCompositionChanged;
import dev.hoot.api.game.Game;
import dev.hoot.api.game.Vars;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.*;
import net.runelite.api.events.*;
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
    private static final Map<Integer, Integer> VARBIT_TO_ENTITYID = new HashMap<>();
    private static final Map<Integer, TileObject> TRANSFORMING_OBJECTS = new HashMap<>();

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
            VARBIT_TO_ENTITYID.put(composition.getTransformVarbit(), event.getNpcIndex());

            if (Vars.getBit(composition.getTransformVarbit()) != 0)
            {
                npc.setTransformedComposition(composition.transform());
            }
        }
    }

    @Subscribe
    private void onSpawn(GameObjectSpawned event)
    {
        checkTransformObject(event.getGameObject());
    }

    @Subscribe
    private void onChange(GameObjectChanged event)
    {
        checkTransformObject(event.getGameObject());
    }

    @Subscribe
    private void onDespawn(GameObjectDespawned event)
    {
        TRANSFORMING_OBJECTS.remove(event.getGameObject().getId());
    }

    @Subscribe
    private void onSpawn(WallObjectSpawned event)
    {
        checkTransformObject(event.getWallObject());
    }

    @Subscribe
    private void onChange(WallObjectSpawned event)
    {
        checkTransformObject(event.getWallObject());
    }

    @Subscribe
    private void onDespawn(WallObjectDespawned event)
    {
        TRANSFORMING_OBJECTS.remove(event.getWallObject().getId());
    }

    @Subscribe
    private void onSpawn(DecorativeObjectSpawned event)
    {
        checkTransformObject(event.getDecorativeObject());
    }

    @Subscribe
    private void onChange(DecorativeObjectChanged event)
    {
        checkTransformObject(event.getDecorativeObject());
    }

    @Subscribe
    private void onDespawn(DecorativeObjectDespawned event)
    {
        TRANSFORMING_OBJECTS.remove(event.getDecorativeObject().getId());
    }

    @Subscribe
    private void onSpawn(GroundObjectSpawned event)
    {
        checkTransformObject(event.getGroundObject());
    }

    @Subscribe
    private void onChange(GroundObjectChanged event)
    {
        checkTransformObject(event.getGroundObject());
    }

    @Subscribe
    private void onDespawn(GroundObjectDespawned event)
    {
        TRANSFORMING_OBJECTS.remove(event.getGroundObject().getId());
    }

    @Subscribe
    private void onItemSpawn(ItemSpawned event)
    {
        client.cacheItem(event.getItem().getId(), client.getItemDefinition(event.getItem().getId()));
    }

    @Subscribe
    private void onItemContainerChanged(ItemContainerChanged event)
    {
        ItemContainer container = event.getItemContainer();
        if (container == null)
        {
            return;
        }

        for (Item item : container.getItems())
        {
            if (item == null)
            {
                continue;
            }

            client.cacheItem(item.getId(), client.getItemDefinition(item.getId()));
        }
    }

    @Subscribe
    private void onGameStateChanged(GameStateChanged gameStateChanged)
    {
        switch (gameStateChanged.getGameState())
        {
            case LOGIN_SCREEN:
            case HOPPING:
                client.clearDefinitionCaches();
                break;
        }
    }

    @Subscribe
    private void onVarbitChanged(VarbitChanged e)
    {
        var changedVarbits = VARBITS.get(e.getIndex());
        for (int varbitId : changedVarbits)
        {
            if (!VARBIT_TO_ENTITYID.containsKey(varbitId))
            {
                continue;
            }

            int configValue = Vars.getBit(varbitId);
            int entityId = VARBIT_TO_ENTITYID.get(varbitId);

            if (entityId < client.getCachedNPCs().length)
            {
                NPC npc = client.getCachedNPCs()[entityId];
                if (npc != null && npc.getComposition() != null)
                {
                    if (configValue == 0)
                    {
                        log.debug("NPC {} reverted to default state", entityId);
                        npc.setTransformedComposition(null);
                    }
                    else
                    {
                        log.debug("NPC {} transformed", entityId);
                        npc.setTransformedComposition(npc.getComposition().transform());
                    }

                    return;
                }
            }

            ObjectComposition objectComposition = client.getObjectDefinition(entityId);
            TileObject cachedObject = TRANSFORMING_OBJECTS.get(entityId);
            if (objectComposition != null && cachedObject != null)
            {
                cachedObject.setTransformedComposition(objectComposition.getImpostor());

                if (configValue == 0)
                {
                    log.debug("Object {} reverted to default state", entityId);
                }
                else
                {
                    log.debug("Object {} transformed", entityId);
                }
            }
        }
    }

    private void checkTransformObject(TileObject object)
    {
        if (object == null)
        {
            return;
        }

        ObjectComposition composition = client.getObjectDefinition(object.getId());
        if (composition == null)
        {
            return;
        }

        if (composition.getImpostorIds() != null && composition.getTransformVarbit() != -1)
        {
            VARBIT_TO_ENTITYID.put(composition.getTransformVarbit(), object.getId());
            TRANSFORMING_OBJECTS.put(object.getId(), object);

            if (Vars.getBit(composition.getTransformVarbit()) != 0)
            {
                object.setTransformedComposition(composition.getImpostor());
            }
            else
            {
                object.setTransformedComposition(composition);
            }
        }
        else
        {
            object.setTransformedComposition(composition);
        }
    }
}
