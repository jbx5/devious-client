import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ck")
@Implements("Projectile")
public final class Projectile extends Renderable {
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -549374795
	)
	@Export("id")
	int id;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1311387965
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1087687777
	)
	@Export("sourceX")
	int sourceX;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1807665337
	)
	@Export("sourceY")
	int sourceY;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1307089547
	)
	@Export("sourceZ")
	int sourceZ;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -171002147
	)
	@Export("endHeight")
	int endHeight;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1921111453
	)
	int field978;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 31638363
	)
	int field979;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1267075461
	)
	int field980;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1420572405
	)
	@Export("cycleStart")
	int cycleStart;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 855194403
	)
	@Export("cycleEnd")
	int cycleEnd;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1543991229
	)
	@Export("slope")
	int slope;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 48542785
	)
	@Export("startHeight")
	int startHeight;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1710661901
	)
	int field988;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -731923483
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("ab")
	@Export("isMoving")
	boolean isMoving;
	@ObfuscatedName("ag")
	@Export("x")
	double x;
	@ObfuscatedName("am")
	@Export("y")
	double y;
	@ObfuscatedName("ax")
	@Export("z")
	double z;
	@ObfuscatedName("ah")
	@Export("speedX")
	double speedX;
	@ObfuscatedName("as")
	@Export("speedY")
	double speedY;
	@ObfuscatedName("ay")
	@Export("speed")
	double speed;
	@ObfuscatedName("aj")
	@Export("speedZ")
	double speedZ;
	@ObfuscatedName("av")
	@Export("accelerationZ")
	double accelerationZ;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -556808089
	)
	@Export("yaw")
	int yaw;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -600416715
	)
	@Export("pitch")
	int pitch;
	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "Lib;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = 1245655713
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = 832169
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
		int var12 = StructComposition.SpotAnimationDefinition_get(this.id).sequence;
		if (var12 != -1) {
			this.sequenceDefinition = EnumComposition.SequenceDefinition_get(var12);
		} else {
			this.sequenceDefinition = null;
		}

	}

	Projectile(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12) {
		this(var1, var2, var3, var4, var5, var6, var7, var8, var9, var11, var12);
		this.field988 = var10;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-912424366"
	)
	@Export("setDestination")
	final void setDestination(int var1, int var2, int var3, int var4) {
		this.field978 = var1;
		this.field979 = var2;
		this.field980 = var3;
		double var5;
		if (!this.isMoving) {
			var5 = (double)(this.field978 - this.sourceX);
			double var7 = (double)(this.field979 - this.sourceY);
			double var9 = Math.sqrt(var5 * var5 + var7 * var7);
			this.x = (double)this.sourceX + (double)this.startHeight * var5 / var9;
			this.y = (double)this.sourceY + (double)this.startHeight * var7 / var9;
			this.z = (double)this.sourceZ;
		}

		var5 = (double)(this.cycleEnd + 1 - var4);
		this.speedX = ((double)this.field978 - this.x) / var5;
		this.speedY = ((double)this.field979 - this.y) / var5;
		this.speed = Math.sqrt(this.speedY * this.speedY + this.speedX * this.speedX);
		if (!this.isMoving) {
			this.speedZ = -this.speed * Math.tan((double)this.slope * 0.02454369D);
		}

		this.accelerationZ = ((double)this.field980 - this.z - this.speedZ * var5) * 2.0D / (var5 * var5);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Ljr;",
		garbageValue = "798227647"
	)
	@Export("getModel")
	protected final Model getModel() {
		SpotAnimationDefinition var1 = StructComposition.SpotAnimationDefinition_get(this.id);
		Model var2 = var1.getModel(this.frame);
		if (var2 == null) {
			return null;
		} else {
			var2.rotateZ(this.pitch);
			return var2;
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "30"
	)
	@Export("advance")
	final void advance(int var1) {
		this.isMoving = true;
		this.x += this.speedX * (double)var1;
		this.y += (double)var1 * this.speedY;
		this.z += 0.5D * this.accelerationZ * (double)var1 * (double)var1 + (double)var1 * this.speedZ;
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
				int var2 = this.sequenceDefinition.method4034();
				if (this.frame >= var2) {
					this.frame = var2 - this.sequenceDefinition.frameCount;
				}
			}
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "992783271"
	)
	public static int method2147(int var0) {
		return class303.field3386[var0];
	}
}
