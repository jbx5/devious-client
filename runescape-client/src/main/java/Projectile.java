import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dd")
@Implements("Projectile")
public final class Projectile extends Renderable {
	@ObfuscatedName("bl")
	@Export("client")
	@ObfuscatedSignature(
		descriptor = "Lclient;"
	)
	static Client client;
	@ObfuscatedName("lk")
	@ObfuscatedGetter(
		intValue = 85219055
	)
	@Export("oculusOrbFocalPointZ")
	static int oculusOrbFocalPointZ;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1334017385
	)
	@Export("id")
	int id;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -648242057
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -925787213
	)
	@Export("sourceX")
	int sourceX;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -778995635
	)
	@Export("sourceY")
	int sourceY;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 839071003
	)
	@Export("sourceZ")
	int sourceZ;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1286412813
	)
	@Export("endHeight")
	int endHeight;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1493153007
	)
	int field971;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 761792217
	)
	int field972;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 2012038281
	)
	int field973;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 770895291
	)
	@Export("cycleStart")
	int cycleStart;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1102312395
	)
	@Export("cycleEnd")
	int cycleEnd;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1879788943
	)
	@Export("slope")
	int slope;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 327814629
	)
	@Export("startHeight")
	int startHeight;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1523098841
	)
	int field978;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 761093297
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("ab")
	@Export("isMoving")
	boolean isMoving;
	@ObfuscatedName("az")
	@Export("x")
	double x;
	@ObfuscatedName("ag")
	@Export("y")
	double y;
	@ObfuscatedName("ad")
	@Export("z")
	double z;
	@ObfuscatedName("ac")
	@Export("speedX")
	double speedX;
	@ObfuscatedName("av")
	@Export("speedY")
	double speedY;
	@ObfuscatedName("ax")
	@Export("speed")
	double speed;
	@ObfuscatedName("aq")
	@Export("speedZ")
	double speedZ;
	@ObfuscatedName("al")
	@Export("accelerationZ")
	double accelerationZ;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -183234509
	)
	@Export("yaw")
	int yaw;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -559648409
	)
	@Export("pitch")
	int pitch;
	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "Liu;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = 1367552883
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = -1138310363
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
		int var12 = class362.SpotAnimationDefinition_get(this.id).sequence;
		if (var12 != -1) {
			this.sequenceDefinition = Widget.SequenceDefinition_get(var12);
		} else {
			this.sequenceDefinition = null;
		}

	}

	Projectile(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12) {
		this(var1, var2, var3, var4, var5, var6, var7, var8, var9, var11, var12);
		this.field978 = var10;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "563767718"
	)
	@Export("setDestination")
	final void setDestination(int var1, int var2, int var3, int var4) {
		this.field971 = var1;
		this.field972 = var2;
		this.field973 = var3;
		double var5;
		if (!this.isMoving) {
			var5 = (double)(this.field971 - this.sourceX);
			double var7 = (double)(this.field972 - this.sourceY);
			double var9 = Math.sqrt(var7 * var7 + var5 * var5);
			this.x = (double)this.sourceX + (double)this.startHeight * var5 / var9;
			this.y = (double)this.sourceY + var7 * (double)this.startHeight / var9;
			this.z = (double)this.sourceZ;
		}

		var5 = (double)(this.cycleEnd + 1 - var4);
		this.speedX = ((double)this.field971 - this.x) / var5;
		this.speedY = ((double)this.field972 - this.y) / var5;
		this.speed = Math.sqrt(this.speedY * this.speedY + this.speedX * this.speedX);
		if (!this.isMoving) {
			this.speedZ = -this.speed * Math.tan(0.02454369D * (double)this.slope);
		}

		this.accelerationZ = ((double)this.field973 - this.z - var5 * this.speedZ) * 2.0D / (var5 * var5);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "43"
	)
	@Export("advance")
	final void advance(int var1) {
		this.isMoving = true;
		this.x += this.speedX * (double)var1;
		this.y += this.speedY * (double)var1;
		this.z += this.speedZ * (double)var1 + this.accelerationZ * 0.5D * (double)var1 * (double)var1;
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
				int var2 = this.sequenceDefinition.method4367();
				if (this.frame >= var2) {
					this.frame = var2 - this.sequenceDefinition.frameCount;
				}
			}
		}

	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Ljy;",
		garbageValue = "1885718735"
	)
	@Export("getModel")
	protected final Model getModel() {
		SpotAnimationDefinition var1 = class362.SpotAnimationDefinition_get(this.id);
		Model var2 = var1.getModel(this.frame);
		if (var2 == null) {
			return null;
		} else {
			var2.rotateZ(this.pitch);
			return var2;
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-111"
	)
	@Export("getVarbit")
	public static int getVarbit(int var0) {
		VarbitComposition var2 = (VarbitComposition)VarbitComposition.VarbitDefinition_cached.get((long)var0);
		VarbitComposition var1;
		if (var2 != null) {
			var1 = var2;
		} else {
			byte[] var3 = VarbitComposition.VarbitDefinition_archive.takeFile(14, var0);
			var2 = new VarbitComposition();
			if (var3 != null) {
				var2.decode(new Buffer(var3));
			}

			VarbitComposition.VarbitDefinition_cached.put(var2, (long)var0);
			var1 = var2;
		}

		int var7 = var1.baseVar;
		int var4 = var1.startBit;
		int var5 = var1.endBit;
		int var6 = Varps.Varps_masks[var5 - var4];
		return Varps.Varps_main[var7] >> var4 & var6;
	}
}
