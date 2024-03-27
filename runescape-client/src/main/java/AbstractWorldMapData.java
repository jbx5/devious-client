import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kl")
@Implements("AbstractWorldMapData")
public abstract class AbstractWorldMapData {
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -843599872
	)
	@Export("regionXLow")
	int regionXLow;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -2039541760
	)
	@Export("regionYLow")
	int regionYLow;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 178731789
	)
	@Export("regionX")
	int regionX;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -104609509
	)
	@Export("regionY")
	int regionY;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1983463193
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -93051335
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 991622431
	)
	@Export("groupId")
	int groupId;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 727914403
	)
	@Export("fileId")
	int fileId;
	@ObfuscatedName("ai")
	@Export("floorUnderlayIds")
	short[][][] floorUnderlayIds;
	@ObfuscatedName("ax")
	@Export("floorOverlayIds")
	short[][][] floorOverlayIds;
	@ObfuscatedName("ar")
	byte[][][] field3100;
	@ObfuscatedName("aj")
	byte[][][] field3101;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "[[[[Lkx;"
	)
	@Export("decorations")
	WorldMapDecoration[][][][] decorations;
	@ObfuscatedName("ay")
	boolean field3097;
	@ObfuscatedName("ap")
	boolean field3104;

	AbstractWorldMapData() {
		this.groupId = -1;
		this.fileId = -1;
		new LinkedList();
		this.field3097 = false;
		this.field3104 = false;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lur;B)V",
		garbageValue = "63"
	)
	@Export("readGeography")
	abstract void readGeography(Buffer var1);

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "0"
	)
	@Export("isFullyLoaded")
	boolean isFullyLoaded() {
		return this.field3097 && this.field3104;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Loc;I)V",
		garbageValue = "-1645561353"
	)
	@Export("loadGeography")
	void loadGeography(AbstractArchive var1) {
		if (!this.isFullyLoaded()) {
			byte[] var2 = var1.takeFile(this.groupId, this.fileId);
			if (var2 != null) {
				this.readGeography(new Buffer(var2));
				this.field3097 = true;
				this.field3104 = true;
			}

		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1724728026"
	)
	@Export("reset")
	void reset() {
		this.floorUnderlayIds = null;
		this.floorOverlayIds = null;
		this.field3100 = null;
		this.field3101 = null;
		this.decorations = null;
		this.field3097 = false;
		this.field3104 = false;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IILur;I)V",
		garbageValue = "731928430"
	)
	@Export("readTile")
	void readTile(int var1, int var2, Buffer var3) {
		int var4 = var3.readUnsignedByte();
		if (var4 != 0) {
			if ((var4 & 1) != 0) {
				this.method5653(var1, var2, var3, var4);
			} else {
				this.method5662(var1, var2, var3, var4);
			}

		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IILur;II)V",
		garbageValue = "660851776"
	)
	void method5653(int var1, int var2, Buffer var3, int var4) {
		boolean var5 = (var4 & 2) != 0;
		if (var5) {
			this.floorOverlayIds[0][var1][var2] = (short)var3.readUnsignedShort();
		}

		this.floorUnderlayIds[0][var1][var2] = (short)var3.readUnsignedShort();
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IILur;IB)V",
		garbageValue = "-59"
	)
	void method5662(int var1, int var2, Buffer var3, int var4) {
		int var5 = ((var4 & 24) >> 3) + 1;
		boolean var6 = (var4 & 2) != 0;
		boolean var7 = (var4 & 4) != 0;
		this.floorUnderlayIds[0][var1][var2] = (short)var3.readUnsignedShort();
		int var8;
		int var9;
		int var11;
		if (var6) {
			var8 = var3.readUnsignedByte();

			for (var9 = 0; var9 < var8; ++var9) {
				int var14 = var3.readUnsignedShort();
				if (var14 != 0) {
					this.floorOverlayIds[var9][var1][var2] = (short)var14;
					var11 = var3.readUnsignedByte();
					this.field3100[var9][var1][var2] = (byte)(var11 >> 2);
					this.field3101[var9][var1][var2] = (byte)(var11 & 3);
				}
			}
		}

		if (var7) {
			for (var8 = 0; var8 < var5; ++var8) {
				var9 = var3.readUnsignedByte();
				if (var9 != 0) {
					WorldMapDecoration[] var10 = this.decorations[var8][var1][var2] = new WorldMapDecoration[var9];

					for (var11 = 0; var11 < var9; ++var11) {
						int var12 = var3.readNullableLargeSmart();
						int var13 = var3.readUnsignedByte();
						var10[var11] = new WorldMapDecoration(var12, var13 >> 2, var13 & 3);
					}
				}
			}
		}

	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1515654392"
	)
	@Export("getRegionX")
	int getRegionX() {
		return this.regionX;
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "103752690"
	)
	@Export("getRegionY")
	int getRegionY() {
		return this.regionY;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ldr;I)V",
		garbageValue = "294784192"
	)
	@Export("runScriptEvent")
	public static void runScriptEvent(ScriptEvent var0) {
		class139.runScript(var0, 500000, 475000);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)Lfe;",
		garbageValue = "536652444"
	)
	static class133 method5682(int var0) {
		class133[] var1 = new class133[]{class133.field1609, class133.field1595, class133.field1594, class133.field1614, class133.field1598, class133.field1599, class133.field1600, class133.field1613, class133.field1602, class133.field1603, class133.field1610, class133.field1605, class133.field1606, class133.field1601, class133.field1608, class133.field1596, class133.field1597};
		class133 var2 = (class133)KitDefinition.findEnumerated(var1, var0);
		if (var2 == null) {
			var2 = class133.field1609;
		}

		return var2;
	}

	@ObfuscatedName("ou")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "829614777"
	)
	static void method5680(boolean var0) {
		Client.leftClickOpensMenu = var0;
	}
}
