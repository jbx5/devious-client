import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("bm")
@Implements("Projectile")
public final class Projectile extends Renderable {
	@ObfuscatedName("iz")
	@ObfuscatedGetter(intValue = 693373263)
	@Export("selectedItemId")
	static int selectedItemId;

	@ObfuscatedName("s")
	@ObfuscatedGetter(intValue = -133563459)
	@Export("id")
	int id;

	@ObfuscatedName("h")
	@ObfuscatedGetter(intValue = 1590189497)
	@Export("plane")
	int plane;

	@ObfuscatedName("w")
	@ObfuscatedGetter(intValue = 1590257653)
	@Export("sourceX")
	int sourceX;

	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = -1657715919)
	@Export("sourceY")
	int sourceY;

	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = 1827310427)
	@Export("sourceZ")
	int sourceZ;

	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = 1228522533)
	@Export("endHeight")
	int endHeight;

	@ObfuscatedName("i")
	@ObfuscatedGetter(intValue = 1089483663)
	@Export("cycleStart")
	int cycleStart;

	@ObfuscatedName("k")
	@ObfuscatedGetter(intValue = -7971857)
	@Export("cycleEnd")
	int cycleEnd;

	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = -1262277093)
	@Export("slope")
	int slope;

	@ObfuscatedName("n")
	@ObfuscatedGetter(intValue = -2023696405)
	@Export("startHeight")
	int startHeight;

	@ObfuscatedName("d")
	@ObfuscatedGetter(intValue = 2015553011)
	@Export("targetIndex")
	int targetIndex;

	@ObfuscatedName("a")
	@Export("isMoving")
	boolean isMoving = false;

	@ObfuscatedName("m")
	@Export("x")
	double x;

	@ObfuscatedName("u")
	@Export("y")
	double y;

	@ObfuscatedName("l")
	@Export("z")
	double z;

	@ObfuscatedName("z")
	@Export("speedX")
	double speedX;

	@ObfuscatedName("r")
	@Export("speedY")
	double speedY;

	@ObfuscatedName("y")
	@Export("speed")
	double speed;

	@ObfuscatedName("p")
	@Export("speedZ")
	double speedZ;

	@ObfuscatedName("e")
	@Export("accelerationZ")
	double accelerationZ;

	@ObfuscatedName("b")
	@ObfuscatedGetter(intValue = 2126136589)
	@Export("yaw")
	int yaw;

	@ObfuscatedName("x")
	@ObfuscatedGetter(intValue = -1534989167)
	@Export("pitch")
	int pitch;

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "Lgh;")
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;

	@ObfuscatedName("t")
	@ObfuscatedGetter(intValue = 735623395)
	@Export("frame")
	int frame = 0;

	@ObfuscatedName("j")
	@ObfuscatedGetter(intValue = 314241463)
	@Export("frameCycle")
	int frameCycle = 0;

	Projectile(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
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
		int var12 = ArchiveDisk.SpotAnimationDefinition_get(this.id).sequence;
		if (var12 != -1) {
			this.sequenceDefinition = ByteArrayPool.SequenceDefinition_get(var12);
		} else {
			this.sequenceDefinition = null;
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(IIIIB)V", garbageValue = "-92")
	@Export("setDestination")
	final void setDestination(int var1, int var2, int var3, int var4) {
		double var5;
		if (!this.isMoving) {
			var5 = ((double) (var1 - this.sourceX));
			double var7 = ((double) (var2 - this.sourceY));
			double var9 = Math.sqrt(var7 * var7 + var5 * var5);
			this.x = ((double) (this.sourceX)) + ((double) (this.startHeight)) * var5 / var9;
			this.y = ((double) (this.sourceY)) + var7 * ((double) (this.startHeight)) / var9;
			this.z = ((double) (this.sourceZ));
		}
		var5 = ((double) (this.cycleEnd + 1 - var4));
		this.speedX = (((double) (var1)) - this.x) / var5;
		this.speedY = (((double) (var2)) - this.y) / var5;
		this.speed = Math.sqrt(this.speedX * this.speedX + this.speedY * this.speedY);
		if (!this.isMoving) {
			this.speedZ = -this.speed * Math.tan(((double) (this.slope)) * 0.02454369);
		}
		this.accelerationZ = (((double) (var3)) - this.z - this.speedZ * var5) * 2.0 / (var5 * var5);
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(B)Lhp;", garbageValue = "4")
	@Export("getModel")
	protected final Model getModel() {
		SpotAnimationDefinition var1 = ArchiveDisk.SpotAnimationDefinition_get(this.id);
		Model var2 = var1.getModel(this.frame);
		if (var2 == null) {
			return null;
		} else {
			var2.rotateZ(this.pitch);
			return var2;
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "-2078292350")
	@Export("advance")
	final void advance(int var1) {
		this.isMoving = true;
		this.x += ((double) (var1)) * this.speedX;
		this.y += this.speedY * ((double) (var1));
		this.z += this.speedZ * ((double) (var1)) + ((double) (var1)) * this.accelerationZ * 0.5 * ((double) (var1));
		this.speedZ += this.accelerationZ * ((double) (var1));
		this.yaw = ((int) (Math.atan2(this.speedX, this.speedY) * 325.949)) + 1024 & 2047;
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
					} while (this.frame >= 0 && this.frame < this.sequenceDefinition.frameIds.length );
					this.frame = 0;
				} 
			} else {
				this.frame += var1;
				int var2 = this.sequenceDefinition.method3729();
				if (this.frame >= var2) {
					this.frame = var2 - this.sequenceDefinition.frameCount;
				}
			}
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(I)[Lop;", garbageValue = "-1495949288")
	static class391[] method1926() {
		return new class391[]{ class391.field4421, class391.field4428, class391.field4422, class391.field4423 };
	}
}