import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dj")
@Implements("Projectile")
public final class Projectile extends Renderable {
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 197772491
	)
	@Export("id")
	int id;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1534471891
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 941170019
	)
	@Export("sourceX")
	int sourceX;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1125042955
	)
	@Export("sourceY")
	int sourceY;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 165646981
	)
	@Export("sourceZ")
	int sourceZ;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 494262325
	)
	@Export("endHeight")
	int endHeight;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1583318851
	)
	int field984;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 707359503
	)
	int field985;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 124441865
	)
	int field981;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 467035077
	)
	@Export("cycleStart")
	int cycleStart;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -884521431
	)
	@Export("cycleEnd")
	int cycleEnd;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1413510113
	)
	@Export("slope")
	int slope;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1959902371
	)
	@Export("startHeight")
	int startHeight;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1373726165
	)
	int field1005;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -954339723
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("ax")
	@Export("isMoving")
	boolean isMoving;
	@ObfuscatedName("ay")
	@Export("x")
	double x;
	@ObfuscatedName("au")
	@Export("y")
	double y;
	@ObfuscatedName("as")
	@Export("z")
	double z;
	@ObfuscatedName("aw")
	@Export("speedX")
	double speedX;
	@ObfuscatedName("ad")
	@Export("speedY")
	double speedY;
	@ObfuscatedName("ai")
	@Export("speed")
	double speed;
	@ObfuscatedName("an")
	@Export("speedZ")
	double speedZ;
	@ObfuscatedName("am")
	@Export("accelerationZ")
	double accelerationZ;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1073677969
	)
	@Export("yaw")
	int yaw;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -64205639
	)
	@Export("pitch")
	int pitch;
	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = 624670785
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = 1555345695
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
		int var12 = Sound.SpotAnimationDefinition_get(this.id).sequence;
		if (var12 != -1) {
			this.sequenceDefinition = FaceNormal.SequenceDefinition_get(var12);
		} else {
			this.sequenceDefinition = null;
		}

	}

	Projectile(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12) {
		this(var1, var2, var3, var4, var5, var6, var7, var8, var9, var11, var12);
		this.field1005 = var10;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-209004511"
	)
	@Export("setDestination")
	final void setDestination(int var1, int var2, int var3, int var4) {
		this.field984 = var1;
		this.field985 = var2;
		this.field981 = var3;
		double var5;
		if (!this.isMoving) {
			var5 = (double)(this.field984 - this.sourceX);
			double var7 = (double)(this.field985 - this.sourceY);
			double var9 = Math.sqrt(var5 * var5 + var7 * var7);
			this.x = (double)this.sourceX + (double)this.startHeight * var5 / var9;
			this.y = (double)this.sourceY + (double)this.startHeight * var7 / var9;
			this.z = (double)this.sourceZ;
		}

		var5 = (double)(this.cycleEnd + 1 - var4);
		this.speedX = ((double)this.field984 - this.x) / var5;
		this.speedY = ((double)this.field985 - this.y) / var5;
		this.speed = Math.sqrt(this.speedX * this.speedX + this.speedY * this.speedY);
		if (!this.isMoving) {
			this.speedZ = -this.speed * Math.tan((double)this.slope * 0.02454369D);
		}

		this.accelerationZ = ((double)this.field981 - this.z - var5 * this.speedZ) * 2.0D / (var5 * var5);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-108620871"
	)
	@Export("advance")
	final void advance(int var1) {
		this.isMoving = true;
		this.x += (double)var1 * this.speedX;
		this.y += (double)var1 * this.speedY;
		this.z += this.accelerationZ * 0.5D * (double)var1 * (double)var1 + this.speedZ * (double)var1;
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
				int var2 = this.sequenceDefinition.method4326();
				if (this.frame >= var2) {
					this.frame = var2 - this.sequenceDefinition.frameCount;
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
		SpotAnimationDefinition var1 = Sound.SpotAnimationDefinition_get(this.id);
		Model var2 = var1.getModel(this.frame);
		if (var2 == null) {
			return null;
		} else {
			var2.rotateZ(this.pitch);
			return var2;
		}
	}
}
