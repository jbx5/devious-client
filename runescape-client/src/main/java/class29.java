import java.applet.Applet;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("am")
public class class29 {
	@ObfuscatedName("v")
	static Applet field176;
	@ObfuscatedName("c")
	static String field175;
	@ObfuscatedName("ha")
	@ObfuscatedGetter(intValue = 
	1188608561)

	static int field181;
	@ObfuscatedName("ij")
	@ObfuscatedSignature(descriptor = 
	"[Lqq;")

	@Export("scrollBarSprites")
	static IndexedSprite[] scrollBarSprites;
	static 
	{
		field176 = null;
		field175 = "";
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(IILgt;Lgv;B)Z", garbageValue = 
	"0")

	public static final boolean method404(int var0, int var1, RouteStrategy var2, CollisionMap var3) {
		int var4 = var0;
		int var5 = var1;
		byte var6 = 64;
		byte var7 = 64;
		int var8 = var0 - var6;
		int var9 = var1 - var7;
		class194.directions[var6][var7] = 99;
		class194.distances[var6][var7] = 0;
		byte var10 = 0;
		int var11 = 0;
		class194.bufferX[var10] = var0;
		byte var10001 = var10;
		int var18 = var10 + 1;
		class194.bufferY[var10001] = var1;
		int[][] var12 = var3.flags;

		while (var18 != var11) {
			var4 = class194.bufferX[var11];
			var5 = class194.bufferY[var11];
			var11 = (var11 + 1) & 4095;
			int var16 = var4 - var8;
			int var17 = var5 - var9;
			int var13 = var4 - var3.xInset;
			int var14 = var5 - var3.yInset;
			if (var2.hasArrived(1, var4, var5, var3)) {
				HealthBarUpdate.field1189 = var4;
				StructComposition.field1988 = var5;
				return true;
			}

			int var15 = class194.distances[var16][var17] + 1;
			if (((var16 > 0) && (class194.directions[var16 - 1][var17] == 0)) && ((var12[var13 - 1][var14] & 19136776) == 0)) {
				class194.bufferX[var18] = var4 - 1;
				class194.bufferY[var18] = var5;
				var18 = (var18 + 1) & 4095;
				class194.directions[var16 - 1][var17] = 2;
				class194.distances[var16 - 1][var17] = var15;
			}

			if (((var16 < 127) && (class194.directions[var16 + 1][var17] == 0)) && ((var12[var13 + 1][var14] & 19136896) == 0)) {
				class194.bufferX[var18] = var4 + 1;
				class194.bufferY[var18] = var5;
				var18 = (var18 + 1) & 4095;
				class194.directions[var16 + 1][var17] = 8;
				class194.distances[var16 + 1][var17] = var15;
			}

			if (((var17 > 0) && (class194.directions[var16][var17 - 1] == 0)) && ((var12[var13][var14 - 1] & 19136770) == 0)) {
				class194.bufferX[var18] = var4;
				class194.bufferY[var18] = var5 - 1;
				var18 = (var18 + 1) & 4095;
				class194.directions[var16][var17 - 1] = 1;
				class194.distances[var16][var17 - 1] = var15;
			}

			if (((var17 < 127) && (class194.directions[var16][var17 + 1] == 0)) && ((var12[var13][var14 + 1] & 19136800) == 0)) {
				class194.bufferX[var18] = var4;
				class194.bufferY[var18] = var5 + 1;
				var18 = (var18 + 1) & 4095;
				class194.directions[var16][var17 + 1] = 4;
				class194.distances[var16][var17 + 1] = var15;
			}

			if ((((((var16 > 0) && (var17 > 0)) && (class194.directions[var16 - 1][var17 - 1] == 0)) && ((var12[var13 - 1][var14 - 1] & 19136782) == 0)) && ((var12[var13 - 1][var14] & 19136776) == 0)) && ((var12[var13][var14 - 1] & 19136770) == 0)) {
				class194.bufferX[var18] = var4 - 1;
				class194.bufferY[var18] = var5 - 1;
				var18 = (var18 + 1) & 4095;
				class194.directions[var16 - 1][var17 - 1] = 3;
				class194.distances[var16 - 1][var17 - 1] = var15;
			}

			if ((((((var16 < 127) && (var17 > 0)) && (class194.directions[var16 + 1][var17 - 1] == 0)) && ((var12[var13 + 1][var14 - 1] & 19136899) == 0)) && ((var12[var13 + 1][var14] & 19136896) == 0)) && ((var12[var13][var14 - 1] & 19136770) == 0)) {
				class194.bufferX[var18] = var4 + 1;
				class194.bufferY[var18] = var5 - 1;
				var18 = (var18 + 1) & 4095;
				class194.directions[var16 + 1][var17 - 1] = 9;
				class194.distances[var16 + 1][var17 - 1] = var15;
			}

			if ((((((var16 > 0) && (var17 < 127)) && (class194.directions[var16 - 1][var17 + 1] == 0)) && ((var12[var13 - 1][var14 + 1] & 19136824) == 0)) && ((var12[var13 - 1][var14] & 19136776) == 0)) && ((var12[var13][var14 + 1] & 19136800) == 0)) {
				class194.bufferX[var18] = var4 - 1;
				class194.bufferY[var18] = var5 + 1;
				var18 = (var18 + 1) & 4095;
				class194.directions[var16 - 1][var17 + 1] = 6;
				class194.distances[var16 - 1][var17 + 1] = var15;
			}

			if ((((((var16 < 127) && (var17 < 127)) && (class194.directions[var16 + 1][var17 + 1] == 0)) && ((var12[var13 + 1][var14 + 1] & 19136992) == 0)) && ((var12[var13 + 1][var14] & 19136896) == 0)) && ((var12[var13][var14 + 1] & 19136800) == 0)) {
				class194.bufferX[var18] = var4 + 1;
				class194.bufferY[var18] = var5 + 1;
				var18 = (var18 + 1) & 4095;
				class194.directions[var16 + 1][var17 + 1] = 12;
				class194.distances[var16 + 1][var17 + 1] = var15;
			}
		} 

		HealthBarUpdate.field1189 = var4;
		StructComposition.field1988 = var5;
		return false;
	}

	@ObfuscatedName("kk")
	@ObfuscatedSignature(descriptor = 
	"(IB)V", garbageValue = 
	"28")

	@Export("Widget_resetModelFrames")
	static final void Widget_resetModelFrames(int var0) {
		if (class155.loadInterface(var0)) {
			Widget[] var1 = Widget.Widget_interfaceComponents[var0];

			for (int var2 = 0; var2 < var1.length; ++var2) {
				Widget var3 = var1[var2];
				if (var3 != null) {
					var3.modelFrame = 0;
					var3.modelFrameCycle = 0;
				}
			}

		}
	}

	@ObfuscatedName("lc")
	@ObfuscatedSignature(descriptor = 
	"(II)V", garbageValue = 
	"-1249255220")

	static void method403(int var0) {
		for (IntegerNode var1 = ((IntegerNode) (Client.widgetFlags.first())); var1 != null; var1 = ((IntegerNode) (Client.widgetFlags.next()))) {
			if (((long) (var0)) == ((var1.key >> 48) & 65535L)) {
				var1.remove();
			}
		}

	}
}