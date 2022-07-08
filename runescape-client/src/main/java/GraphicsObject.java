import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("bh")
@Implements("GraphicsObject")
public class GraphicsObject extends Renderable {
	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = 630502901)
	@Export("id")
	int id;

	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = -1889786839)
	@Export("cycleStart")
	int cycleStart;

	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = 844498895)
	@Export("plane")
	int plane;

	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = 1978807023)
	@Export("x")
	int x;

	@ObfuscatedName("j")
	@ObfuscatedGetter(intValue = 926391019)
	@Export("y")
	int y;

	@ObfuscatedName("e")
	@ObfuscatedGetter(intValue = 574718691)
	@Export("z")
	int z;

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = "Lgc;")
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;

	@ObfuscatedName("w")
	@ObfuscatedGetter(intValue = -1310150497)
	@Export("frame")
	int frame;

	@ObfuscatedName("y")
	@ObfuscatedGetter(intValue = 426269681)
	@Export("frameCycle")
	int frameCycle;

	@ObfuscatedName("i")
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
		int var8 = ObjectSound.SpotAnimationDefinition_get(this.id).sequence;
		if (var8 != -1) {
			this.isFinished = false;
			this.sequenceDefinition = ScriptFrame.SequenceDefinition_get(var8);
		} else {
			this.isFinished = true;
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "-1454918275")
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
				if (this.frame >= this.sequenceDefinition.method3835()) {
					this.isFinished = true;
				}
			}
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(I)Lhy;", garbageValue = "1081110576")
	@Export("getModel")
	protected final Model getModel() {
		SpotAnimationDefinition var1 = ObjectSound.SpotAnimationDefinition_get(this.id);
		Model var2;
		if (!this.isFinished) {
			var2 = var1.getModel(this.frame);
		} else {
			var2 = var1.getModel(-1);
		}
		return var2 == null ? null : var2;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", garbageValue = "337794204")
	static void method1877(String var0, String var1, String var2) {
		WorldMapData_1.method4872(7);
		class101.setLoginResponseString(var0, var1, var2);
	}

	@ObfuscatedName("ki")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "2056411217")
	static void method1870() {
		for (InterfaceParent var0 = ((InterfaceParent) (Client.interfaceParents.first())); var0 != null; var0 = ((InterfaceParent) (Client.interfaceParents.next()))) {
			int var1 = var0.group;
			if (WorldMapSection2.loadInterface(var1)) {
				boolean var2 = true;
				Widget[] var3 = SoundCache.Widget_interfaceComponents[var1];
				int var4;
				for (var4 = 0; var4 < var3.length; ++var4) {
					if (var3[var4] != null) {
						var2 = var3[var4].isIf3;
						break;
					}
				}
				if (!var2) {
					var4 = ((int) (var0.key));
					Widget var5 = class140.getWidget(var4);
					if (var5 != null) {
						ChatChannel.invalidateWidget(var5);
					}
				}
			}
		}
	}

	public GraphicsObject() {
	}
}