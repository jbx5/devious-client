import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cx")
@Implements("Projectile")
public final class Projectile extends Renderable {
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 700528583
	)
	@Export("id")
	int id;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -761584125
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -838146967
	)
	@Export("sourceX")
	int sourceX;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 943535563
	)
	@Export("sourceY")
	int sourceY;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -851542771
	)
	@Export("sourceZ")
	int sourceZ;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -103232621
	)
	@Export("endHeight")
	int endHeight;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -379262501
	)
	int field960;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1036585231
	)
	int field953;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1418066721
	)
	int field954;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 46659225
	)
	@Export("cycleStart")
	int cycleStart;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -439806533
	)
	@Export("cycleEnd")
	int cycleEnd;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1822804607
	)
	@Export("slope")
	int slope;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -649327269
	)
	@Export("startHeight")
	int startHeight;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1211752233
	)
	int field959;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1771820289
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("az")
	@Export("isMoving")
	boolean isMoving;
	@ObfuscatedName("av")
	@Export("x")
	double x;
	@ObfuscatedName("ak")
	@Export("y")
	double y;
	@ObfuscatedName("ay")
	@Export("z")
	double z;
	@ObfuscatedName("as")
	@Export("speedX")
	double speedX;
	@ObfuscatedName("ab")
	@Export("speedY")
	double speedY;
	@ObfuscatedName("ah")
	@Export("speed")
	double speed;
	@ObfuscatedName("ai")
	@Export("speedZ")
	double speedZ;
	@ObfuscatedName("ac")
	@Export("accelerationZ")
	double accelerationZ;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -815183487
	)
	@Export("yaw")
	int yaw;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1470974707
	)
	@Export("pitch")
	int pitch;
	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "Lhl;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -1596674159
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = -1171655123
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
		int var12 = class151.SpotAnimationDefinition_get(this.id).sequence;
		if (var12 != -1) {
			this.sequenceDefinition = HttpMethod.SequenceDefinition_get(var12);
		} else {
			this.sequenceDefinition = null;
		}

	}

	Projectile(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12) {
		this(var1, var2, var3, var4, var5, var6, var7, var8, var9, var11, var12);
		this.field959 = var10;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1385844103"
	)
	@Export("setDestination")
	final void setDestination(int var1, int var2, int var3, int var4) {
		this.field960 = var1;
		this.field953 = var2;
		this.field954 = var3;
		double var5;
		if (!this.isMoving) {
			var5 = (double)(this.field960 - this.sourceX);
			double var7 = (double)(this.field953 - this.sourceY);
			double var9 = Math.sqrt(var7 * var7 + var5 * var5);
			this.x = (double)this.startHeight * var5 / var9 + (double)this.sourceX;
			this.y = var7 * (double)this.startHeight / var9 + (double)this.sourceY;
			this.z = (double)this.sourceZ;
		}

		var5 = (double)(this.cycleEnd + 1 - var4);
		this.speedX = ((double)this.field960 - this.x) / var5;
		this.speedY = ((double)this.field953 - this.y) / var5;
		this.speed = Math.sqrt(this.speedX * this.speedX + this.speedY * this.speedY);
		if (!this.isMoving) {
			this.speedZ = -this.speed * Math.tan(0.02454369D * (double)this.slope);
		}

		this.accelerationZ = 2.0D * ((double)this.field954 - this.z - this.speedZ * var5) / (var5 * var5);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Lko;",
		garbageValue = "-714420560"
	)
	@Export("getModel")
	protected final Model getModel() {
		SpotAnimationDefinition var1 = class151.SpotAnimationDefinition_get(this.id);
		Model var2 = var1.getModel(this.frame);
		if (var2 == null) {
			return null;
		} else {
			var2.rotateZ(this.pitch);
			return var2;
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "50"
	)
	@Export("advance")
	final void advance(int var1) {
		this.isMoving = true;
		this.x += this.speedX * (double)var1;
		this.y += this.speedY * (double)var1;
		this.z += (double)var1 * this.speedZ + (double)var1 * 0.5D * this.accelerationZ * (double)var1;
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
				int var2 = this.sequenceDefinition.method4106();
				if (this.frame >= var2) {
					this.frame = var2 - this.sequenceDefinition.frameCount;
				}
			}
		}

	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)[Lnd;",
		garbageValue = "1117733101"
	)
	public static StudioGame[] method2222() {
		return new StudioGame[]{StudioGame.stellardawn, StudioGame.game4, StudioGame.oldscape, StudioGame.runescape, StudioGame.game3, StudioGame.game5};
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1483530457"
	)
	static final void method2221(String var0) {
		Canvas.method334(var0 + " is already on your ignore list");
	}
}
