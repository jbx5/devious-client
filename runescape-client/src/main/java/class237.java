import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jv")
public enum class237 implements Enum {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	field2523((byte)-1, 0.0F),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	field2524((byte)0, 0.5F),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	field2525((byte)1, 1.0F),
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	field2529((byte)2, 2.0F),
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	field2526((byte)3, 1.5F),
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	field2531((byte)4, 2.5F),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	field2528((byte)5, 3.0F),
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	field2522((byte)6, 3.5F),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	field2530((byte)7, 4.0F);

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "[Ljv;"
	)
	static class237[] field2533;
	@ObfuscatedName("kd")
	@ObfuscatedSignature(
		descriptor = "[Lvc;"
	)
	@Export("crossSprites")
	static SpritePixels[] crossSprites;
	@ObfuscatedName("ao")
	public final byte field2532;
	@ObfuscatedName("ah")
	public final float field2527;

	static {
		// $FF: Couldn't be decompiled
	}

	class237(byte var3, float var4) {
		this.field2532 = var3;
		this.field2527 = var4;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-311400525"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field2532;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-2115289090"
	)
	public static boolean method4551(int var0) {
		return var0 >= WorldMapDecorationType.field4010.id && var0 <= WorldMapDecorationType.field4008.id || var0 == WorldMapDecorationType.field3997.id;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lcl;Lcl;IZI)I",
		garbageValue = "-982897071"
	)
	@Export("compareWorlds")
	static int compareWorlds(World var0, World var1, int var2, boolean var3) {
		if (var2 == 1) {
			int var4 = var0.population;
			int var5 = var1.population;
			if (!var3) {
				if (var4 == -1) {
					var4 = 2001;
				}

				if (var5 == -1) {
					var5 = 2001;
				}
			}

			return var4 - var5;
		} else if (var2 == 2) {
			return var0.location - var1.location;
		} else if (var2 == 3) {
			if (var0.activity.equals("-")) {
				if (var1.activity.equals("-")) {
					return 0;
				} else {
					return var3 ? -1 : 1;
				}
			} else if (var1.activity.equals("-")) {
				return var3 ? 1 : -1;
			} else {
				return var0.activity.compareTo(var1.activity);
			}
		} else if (var2 == 4) {
			return var0.method1836() ? (var1.method1836() ? 0 : 1) : (var1.method1836() ? -1 : 0);
		} else if (var2 == 5) {
			return var0.method1849() ? (var1.method1849() ? 0 : 1) : (var1.method1849() ? -1 : 0);
		} else if (var2 == 6) {
			return var0.isPvp() ? (var1.isPvp() ? 0 : 1) : (var1.isPvp() ? -1 : 0);
		} else if (var2 == 7) {
			return var0.isMembersOnly() ? (var1.isMembersOnly() ? 0 : 1) : (var1.isMembersOnly() ? -1 : 0);
		} else {
			return var0.id - var1.id;
		}
	}

	@ObfuscatedName("iw")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	static final void method4550() {
		if (class285.ClanChat_inClanChat) {
			if (class108.friendsChat != null) {
				class108.friendsChat.sort();
			}

			for (int var0 = 0; var0 < class358.scene.field1336.field1415; ++var0) {
				Player var1 = class358.scene.field1341[class358.scene.field1336.field1416[var0]];
				var1.clearIsInFriendsChat();
			}

			class285.ClanChat_inClanChat = false;
		}

	}

	@ObfuscatedName("jc")
	@ObfuscatedSignature(
		descriptor = "(Ldt;B)V",
		garbageValue = "-13"
	)
	static final void method4552(class101 var0) {
		for (GraphicsObject var1 = (GraphicsObject)var0.field1352.last(); var1 != null; var1 = (GraphicsObject)var0.field1352.previous()) {
			if (var0.field1348 == var1.plane && !var1.isFinished) {
				if (Client.cycle >= var1.cycleStart) {
					var1.advance(Client.graphicsCycle);
					if (var1.isFinished) {
						var1.remove();
					} else {
						var0.field1331.drawEntity(var1.plane, var1.x, var1.y, var1.z, 60, var1, 0, -1L, false);
					}
				}
			} else {
				var1.remove();
			}
		}

	}
}
