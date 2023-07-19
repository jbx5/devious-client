import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cv")
@Implements("Projectile")
public final class Projectile extends Renderable {
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -976192127
	)
	@Export("id")
	int id;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1625341395
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -721134889
	)
	@Export("sourceX")
	int sourceX;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -599280821
	)
	@Export("sourceY")
	int sourceY;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -492864111
	)
	@Export("sourceZ")
	int sourceZ;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -60638153
	)
	@Export("endHeight")
	int endHeight;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1414464861
	)
	@Export("cycleStart")
	int cycleStart;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 495860239
	)
	@Export("cycleEnd")
	int cycleEnd;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -2030426167
	)
	@Export("slope")
	int slope;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -2077576861
	)
	@Export("startHeight")
	int startHeight;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 2073616239
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("at")
	@Export("isMoving")
	boolean isMoving;
	@ObfuscatedName("ah")
	@Export("x")
	double x;
	@ObfuscatedName("ax")
	@Export("y")
	double y;
	@ObfuscatedName("aa")
	@Export("z")
	double z;
	@ObfuscatedName("au")
	@Export("speedX")
	double speedX;
	@ObfuscatedName("ae")
	@Export("speedY")
	double speedY;
	@ObfuscatedName("ab")
	@Export("speed")
	double speed;
	@ObfuscatedName("ad")
	@Export("speedZ")
	double speedZ;
	@ObfuscatedName("ao")
	@Export("accelerationZ")
	double accelerationZ;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -619535977
	)
	@Export("yaw")
	int yaw;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1365581129
	)
	@Export("pitch")
	int pitch;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1628887833
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1452171409
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
		int var12 = NPCComposition.SpotAnimationDefinition_get(this.id).sequence;
		if (var12 != -1) {
			this.sequenceDefinition = class135.SequenceDefinition_get(var12);
		} else {
			this.sequenceDefinition = null;
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "1"
	)
	@Export("setDestination")
	final void setDestination(int var1, int var2, int var3, int var4) {
		double var5;
		if (!this.isMoving) {
			var5 = (double)(var1 - this.sourceX);
			double var7 = (double)(var2 - this.sourceY);
			double var9 = Math.sqrt(var7 * var7 + var5 * var5);
			this.x = (double)this.sourceX + (double)this.startHeight * var5 / var9;
			this.y = (double)this.sourceY + var7 * (double)this.startHeight / var9;
			this.z = (double)this.sourceZ;
		}

		var5 = (double)(this.cycleEnd + 1 - var4);
		this.speedX = ((double)var1 - this.x) / var5;
		this.speedY = ((double)var2 - this.y) / var5;
		this.speed = Math.sqrt(this.speedY * this.speedY + this.speedX * this.speedX);
		if (!this.isMoving) {
			this.speedZ = -this.speed * Math.tan(0.02454369D * (double)this.slope);
		}

		this.accelerationZ = ((double)var3 - this.z - var5 * this.speedZ) * 2.0D / (var5 * var5);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Ljo;",
		garbageValue = "-983173466"
	)
	@Export("getModel")
	protected final Model getModel() {
		SpotAnimationDefinition var1 = NPCComposition.SpotAnimationDefinition_get(this.id);
		Model var2 = var1.getModel(this.frame);
		if (var2 == null) {
			return null;
		} else {
			var2.rotateZ(this.pitch);
			return var2;
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1587354661"
	)
	@Export("advance")
	final void advance(int var1) {
		this.isMoving = true;
		this.x += this.speedX * (double)var1;
		this.y += this.speedY * (double)var1;
		this.z += (double)var1 * this.accelerationZ * 0.5D * (double)var1 + (double)var1 * this.speedZ;
		this.speedZ += this.accelerationZ * (double)var1;
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
				int var2 = this.sequenceDefinition.method4074();
				if (this.frame >= var2) {
					this.frame = var2 - this.sequenceDefinition.frameCount;
				}
			}
		}

	}
}
