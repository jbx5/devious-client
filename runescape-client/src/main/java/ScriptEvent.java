import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("di")
@Implements("ScriptEvent")
public class ScriptEvent extends Node {
	@ObfuscatedName("aw")
	@Export("args")
	Object[] args;
	@ObfuscatedName("ay")
	boolean field1070;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	@Export("widget")
	Widget widget;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 56246801
	)
	@Export("mouseX")
	int mouseX;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 531717559
	)
	@Export("mouseY")
	int mouseY;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 993131621
	)
	@Export("opIndex")
	int opIndex;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	@Export("dragTarget")
	Widget dragTarget;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1148882053
	)
	@Export("keyTyped")
	int keyTyped;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 326052707
	)
	@Export("keyPressed")
	int keyPressed;
	@ObfuscatedName("ap")
	@Export("targetName")
	String targetName;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 306478139
	)
	int field1074;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 981829293
	)
	@Export("type")
	int type;

	public ScriptEvent() {
		this.type = 76;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;I)V",
		garbageValue = "-720294865"
	)
	@Export("setArgs")
	public void setArgs(Object[] var1) {
		this.args = var1;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2065386179"
	)
	@Export("setType")
	public void setType(int var1) {
		this.type = var1;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lmt;I)V",
		garbageValue = "1544953462"
	)
	public void method2290(Widget var1) {
		this.widget = var1;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lty;IIIIIIB)V",
		garbageValue = "1"
	)
	@Export("loadTerrain")
	static final void loadTerrain(Buffer var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		boolean var7 = var1 >= 0 && var1 < 4 && var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104;
		int var8;
		if (var7) {
			Tiles.Tiles_renderFlags[var1][var2][var3] = 0;

			while (true) {
				var8 = var0.readUnsignedShort();
				if (var8 == 0) {
					if (var1 == 0) {
						Tiles.Tiles_heights[0][var2][var3] = -UserComparator10.method2897(var4 + 932731, var5 + 556238) * 8;
					} else {
						Tiles.Tiles_heights[var1][var2][var3] = Tiles.Tiles_heights[var1 - 1][var2][var3] - 240;
					}
					break;
				}

				if (var8 == 1) {
					int var9 = var0.readUnsignedByte();
					if (var9 == 1) {
						var9 = 0;
					}

					if (var1 == 0) {
						Tiles.Tiles_heights[0][var2][var3] = -var9 * 8;
					} else {
						Tiles.Tiles_heights[var1][var2][var3] = Tiles.Tiles_heights[var1 - 1][var2][var3] - var9 * 8;
					}
					break;
				}

				if (var8 <= 49) {
					Tiles.Tiles_overlays[var1][var2][var3] = (short)var0.readShort();
					class19.Tiles_shapes[var1][var2][var3] = (byte)((var8 - 2) / 4);
					UserComparator10.field1474[var1][var2][var3] = (byte)(var8 - 2 + var6 & 3);
				} else if (var8 <= 81) {
					Tiles.Tiles_renderFlags[var1][var2][var3] = (byte)(var8 - 49);
				} else {
					Tiles.Tiles_underlays[var1][var2][var3] = (short)(var8 - 81);
				}
			}
		} else {
			while (true) {
				var8 = var0.readUnsignedShort();
				if (var8 == 0) {
					break;
				}

				if (var8 == 1) {
					var0.readUnsignedByte();
					break;
				}

				if (var8 <= 49) {
					var0.readShort();
				}
			}
		}

	}
}
