import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("it")
@Implements("Renderable")
public abstract class Renderable extends DualNode {
	@ObfuscatedName("er")
	@ObfuscatedGetter(
		intValue = -1050076859
	)
	@Export("height")
	public int height;

	protected Renderable() {
		this.height = 1000;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Ljo;",
		garbageValue = "-983173466"
	)
	@Export("getModel")
	protected Model getModel() {
		return null;
	}

	@ObfuscatedName("dx")
	@Export("draw")
	void draw(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
		Model var11 = this.getModel();
		if (var11 != null) {
			this.height = var11.height;
			var11.draw(var1, var2, var3, var4, var5, var6, var7, var8, var9);
		}

	}
}
