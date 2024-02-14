import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cr")
@Implements("Projectile")
public final class Projectile extends Renderable {
	@ObfuscatedName("ii")
	@ObfuscatedGetter(
		intValue = -2067025143
	)
	@Export("baseX")
	static int baseX;
	@ObfuscatedName("so")
	@ObfuscatedSignature(
		descriptor = "Lrt;"
	)
	@Export("friendsChat")
	static FriendsChat friendsChat;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1340568521
	)
	@Export("id")
	int id;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1339285629
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1488219019
	)
	@Export("sourceX")
	int sourceX;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1783553383
	)
	@Export("sourceY")
	int sourceY;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 791763453
	)
	@Export("sourceZ")
	int sourceZ;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1909972809
	)
	@Export("endHeight")
	int endHeight;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1247501669
	)
	int field1008;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -455196585
	)
	int field987;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 393695049
	)
	int field988;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 897375107
	)
	@Export("cycleStart")
	int cycleStart;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1089229095
	)
	@Export("cycleEnd")
	int cycleEnd;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -20042567
	)
	@Export("slope")
	int slope;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -130381619
	)
	@Export("startHeight")
	int startHeight;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -658550749
	)
	int field993;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -103533343
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("an")
	@Export("isMoving")
	boolean isMoving;
	@ObfuscatedName("ag")
	@Export("x")
	double x;
	@ObfuscatedName("am")
	@Export("y")
	double y;
	@ObfuscatedName("ad")
	@Export("z")
	double z;
	@ObfuscatedName("at")
	@Export("speedX")
	double speedX;
	@ObfuscatedName("ay")
	@Export("speedY")
	double speedY;
	@ObfuscatedName("ae")
	@Export("speed")
	double speed;
	@ObfuscatedName("ac")
	@Export("speedZ")
	double speedZ;
	@ObfuscatedName("ab")
	@Export("accelerationZ")
	double accelerationZ;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 706671827
	)
	@Export("yaw")
	int yaw;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1722955333
	)
	@Export("pitch")
	int pitch;
	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "Lhs;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = -1382456271
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -263190565
	)
	@Export("frameCycle")
	int frameCycle;

	Projectile(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
		this.isMoving = false;
		this.frame = 0;
		this.frameCycle = 0;
		this.id = var1;
		this.plane = var2;
		this.sourceX = var3;
		this.sourceY = var4;
		this.sourceZ = var5;
		this.cycleStart = var6;
		this.cycleEnd = var7;
		this.slope = var8;
		this.startHeight = var9;
		this.targetIndex = var10;
		this.endHeight = var11;
		this.isMoving = false;
		int var12 = VarbitComposition.SpotAnimationDefinition_get(this.id).sequence;
		if (var12 != -1) {
			this.sequenceDefinition = MilliClock.SequenceDefinition_get(var12);
		} else {
			this.sequenceDefinition = null;
		}

	}

	Projectile(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12) {
		this(var1, var2, var3, var4, var5, var6, var7, var8, var9, var11, var12);
		this.field993 = var10;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1651218961"
	)
	@Export("setDestination")
	final void setDestination(int var1, int var2, int var3, int var4) {
		this.field1008 = var1;
		this.field987 = var2;
		this.field988 = var3;
		double var5;
		if (!this.isMoving) {
			var5 = (double)(this.field1008 - this.sourceX);
			double var7 = (double)(this.field987 - this.sourceY);
			double var9 = Math.sqrt(var5 * var5 + var7 * var7);
			this.x = (double)this.startHeight * var5 / var9 + (double)this.sourceX;
			this.y = (double)this.startHeight * var7 / var9 + (double)this.sourceY;
			this.z = (double)this.sourceZ;
		}

		var5 = (double)(this.cycleEnd + 1 - var4);
		this.speedX = ((double)this.field1008 - this.x) / var5;
		this.speedY = ((double)this.field987 - this.y) / var5;
		this.speed = Math.sqrt(this.speedX * this.speedX + this.speedY * this.speedY);
		if (!this.isMoving) {
			this.speedZ = -this.speed * Math.tan(0.02454369D * (double)this.slope);
		}

		this.accelerationZ = ((double)this.field988 - this.z - this.speedZ * var5) * 2.0D / (var5 * var5);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Lkz;",
		garbageValue = "1036754463"
	)
	@Export("getModel")
	protected final Model getModel() {
		SpotAnimationDefinition var1 = VarbitComposition.SpotAnimationDefinition_get(this.id);
		Model var2 = var1.getModel(this.frame);
		if (var2 == null) {
			return null;
		} else {
			var2.rotateZ(this.pitch);
			return var2;
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1114851198"
	)
	@Export("advance")
	final void advance(int var1) {
		this.isMoving = true;
		this.x += this.speedX * (double)var1;
		this.y += this.speedY * (double)var1;
		this.z += (double)var1 * 0.5D * this.accelerationZ * (double)var1 + (double)var1 * this.speedZ;
		this.speedZ += (double)var1 * this.accelerationZ;
		this.yaw = (int)(Math.atan2(this.speedX, this.speedY) * 325.949D) + 1024 & 2047;
		this.pitch = (int)(Math.atan2(this.speedZ, this.speed) * 325.949D) & 2047;
		if (this.sequenceDefinition != null) {
			if (!this.sequenceDefinition.isCachedModelIdSet()) {
				this.frameCycle += var1;

				while (true) {
					do {
						do {
							if (this.frameCycle <= this.sequenceDefinition.frameLengths[this.frame]) {
								return;
							}

							this.frameCycle -= this.sequenceDefinition.frameLengths[this.frame];
							++this.frame;
						} while(this.frame < this.sequenceDefinition.frameIds.length);

						this.frame -= this.sequenceDefinition.frameCount;
					} while(this.frame >= 0 && this.frame < this.sequenceDefinition.frameIds.length);

					this.frame = 0;
				}
			} else {
				this.frame += var1;
				int var2 = this.sequenceDefinition.method4065();
				if (this.frame >= var2) {
					this.frame = var2 - this.sequenceDefinition.frameCount;
				}
			}
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Lvd;",
		garbageValue = "-367754772"
	)
	static SpritePixels method2214() {
		SpritePixels var0 = new SpritePixels();
		var0.width = SpriteBufferProperties.SpriteBuffer_spriteWidth;
		var0.height = SpriteBufferProperties.SpriteBuffer_spriteHeight;
		var0.xOffset = SpriteBufferProperties.SpriteBuffer_xOffsets[0];
		var0.yOffset = SpriteBufferProperties.SpriteBuffer_yOffsets[0];
		var0.subWidth = class235.SpriteBuffer_spriteWidths[0];
		var0.subHeight = SpriteBufferProperties.SpriteBuffer_spriteHeights[0];
		int var1 = var0.subHeight * var0.subWidth;
		byte[] var2 = SpriteBufferProperties.SpriteBuffer_pixels[0];
		var0.pixels = new int[var1];

		for (int var3 = 0; var3 < var1; ++var3) {
			var0.pixels[var3] = AbstractSocket.SpriteBuffer_spritePalette[var2[var3] & 255];
		}

		SpriteBufferProperties.SpriteBuffer_xOffsets = null;
		SpriteBufferProperties.SpriteBuffer_yOffsets = null;
		class235.SpriteBuffer_spriteWidths = null;
		SpriteBufferProperties.SpriteBuffer_spriteHeights = null;
		AbstractSocket.SpriteBuffer_spritePalette = null;
		SpriteBufferProperties.SpriteBuffer_pixels = null;
		return var0;
	}
}
