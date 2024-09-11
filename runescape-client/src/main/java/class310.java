import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lj")
public abstract class class310 implements class312 {
	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "Lvw;"
	)
	@Export("rasterProvider")
	public static AbstractRasterProvider rasterProvider;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 935359149
	)
	protected int field3279;

	@ObfuscatedSignature(
		descriptor = "(Lob;Lpx;I)V"
	)
	protected class310(StudioGame var1, Language var2, int var3) {
		this.field3279 = var3;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)[Lmj;",
		garbageValue = "-1207228854"
	)
	@Export("ServerPacket_values")
	public static ServerPacket[] ServerPacket_values() {
		return new ServerPacket[]{ServerPacket.field3442, ServerPacket.SET_PLAYER_OP, ServerPacket.PLAYER_INFO, ServerPacket.field3473, ServerPacket.UPDATE_INV_CLEAR, ServerPacket.UPDATE_ZONE_PARTIAL_ENCLOSED, ServerPacket.field3439, ServerPacket.field3440, ServerPacket.UPDATE_STAT, ServerPacket.field3484, ServerPacket.UPDATE_ZONE_FULL_FOLLOWS, ServerPacket.field3570, ServerPacket.field3445, ServerPacket.field3446, ServerPacket.field3447, ServerPacket.MINIMAP_FLAG_SET, ServerPacket.MESSAGE_PRIVATE, ServerPacket.field3450, ServerPacket.field3472, ServerPacket.IF_SETCOLOUR, ServerPacket.field3453, ServerPacket.PROJECTILE_SPAWN, ServerPacket.CHAT_FILTER_SETTINGS, ServerPacket.field3511, ServerPacket.field3457, ServerPacket.VARP_SMALL, ServerPacket.UPDATE_INV_FULL, ServerPacket.IF_CLOSESUB, ServerPacket.IF_SETOBJECT, ServerPacket.field3462, ServerPacket.field3463, ServerPacket.GRAPHICSOBJECT_SPAWN, ServerPacket.field3558, ServerPacket.field3466, ServerPacket.MESSAGE_FRIENDS_CHAT, ServerPacket.field3468, ServerPacket.field3469, ServerPacket.field3470, ServerPacket.IF_SETPLAYERHEAD, ServerPacket.field3509, ServerPacket.REBUILD_NORMAL, ServerPacket.field3474, ServerPacket.RESET_CLIENT_VARCACHE, ServerPacket.DYNAMICOBJECT_SPAWN, ServerPacket.field3451, ServerPacket.field3478, ServerPacket.TRIGGER_ONDIALOG_ABORT, ServerPacket.UPDATE_REBOOT_TIMER, ServerPacket.field3481, ServerPacket.MESSAGE_PRIVATE_ECHO, ServerPacket.field3565, ServerPacket.field3541, ServerPacket.field3485, ServerPacket.VARP_LARGE, ServerPacket.field3487, ServerPacket.field3476, ServerPacket.field3489, ServerPacket.IF_SETHIDE, ServerPacket.field3491, ServerPacket.LOGOUT_FULL, ServerPacket.field3499, ServerPacket.UPDATE_FRIENDLIST, ServerPacket.CAM_SETANGLE, ServerPacket.field3496, ServerPacket.IF_SETANGLE, ServerPacket.field3498, ServerPacket.CAM_RESET, ServerPacket.LOGOUT, ServerPacket.field3501, ServerPacket.REFLECTION_CHECKER, ServerPacket.CAM_MOVETO, ServerPacket.UPDATE_INV_PARTIAL, ServerPacket.field3505, ServerPacket.CAM_LOOKAT, ServerPacket.UPDATE_INV_STOP_TRANSIT, ServerPacket.field3508, ServerPacket.field3512, ServerPacket.UPDATE_STOCKMARKET_SLOT, ServerPacket.RUNCLIENTSCRIPT, ServerPacket.SYNC_CLIENT_VARCACHE, ServerPacket.MESSAGE_GAME, ServerPacket.field3467, ServerPacket.SET_PRIVCHATMODE, ServerPacket.field3516, ServerPacket.URL_OPEN, ServerPacket.field3531, ServerPacket.field3514, ServerPacket.IF_SETPOSITION, ServerPacket.field3433, ServerPacket.field3522, ServerPacket.IF_SETMODEL, ServerPacket.IF_SETSCROLLPOS, ServerPacket.field3525, ServerPacket.field3537, ServerPacket.field3527, ServerPacket.REBUILD_REGION, ServerPacket.field3479, ServerPacket.IF_SETNPCHEAD, ServerPacket.field3483, ServerPacket.field3532, ServerPacket.field3500, ServerPacket.MINIMAP_TOGGLE, ServerPacket.field3535, ServerPacket.HINT_ARROW, ServerPacket.field3444, ServerPacket.NPC_INFO_LARGE_VIEWPORT_2, ServerPacket.field3539, ServerPacket.field3449, ServerPacket.UPDATE_IGNORELIST, ServerPacket.NPC_INFO_SMALL_VIEWPORT_1, ServerPacket.field3456, ServerPacket.NPC_SET_SEQUENCE, ServerPacket.PING_STATISTICS_REQUEST, ServerPacket.field3475, ServerPacket.field3547, ServerPacket.field3548, ServerPacket.PLAYER_SPOTANIM, ServerPacket.IF_MOVESUB, ServerPacket.field3551, ServerPacket.NPC_SPOTANIM, ServerPacket.field3553, ServerPacket.field3554, ServerPacket.EVENT_WORLDHOP, ServerPacket.field3556, ServerPacket.MIDI_SONG, ServerPacket.field3493, ServerPacket.field3559, ServerPacket.UPDATE_UID192, ServerPacket.field3561, ServerPacket.field3519, ServerPacket.field3563, ServerPacket.field3503, ServerPacket.field3538, ServerPacket.field3562, ServerPacket.field3567, ServerPacket.field3568, ServerPacket.field3569};
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "([FB)V",
		garbageValue = "1"
	)
	static void method6339(float[] var0) {
		var0[1] = 1.0F - var0[1];
		if (var0[0] < 0.0F) {
			var0[0] = 0.0F;
		}

		if (var0[1] < 0.0F) {
			var0[1] = 0.0F;
		}

		if (var0[0] > 1.0F || var0[1] > 1.0F) {
			float var1 = var0[0] * (var0[0] - 2.0F + var0[1]) + var0[1] * (var0[1] - 2.0F) + 1.0F;
			if (class133.field1561 + var1 > 0.0F) {
				class180.method3807(var0);
			}
		}

		var0[1] = 1.0F - var0[1];
	}

	@ObfuscatedName("oq")
	@ObfuscatedSignature(
		descriptor = "(Lny;B)I",
		garbageValue = "5"
	)
	@Export("getWidgetFlags")
	static int getWidgetFlags(Widget var0) {
		IntegerNode var1 = (IntegerNode)Client.widgetFlags.get(((long)var0.id << 32) + (long)var0.childIndex);
		return var1 != null ? var1.integer : var0.flags;
	}

	@ObfuscatedName("pk")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-72"
	)
	static void method6340() {
		for (int var0 = 0; var0 < Client.field809.size(); ++var0) {
			int var2 = (Integer)Client.field809.get(var0);
			class145 var3 = GameEngine.method658(var2);
			int var1;
			if (var3 == null) {
				var1 = 2;
			} else {
				var1 = var3.method3396() ? 0 : 1;
			}

			if (var1 != 2) {
				Client.field809.remove(var0);
				--var0;
			}
		}

	}
}
