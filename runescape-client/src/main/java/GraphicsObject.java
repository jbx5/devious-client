import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cg")
@Implements("GraphicsObject")
public class GraphicsObject extends Renderable {
	@ObfuscatedName("dd")
	static boolean field902;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -61247699
	)
	@Export("id")
	int id;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -217494561
	)
	@Export("cycleStart")
	int cycleStart;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -107795739
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1739675053
	)
	@Export("x")
	int x;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 777941077
	)
	@Export("y")
	int y;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1573445793
	)
	@Export("z")
	int z;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1549919911
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1586287101
	)
	@Export("frameCycle")
	int frameCycle;
	@ObfuscatedName("ao")
	@Export("isFinished")
	boolean isFinished;

	GraphicsObject(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		this.frame = 0;
		this.frameCycle = 0;
		this.isFinished = false;
		this.id = var1;
		this.plane = var2;
		this.x = var3;
		this.y = var4;
		this.z = var5;
		this.cycleStart = var7 + var6;
		int var8 = Sound.SpotAnimationDefinition_get(this.id).sequence;
		if (var8 != -1) {
			this.isFinished = false;
			this.sequenceDefinition = FaceNormal.SequenceDefinition_get(var8);
		} else {
			this.isFinished = true;
		}

	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-58"
	)
	@Export("advance")
	final void advance(int var1) {
		if (!this.isFinished) {
			this.frameCycle += var1;
			if (!this.sequenceDefinition.isCachedModelIdSet()) {
				while (this.frameCycle > this.sequenceDefinition.frameLengths[this.frame]) {
					this.frameCycle -= this.sequenceDefinition.frameLengths[this.frame];
					++this.frame;
					if (this.frame >= this.sequenceDefinition.frameIds.length) {
						this.isFinished = true;
						break;
					}
				}
			} else {
				this.frame += var1;
				if (this.frame >= this.sequenceDefinition.method4326()) {
					this.isFinished = true;
				}
			}

		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Lkb;",
		garbageValue = "-852782106"
	)
	@Export("getModel")
	protected final Model getModel() {
		SpotAnimationDefinition var1 = Sound.SpotAnimationDefinition_get(this.id);
		Model var2;
		if (!this.isFinished) {
			var2 = var1.getModel(this.frame);
		} else {
			var2 = var1.getModel(-1);
		}

		return var2 == null ? null : var2;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-100"
	)
	public static void method2102() {
		FileSystem.FileSystem_cacheFiles.clear();
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-395899461"
	)
	public static int method2104(int var0, int var1, int var2) {
		int var3 = WorldMapID.method5942(var2 - var1 + 1);
		var3 <<= var1;
		return var0 & ~var3;
	}

	@ObfuscatedName("ly")
	@ObfuscatedSignature(
		descriptor = "(Ldt;Ldk;I)V",
		garbageValue = "2074227552"
	)
	static final void method2099(class101 var0, PendingSpawn var1) {
		Scene var2 = var0.field1331;
		long var3 = 0L;
		int var5 = -1;
		int var6 = 0;
		int var7 = 0;
		if (var1.field1191 == 0) {
			var3 = var2.getBoundaryObjectTag(var1.field1200, var1.field1192, var1.field1196);
		}

		if (var1.field1191 == 1) {
			var3 = var2.getWallDecorationTag(var1.field1200, var1.field1192, var1.field1196);
		}

		if (var1.field1191 == 2) {
			var3 = var2.getGameObjectTag(var1.field1200, var1.field1192, var1.field1196);
		}

		if (var1.field1191 == 3) {
			var3 = var2.getFloorDecorationTag(var1.field1200, var1.field1192, var1.field1196);
		}

		if (var3 != 0L) {
			int var8 = var2.getObjectFlags(var1.field1200, var1.field1192, var1.field1196, var3);
			var5 = class105.method2748(var3);
			var6 = var8 & 31;
			var7 = var8 >> 6 & 3;
		}

		var1.field1194 = var5;
		var1.field1201 = var6;
		var1.field1195 = var7;
	}

	public GraphicsObject() {
	}
}
