package dev.hoot.api.movement.pathfinder;

import dev.hoot.api.game.Skills;
import dev.hoot.api.game.Vars;
import dev.hoot.api.game.Worlds;
import dev.hoot.api.magic.Magic;
import dev.hoot.api.magic.Regular;
import dev.hoot.api.magic.Rune;
import dev.hoot.api.magic.Spell;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldPoint;

public enum TeleportSpell {
    VARROCK_TELEPORT(
            Magic.SpellBook.REGULAR,
            Regular.VARROCK_TELEPORT,
            25,
            new WorldPoint(3212, 3424, 0),
            false,
            "Varrock Teleport",
            new RuneRequirement(1, Rune.LAW),
            new RuneRequirement(3, Rune.AIR),
            new RuneRequirement(1, Rune.FIRE)),
    LUMBRIDGE_TELEPORT(
            Magic.SpellBook.REGULAR,
            Regular.LUMBRIDGE_TELEPORT,
            31,
            new WorldPoint(3225, 3219, 0),
            false,
            "Lumbridge Teleport",
            new RuneRequirement(1, Rune.LAW),
            new RuneRequirement(3, Rune.AIR),
            new RuneRequirement(1, Rune.EARTH)),
    FALADOR_TELEPORT(
            Magic.SpellBook.REGULAR,
            Regular.FALADOR_TELEPORT,
            37,
            new WorldPoint(2966, 3379, 0),
            false,
            "Falador Teleport",
            new RuneRequirement(1, Rune.LAW),
            new RuneRequirement(3, Rune.AIR),
            new RuneRequirement(1, Rune.WATER)),
    CAMELOT_TELEPORT(
            Magic.SpellBook.REGULAR,
            Regular.CAMELOT_TELEPORT,
            45,
            new WorldPoint(2757, 3479, 0),
            true,
            "Camelot Teleport",
            new RuneRequirement(1, Rune.LAW),
            new RuneRequirement(5, Rune.AIR)),
    ARDOUGNE_TELEPORT(
            Magic.SpellBook.REGULAR,
            Regular.ARDOUGNE_TELEPORT,
            51,
            new WorldPoint(2661, 3300, 0),
            true,
            "Ardougne Teleport",
            new RuneRequirement(2, Rune.LAW),
            new RuneRequirement(2, Rune.WATER))
    ;

    private final Magic.SpellBook spellBook;
    private final Spell spell;
    private final int requiredLevel;
    private final WorldPoint point;
    private final boolean members;
    private final String spellName;
    private final RuneRequirement[] requirements;

    TeleportSpell(Magic.SpellBook spellBook, Spell spell, int level, WorldPoint point, boolean members, String spellName, RuneRequirement... requirements) {
        this.spellBook = spellBook;
        this.spell = spell;
        this.requiredLevel = level;
        this.point = point;
        this.members = members;
        this.spellName = spellName;
        this.requirements = requirements;
    }

    public Magic.SpellBook getSpellBook() {
        return spellBook;
    }

    public Spell getSpell() {
        return spell;
    }

    public int getRequiredLevel() {
        return requiredLevel;
    }

    public WorldPoint getPoint() {
        return point;
    }

    public boolean isMembers() {
        return members;
    }

    public String getSpellName() {
        return spellName;
    }

    public RuneRequirement[] getRequirements() {
        return requirements;
    }

    public boolean canCast() {
        if (Magic.SpellBook.getCurrent() != spellBook) {
            return false;
        }

        if (members && !Worlds.inMembersWorld()) {
            return false;
        }

        if (requiredLevel > Skills.getLevel(Skill.MAGIC)) {
            return false;
        }

        if (this == ARDOUGNE_TELEPORT && Vars.getVarp(165) < 30) {
            return false;
        }

        return haveRunesAvailable();
    }

    public boolean haveRunesAvailable() {
        for (RuneRequirement req : requirements) {
            if (!req.meetsRequirements()) {
                return false;
            }
        }

        return true;
    }
}
