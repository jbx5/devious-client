import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("di")
@Implements("DynamicObject")
public class DynamicObject extends Renderable {
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 397033549
	)
	@Export("id")
	int id;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 907568557
	)
	@Export("type")
	int type;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1972714689
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1138644923
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -267615049
	)
	@Export("x")
	int x;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1043709331
	)
	@Export("y")
	int y;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lhx;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -2062693637
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1708122471
	)
	@Export("cycleStart")
	int cycleStart;

	@ObfuscatedSignature(
		descriptor = "(IIIIIIIZLkt;)V"
	)
	DynamicObject(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, Renderable var9) {
		this.id = var1;
		this.type = var2;
		this.orientation = var3;
		this.plane = var4;
		this.x = var5;
		this.y = var6;
		if (var7 != -1) {
			this.sequenceDefinition = SequenceDefinition_get(var7);
			this.frame = 0;
			this.cycleStart = Client.cycle - 1;
			if (this.sequenceDefinition.restartMode == 0 && var9 != null && var9 instanceof DynamicObject) {
				DynamicObject var10 = (DynamicObject)var9;
				if (var10.sequenceDefinition == this.sequenceDefinition) {
					this.frame = var10.frame;
					this.cycleStart = var10.cycleStart;
					return;
				}
			}

			if (var8 && this.sequenceDefinition.frameCount != -1) {
				if (!this.sequenceDefinition.isCachedModelIdSet()) {
					this.frame = (int)(Math.random() * (double)this.sequenceDefinition.frameIds.length);
					this.cycleStart -= (int)(Math.random() * (double)this.sequenceDefinition.frameLengths[this.frame]);
				} else {
					this.frame = (int)(Math.random() * (double)this.sequenceDefinition.method4064());
				}
			}
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)Lka;",
		garbageValue = "1"
	)
	@Export("getModel")
	protected final Model getModel() {
		int var2;
		if (this.sequenceDefinition != null) {
			int var1 = Client.cycle - this.cycleStart;
			if (var1 > 100 && this.sequenceDefinition.frameCount > 0) {
				var1 = 100;
			}

			if (this.sequenceDefinition.isCachedModelIdSet()) {
				var2 = this.sequenceDefinition.method4064();
				this.frame += var1;
				var1 = 0;
				if (this.frame >= var2) {
					this.frame = var2 - this.sequenceDefinition.frameCount;
					if (this.frame < 0 || this.frame > var2) {
						this.sequenceDefinition = null;
					}
				}
			} else {
				label80: {
					do {
						do {
							if (var1 <= this.sequenceDefinition.frameLengths[this.frame]) {
								break label80;
							}

							var1 -= this.sequenceDefinition.frameLengths[this.frame];
							++this.frame;
						} while(this.frame < this.sequenceDefinition.frameIds.length);

						this.frame -= this.sequenceDefinition.frameCount;
					} while(this.frame >= 0 && this.frame < this.sequenceDefinition.frameIds.length);

					this.sequenceDefinition = null;
				}
			}

			this.cycleStart = Client.cycle - var1;
		}

		ObjectComposition var12 = WorldMapSection2.getObjectDefinition(this.id);
		if (var12.transforms != null) {
			var12 = var12.transform();
		}

		if (var12 == null) {
			return null;
		} else {
			int var3;
			if (this.orientation != 1 && this.orientation != 3) {
				var2 = var12.sizeX;
				var3 = var12.sizeY;
			} else {
				var2 = var12.sizeY;
				var3 = var12.sizeX;
			}

			int var4 = (var2 >> 1) + this.x;
			int var5 = (var2 + 1 >> 1) + this.x;
			int var6 = (var3 >> 1) + this.y;
			int var7 = (var3 + 1 >> 1) + this.y;
			int[][] var8 = Tiles.Tiles_heights[this.plane];
			int var9 = var8[var5][var7] + var8[var5][var6] + var8[var4][var6] + var8[var4][var7] >> 2;
			int var10 = (this.x << 7) + (var2 << 6);
			int var11 = (this.y << 7) + (var3 << 6);
			return var12.getModelDynamic(this.type, this.orientation, var8, var10, var9, var11, this.sequenceDefinition, this.frame);
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)Lhx;",
		garbageValue = "-1047374686"
	)
	@Export("SequenceDefinition_get")
	public static SequenceDefinition SequenceDefinition_get(int var0) {
		SequenceDefinition var1 = (SequenceDefinition)SequenceDefinition.SequenceDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = class369.SequenceDefinition_archive.takeFile(12, var0);
			var1 = new SequenceDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.postDecode();
			SequenceDefinition.SequenceDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("hn")
	@ObfuscatedSignature(
		descriptor = "(Lhx;IIILdf;I)V",
		garbageValue = "732979691"
	)
	static void method2244(SequenceDefinition var0, int var1, int var2, int var3, Actor var4) {
		if (Client.soundEffectCount < 50) {
			if (var0.soundEffects != null && var1 < var0.soundEffects.length) {
				int var5 = var0.soundEffects[var1] & 15;
				if ((var5 <= 0 || WorldMapIcon_1.clientPreferences.getAreaSoundEffectsVolume() != 0) && (var5 != 0 || WorldMapIcon_1.clientPreferences.getSoundEffectsVolume() != 0)) {
					int var6 = var0.soundEffects[var1];
					boolean var9 = var4 == class229.localPlayer;
					if (var6 != 0) {
						int var10 = var6 & 15;
						int var11;
						int var12;
						if (var10 == 0) {
							if (!var9) {
								return;
							}

							Client.soundLocations[Client.soundEffectCount] = 0;
						} else {
							var11 = (var2 - 64) / 128;
							var12 = (var3 - 64) / 128;
							Client.soundLocations[Client.soundEffectCount] = var10 + (var12 << 8) + (var11 << 16);
						}

						var11 = var6 >> 8;
						var12 = var6 >> 4 & 7;
						Client.soundEffectIds[Client.soundEffectCount] = var11;
						Client.queuedSoundEffectLoops[Client.soundEffectCount] = var12;
						Client.queuedSoundEffectDelays[Client.soundEffectCount] = 0;
						Client.soundEffects[Client.soundEffectCount] = null;
						++Client.soundEffectCount;
					}

				}
			}
		}
	}
}
