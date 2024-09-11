import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ll")
@Implements("WorldMapIcon_0")
public class WorldMapIcon_0 extends AbstractWorldMapIcon {
	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "[Lvt;"
	)
	@Export("worldSelectArrows")
	static IndexedSprite[] worldSelectArrows;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1314680731
	)
	@Export("element")
	final int element;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	@Export("label")
	final WorldMapLabel label;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1349972895
	)
	@Export("subWidth")
	final int subWidth;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1239827825
	)
	@Export("subHeight")
	final int subHeight;

	@ObfuscatedSignature(
		descriptor = "(Lnm;Lnm;ILls;)V"
	)
	WorldMapIcon_0(Coord var1, Coord var2, int var3, WorldMapLabel var4) {
		super(var1, var2);
		this.element = var3;
		this.label = var4;
		WorldMapElement var5 = class142.WorldMapElement_get(this.getElement());
		SpritePixels var6 = var5.getSpriteBool(false);
		if (var6 != null) {
			this.subWidth = var6.subWidth;
			this.subHeight = var6.subHeight;
		} else {
			this.subWidth = 0;
			this.subHeight = 0;
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1570517373"
	)
	@Export("getElement")
	public int getElement() {
		return this.element;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)Lls;",
		garbageValue = "43"
	)
	@Export("getLabel")
	WorldMapLabel getLabel() {
		return this.label;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-288166594"
	)
	@Export("getSubWidth")
	int getSubWidth() {
		return this.subWidth;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1390628388"
	)
	@Export("getSubHeight")
	int getSubHeight() {
		return this.subHeight;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ldd;[BIIIIIIIIIB)V",
		garbageValue = "85"
	)
	static final void method6097(WorldView var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		CollisionMap[] var11 = var0.collisionMaps;
		int var13;
		if (var11 != null) {
			for (int var12 = 0; var12 < 8; ++var12) {
				for (var13 = 0; var13 < 8; ++var13) {
					if (var3 + var12 > 0 && var3 + var12 < var11[var2].flags.length && var13 + var4 > 0 && var13 + var4 < var11[var2].flags[var3 + var12].length) {
						int[] var10000 = var11[var2].flags[var3 + var12];
						var10000[var4 + var13] &= -1073741825;
					}
				}
			}
		}

		Buffer var20 = new Buffer(var1);

		for (var13 = 0; var13 < 4; ++var13) {
			for (int var14 = 0; var14 < 64; ++var14) {
				for (int var15 = 0; var15 < 64; ++var15) {
					if (var5 == var13 && var14 >= var6 && var14 < var6 + 8 && var15 >= var7 && var15 < var7 + 8) {
						int var16 = var3 + class180.method3805(var14 & 7, var15 & 7, var8);
						int var17 = var4 + CollisionMap.method5635(var14 & 7, var15 & 7, var8);
						int var18 = var3 + (var14 & 7) + var9;
						int var19 = var10 + (var15 & 7) + var4;
						class537.loadTerrain(var0, var20, var2, var16, var17, var18, var19, var8);
					} else {
						class537.loadTerrain(var0, var20, 0, -1, -1, 0, 0, 0);
					}
				}
			}
		}

	}
}
