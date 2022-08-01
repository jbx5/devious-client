import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Export;
@ObfuscatedName("eq")
public class class136 extends class144 {
	@ObfuscatedName("hr")
	@ObfuscatedSignature(descriptor = "Lpb;")
	@Export("WorldMapElement_fonts")
	static Fonts WorldMapElement_fonts;

	@ObfuscatedName("nx")
	@ObfuscatedSignature(descriptor = "Lbe;")
	@Export("tempMenuAction")
	static MenuAction tempMenuAction;

	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = 1569891361)
	int field1598;

	@ObfuscatedSignature(descriptor = "Let;")
	final class145 this$0;

	@ObfuscatedSignature(descriptor = "(Let;)V")
	class136(class145 var1) {
		this.this$0 = var1;
		this.field1598 = -1;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(Lqw;I)V", garbageValue = "-1897546377")
	void vmethod3146(Buffer var1) {
		this.field1598 = var1.readUnsignedShort();
		var1.readUnsignedByte();
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			var1.readLong();
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(Ley;I)V", garbageValue = "-406744366")
	void vmethod3145(ClanChannel var1) {
		var1.removeMember(this.field1598);
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "(II)Z", garbageValue = "1572525862")
	public static boolean method2955(int var0) {
		return (var0 >> 21 & 1) != 0;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "([BIIIIIII[Lgr;I)V", garbageValue = "1308241235")
	static final void method2954(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, CollisionMap[] var8) {
		int var10;
		for (int var9 = 0; var9 < 8; ++var9) {
			for (var10 = 0; var10 < 8; ++var10) {
				if (var9 + var2 > 0 && var9 + var2 < 103 && var3 + var10 > 0 && var3 + var10 < 103) {
					int[] var10000 = var8[var1].flags[var9 + var2];
					var10000[var3 + var10] &= -16777217;
				}
			}
		}
		Buffer var21 = new Buffer(var0);
		for (var10 = 0; var10 < 4; ++var10) {
			for (int var11 = 0; var11 < 64; ++var11) {
				for (int var12 = 0; var12 < 64; ++var12) {
					if (var10 == var4 && var11 >= var5 && var11 < var5 + 8 && var12 >= var6 && var12 < var6 + 8) {
						int var15 = var2 + class286.method5524(var11 & 7, var12 & 7, var7);
						int var18 = var11 & 7;
						int var19 = var12 & 7;
						int var20 = var7 & 3;
						int var17;
						if (var20 == 0) {
							var17 = var19;
						} else if (var20 == 1) {
							var17 = 7 - var18;
						} else if (var20 == 2) {
							var17 = 7 - var19;
						} else {
							var17 = var18;
						}
						class174.loadTerrain(var21, var1, var15, var3 + var17, 0, 0, var7);
					} else {
						class174.loadTerrain(var21, 0, -1, -1, 0, 0, 0);
					}
				}
			}
		}
	}

	@ObfuscatedName("fi")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "237156850")
	@Export("forceDisconnect")
	static final void forceDisconnect(int var0) {
		class433.logOut();
		switch (var0) {
			case 1 :
				MenuAction.method1933();
				break;
			case 2 :
				SoundSystem.method768();
		}
	}

	@ObfuscatedName("kz")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "86287097")
	static final void method2949(int var0) {
		var0 = Math.min(Math.max(var0, 0), 127);
		class260.clientPreferences.method2332(var0);
	}
}