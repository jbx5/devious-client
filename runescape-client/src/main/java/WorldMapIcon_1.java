import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("hp")
@Implements("WorldMapIcon_1")
public class WorldMapIcon_1 extends AbstractWorldMapIcon {
	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = 574768679)
	@Export("objectDefId")
	final int objectDefId;

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "Lhn;")
	@Export("region")
	final WorldMapRegion region;

	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = -312607591)
	@Export("element")
	int element;

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "Liz;")
	@Export("label")
	WorldMapLabel label;

	@ObfuscatedName("j")
	@ObfuscatedGetter(intValue = -2109646665)
	@Export("subWidth")
	int subWidth;

	@ObfuscatedName("e")
	@ObfuscatedGetter(intValue = -2072150361)
	@Export("subHeight")
	int subHeight;

	@ObfuscatedSignature(descriptor = "(Lkd;Lkd;ILhn;)V")
	WorldMapIcon_1(Coord var1, Coord var2, int var3, WorldMapRegion var4) {
		super(var1, var2);
		this.objectDefId = var3;
		this.region = var4;
		this.init();
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-1694427689")
	@Export("init")
	void init() {
		this.element = class162.getObjectDefinition(this.objectDefId).transform().mapIconId;
		this.label = this.region.createMapLabel(class432.WorldMapElement_get(this.element));
		WorldMapElement var1 = class432.WorldMapElement_get(this.getElement());
		SpritePixels var2 = var1.getSpriteBool(false);
		if (var2 != null) {
			this.subWidth = var2.subWidth;
			this.subHeight = var2.subHeight;
		} else {
			this.subWidth = 0;
			this.subHeight = 0;
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "781292504")
	@Export("getElement")
	public int getElement() {
		return this.element;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(I)Liz;", garbageValue = "1473728")
	@Export("getLabel")
	WorldMapLabel getLabel() {
		return this.label;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-1263012412")
	@Export("getSubWidth")
	int getSubWidth() {
		return this.subWidth;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "(B)I", garbageValue = "-34")
	@Export("getSubHeight")
	int getSubHeight() {
		return this.subHeight;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(IILgu;Lgv;I)Z", garbageValue = "312138547")
	public static final boolean method4592(int var0, int var1, RouteStrategy var2, CollisionMap var3) {
		int var4 = var0;
		int var5 = var1;
		byte var6 = 64;
		byte var7 = 64;
		int var8 = var0 - var6;
		int var9 = var1 - var7;
		class193.directions[var6][var7] = 99;
		class193.distances[var6][var7] = 0;
		byte var10 = 0;
		int var11 = 0;
		class193.bufferX[var10] = var0;
		byte var10001 = var10;
		int var18 = var10 + 1;
		class193.bufferY[var10001] = var1;
		int[][] var12 = var3.flags;
		while (var11 != var18) {
			var4 = class193.bufferX[var11];
			var5 = class193.bufferY[var11];
			var11 = var11 + 1 & 4095;
			int var16 = var4 - var8;
			int var17 = var5 - var9;
			int var13 = var4 - var3.xInset;
			int var14 = var5 - var3.yInset;
			if (var2.hasArrived(2, var4, var5, var3)) {
				class193.field2219 = var4;
				class394.field4429 = var5;
				return true;
			}
			int var15 = class193.distances[var16][var17] + 1;
			if (var16 > 0 && class193.directions[var16 - 1][var17] == 0 && (var12[var13 - 1][var14] & 19136782) == 0 && (var12[var13 - 1][var14 + 1] & 19136824) == 0) {
				class193.bufferX[var18] = var4 - 1;
				class193.bufferY[var18] = var5;
				var18 = var18 + 1 & 4095;
				class193.directions[var16 - 1][var17] = 2;
				class193.distances[var16 - 1][var17] = var15;
			}
			if (var16 < 126 && class193.directions[var16 + 1][var17] == 0 && (var12[var13 + 2][var14] & 19136899) == 0 && (var12[var13 + 2][var14 + 1] & 19136992) == 0) {
				class193.bufferX[var18] = var4 + 1;
				class193.bufferY[var18] = var5;
				var18 = var18 + 1 & 4095;
				class193.directions[var16 + 1][var17] = 8;
				class193.distances[var16 + 1][var17] = var15;
			}
			if (var17 > 0 && class193.directions[var16][var17 - 1] == 0 && (var12[var13][var14 - 1] & 19136782) == 0 && (var12[var13 + 1][var14 - 1] & 19136899) == 0) {
				class193.bufferX[var18] = var4;
				class193.bufferY[var18] = var5 - 1;
				var18 = var18 + 1 & 4095;
				class193.directions[var16][var17 - 1] = 1;
				class193.distances[var16][var17 - 1] = var15;
			}
			if (var17 < 126 && class193.directions[var16][var17 + 1] == 0 && (var12[var13][var14 + 2] & 19136824) == 0 && (var12[var13 + 1][var14 + 2] & 19136992) == 0) {
				class193.bufferX[var18] = var4;
				class193.bufferY[var18] = var5 + 1;
				var18 = var18 + 1 & 4095;
				class193.directions[var16][var17 + 1] = 4;
				class193.distances[var16][var17 + 1] = var15;
			}
			if (var16 > 0 && var17 > 0 && class193.directions[var16 - 1][var17 - 1] == 0 && (var12[var13 - 1][var14] & 19136830) == 0 && (var12[var13 - 1][var14 - 1] & 19136782) == 0 && (var12[var13][var14 - 1] & 19136911) == 0) {
				class193.bufferX[var18] = var4 - 1;
				class193.bufferY[var18] = var5 - 1;
				var18 = var18 + 1 & 4095;
				class193.directions[var16 - 1][var17 - 1] = 3;
				class193.distances[var16 - 1][var17 - 1] = var15;
			}
			if (var16 < 126 && var17 > 0 && class193.directions[var16 + 1][var17 - 1] == 0 && (var12[var13 + 1][var14 - 1] & 19136911) == 0 && (var12[var13 + 2][var14 - 1] & 19136899) == 0 && (var12[var13 + 2][var14] & 19136995) == 0) {
				class193.bufferX[var18] = var4 + 1;
				class193.bufferY[var18] = var5 - 1;
				var18 = var18 + 1 & 4095;
				class193.directions[var16 + 1][var17 - 1] = 9;
				class193.distances[var16 + 1][var17 - 1] = var15;
			}
			if (var16 > 0 && var17 < 126 && class193.directions[var16 - 1][var17 + 1] == 0 && (var12[var13 - 1][var14 + 1] & 19136830) == 0 && (var12[var13 - 1][var14 + 2] & 19136824) == 0 && (var12[var13][var14 + 2] & 19137016) == 0) {
				class193.bufferX[var18] = var4 - 1;
				class193.bufferY[var18] = var5 + 1;
				var18 = var18 + 1 & 4095;
				class193.directions[var16 - 1][var17 + 1] = 6;
				class193.distances[var16 - 1][var17 + 1] = var15;
			}
			if (var16 < 126 && var17 < 126 && class193.directions[var16 + 1][var17 + 1] == 0 && (var12[var13 + 1][var14 + 2] & 19137016) == 0 && (var12[var13 + 2][var14 + 2] & 19136992) == 0 && (var12[var13 + 2][var14 + 1] & 19136995) == 0) {
				class193.bufferX[var18] = var4 + 1;
				class193.bufferY[var18] = var5 + 1;
				var18 = var18 + 1 & 4095;
				class193.directions[var16 + 1][var17 + 1] = 12;
				class193.distances[var16 + 1][var17 + 1] = var15;
			}
		} 
		class193.field2219 = var4;
		class394.field4429 = var5;
		return false;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(II)Lgi;", garbageValue = "-288193163")
	@Export("StructDefinition_getStructDefinition")
	public static StructComposition StructDefinition_getStructDefinition(int var0) {
		StructComposition var1 = ((StructComposition) (StructComposition.StructDefinition_cached.get(((long) (var0)))));
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = StructComposition.StructDefinition_archive.takeFile(34, var0);
			var1 = new StructComposition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}
			var1.postDecode();
			StructComposition.StructDefinition_cached.put(var1, ((long) (var0)));
			return var1;
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(descriptor = "(IIB)I", garbageValue = "-27")
	static final int method4594(int var0, int var1) {
		int var2 = var1 * 57 + var0;
		var2 ^= var2 << 13;
		int var3 = var2 * (var2 * var2 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE;
		return var3 >> 19 & 255;
	}

	@ObfuscatedName("lg")
	@ObfuscatedSignature(descriptor = "(Lqt;II)V", garbageValue = "-735422475")
	static void method4590(Buffer var0, int var1) {
		byte[] var2 = var0.array;
		if (Client.randomDatData == null) {
			Client.randomDatData = new byte[24];
		}
		class350.writeRandomDat(var2, var1, Client.randomDatData, 0, 24);
		if (JagexCache.JagexCache_randomDat != null) {
			try {
				JagexCache.JagexCache_randomDat.seek(0L);
				JagexCache.JagexCache_randomDat.write(var0.array, var1, 24);
			} catch (Exception var4) {
			}
		}
	}
}