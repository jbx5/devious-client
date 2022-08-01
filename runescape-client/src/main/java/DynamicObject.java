import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("bo")
@Implements("DynamicObject")
public class DynamicObject extends Renderable {
	@ObfuscatedName("a")
	public static short[][] field986;

	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = 1430212925)
	@Export("id")
	int id;

	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = -1046946639)
	@Export("type")
	int type;

	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = -394515925)
	@Export("orientation")
	int orientation;

	@ObfuscatedName("u")
	@ObfuscatedGetter(intValue = -492001715)
	@Export("plane")
	int plane;

	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = -1620176229)
	@Export("x")
	int x;

	@ObfuscatedName("w")
	@ObfuscatedGetter(intValue = 592777455)
	@Export("y")
	int y;

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = "Lgc;")
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;

	@ObfuscatedName("j")
	@ObfuscatedGetter(intValue = 1619092909)
	@Export("frame")
	int frame;

	@ObfuscatedName("h")
	@ObfuscatedGetter(intValue = -188388887)
	@Export("cycleStart")
	int cycleStart;

	@ObfuscatedSignature(descriptor = "(IIIIIIIZLgk;)V")
	DynamicObject(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, Renderable var9) {
		this.id = var1;
		this.type = var2;
		this.orientation = var3;
		this.plane = var4;
		this.x = var5;
		this.y = var6;
		if (var7 != -1) {
			this.sequenceDefinition = class14.SequenceDefinition_get(var7);
			this.frame = 0;
			this.cycleStart = Client.cycle - 1;
			if (this.sequenceDefinition.field2175 == 0 && var9 != null && var9 instanceof DynamicObject) {
				DynamicObject var10 = ((DynamicObject) (var9));
				if (var10.sequenceDefinition == this.sequenceDefinition) {
					this.frame = var10.frame;
					this.cycleStart = var10.cycleStart;
					return;
				}
			}
			if (var8 && this.sequenceDefinition.frameCount != -1) {
				if (!this.sequenceDefinition.isCachedModelIdSet()) {
					this.frame = ((int) (Math.random() * ((double) (this.sequenceDefinition.frameIds.length))));
					this.cycleStart -= ((int) (Math.random() * ((double) (this.sequenceDefinition.frameLengths[this.frame]))));
				} else {
					this.frame = ((int) (Math.random() * ((double) (this.sequenceDefinition.method3812()))));
				}
			}
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(I)Lhd;", garbageValue = "-842208187")
	@Export("getModel")
	protected final Model getModel() {
		int var2;
		if (this.sequenceDefinition != null) {
			int var1 = Client.cycle - this.cycleStart;
			if (var1 > 100 && this.sequenceDefinition.frameCount > 0) {
				var1 = 100;
			}
			if (this.sequenceDefinition.isCachedModelIdSet()) {
				var2 = this.sequenceDefinition.method3812();
				this.frame += var1;
				var1 = 0;
				if (this.frame >= var2) {
					this.frame = var2 - this.sequenceDefinition.frameCount;
					if (this.frame < 0 || this.frame > var2) {
						this.sequenceDefinition = null;
					}
				}
			} else {
				label82 : {
					do {
						do {
							if (var1 <= this.sequenceDefinition.frameLengths[this.frame]) {
								break label82;
							}
							var1 -= this.sequenceDefinition.frameLengths[this.frame];
							++this.frame;
						} while (this.frame < this.sequenceDefinition.frameIds.length );
						this.frame -= this.sequenceDefinition.frameCount;
					} while (this.frame >= 0 && this.frame < this.sequenceDefinition.frameIds.length );
					this.sequenceDefinition = null;
				}
			}
			this.cycleStart = Client.cycle - var1;
		}
		ObjectComposition var12 = WorldMapDecoration.getObjectDefinition(this.id);
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
			int var9 = var8[var4][var6] + var8[var5][var6] + var8[var4][var7] + var8[var5][var7] >> 2;
			int var10 = (this.x << 7) + (var2 << 6);
			int var11 = (this.y << 7) + (var3 << 6);
			return var12.getModelDynamic(this.type, this.orientation, var8, var10, var9, var11, this.sequenceDefinition, this.frame);
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(ZZI)Lql;", garbageValue = "-993701354")
	static IndexedSprite method2045(boolean var0, boolean var1) {
		return var0 ? var1 ? SoundSystem.field321 : Login.options_buttons_2Sprite : var1 ? class329.field4111 : class11.options_buttons_0Sprite;
	}
}