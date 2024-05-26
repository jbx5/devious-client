import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dr")
@Implements("DynamicObject")
public class DynamicObject extends Renderable {
	@ObfuscatedName("fp")
	@ObfuscatedSignature(
		descriptor = "Lot;"
	)
	static Archive field1038;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Ldt;"
	)
	@Export("worldView")
	WorldView worldView;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -221657491
	)
	@Export("id")
	int id;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 361896199
	)
	@Export("type")
	int type;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 2000434069
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -415493371
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -25327393
	)
	@Export("x")
	int x;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 743991919
	)
	@Export("y")
	int y;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -440522477
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -212623117
	)
	@Export("cycleStart")
	int cycleStart;

	@ObfuscatedSignature(
		descriptor = "(Ldt;IIIIIIIZLju;)V"
	)
	DynamicObject(WorldView var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, Renderable var10) {
		this.worldView = var1;
		this.id = var2;
		this.type = var3;
		this.orientation = var4;
		this.plane = var5;
		this.x = var6;
		this.y = var7;
		if (var8 != -1) {
			this.sequenceDefinition = FaceNormal.SequenceDefinition_get(var8);
			this.frame = 0;
			this.cycleStart = Client.cycle - 1;
			if (this.sequenceDefinition.restartMode == 0 && var10 != null && var10 instanceof DynamicObject) {
				DynamicObject var11 = (DynamicObject)var10;
				if (this.sequenceDefinition == var11.sequenceDefinition) {
					this.frame = var11.frame;
					this.cycleStart = var11.cycleStart;
					return;
				}
			}

			if (var9 && this.sequenceDefinition.frameCount != -1) {
				if (!this.sequenceDefinition.isCachedModelIdSet()) {
					this.frame = (int)(Math.random() * (double)this.sequenceDefinition.frameIds.length);
					this.cycleStart -= (int)(Math.random() * (double)this.sequenceDefinition.frameLengths[this.frame]);
				} else {
					this.frame = (int)(Math.random() * (double)this.sequenceDefinition.method4326());
				}
			}
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Lkb;",
		garbageValue = "-852782106"
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
				var2 = this.sequenceDefinition.method4326();
				this.frame += var1;
				var1 = 0;
				if (this.frame >= var2) {
					this.frame = var2 - this.sequenceDefinition.frameCount;
					if (this.frame < 0 || this.frame > var2) {
						this.sequenceDefinition = null;
					}
				}
			} else {
				label83: {
					do {
						do {
							if (var1 <= this.sequenceDefinition.frameLengths[this.frame]) {
								break label83;
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

		ObjectComposition var12 = HitSplatDefinition.getObjectDefinition(this.id);
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
			int[][] var8 = this.worldView.tileHeights[this.plane];
			int var9 = var8[var4][var7] + var8[var5][var6] + var8[var4][var6] + var8[var5][var7] >> 2;
			int var10 = (this.x << 7) + (var2 << 6);
			int var11 = (this.y << 7) + (var3 << 6);
			return var12.getModelDynamic(this.type, this.orientation, var8, var10, var9, var11, this.sequenceDefinition, this.frame);
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "295501002"
	)
	public static void method2224(int var0, int var1) {
		VarbitComposition var2 = MouseHandler.method689(var0);
		int var3 = var2.baseVar;
		int var4 = var2.startBit;
		int var5 = var2.endBit;
		int var6 = Varps.Varps_masks[var5 - var4];
		if (var1 < 0 || var1 > var6) {
			var1 = 0;
		}

		var6 <<= var4;
		Varps.Varps_main[var3] = Varps.Varps_main[var3] & ~var6 | var1 << var4 & var6;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lnb;II)V",
		garbageValue = "-1992565034"
	)
	@Export("Widget_setKeyIgnoreHeld")
	static final void Widget_setKeyIgnoreHeld(Widget var0, int var1) {
		if (var0.field3891 == null) {
			throw new RuntimeException();
		} else {
			if (var0.field3822 == null) {
				var0.field3822 = new int[var0.field3891.length];
			}

			var0.field3822[var1] = Integer.MAX_VALUE;
		}
	}
}
