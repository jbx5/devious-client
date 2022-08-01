import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("bp")
@Implements("GraphicsObject")
public class GraphicsObject extends Renderable {
	@ObfuscatedName("ix")
	@ObfuscatedGetter(intValue = 1138996141)
	@Export("selectedItemWidget")
	static int selectedItemWidget;

	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = -1047624505)
	@Export("id")
	int id;

	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = 1499775571)
	@Export("cycleStart")
	int cycleStart;

	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = 1264391023)
	@Export("plane")
	int plane;

	@ObfuscatedName("u")
	@ObfuscatedGetter(intValue = -336804817)
	@Export("x")
	int x;

	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = -1743079855)
	@Export("y")
	int y;

	@ObfuscatedName("w")
	@ObfuscatedGetter(intValue = -1982831053)
	@Export("z")
	int z;

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = "Lgc;")
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;

	@ObfuscatedName("j")
	@ObfuscatedGetter(intValue = 1475288121)
	@Export("frame")
	int frame;

	@ObfuscatedName("h")
	@ObfuscatedGetter(intValue = -1798816539)
	@Export("frameCycle")
	int frameCycle;

	@ObfuscatedName("a")
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
		int var8 = class13.SpotAnimationDefinition_get(this.id).sequence;
		if (var8 != -1) {
			this.isFinished = false;
			this.sequenceDefinition = class14.SequenceDefinition_get(var8);
		} else {
			this.isFinished = true;
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "-453540716")
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
				if (this.frame >= this.sequenceDefinition.method3812()) {
					this.isFinished = true;
				}
			}
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(I)Lhd;", garbageValue = "-842208187")
	@Export("getModel")
	protected final Model getModel() {
		SpotAnimationDefinition var1 = class13.SpotAnimationDefinition_get(this.id);
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