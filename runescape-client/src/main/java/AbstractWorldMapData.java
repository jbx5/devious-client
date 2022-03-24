import java.util.LinkedList;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService; import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iu")
@Implements("AbstractWorldMapData")
public abstract class AbstractWorldMapData {
	@ObfuscatedName("ff")
	static String field2796;
	@ObfuscatedName("l")
	@ObfuscatedGetter(intValue = 
	-2134162895)

	@Export("regionXLow")
	int regionXLow;
	@ObfuscatedName("n")
	@ObfuscatedGetter(intValue = 
	466431409)

	@Export("regionYLow")
	int regionYLow;
	@ObfuscatedName("d")
	@ObfuscatedGetter(intValue = 
	1382300835)

	@Export("regionX")
	int regionX;
	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = 
	-1154191837)

	@Export("regionY")
	int regionY;
	@ObfuscatedName("u")
	@ObfuscatedGetter(intValue = 
	1056941337)

	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("r")
	@ObfuscatedGetter(intValue = 
	1127387871)

	@Export("planes")
	int planes;
	@ObfuscatedName("k")
	@ObfuscatedGetter(intValue = 
	1648265251)

	@Export("groupId")
	int groupId;
	@ObfuscatedName("x")
	@ObfuscatedGetter(intValue = 
	1093905309)

	@Export("fileId")
	int fileId;
	@ObfuscatedName("c")
	@Export("floorUnderlayIds")
	short[][][] floorUnderlayIds;
	@ObfuscatedName("j")
	@Export("floorOverlayIds")
	short[][][] floorOverlayIds;
	@ObfuscatedName("p")
	byte[][][] field2793;
	@ObfuscatedName("s")
	byte[][][] field2792;
	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = 
	"[[[[Lij;")

	@Export("decorations")
	WorldMapDecoration[][][][] decorations;
	@ObfuscatedName("w")
	boolean field2794;
	@ObfuscatedName("a")
	boolean field2795;

	AbstractWorldMapData() {
		this.groupId = -1;
		this.fileId = -1;
		new LinkedList();
		this.field2794 = false;
		this.field2795 = false;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"(Lpd;I)V", garbageValue = 
	"1809174469")

	@Export("readGeography")
	abstract void readGeography(Buffer var1);

	@ObfuscatedName("e")
	@ObfuscatedSignature(descriptor = 
	"(I)Z", garbageValue = 
	"2021413302")

	@Export("isFullyLoaded")
	boolean isFullyLoaded() {
		return this.field2794 && this.field2795;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(descriptor = 
	"(Llq;I)V", garbageValue = 
	"1505818240")

	@Export("loadGeography")
	void loadGeography(AbstractArchive var1) {
		if (!this.isFullyLoaded()) {
			byte[] var2 = var1.takeFile(this.groupId, this.fileId);
			if (var2 != null) {
				this.readGeography(new Buffer(var2));
				this.field2794 = true;
				this.field2795 = true;
			}

		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"1763355958")

	@Export("reset")
	void reset() {
		this.floorUnderlayIds = null;
		this.floorOverlayIds = null;
		this.field2793 = null;
		this.field2792 = null;
		this.decorations = null;
		this.field2794 = false;
		this.field2795 = false;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(descriptor = 
	"(IILpd;B)V", garbageValue = 
	"-26")

	@Export("readTile")
	void readTile(int var1, int var2, Buffer var3) {
		int var4 = var3.readUnsignedByte();
		if (var4 != 0) {
			if ((var4 & 1) != 0) {
				this.method4981(var1, var2, var3, var4);
			} else {
				this.method4960(var1, var2, var3, var4);
			}

		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(descriptor = 
	"(IILpd;II)V", garbageValue = 
	"2062281741")

	void method4981(int var1, int var2, Buffer var3, int var4) {
		boolean var5 = (var4 & 2) != 0;
		if (var5) {
			this.floorOverlayIds[0][var1][var2] = ((short) (var3.readUnsignedByte()));
		}

		this.floorUnderlayIds[0][var1][var2] = ((short) (var3.readUnsignedByte()));
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(descriptor = 
	"(IILpd;IB)V", garbageValue = 
	"-17")

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
					this.field2793[var9][var1][var2] = ((byte) (var11 >> 2));
					this.field2792[var9][var1][var2] = ((byte) (var11 & 3));
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

	@ObfuscatedName("au")
	@ObfuscatedSignature(descriptor = 
	"(I)I", garbageValue = 
	"-1156452481")

	@Export("getRegionX")
	int getRegionX() {
		return this.regionX;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(descriptor = 
	"(I)I", garbageValue = 
	"1671134455")

	@Export("getRegionY")
	int getRegionY() {
		return this.regionY;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = 
	"(Lfw;III)Lao;", garbageValue = 
	"-558526077")

	public static final PcmPlayer method4986(TaskHandler var0, int var1, int var2) {
		if ((var1 >= 0) && (var1 < 2)) {
			if (var2 < 256) {
				var2 = 256;
			}

			try {
				PcmPlayer var3 = BuddyRankComparator.pcmPlayerProvider.player();
				var3.samples = new int[256 * (PcmPlayer.PcmPlayer_stereo ? 2 : 1)];
				var3.field282 = var2;
				var3.init();
				var3.capacity = (var2 & (-1024)) + 1024;
				if (var3.capacity > 16384) {
					var3.capacity = 16384;
				}

				var3.open(var3.capacity);
				if ((class33.field237 > 0) && (VarpDefinition.soundSystem == null)) {
					VarpDefinition.soundSystem = new SoundSystem();
					class342.soundSystemExecutor = Executors.newScheduledThreadPool(1);
					class342.soundSystemExecutor.scheduleAtFixedRate(VarpDefinition.soundSystem, 0L, 10L, TimeUnit.MILLISECONDS);
				}

				if (VarpDefinition.soundSystem != null) {
					if (VarpDefinition.soundSystem.players[var1] != null) {
						throw new IllegalArgumentException();
					}

					VarpDefinition.soundSystem.players[var1] = var3;
				}

				return var3;
			} catch (Throwable var4) {
				return new PcmPlayer();
			}
		} else {
			throw new IllegalArgumentException();
		}
	}
}