/*
 * Copyright (c) 2024, Melxin <https://github.com/melxin>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.deob.deobfuscators.mapping.packets;

import com.google.common.base.Stopwatch;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import net.runelite.asm.Annotation;
import net.runelite.asm.ClassFile;
import net.runelite.asm.ClassGroup;
import net.runelite.asm.Field;
import net.runelite.asm.Type;
import net.runelite.deob.DeobAnnotations;
import net.runelite.deob.DeobProperties;
import net.runelite.deob.deobfuscators.Renamer;
import net.runelite.deob.deobfuscators.mapping.ParallelExecutorMapping;
import net.runelite.deob.util.NameMappings;

/**
 * Map server & client packets
 *
 * Thanks to mod weath for providing the mapped server and client packets
 */
public class ModWeathPacketsParser implements Runnable
{
	// Update COMPATIBLE_REVISION, SERVER_PACKETS and CLIENT_PACKETS each revision
	private static final String COMPATIBLE_REVISION = "226";

	private static final Map<String, String> SERVER_PACKETS = List.of(
		"UPDATE_REBOOT_TIMER,field3441,5",
		"LOGOUT,field3456,8",
		"REBUILD_REGION,field3461,9",
		"CHAT_FILTER_SETTINGS,field3446,10",
		"TRIGGER_ONDIALOG_ABORT,field3448,12",
		"GRAPHICSOBJECT_SPAWN,field3451,15",
		"RESET_CLIENT_VARCACHE,field3452,16",
		"MESSAGE_PRIVATE_ECHO,field3454,18",
		"SET_PLAYER_OP,field3460,19",
		"MESSAGE_PRIVATE,field3445,21",
		"UPDATE_ZONE_FULL_FOLLOWS,field3459,23",
		"UPDATE_INV_PARTIAL,field3543,24",
		"IF_CLOSESUB,field3522,25",
		"UPDATE_INV_FULL,field3462,26",
		"UPDATE_ZONE_PARTIAL_ENCLOSED,field3467,31",
		"UPDATE_IGNORELIST,field3472,36",
		"CAM_SETANGLE,field3525,39",
		"CAM_MOVETO,field3476,40",
		"MESSAGE_GAME,field3483,47",
		"PROJECTILE_SPAWN_OLD,field3484,48",
		"VARP_LARGE,field3486,50",
		"SYNC_CLIENT_VARCACHE,field3571,51",
		"DYNAMICOBJECT_SPAWN,field3489,53",
		"UPDATE_STOCKMARKET_SLOT,field3491,55",
		"IF_SETHIDE,field3493,57",
		"IF_SETCOLOUR,field3494,58",
		"IF_SETMODEL,field3495,59",
		"UPDATE_UID192,field3444,61",
		"PLAYER_INFO,field3499,63",
		"LOGOUT_FULL,field3549,68",
		"UPDATE_STAT,field3532,70",
		"IF_MOVESUB,field3507,71",
		"UPDATE_INV_STOP_TRANSIT,field3508,72",
		"REFLECTION_CHECKER,field3514,78",
		"IF_SETPLAYERHEAD,field3515,79",
		"NPC_SET_SEQUENCE,field3517,81",
		"SET_PRIVCHATMODE,field3443,82",
		"NPC_SPOTANIM,field3519,83",
		"IF_SETSCROLLPOS,field3502,91",
		"HINT_ARROW,field3531,95",
		"MINIMAP_TOGGLE,field3565,96",
		"RUNCLIENTSCRIPT,field3533,97",
		"MESSAGE_FRIENDS_CHAT,field3534,98",
		"URL_OPEN,field3535,99",
		"VARP_SMALL,field3575,101",
		"EVENT_WORLDHOP,field3471,103",
		"UPDATE_INV_CLEAR,field3542,106",
		"CAM_LOOKAT,field3544,108",
		"REBUILD_NORMAL,field3545,109",
		"MINIMAP_FLAG_SET,field3548,112",
		"IF_SETOBJECT,field3550,114",
		"IF_SETNPCHEAD,field3582,115",
		"PLAYER_SPOTANIM,field3552,116",
		"IF_SETPOSITION,field3553,117",
		"PING_STATISTICS_REQUEST,field3554,118",
		"CAM_RESET,field3557,121",
		"UPDATE_FRIENDLIST,field3500,122",
		"IF_SETANGLE,field3560,124",
		"PROJECTILE_SPAWN,field3457,135"
	).stream()
		.map(s -> s.split(","))
		.filter(s -> s.length >= 2)
		.collect(Collectors.toMap(s -> s[1].trim(), s -> s[0].trim()));

