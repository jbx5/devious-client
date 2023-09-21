import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ch")
@Implements("GraphicsObject")
public class GraphicsObject extends Renderable {
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1842226835
	)
	static int field890;
	@ObfuscatedName("bt")
	protected static String field888;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1980942277
	)
	@Export("id")
	int id;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -193799833
	)
	@Export("cycleStart")
	int cycleStart;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 488343415
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 463669607
	)
	@Export("x")
	int x;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1976147247
	)
	@Export("y")
	int y;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 371756529
	)
	@Export("z")
	int z;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lif;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -2020340729
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 597667557
	)
	@Export("frameCycle")
	int frameCycle;
	@ObfuscatedName("av")
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
		int var8 = class406.SpotAnimationDefinition_get(this.id).sequence;
		if (var8 != -1) {
			this.isFinished = false;
			this.sequenceDefinition = class36.SequenceDefinition_get(var8);
		} else {
			this.isFinished = true;
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "108"
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
				if (this.frame >= this.sequenceDefinition.method4177()) {
					this.isFinished = true;
				}
			}

		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)Ljn;",
		garbageValue = "0"
	)
	@Export("getModel")
	protected final Model getModel() {
		SpotAnimationDefinition var1 = class406.SpotAnimationDefinition_get(this.id);
		Model var2;
		if (!this.isFinished) {
			var2 = var1.getModel(this.frame);
		} else {
			var2 = var1.getModel(-1);
		}

		return var2 == null ? null : var2;
	}

	public GraphicsObject() {
	}
}
