import java.util.LinkedList;
import net.runelite.mapping.ObfuscatedName;
import java.awt.Desktop.Action;
import net.runelite.mapping.ObfuscatedSignature;
import java.awt.Desktop;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import java.net.URI;
import net.runelite.mapping.Export;
@ObfuscatedName("hd")
@Implements("AbstractWorldMapData")
public abstract class AbstractWorldMapData {
	@ObfuscatedName("pk")
	@ObfuscatedSignature(descriptor = "Lpr;")
	@Export("HitSplatDefinition_cachedSprites")
	static class427 HitSplatDefinition_cachedSprites;

	@ObfuscatedName("j")
	@ObfuscatedGetter(intValue = -1310599883)
	@Export("regionXLow")
	int regionXLow;

	@ObfuscatedName("e")
	@ObfuscatedGetter(intValue = 1550502339)
	@Export("regionYLow")
	int regionYLow;

	@ObfuscatedName("g")
	@ObfuscatedGetter(intValue = -1231055167)
	@Export("regionX")
	int regionX;

	@ObfuscatedName("w")
	@ObfuscatedGetter(intValue = -1712917707)
	@Export("regionY")
	int regionY;

	@ObfuscatedName("y")
	@ObfuscatedGetter(intValue = -445502067)
	@Export("minPlane")
	int minPlane;

	@ObfuscatedName("i")
	@ObfuscatedGetter(intValue = -1847125717)
	@Export("planes")
	int planes;

	@ObfuscatedName("s")
	@ObfuscatedGetter(intValue = -1231676597)
	@Export("groupId")
	int groupId;

	@ObfuscatedName("t")
	@ObfuscatedGetter(intValue = -187644203)
	@Export("fileId")
	int fileId;

	@ObfuscatedName("z")
	@Export("floorUnderlayIds")
	short[][][] floorUnderlayIds;

	@ObfuscatedName("r")
	@Export("floorOverlayIds")
	short[][][] floorOverlayIds;

	@ObfuscatedName("u")
	byte[][][] field2796;

	@ObfuscatedName("k")
	byte[][][] field2795;

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "[[[[Lix;")
	@Export("decorations")
	WorldMapDecoration[][][][] decorations;

	@ObfuscatedName("x")
	boolean field2810;

	@ObfuscatedName("l")
	boolean field2808;

	AbstractWorldMapData() {
		this.groupId = -1;
		this.fileId = -1;
		new LinkedList();
		this.field2810 = false;
		this.field2808 = false;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(Lqt;I)V", garbageValue = "-2593161")
	@Export("readGeography")
	abstract void readGeography(Buffer var1);

	@ObfuscatedName("a")
	@ObfuscatedSignature(descriptor = "(S)Z", garbageValue = "2000")
	@Export("isFullyLoaded")
	boolean isFullyLoaded() {
		return this.field2810 && this.field2808;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(descriptor = "(Llh;B)V", garbageValue = "-6")
	@Export("loadGeography")
	void loadGeography(AbstractArchive var1) {
		if (!this.isFullyLoaded()) {
			byte[] var2 = var1.takeFile(this.groupId, this.fileId);
			if (var2 != null) {
				this.readGeography(new Buffer(var2));
				this.field2810 = true;
				this.field2808 = true;
			}
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "-81")
	@Export("reset")
	void reset() {
		this.floorUnderlayIds = null;
		this.floorOverlayIds = null;
		this.field2796 = null;
		this.field2795 = null;
		this.decorations = null;
		this.field2810 = false;
		this.field2808 = false;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = "(IILqt;I)V", garbageValue = "1403402457")
	@Export("readTile")
	void readTile(int var1, int var2, Buffer var3) {
		int var4 = var3.readUnsignedByte();
		if (var4 != 0) {
			if ((var4 & 1) != 0) {
				this.method4980(var1, var2, var3, var4);
			} else {
				this.method4960(var1, var2, var3, var4);
			}
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(IILqt;IS)V", garbageValue = "-25034")
	void method4980(int var1, int var2, Buffer var3, int var4) {
		boolean var5 = (var4 & 2) != 0;
		if (var5) {
			this.floorOverlayIds[0][var1][var2] = ((short) (var3.readUnsignedByte()));
		}
		this.floorUnderlayIds[0][var1][var2] = ((short) (var3.readUnsignedByte()));
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(descriptor = "(IILqt;IB)V", garbageValue = "117")
	void method4960(int var1, int var2, Buffer var3, int var4) {
		int var5 = ((var4 & 24) >> 3) + 1;
		boolean var6 = (var4 & 2) != 0;
		boolean var7 = (var4 & 4) != 0;
		this.floorUnderlayIds[0][var1][var2] = ((short) (var3.readUnsignedByte()));
		int var8;
		int var9;
		int var11;
		if (var6) {
			var8 = var3.readUnsignedByte();
			for (var9 = 0; var9 < var8; ++var9) {
				int var14 = var3.readUnsignedByte();
				if (var14 != 0) {
					this.floorOverlayIds[var9][var1][var2] = ((short) (var14));
					var11 = var3.readUnsignedByte();
					this.field2796[var9][var1][var2] = ((byte) (var11 >> 2));
					this.field2795[var9][var1][var2] = ((byte) (var11 & 3));
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

	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "2061969242")
	@Export("getRegionX")
	int getRegionX() {
		return this.regionX;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-604359036")
	@Export("getRegionY")
	int getRegionY() {
		return this.regionY;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;ZLjava/lang/String;ZI)V", garbageValue = "383517165")
	static void method4987(String var0, boolean var1, String var2, boolean var3) {
		if (var1) {
			if (!var3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
				try {
					Desktop.getDesktop().browse(new URI(var0));
					return;
				} catch (Exception var5) {
				}
			}
			if (class29.field169.startsWith("win") && !var3) {
				class294.method5736(var0, 0, "openjs");
				return;
			}
			if (class29.field169.startsWith("mac")) {
				class294.method5736(var0, 1, var2);
				return;
			}
			class294.method5736(var0, 2, "openjs");
		} else {
			class294.method5736(var0, 3, "openjs");
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-1305112358")
	static void method4958() {
		Players.Players_count = 0;
		for (int var0 = 0; var0 < 2048; ++var0) {
			Players.field1307[var0] = null;
			Players.field1304[var0] = class192.field2212;
		}
	}

	@ObfuscatedName("gx")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-2134407784")
	static final void method4985() {
		if (class326.field4082) {
			for (int var0 = 0; var0 < Players.Players_count; ++var0) {
				Player var1 = Client.players[Players.Players_indices[var0]];
				var1.method2135();
			}
			class326.field4082 = false;
		}
	}
}