	private static final Map<String, String> CLIENT_PACKETS = List.of(
		"EVENT_MOUSE_IDLE,field3313,2",
		"OPPLAYER7,field3314,3",
		"IF_BUTTON2,field3328,5",
		"OPPLAYERT,field3384,8",
		"OPOBJ2,field3312,9",
		"OPLOC1,field3321,10",
		"REFLECTION_CHECK_REPLY,field3323,12",
		"IF_BUTTON1,field3380,13",
		"OPOBJE,field3325,14",
		"OPPLAYER1,field3352,15",
		"OPNPC2,field3372,16",
		"RESUME_COUNTDIALOG,field3353,17",
		"IF_BUTTON3,field3329,18",
		"FRIEND_DELUSER,field3356,19",
		"NO_TIMEOUT,field3331,20",
		"IF_BUTTON8,field3334,23",
		"EVENT_WINDOW_SETTING,field3335,24",
		"MOVE_GAMECLICK,field3336,25",
		"OPOBJ1,field3337,26",
		"CHAT_SENDABUSEREPORT,field3339,28",
		"CLOSE_MODAL,field3340,29",
		"OPOBJ5,field3341,30",
		"OPNPCT,field3342,31",
		"DOCHEAT,field3343,32",
		"IF_SUBOP,field3344,33",
		"OPNPC3,field3345,34",
		"EVENT_KEYBOARD,field3365,36",
		"EVENT_APPLET_FOCUS,field3348,37",
		"OPLOC3,field3351,40",
		"IF_BUTTON5,field3362,41",
		"OPPLAYER6,field3390,43",
		"OPPLAYER8,field3355,44",
		"OPNPCE,field3324,45",
		"IF_BUTTON7,field3357,46",
		"OPLOC5,field3358,47",
		"OPPLAYER3,field3360,49",
		"DETECT_MODIFIED_CLIENT,field3361,50",
		"OPLOC4,field3373,51",
		"OPLOCT,field3363,52",
		"OPPLAYER5,field3364,53",
		"RESUME_PAUSEBUTTON,field3354,54",
		"EVENT_MOUSE_CLICK,field3366,55",
		"IF_BUTTON6,field3367,56",
		"OPNPC1,field3393,58",
		"LOGIN_TIMINGS,field3370,59",
		"CHAT_SENDPRIVATE,field3371,60",
		"OPHELDD,field3369,61",
		"RESUME_NAMEDIALOG,field3374,63",
		"OPNPC5,field3375,64",
		"IF_BUTTONT,field3376,65",
		"CHAT_SETFILTER,field3377,66",
		"PING_STATISTICS,field3378,67",
		"MINIMAP_CLICK,field3386,72",
		"WIDGET_TYPE,field3347,73",
		"RESUME_STRINGDIALOG,field3311,74",
		"IF_BUTTON4,field3346,75",
		"OPLOCE,field3389,78",
		"IF_BUTTON9,field3401,79",
		"OPOBJ4,field3391,80",
		"RESUME_OBJDIALOG,field3396,82",
		"OPPLAYER2,field3395,84",
		"IGNORE_DELUSER,field3316,86",
		"OPOBJT,field3399,88",
		"CLAN_KICKUSER,field3320,90",
		"OPPLAYER4,field3403,92",
		"IF_BUTTON10,field3404,93",
		"EVENT_CAMERA_POSITION,field3405,94",
		"OPLOC2,field3406,95",
		"OPNPC4,field3319,98",
		"OPOBJ3,field3411,100"
	).stream()
		.map(s -> s.split(","))
		.filter(s -> s.length >= 2)
		.collect(Collectors.toMap(s -> s[1].trim(), s -> s[0].trim()));

	private static final Logger logger = LoggerFactory.getLogger(ModWeathPacketsParser.class);

	private final ParallelExecutorMapping mapping;
	private final ClassGroup namedGroup;
	private final ClassGroup targetGroup;

	private final ClassFile namedServerPacketCF;
	private final ClassFile targetServerPacketCF;

	private final ClassFile namedClientPacketCF;
	private final ClassFile targetClientPacketCF;

