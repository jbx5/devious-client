import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bf")
@Implements("Projectile")
public final class Projectile extends Renderable {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lnk;"
	)
	static Bounds field957;
	@ObfuscatedName("eo")
	@ObfuscatedGetter(
		longValue = 7183752234568421229L
	)
	static long field949;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1090460259
	)
	@Export("id")
	int id;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 331717549
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 574299707
	)
	@Export("sourceX")
	int sourceX;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -285807139
	)
	@Export("sourceY")
	int sourceY;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -209602125
	)
	@Export("sourceZ")
	int sourceZ;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 525427377
	)
	@Export("endHeight")
	int endHeight;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1231465073
	)
	@Export("cycleStart")
	int cycleStart;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -898831409
	)
	@Export("cycleEnd")
	int cycleEnd;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -875325807
	)
	@Export("slope")
	int slope;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 1104021127
	)
	@Export("startHeight")
	int startHeight;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1885386519
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("v")
	@Export("isMoving")
	boolean isMoving;
	@ObfuscatedName("h")
	@Export("x")
	double x;
	@ObfuscatedName("t")
	@Export("y")
	double y;
	@ObfuscatedName("u")
	@Export("z")
	double z;
	@ObfuscatedName("d")
	@Export("speedX")
	double speedX;
	@ObfuscatedName("b")
	@Export("speedY")
	double speedY;
	@ObfuscatedName("a")
	@Export("speed")
	double speed;
	@ObfuscatedName("l")
	@Export("speedZ")
	double speedZ;
	@ObfuscatedName("e")
	@Export("accelerationZ")
	double accelerationZ;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 1576151849
	)
	@Export("yaw")
	int yaw;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 2143964555
	)
	@Export("pitch")
	int pitch;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lgd;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -209391393
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1060288339
	)
	@Export("frameCycle")
	int frameCycle;

	Projectile(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
		this.isMoving = false; // L: 20
		this.frame = 0; // L: 32
		this.frameCycle = 0; // L: 33
		this.id = var1; // L: 36
		this.plane = var2; // L: 37
		this.sourceX = var3; // L: 38
		this.sourceY = var4; // L: 39
		this.sourceZ = var5; // L: 40
		this.cycleStart = var6; // L: 41
		this.cycleEnd = var7; // L: 42
		this.slope = var8; // L: 43
		this.startHeight = var9; // L: 44
		this.targetIndex = var10; // L: 45
		this.endHeight = var11; // L: 46
		this.isMoving = false; // L: 47
		int var12 = class308.SpotAnimationDefinition_get(this.id).sequence; // L: 48
		if (var12 != -1) { // L: 49
			this.sequenceDefinition = class4.SequenceDefinition_get(var12);
		} else {
			this.sequenceDefinition = null; // L: 50
		}

	} // L: 51

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "-44"
	)
	@Export("setDestination")
	final void setDestination(int var1, int var2, int var3, int var4) {
		double var5;
		if (!this.isMoving) { // L: 54
			var5 = (double)(var1 - this.sourceX); // L: 55
			double var7 = (double)(var2 - this.sourceY); // L: 56
			double var9 = Math.sqrt(var7 * var7 + var5 * var5); // L: 57
			this.x = (double)this.startHeight * var5 / var9 + (double)this.sourceX; // L: 58
			this.y = (double)this.startHeight * var7 / var9 + (double)this.sourceY; // L: 59
			this.z = (double)this.sourceZ; // L: 60
		}

		var5 = (double)(this.cycleEnd + 1 - var4); // L: 62
		this.speedX = ((double)var1 - this.x) / var5; // L: 63
		this.speedY = ((double)var2 - this.y) / var5; // L: 64
		this.speed = Math.sqrt(this.speedY * this.speedY + this.speedX * this.speedX); // L: 65
		if (!this.isMoving) { // L: 66
			this.speedZ = -this.speed * Math.tan((double)this.slope * 0.02454369D);
		}

		this.accelerationZ = ((double)var3 - this.z - var5 * this.speedZ) * 2.0D / (var5 * var5); // L: 67
	} // L: 68

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(B)Lha;",
		garbageValue = "13"
	)
	@Export("getModel")
	protected final Model getModel() {
		SpotAnimationDefinition var1 = class308.SpotAnimationDefinition_get(this.id); // L: 101
		Model var2 = var1.getModel(this.frame); // L: 102
		if (var2 == null) { // L: 103
			return null;
		} else {
			var2.rotateZ(this.pitch); // L: 104
			return var2; // L: 105
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "634950374"
	)
	@Export("advance")
	final void advance(int var1) {
		this.isMoving = true; // L: 71
		this.x += this.speedX * (double)var1; // L: 72
		this.y += this.speedY * (double)var1; // L: 73
		this.z += (double)var1 * (double)var1 * 0.5D * this.accelerationZ + (double)var1 * this.speedZ; // L: 74
		this.speedZ += (double)var1 * this.accelerationZ; // L: 75
		this.yaw = (int)(Math.atan2(this.speedX, this.speedY) * 325.949D) + 1024 & 2047; // L: 76
		this.pitch = (int)(Math.atan2(this.speedZ, this.speed) * 325.949D) & 2047; // L: 77
		if (this.sequenceDefinition != null) { // L: 78
			if (!this.sequenceDefinition.isCachedModelIdSet()) { // L: 79
				this.frameCycle += var1; // L: 80

				while (true) {
					do {
						do {
							if (this.frameCycle <= this.sequenceDefinition.frameLengths[this.frame]) { // L: 81
								return; // L: 98
							}

							this.frameCycle -= this.sequenceDefinition.frameLengths[this.frame]; // L: 82
							++this.frame; // L: 83
						} while(this.frame < this.sequenceDefinition.frameIds.length); // L: 84

						this.frame -= this.sequenceDefinition.frameCount; // L: 85
					} while(this.frame >= 0 && this.frame < this.sequenceDefinition.frameIds.length); // L: 86

					this.frame = 0;
				}
			} else {
				this.frame += var1; // L: 91
				int var2 = this.sequenceDefinition.method3950(); // L: 92
				if (this.frame >= var2) { // L: 93
					this.frame = var2 - this.sequenceDefinition.frameCount; // L: 94
				}
			}
		}

	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)Lgr;",
		garbageValue = "1441045906"
	)
	@Export("getParamDefinition")
	public static ParamComposition getParamDefinition(int var0) {
		ParamComposition var1 = (ParamComposition)ParamComposition.ParamDefinition_cached.get((long)var0); // L: 21
		if (var1 != null) { // L: 22
			return var1;
		} else {
			byte[] var2 = ParamComposition.ParamDefinition_archive.takeFile(11, var0); // L: 23
			var1 = new ParamComposition(); // L: 24
			if (var2 != null) { // L: 25
				var1.decode(new Buffer(var2));
			}

			var1.postDecode(); // L: 26
			ParamComposition.ParamDefinition_cached.put(var1, (long)var0); // L: 27
			return var1; // L: 28
		}
	}

	@ObfuscatedName("mi")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1729290040"
	)
	static void method2097(int var0) {
		Client.oculusOrbState = var0; // L: 12139
	} // L: 12140
}
