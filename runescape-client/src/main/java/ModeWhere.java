import java.util.HashSet;
import java.util.Set;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oe")
@Implements("ModeWhere")
public enum ModeWhere implements MouseWheel {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Loe;"
	)
	field4393("", 0, new class370[]{class370.field4372, class370.field4370}),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Loe;"
	)
	field4389("", 1, new class370[]{class370.field4369, class370.field4372, class370.field4370}),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Loe;"
	)
	field4390("", 2, new class370[]{class370.field4369, class370.field4373, class370.field4372}),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Loe;"
	)
	field4406("", 3, new class370[]{class370.field4369}),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Loe;"
	)
	field4392("", 4),
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Loe;"
	)
	field4394("", 5, new class370[]{class370.field4369, class370.field4372}),
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Loe;"
	)
	field4395("", 6, new class370[]{class370.field4372}),
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Loe;"
	)
	field4399("", 8, new class370[]{class370.field4369, class370.field4372}),
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Loe;"
	)
	field4397("", 9, new class370[]{class370.field4369, class370.field4373}),
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Loe;"
	)
	field4398("", 10, new class370[]{class370.field4369}),
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Loe;"
	)
	field4391("", 11, new class370[]{class370.field4369}),
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Loe;"
	)
	field4400("", 12, new class370[]{class370.field4369, class370.field4372}),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Loe;"
	)
	field4401("", 13, new class370[]{class370.field4369});

	@ObfuscatedName("dc")
	static boolean field4404;
	@ObfuscatedName("oo")
	@ObfuscatedGetter(
		intValue = 380292501
	)
	@Export("selectedSpellWidget")
	static int selectedSpellWidget;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -539297047
	)
	@Export("id")
	final int id;
	@ObfuscatedName("ar")
	final Set field4403;

	static {
		method6962();
	}

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I[Log;)V"
	)
	ModeWhere(String var3, int var4, class370[] var5) {
		this.field4403 = new HashSet();
		this.id = var4;
		class370[] var6 = var5;

		for (int var7 = 0; var7 < var6.length; ++var7) {
			class370 var8 = var6[var7];
			this.field4403.add(var8);
		}

	}

	ModeWhere(String var3, int var4) {
		this.field4403 = new HashSet();
		this.id = var4;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "41"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)[Loe;",
		garbageValue = "-1302821718"
	)
	static ModeWhere[] method6962() {
		return new ModeWhere[]{field4391, field4401, field4392, field4397, field4399, field4406, field4398, field4400, field4394, field4389, field4395, field4390, field4393};
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lnu;I)V",
		garbageValue = "-1598349673"
	)
	public static void method6955(AbstractArchive var0) {
		class13.InvDefinition_archive = var0;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "1"
	)
	@Export("loadInterface")
	public static boolean loadInterface(int var0) {
		if (class316.Widget_loadedInterfaces[var0]) {
			return true;
		} else if (!Decimator.Widget_archive.tryLoadGroup(var0)) {
			return false;
		} else {
			int var1 = Decimator.Widget_archive.getGroupFileCount(var0);
			if (var1 == 0) {
				class316.Widget_loadedInterfaces[var0] = true;
				return true;
			} else {
				if (PacketBufferNode.Widget_interfaceComponents[var0] == null) {
					PacketBufferNode.Widget_interfaceComponents[var0] = new Widget[var1];
				}

				for (int var2 = 0; var2 < var1; ++var2) {
					if (PacketBufferNode.Widget_interfaceComponents[var0][var2] == null) {
						byte[] var3 = Decimator.Widget_archive.takeFile(var0, var2);
						if (var3 != null) {
							PacketBufferNode.Widget_interfaceComponents[var0][var2] = new Widget();
							PacketBufferNode.Widget_interfaceComponents[var0][var2].id = var2 + (var0 << 16);
							if (var3[0] == -1) {
								PacketBufferNode.Widget_interfaceComponents[var0][var2].decode(new Buffer(var3));
							} else {
								PacketBufferNode.Widget_interfaceComponents[var0][var2].decodeLegacy(new Buffer(var3));
							}
						}
					}
				}

				class316.Widget_loadedInterfaces[var0] = true;
				return true;
			}
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(III)Ldh;",
		garbageValue = "-305798584"
	)
	static Script method6961(int var0, int var1) {
		Script var2 = (Script)Script.Script_cached.get((long)(var0 << 16));
		if (var2 != null) {
			return var2;
		} else {
			String var3 = String.valueOf(var0);
			int var4 = GrandExchangeOffer.archive12.getGroupId(var3);
			if (var4 == -1) {
				return null;
			} else {
				byte[] var5 = GrandExchangeOffer.archive12.takeFileFlat(var4);
				if (var5 != null) {
					if (var5.length <= 1) {
						return null;
					}

					var2 = HitSplatDefinition.newScript(var5);
					if (var2 != null) {
						Script.Script_cached.put(var2, (long)(var0 << 16));
						return var2;
					}
				}

				return null;
			}
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lch;I)V",
		garbageValue = "516890386"
	)
	@Export("changeWorld")
	static void changeWorld(World var0) {
		if (var0.isMembersOnly() != Client.isMembersWorld) {
			Client.isMembersWorld = var0.isMembersOnly();
			boolean var1 = var0.isMembersOnly();
			if (var1 != ItemComposition.ItemDefinition_inMembersWorld) {
				ItemComposition.ItemDefinition_cached.clear();
				ItemComposition.ItemDefinition_cachedModels.clear();
				ItemComposition.ItemDefinition_cachedSprites.clear();
				ItemComposition.ItemDefinition_inMembersWorld = var1;
			}
		}

		if (var0.properties != Client.worldProperties) {
			Archive var3 = PcmPlayer.archive8;
			int var2 = var0.properties;
			if ((var2 & class510.field5090.rsOrdinal()) != 0) {
				SoundSystem.logoSprite = class172.SpriteBuffer_getIndexedSpriteByName(var3, "logo_deadman_mode", "");
			} else if ((var2 & class510.field5091.rsOrdinal()) != 0) {
				SoundSystem.logoSprite = class172.SpriteBuffer_getIndexedSpriteByName(var3, "logo_seasonal_mode", "");
			} else if ((var2 & class510.field5069.rsOrdinal()) != 0) {
				SoundSystem.logoSprite = class172.SpriteBuffer_getIndexedSpriteByName(var3, "logo_speedrunning", "");
			} else {
				SoundSystem.logoSprite = class172.SpriteBuffer_getIndexedSpriteByName(var3, "logo", "");
			}
		}

		class292.worldHost = var0.host;
		Client.worldId = var0.id;
		Client.worldProperties = var0.properties;
		class30.field166 = var0.field847;
		class480.worldPort = Client.gameBuild == 0 ? 43594 : var0.id + 40000;
		class129.js5Port = Client.gameBuild == 0 ? 443 : var0.id + 50000;
		class4.currentPort = class480.worldPort;
	}
}
