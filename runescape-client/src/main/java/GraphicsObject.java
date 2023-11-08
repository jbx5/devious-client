import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cu")
@Implements("GraphicsObject")
public class GraphicsObject extends Renderable {
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -760217247
	)
	@Export("id")
	int id;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1322973095
	)
	@Export("cycleStart")
	int cycleStart;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1889541897
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1464920783
	)
	@Export("x")
	int x;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1449357735
	)
	@Export("y")
	int y;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -609987307
	)
	@Export("z")
	int z;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lhx;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -202407843
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1223932003
	)
	@Export("frameCycle")
	int frameCycle;
	@ObfuscatedName("az")
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
		int var8 = Canvas.SpotAnimationDefinition_get(this.id).sequence;
		if (var8 != -1) {
			this.isFinished = false;
			this.sequenceDefinition = DynamicObject.SequenceDefinition_get(var8);
		} else {
			this.isFinished = true;
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-19"
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
				if (this.frame >= this.sequenceDefinition.method4064()) {
					this.isFinished = true;
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
		SpotAnimationDefinition var1 = Canvas.SpotAnimationDefinition_get(this.id);
		Model var2;
		if (!this.isFinished) {
			var2 = var1.getModel(this.frame);
		} else {
			var2 = var1.getModel(-1);
		}

		return var2 == null ? null : var2;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "-39"
	)
	public static boolean method2128(int var0, int var1) {
		return (var0 >> var1 + 1 & 1) != 0;
	}

	public GraphicsObject() {
	}
}
