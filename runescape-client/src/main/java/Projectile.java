import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bs")
@Implements("Projectile")
public final class Projectile extends Renderable {
	@ObfuscatedName("ag")
	@ObfuscatedSignature(descriptor = 
	"Lnm;")

	static Bounds field946;
	@ObfuscatedName("ok")
	@ObfuscatedGetter(intValue = 
	1774721187)

	static int field944;
	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = 
	635126401)

	@Export("id")
	int id;
	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = 
	-1804600121)

	@Export("plane")
	int plane;
	@ObfuscatedName("h")
	@ObfuscatedGetter(intValue = 
	-865645861)

	@Export("sourceX")
	int sourceX;
	@ObfuscatedName("g")
	@ObfuscatedGetter(intValue = 
	823151717)

	@Export("sourceY")
	int sourceY;
	@ObfuscatedName("l")
	@ObfuscatedGetter(intValue = 
	-1640532067)

	@Export("sourceZ")
	int sourceZ;
	@ObfuscatedName("n")
	@ObfuscatedGetter(intValue = 
	1908333049)

	@Export("endHeight")
	int endHeight;
	@ObfuscatedName("d")
	@ObfuscatedGetter(intValue = 
	-1093018891)

	@Export("cycleStart")
	int cycleStart;
	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = 
	129177565)

	@Export("cycleEnd")
	int cycleEnd;
	@ObfuscatedName("u")
	@ObfuscatedGetter(intValue = 
	1426433187)

	@Export("slope")
	int slope;
	@ObfuscatedName("r")
	@ObfuscatedGetter(intValue = 
	1732852593)

	@Export("startHeight")
	int startHeight;
	@ObfuscatedName("k")
	@ObfuscatedGetter(intValue = 
	-552309999)

	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("x")
	@Export("isMoving")
	boolean isMoving;
	@ObfuscatedName("c")
	@Export("x")
	double x;
	@ObfuscatedName("j")
	@Export("y")
	double y;
	@ObfuscatedName("p")
	@Export("z")
	double z;
	@ObfuscatedName("s")
	@Export("speedX")
	double speedX;
	@ObfuscatedName("b")
	@Export("speedY")
	double speedY;
	@ObfuscatedName("w")
	@Export("speed")
	double speed;
	@ObfuscatedName("a")
	@Export("speedZ")
	double speedZ;
	@ObfuscatedName("m")
	@Export("accelerationZ")
	double accelerationZ;
	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = 
	747032263)

	@Export("yaw")
	int yaw;
	@ObfuscatedName("y")
	@ObfuscatedGetter(intValue = 
	1515393455)

	@Export("pitch")
	int pitch;
	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = 
	"Lgg;")

	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("e")
	@ObfuscatedGetter(intValue = 
	-1010884921)

	@Export("frame")
	int frame;
	@ObfuscatedName("t")
	@ObfuscatedGetter(intValue = 
	637494227)

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
		int var12 = class6.SpotAnimationDefinition_get(this.id).sequence;
		if (var12 != (-1)) {
			this.sequenceDefinition = ItemContainer.SequenceDefinition_get(var12);
		} else {
			this.sequenceDefinition = null;
		}

	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(IIIII)V", garbageValue = 
	"1216965669")

	@Export("setDestination")
	final void setDestination(int var1, int var2, int var3, int var4) {
		double var5;
		if (!this.isMoving) {
			var5 = ((double) (var1 - this.sourceX));
			double var7 = ((double) (var2 - this.sourceY));
			double var9 = Math.sqrt((var5 * var5) + (var7 * var7));
			this.x = ((var5 * ((double) (this.startHeight))) / var9) + ((double) (this.sourceX));
			this.y = ((((double) (this.startHeight)) * var7) / var9) + ((double) (this.sourceY));
			this.z = ((double) (this.sourceZ));
		}

		var5 = ((double) ((this.cycleEnd + 1) - var4));
		this.speedX = (((double) (var1)) - this.x) / var5;
		this.speedY = (((double) (var2)) - this.y) / var5;
		this.speed = Math.sqrt((this.speedX * this.speedX) + (this.speedY * this.speedY));
		if (!this.isMoving) {
			this.speedZ = (-this.speed) * Math.tan(0.02454369 * ((double) (this.slope)));
		}

		this.accelerationZ = (2.0 * ((((double) (var3)) - this.z) - (var5 * this.speedZ))) / (var5 * var5);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"(B)Lhx;", garbageValue = 
	"63")

	@Export("getModel")
	protected final Model getModel() {
		SpotAnimationDefinition var1 = class6.SpotAnimationDefinition_get(this.id);
		Model var2 = var1.getModel(this.frame);
		if (var2 == null) {
			return null;
		} else {
			var2.rotateZ(this.pitch);
			return var2;
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = 
	"(IB)V", garbageValue = 
	"104")

	@Export("advance")
	final void advance(int var1) {
		this.isMoving = true;
		this.x += ((double) (var1)) * this.speedX;
		this.y += ((double) (var1)) * this.speedY;
		this.z += (((double) (var1)) * this.speedZ) + (((((double) (var1)) * ((double) (var1))) * 0.5) * this.accelerationZ);
		this.speedZ += ((double) (var1)) * this.accelerationZ;
		this.yaw = (((int) (Math.atan2(this.speedX, this.speedY) * 325.949)) + 1024) & 2047;
		this.pitch = ((int) (Math.atan2(this.speedZ, this.speed) * 325.949)) & 2047;
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
						} while (this.frame < this.sequenceDefinition.frameIds.length );

						this.frame -= this.sequenceDefinition.frameCount;
					} while ((this.frame >= 0) && (this.frame < this.sequenceDefinition.frameIds.length) );

					this.frame = 0;
				} 
			} else {
				this.frame += var1;
				int var2 = this.sequenceDefinition.method3827();
				if (this.frame >= var2) {
					this.frame = var2 - this.sequenceDefinition.frameCount;
				}
			}
		}

	}

	@ObfuscatedName("hw")
	@ObfuscatedSignature(descriptor = 
	"(B)V", garbageValue = 
	"-27")

	static final void method1957() {
		for (PendingSpawn var0 = ((PendingSpawn) (Client.pendingSpawns.last())); var0 != null; var0 = ((PendingSpawn) (Client.pendingSpawns.previous()))) {
			if (var0.hitpoints == (-1)) {
				var0.delay = 0;
				WorldMapRegion.method4795(var0);
			} else {
				var0.remove();
			}
		}

	}
}