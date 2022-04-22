import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bn")
@Implements("GraphicsObject")
public class GraphicsObject extends Renderable {
	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = 
	633552685)

	@Export("id")
	int id;
	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = 
	-1513105003)

	@Export("cycleStart")
	int cycleStart;
	@ObfuscatedName("i")
	@ObfuscatedGetter(intValue = 
	-809996185)

	@Export("plane")
	int plane;
	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = 
	1383105845)

	@Export("x")
	int x;
	@ObfuscatedName("b")
	@ObfuscatedGetter(intValue = 
	-2057789727)

	@Export("y")
	int y;
	@ObfuscatedName("n")
	@ObfuscatedGetter(intValue = 
	-1487431233)

	@Export("z")
	int z;
	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = 
	"Lgw;")

	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("l")
	@ObfuscatedGetter(intValue = 
	1421112585)

	@Export("frame")
	int frame;
	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = 
	-1965539669)

	@Export("frameCycle")
	int frameCycle;
	@ObfuscatedName("o")
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
		int var8 = ClientPreferences.SpotAnimationDefinition_get(this.id).sequence;
		if (var8 != (-1)) {
			this.isFinished = false;
			this.sequenceDefinition = class163.SequenceDefinition_get(var8);
		} else {
			this.isFinished = true;
		}

	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(IB)V", garbageValue = 
	"79")

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
				if (this.frame >= this.sequenceDefinition.method3844()) {
					this.isFinished = true;
				}
			}

		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(B)Liq;", garbageValue = 
	"103")

	@Export("getModel")
	protected final Model getModel() {
		SpotAnimationDefinition var1 = ClientPreferences.SpotAnimationDefinition_get(this.id);
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