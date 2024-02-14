import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cp")
@Implements("GraphicsObject")
public class GraphicsObject extends Renderable {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1645630793
	)
	@Export("id")
	int id;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 544938599
	)
	@Export("cycleStart")
	int cycleStart;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 917498307
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1816433785
	)
	@Export("x")
	int x;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1360942911
	)
	@Export("y")
	int y;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1769987357
	)
	@Export("z")
	int z;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lhs;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -511691401
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -338146921
	)
	@Export("frameCycle")
	int frameCycle;
	@ObfuscatedName("au")
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
		int var8 = VarbitComposition.SpotAnimationDefinition_get(this.id).sequence;
		if (var8 != -1) {
			this.isFinished = false;
			this.sequenceDefinition = MilliClock.SequenceDefinition_get(var8);
		} else {
			this.isFinished = true;
		}

	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1268630388"
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
				if (this.frame >= this.sequenceDefinition.method4065()) {
					this.isFinished = true;
				}
			}

		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Lkz;",
		garbageValue = "1036754463"
	)
	@Export("getModel")
	protected final Model getModel() {
		SpotAnimationDefinition var1 = VarbitComposition.SpotAnimationDefinition_get(this.id);
		Model var2;
		if (!this.isFinished) {
			var2 = var1.getModel(this.frame);
		} else {
			var2 = var1.getModel(-1);
		}

		return var2 == null ? null : var2;
	}

	@ObfuscatedName("hh")
	@ObfuscatedSignature(
		descriptor = "(Lhs;IIILdz;I)V",
		garbageValue = "-527389665"
	)
	static void method2116(SequenceDefinition var0, int var1, int var2, int var3, Actor var4) {
		if (Client.soundEffectCount < 50) {
			if (var0.soundEffects != null && var1 < var0.soundEffects.length && var0.soundEffects[var1] != null) {
				int var5 = var0.soundEffects[var1].field2109 & 31;
				if ((var5 <= 0 || class30.clientPreferences.getAreaSoundEffectsVolume() != 0) && (var5 != 0 || class30.clientPreferences.getSoundEffectsVolume() != 0)) {
					class94.method2453(var0.soundEffects[var1], var2, var3, var4 == VarpDefinition.localPlayer);
				}
			}
		}
	}

	@ObfuscatedName("ju")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "-1215891921"
	)
	static void method2114(int var0, int var1, int var2, int var3, int var4, int var5) {
		NodeDeque var6 = Client.groundItems[var0][var1][var2];
		if (var6 != null) {
			for (TileItem var7 = (TileItem)var6.last(); var7 != null; var7 = (TileItem)var6.previous()) {
				if ((var3 & 32767) == var7.id && var4 == var7.quantity) {
					var7.quantity = var5;
					break;
				}
			}

			class73.updateItemPile(var0, var1, var2);
		}

	}

	public GraphicsObject() {
	}
}
