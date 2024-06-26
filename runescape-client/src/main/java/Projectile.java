import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("df")
@Implements("Projectile")
public final class Projectile extends Renderable {
	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "Luu;"
	)
	@Export("loginType")
	static LoginType loginType;
	@ObfuscatedName("tw")
	@ObfuscatedSignature(
		descriptor = "Lbv;"
	)
	@Export("pcmPlayer1")
	static PcmPlayer pcmPlayer1;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -504466887
	)
	@Export("id")
	int id;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1766816905
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1772430645
	)
	@Export("sourceX")
	int sourceX;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1782025733
	)
	@Export("sourceY")
	int sourceY;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1045611613
	)
	@Export("sourceZ")
	int sourceZ;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1690959867
	)
	@Export("endHeight")
	int endHeight;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -935780375
	)
	int field968;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1926569083
	)
	int field985;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 429044921
	)
	int field970;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -135221413
	)
	@Export("cycleStart")
	int cycleStart;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1039953437
	)
	@Export("cycleEnd")
	int cycleEnd;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 563603713
	)
	@Export("slope")
	int slope;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 864895171
	)
	@Export("startHeight")
	int startHeight;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1613876837
	)
	int field975;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1863287717
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("ac")
	@Export("isMoving")
	boolean isMoving;
	@ObfuscatedName("al")
	@Export("x")
	double x;
	@ObfuscatedName("ay")
	@Export("y")
	double y;
	@ObfuscatedName("ao")
	@Export("z")
	double z;
	@ObfuscatedName("aa")
	@Export("speedX")
	double speedX;
	@ObfuscatedName("as")
	@Export("speedY")
	double speedY;
	@ObfuscatedName("aw")
	@Export("speed")
	double speed;
	@ObfuscatedName("at")
	@Export("speedZ")
	double speedZ;
	@ObfuscatedName("af")
	@Export("accelerationZ")
	double accelerationZ;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -418607101
	)
	@Export("yaw")
	int yaw;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1052283447
	)
	@Export("pitch")
	int pitch;
	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "Lii;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = 1315368611
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = -232988127
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
		int var12 = class178.SpotAnimationDefinition_get(this.id).sequence;
		if (var12 != -1) {
			this.sequenceDefinition = class353.SequenceDefinition_get(var12);
		} else {
			this.sequenceDefinition = null;
		}

	}

	Projectile(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12) {
		this(var1, var2, var3, var4, var5, var6, var7, var8, var9, var11, var12);
		this.field975 = var10;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1354303074"
	)
	@Export("setDestination")
	final void setDestination(int var1, int var2, int var3, int var4) {
		this.field968 = var1;
		this.field985 = var2;
		this.field970 = var3;
		double var5;
		if (!this.isMoving) {
			var5 = (double)(this.field968 - this.sourceX);
			double var7 = (double)(this.field985 - this.sourceY);
			double var9 = Math.sqrt(var5 * var5 + var7 * var7);
			this.x = (double)this.startHeight * var5 / var9 + (double)this.sourceX;
			this.y = var7 * (double)this.startHeight / var9 + (double)this.sourceY;
			this.z = (double)this.sourceZ;
		}

		var5 = (double)(this.cycleEnd + 1 - var4);
		this.speedX = ((double)this.field968 - this.x) / var5;
		this.speedY = ((double)this.field985 - this.y) / var5;
		this.speed = Math.sqrt(this.speedY * this.speedY + this.speedX * this.speedX);
		if (!this.isMoving) {
			this.speedZ = -this.speed * Math.tan((double)this.slope * 0.02454369D);
		}

		this.accelerationZ = 2.0D * ((double)this.field970 - this.z - this.speedZ * var5) / (var5 * var5);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2141951542"
	)
	@Export("advance")
	final void advance(int var1) {
		this.isMoving = true;
		this.x += this.speedX * (double)var1;
		this.y += (double)var1 * this.speedY;
		this.z += (double)var1 * this.speedZ + (double)var1 * 0.5D * this.accelerationZ * (double)var1;
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
				int var2 = this.sequenceDefinition.method4059();
				if (this.frame >= var2) {
					this.frame = var2 - this.sequenceDefinition.frameCount;
				}
			}
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Llv;",
		garbageValue = "-543123602"
	)
	@Export("getModel")
	protected final Model getModel() {
		SpotAnimationDefinition var1 = class178.SpotAnimationDefinition_get(this.id);
		Model var2 = var1.getModel(this.frame);
		if (var2 == null) {
			return null;
		} else {
			var2.rotateZ(this.pitch);
			return var2;
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ldu;I)V",
		garbageValue = "-300330513"
	)
	@Export("runScriptEvent")
	public static void runScriptEvent(ScriptEvent var0) {
		Varps.runScript(var0, 500000, 475000);
	}
}