	private final Type SERVER_PACKET_TYPE;
	private final Type CLIENT_PACKET_TYPE;

	private final NameMappings newNameMappings;

	public ModWeathPacketsParser(ParallelExecutorMapping mapping, ClassGroup group1, ClassGroup group2)
	{
		this.mapping = mapping;
		this.namedGroup = group1;
		this.targetGroup = group2;

		this.namedServerPacketCF = namedGroup.findClass("ServerPacket");
		this.targetServerPacketCF = (ClassFile) mapping.getMap().get(namedServerPacketCF);

		this.namedClientPacketCF = namedGroup.findClass("ClientPacket");
		this.targetClientPacketCF = (ClassFile) mapping.getMap().get(namedClientPacketCF);

		this.SERVER_PACKET_TYPE = new Type("LServerPacket;");
		this.CLIENT_PACKET_TYPE = new Type("LClientPacket;");

		this.newNameMappings = new NameMappings();
	}

	@Override
	public void run()
	{
		if (!DeobProperties.getRevision().equals(COMPATIBLE_REVISION))
		{
			logger.warn("Invalid packet data, update required!");
			return;
		}

		Stopwatch stopwatch = Stopwatch.createStarted();

		// Server packets
		if (!SERVER_PACKETS.isEmpty())
		{
			targetServerPacketCF.getFields().stream()
				.filter(f -> f.getType().equals(SERVER_PACKET_TYPE))
				.forEach(targetServerPacketField ->
				{
					if (SERVER_PACKETS.containsKey(targetServerPacketField.getName()))
					{
						logger.info("Mapping server packet: {} -> {}", targetServerPacketField.getName(), SERVER_PACKETS.get(targetServerPacketField.getName()));
						newNameMappings.map(targetServerPacketField.getPoolField(), SERVER_PACKETS.get(targetServerPacketField.getName()));
					}
				});
		}

		// Client packets
		if (!CLIENT_PACKETS.isEmpty())
		{
			targetClientPacketCF.getFields().stream()
				.filter(f -> f.getType().equals(CLIENT_PACKET_TYPE))
				.forEach(targetClientPacketField ->
				{
					if (CLIENT_PACKETS.containsKey(targetClientPacketField.getName()))
					{
						logger.info("Mapping client packet: {} -> {}", targetClientPacketField.getName(), CLIENT_PACKETS.get(targetClientPacketField.getName()));
						newNameMappings.map(targetClientPacketField.getPoolField(), CLIENT_PACKETS.get(targetClientPacketField.getName()));
					}
				});
		}

		/**
		 * Renamer
		 */
		new Renamer(newNameMappings).run(targetGroup);

		/**
		 * Remove export annotations
		 */
		targetServerPacketCF.getFields().stream().filter(f -> f.isStatic() && f.getType().equals(new Type("L" + targetServerPacketCF.getName() + ";"))).forEach(clp ->
		{
			Map<Type, Annotation> cfAnnotations = clp.getAnnotations();
			cfAnnotations.keySet().stream().filter(k -> k.equals(DeobAnnotations.EXPORT)).collect(Collectors.toList()).forEach(cfAnnotations::remove);
		});

		targetClientPacketCF.getFields().stream().filter(f -> f.isStatic() && f.getType().equals(new Type("L" + targetClientPacketCF.getName() + ";"))).forEach(clp ->
		{
			Map<Type, Annotation> cfAnnotations = clp.getAnnotations();
			cfAnnotations.keySet().stream().filter(k -> k.equals(DeobAnnotations.EXPORT)).collect(Collectors.toList()).forEach(cfAnnotations::remove);
		});

		/**
		 * Unable to map
		 */
		for (Field f : namedServerPacketCF.getFields())
		{
			if (f.getName().startsWith("field") || !f.getType().equals(SERVER_PACKET_TYPE))
			{
				continue;
			}
			if (!newNameMappings.getMap().containsValue(f.getName()))
			{
				logger.error("Unable to map server packet: {}", f.getName());
			}
		}

		for (Field f : namedClientPacketCF.getFields())
		{
			if (f.getName().startsWith("field") || !f.getType().equals(CLIENT_PACKET_TYPE))
			{
				continue;
			}
			if (!newNameMappings.getMap().containsValue(f.getName()))
			{
				logger.error("Unable to map client packet: {}", f.getName());
			}
		}

		logger.info("Took: {}", stopwatch);
	}
}