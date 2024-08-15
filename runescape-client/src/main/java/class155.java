import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fw")
public class class155 extends class148 {
	@ObfuscatedName("fl")
	static boolean field1718;
	@ObfuscatedName("ab")
	boolean field1716;
	@ObfuscatedName("ay")
	byte field1712;
	@ObfuscatedName("an")
	byte field1714;
	@ObfuscatedName("au")
	byte field1715;
	@ObfuscatedName("ax")
	byte field1713;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfy;"
	)
	final class151 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfy;)V"
	)
	class155(class151 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lvg;I)V",
		garbageValue = "-1070155477"
	)
	void vmethod3619(Buffer var1) {
		this.field1716 = var1.readUnsignedByte() == 1;
		this.field1712 = var1.readByte();
		this.field1714 = var1.readByte();
		this.field1715 = var1.readByte();
		this.field1713 = var1.readByte();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lgg;I)V",
		garbageValue = "1070728869"
	)
	void vmethod3621(ClanSettings var1) {
		var1.allowGuests = this.field1716;
		var1.field1738 = this.field1712;
		var1.field1757 = this.field1714;
		var1.field1740 = this.field1715;
		var1.field1741 = this.field1713;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-772245608"
	)
	public static boolean method3410(int var0) {
		return (var0 >> 22 & 1) != 0;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ldy;[BIII)V",
		garbageValue = "1575299273"
	)
	static final void method3409(WorldView var0, byte[] var1, int var2, int var3) {
		Buffer var4 = new Buffer(var1);
		int var5 = -1;

		while (true) {
			int var6 = var4.readIncrSmallSmart();
			if (var6 == 0) {
				return;
			}

			var5 += var6;
			int var7 = 0;

			while (true) {
				int var8 = var4.readUShortSmart();
				if (var8 == 0) {
					break;
				}

				var7 += var8 - 1;
				int var9 = var7 & 63;
				int var10 = var7 >> 6 & 63;
				int var11 = var7 >> 12;
				int var12 = var4.readUnsignedByte();
				int var13 = var12 >> 2;
				int var14 = var12 & 3;
				int var15 = var10 + var2;
				int var16 = var3 + var9;
				if (var15 > 0 && var16 > 0 && var15 < var0.tileHeights[0].length - 2 && var16 < var0.tileHeights[0][0].length - 2) {
					int var17 = var11;
					if ((var0.tileSettings[1][var15][var16] & 2) == 2) {
						var17 = var11 - 1;
					}

					CollisionMap var18 = null;
					if (var17 >= 0 && var0.collisionMaps != null) {
						var18 = var0.collisionMaps[var17];
					}

					Tile.addObjects(var0, var11, var15, var16, var5, var14, var13, var18);
				}
			}
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "103"
	)
	static final int method3412(int var0, int var1, int var2) {
		int var3 = var0 / var2;
		int var4 = var0 & var2 - 1;
		int var5 = var1 / var2;
		int var6 = var1 & var2 - 1;
		int var7 = class322.method6155(var3, var5);
		int var8 = class322.method6155(var3 + 1, var5);
		int var9 = class322.method6155(var3, var5 + 1);
		int var10 = class322.method6155(var3 + 1, var5 + 1);
		int var11 = class535.method9446(var7, var8, var4, var2);
		int var12 = class535.method9446(var9, var10, var4, var2);
		return class535.method9446(var11, var12, var6, var2);
	}

	@ObfuscatedName("ky")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIIIIIIIB)V",
		garbageValue = "-20"
	)
	static void method3404(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13) {
		var1 = var1 * 128 + 64;
		var2 = var2 * 128 + 64;
		var3 = var3 * 128 + 64;
		var4 = var4 * 128 + 64;
		Projectile var14 = new Projectile(var6, var0, var1, var2, class162.getTileHeight(class328.worldView, var1, var2, var0) - var7, var9 + Client.cycle, var10 + Client.cycle, var11, var12, var13, var5, var8);
		var14.setDestination(var3, var4, class162.getTileHeight(class328.worldView, var3, var4, var0) - var8, var9 + Client.cycle);
		class328.worldView.projectiles.addFirst(var14);
	}

	@ObfuscatedName("ne")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "297323985"
	)
	static final void method3411(int var0) {
		if (FloorUnderlayDefinition.widgetDefinition.loadInterface(var0)) {
			class59.drawModelComponents(FloorUnderlayDefinition.widgetDefinition.Widget_interfaceComponents[var0], -1);
		}
	}
}
