import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ll")
@Implements("WorldMapAreaData")
public class WorldMapAreaData extends WorldMapArea {
	@ObfuscatedName("as")
	HashSet field3220;
	@ObfuscatedName("aw")
	HashSet field3221;
	@ObfuscatedName("af")
	@Export("iconList")
	List iconList;

	WorldMapAreaData() {
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(Lvg;Lvg;IZB)V",
		garbageValue = "11"
	)
	void method6041(Buffer var1, Buffer var2, int var3, boolean var4) {
		this.method5607(var1, var3);
		int var5 = var2.readUnsignedShort();
		this.field3220 = new HashSet(var5);

		int var6;
		for (var6 = 0; var6 < var5; ++var6) {
			WorldMapData_0 var7 = new WorldMapData_0();

			try {
				var7.init(var2);
			} catch (IllegalStateException var12) {
				continue;
			}

			this.field3220.add(var7);
		}

		var6 = var2.readUnsignedShort();
		this.field3221 = new HashSet(var6);

		for (int var10 = 0; var10 < var6; ++var10) {
			WorldMapData_1 var8 = new WorldMapData_1();

			try {
				var8.init(var2);
			} catch (IllegalStateException var11) {
				continue;
			}

			this.field3221.add(var8);
		}

		this.initIconsList(var2, var4);
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(Lvg;ZS)V",
		garbageValue = "18463"
	)
	@Export("initIconsList")
	void initIconsList(Buffer var1, boolean var2) {
		this.iconList = new LinkedList();
		int var3 = var1.readUnsignedShort();

		for (int var4 = 0; var4 < var3; ++var4) {
			int var5 = var1.readNullableLargeSmart();
			Coord var6 = new Coord(var1.readInt());
			boolean var7 = var1.readUnsignedByte() == 1;
			if (var2 || !var7) {
				this.iconList.add(new WorldMapIcon_0((Coord)null, var6, var5, (WorldMapLabel)null));
			}
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IZI)Ljava/lang/String;",
		garbageValue = "1053822388"
	)
	@Export("intToString")
	public static String intToString(int var0, boolean var1) {
		if (var1 && var0 >= 0) {
			int var3 = var0;
			String var2;
			if (var1 && var0 >= 0) {
				int var4 = 2;

				for (int var5 = var0 / 10; var5 != 0; ++var4) {
					var5 /= 10;
				}

				char[] var6 = new char[var4];
				var6[0] = '+';

				for (int var7 = var4 - 1; var7 > 0; --var7) {
					int var8 = var3;
					var3 /= 10;
					int var9 = var8 - var3 * 10;
					if (var9 >= 10) {
						var6[var7] = (char)(var9 + 87);
					} else {
						var6[var7] = (char)(var9 + 48);
					}
				}

				var2 = new String(var6);
			} else {
				var2 = Integer.toString(var0, 10);
			}

			return var2;
		} else {
			return Integer.toString(var0);
		}
	}

	@ObfuscatedName("kp")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIB)V",
		garbageValue = "-114"
	)
	static void method6038(int var0, int var1, int var2, int var3, int var4, int var5) {
		NodeDeque var6 = class328.worldView.groundItems[var0][var1][var2];
		if (var6 != null) {
			for (TileItem var7 = (TileItem)var6.last(); var7 != null; var7 = (TileItem)var6.previous()) {
				if ((var3 & 32767) == var7.id && var4 == var7.quantity) {
					var7.quantity = var5;
					break;
				}
			}

			HitSplatDefinition.updateItemPile(var0, var1, var2);
		}

	}
}
