import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("fd")
@Implements("FloorUnderlayDefinition")
public class FloorUnderlayDefinition extends DualNode {
	@ObfuscatedName("ss")
	@ObfuscatedSignature(descriptor = "Lqe;")
	@Export("sceneMinimapSprite")
	static SpritePixels sceneMinimapSprite;

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "Llh;")
	@Export("FloorUnderlayDefinition_archive")
	public static AbstractArchive FloorUnderlayDefinition_archive;

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "Lii;")
	@Export("FloorUnderlayDefinition_cached")
	public static EvictingDualNodeHashTable FloorUnderlayDefinition_cached;

	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = -1886230441)
	@Export("rgb")
	int rgb;

	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = -1580613665)
	@Export("hue")
	public int hue;

	@ObfuscatedName("j")
	@ObfuscatedGetter(intValue = -957882951)
	@Export("saturation")
	public int saturation;

	@ObfuscatedName("e")
	@ObfuscatedGetter(intValue = 900719109)
	@Export("lightness")
	public int lightness;

	@ObfuscatedName("g")
	@ObfuscatedGetter(intValue = 604774139)
	@Export("hueMultiplier")
	public int hueMultiplier;

	static {
		FloorUnderlayDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	public FloorUnderlayDefinition() {
		this.rgb = 0;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-1750111550")
	@Export("postDecode")
	public void postDecode() {
		this.setHsl(this.rgb);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(Lqt;IB)V", garbageValue = "-100")
	@Export("decode")
	public void decode(Buffer var1, int var2) {
		while (true) {
			int var3 = var1.readUnsignedByte();
			if (var3 == 0) {
				return;
			}
			this.decodeNext(var1, var3, var2);
		} 
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(Lqt;III)V", garbageValue = "-2023862800")
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2, int var3) {
		if (var2 == 1) {
			this.rgb = var1.readMedium();
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "-1276241137")
	@Export("setHsl")
	void setHsl(int var1) {
		double var2 = ((double) (var1 >> 16 & 255)) / 256.0;
		double var4 = ((double) (var1 >> 8 & 255)) / 256.0;
		double var6 = ((double) (var1 & 255)) / 256.0;
		double var8 = var2;
		if (var4 < var2) {
			var8 = var4;
		}
		if (var6 < var8) {
			var8 = var6;
		}
		double var10 = var2;
		if (var4 > var2) {
			var10 = var4;
		}
		if (var6 > var10) {
			var10 = var6;
		}
		double var12 = 0.0;
		double var14 = 0.0;
		double var16 = (var10 + var8) / 2.0;
		if (var8 != var10) {
			if (var16 < 0.5) {
				var14 = (var10 - var8) / (var8 + var10);
			}
			if (var16 >= 0.5) {
				var14 = (var10 - var8) / (2.0 - var10 - var8);
			}
			if (var2 == var10) {
				var12 = (var4 - var6) / (var10 - var8);
			} else if (var4 == var10) {
				var12 = 2.0 + (var6 - var2) / (var10 - var8);
			} else if (var10 == var6) {
				var12 = (var2 - var4) / (var10 - var8) + 4.0;
			}
		}
		var12 /= 6.0;
		this.saturation = ((int) (var14 * 256.0));
		this.lightness = ((int) (256.0 * var16));
		if (this.saturation < 0) {
			this.saturation = 0;
		} else if (this.saturation > 255) {
			this.saturation = 255;
		}
		if (this.lightness < 0) {
			this.lightness = 0;
		} else if (this.lightness > 255) {
			this.lightness = 255;
		}
		if (var16 > 0.5) {
			this.hueMultiplier = ((int) (var14 * (1.0 - var16) * 512.0));
		} else {
			this.hueMultiplier = ((int) (512.0 * var14 * var16));
		}
		if (this.hueMultiplier < 1) {
			this.hueMultiplier = 1;
		}
		this.hue = ((int) (var12 * ((double) (this.hueMultiplier))));
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(I)[Ljn;", garbageValue = "-2098307250")
	@Export("ServerPacket_values")
	public static ServerPacket[] ServerPacket_values() {
		return new ServerPacket[]{ ServerPacket.RUNCLIENTSCRIPT, ServerPacket.field3037, ServerPacket.field3038, ServerPacket.field3118, ServerPacket.field3040, ServerPacket.IF_SETCOLOUR, ServerPacket.UPDATE_ZONE_FULL_FOLLOWS, ServerPacket.field3109, ServerPacket.SYNC_CLIENT_VARCACHE, ServerPacket.field3067, ServerPacket.REBUILD_REGION, ServerPacket.field3113, ServerPacket.field3048, ServerPacket.PING_STATISTICS_REQUEST, ServerPacket.field3050, ServerPacket.field3039, ServerPacket.PLAYER_SPOTANIM, ServerPacket.field3053, ServerPacket.field3054, ServerPacket.TRIGGER_ONDIALOG_ABORT, ServerPacket.NPC_INFO_SMALL_VIEWPORT_1, ServerPacket.NPC_SET_SEQUENCE, ServerPacket.NPC_INFO_LARGE_VIEWPORT_2, ServerPacket.NPC_INFO_SMALL_VIEWPORT_2, ServerPacket.UPDATE_REBOOT_TIMER, ServerPacket.MINIMAP_FLAG_SET, ServerPacket.field3051, ServerPacket.field3063, ServerPacket.field3044, ServerPacket.field3059, ServerPacket.UPDATE_IGNORELIST, ServerPacket.UPDATE_UID192, ServerPacket.CAM_RESET, ServerPacket.IF_MOVESUB, ServerPacket.UPDATE_INV_STOP_TRANSIT, ServerPacket.field3071, ServerPacket.IF_SETPLAYERHEAD, ServerPacket.UPDATE_INV_PARTIAL, ServerPacket.MESSAGE_GAME, ServerPacket.LOGOUT, ServerPacket.field3076, ServerPacket.field3110, ServerPacket.IF_CLOSESUB, ServerPacket.RESET_CLIENT_VARCACHE, ServerPacket.UPDATE_INV_CLEAR, ServerPacket.IF_SETMODEL, ServerPacket.REBUILD_NORMAL, ServerPacket.MESSAGE_PRIVATE, ServerPacket.field3084, ServerPacket.field3085, ServerPacket.field3086, ServerPacket.IF_SETPOSITION, ServerPacket.field3088, ServerPacket.IF_SETOBJECT, ServerPacket.PLAYER_INFO, ServerPacket.UPDATE_STAT, ServerPacket.SET_PRIVCHATMODE, ServerPacket.field3140, ServerPacket.UPDATE_STOCKMARKET_SLOT, ServerPacket.IF_SETHIDE, ServerPacket.MESSAGE_FRIENDS_CHAT, ServerPacket.IF_SETSCROLLPOS, ServerPacket.field3062, ServerPacket.IF_SETNPCHEAD, ServerPacket.field3100, ServerPacket.MIDI_SONG, ServerPacket.field3064, ServerPacket.UPDATE_INV_FULL, ServerPacket.DYNAMICOBJECT_SPAWN, ServerPacket.UPDATE_ZONE_PARTIAL_ENCLOSED, ServerPacket.CAM_SETANGLE, ServerPacket.LOGOUT_FULL, ServerPacket.VARP_LARGE, ServerPacket.NPC_INFO_LARGE_VIEWPORT_1, ServerPacket.IF_SETANGLE, ServerPacket.field3111, ServerPacket.field3112, ServerPacket.MINIMAP_TOGGLE, ServerPacket.SET_PLAYER_OP, ServerPacket.field3077, ServerPacket.PROJECTILE_SPAWN, ServerPacket.field3117, ServerPacket.CHAT_FILTER_SETTINGS, ServerPacket.UPDATE_FRIENDLIST, ServerPacket.URL_OPEN, ServerPacket.CAM_LOOKAT, ServerPacket.field3122, ServerPacket.GRAPHICSOBJECT_SPAWN, ServerPacket.field3124, ServerPacket.field3125, ServerPacket.field3072, ServerPacket.HINT_ARROW, ServerPacket.field3128, ServerPacket.NPC_SPOTANIM, ServerPacket.field3065, ServerPacket.field3131, ServerPacket.VARP_SMALL, ServerPacket.field3133, ServerPacket.field3134, ServerPacket.field3135, ServerPacket.MESSAGE_PRIVATE_ECHO, ServerPacket.REFLECTION_CHECKER, ServerPacket.field3115, ServerPacket.field3139, ServerPacket.field3098 };
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(IS)Lfp;", garbageValue = "180")
	@Export("VarpDefinition_get")
	public static VarpDefinition VarpDefinition_get(int var0) {
		VarpDefinition var1 = ((VarpDefinition) (VarpDefinition.VarpDefinition_cached.get(((long) (var0)))));
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = VarpDefinition.VarpDefinition_archive.takeFile(16, var0);
			var1 = new VarpDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}
			VarpDefinition.VarpDefinition_cached.put(var1, ((long) (var0)));
			return var1;
		}
	}
}