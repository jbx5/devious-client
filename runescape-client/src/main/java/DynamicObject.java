import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dj")
@Implements("DynamicObject")
public class DynamicObject extends Renderable {
	@ObfuscatedName("by")
	@Export("client")
	@ObfuscatedSignature(
		descriptor = "Lclient;"
	)
	public static Client client;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Ldy;"
	)
	@Export("worldView")
	final WorldView worldView;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1525575171
	)
	@Export("id")
	final int id;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1122655813
	)
	@Export("type")
	final int type;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1582123371
	)
	@Export("orientation")
	final int orientation;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1518726997
	)
	@Export("plane")
	final int plane;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 156798943
	)
	@Export("x")
	final int x;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1107102909
	)
	@Export("y")
	final int y;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lkr;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1437847093
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 355630901
	)
	@Export("cycleStart")
	int cycleStart;

	@ObfuscatedSignature(
		descriptor = "(Ldy;IIIIIIIZLhs;)V"
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
			this.sequenceDefinition = class182.SequenceDefinition_get(var8);
			this.frame = 0;
			this.cycleStart = Client.cycle - 1;
			if (this.sequenceDefinition.restartMode == 0 && var10 instanceof DynamicObject) {
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
					this.frame = (int)(Math.random() * (double)this.sequenceDefinition.method5307());
				}
			}
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Lhr;",
		garbageValue = "-1547633874"
	)
	@Export("getModel")
	protected final Model getModel() {
		ObjectComposition var1 = class222.getObjectDefinition(this.id);
		if (var1.transforms != null) {
			var1 = var1.transform();
		}

		if (var1 == null) {
			return null;
		} else {
			int var2;
			int var3;
			if (this.orientation != 1 && this.orientation != 3) {
				var2 = var1.sizeX;
				var3 = var1.sizeY;
			} else {
				var2 = var1.sizeY;
				var3 = var1.sizeX;
			}

			int var4 = (var2 >> 1) + this.x;
			int var5 = (var2 + 1 >> 1) + this.x;
			int var6 = (var3 >> 1) + this.y;
			int var7 = (var3 + 1 >> 1) + this.y;
			int[][] var8 = this.worldView.tileHeights[this.plane];
			int var9 = var8[var5][var7] + var8[var5][var6] + var8[var4][var6] + var8[var4][var7] >> 2;
			int var10 = (this.x << 7) + (var2 << 6);
			int var11 = (this.y << 7) + (var3 << 6);
			if (this.sequenceDefinition != null) {
				int var12 = Client.cycle - this.cycleStart;
				if (var12 > 100 && this.sequenceDefinition.frameCount > 0) {
					var12 = 100;
				}

				if (!this.sequenceDefinition.isCachedModelIdSet()) {
					label60: {
						do {
							while (true) {
								if (var12 <= this.sequenceDefinition.frameLengths[this.frame]) {
									break label60;
								}

								var12 -= this.sequenceDefinition.frameLengths[this.frame];
								++this.frame;
								if (this.frame >= this.sequenceDefinition.frameIds.length) {
									this.frame -= this.sequenceDefinition.frameCount;
									break;
								}

								class142.method3293(this.sequenceDefinition, this.frame, var10, var11, false);
							}
						} while(this.frame >= 0 && this.frame < this.sequenceDefinition.frameIds.length);

						this.sequenceDefinition = null;
					}
				} else {
					int var13 = this.sequenceDefinition.method5307();
					this.frame += var12;
					var12 = 0;
					if (this.frame >= var13) {
						this.frame = var13 - this.sequenceDefinition.frameCount;
						if (this.frame < 0 || this.frame > var13) {
							this.sequenceDefinition = null;
						}
					}

					if (this.sequenceDefinition != null) {
						class139.method3253(this.sequenceDefinition, this.frame, var10, var11, false);
					}
				}

				this.cycleStart = Client.cycle - var12;
			}

			return var1.getModelDynamic(this.type, this.orientation, var8, var10, var9, var11, this.sequenceDefinition, this.frame);
		}
	}
}
