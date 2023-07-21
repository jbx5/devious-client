import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cl")
@Implements("GraphicsObject")
public class GraphicsObject extends Renderable {
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1785449313
	)
	@Export("id")
	int id;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 532269849
	)
	@Export("cycleStart")
	int cycleStart;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1919905893
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1123218449
	)
	@Export("x")
	int x;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1323044463
	)
	@Export("y")
	int y;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1884140779
	)
	@Export("z")
	int z;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1460987609
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1679083777
	)
	@Export("frameCycle")
	int frameCycle;
	@ObfuscatedName("ap")
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
		int var8 = NPCComposition.SpotAnimationDefinition_get(this.id).sequence;
		if (var8 != -1) {
			this.isFinished = false;
			this.sequenceDefinition = class135.SequenceDefinition_get(var8);
		} else {
			this.isFinished = true;
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-1"
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
				if (this.frame >= this.sequenceDefinition.method4074()) {
					this.isFinished = true;
				}
			}

		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Ljo;",
		garbageValue = "-983173466"
	)
	@Export("getModel")
	protected final Model getModel() {
		SpotAnimationDefinition var1 = NPCComposition.SpotAnimationDefinition_get(this.id);
		Model var2;
		if (!this.isFinished) {
			var2 = var1.getModel(this.frame);
		} else {
			var2 = var1.getModel(-1);
		}

		return var2 == null ? null : var2;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-30148371"
	)
	public static boolean method2081() {
		ReflectionCheck var0 = (ReflectionCheck)class36.reflectionChecks.last();
		return var0 != null;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lmt;II)V",
		garbageValue = "762775056"
	)
	@Export("Widget_setKeyIgnoreHeld")
	static final void Widget_setKeyIgnoreHeld(Widget var0, int var1) {
		if (var0.field3711 == null) {
			throw new RuntimeException();
		} else {
			if (var0.field3769 == null) {
				var0.field3769 = new int[var0.field3711.length];
			}

			var0.field3769[var1] = Integer.MAX_VALUE;
		}
	}

	public GraphicsObject() {
	}
}
