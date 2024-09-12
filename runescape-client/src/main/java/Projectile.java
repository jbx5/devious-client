import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("df")
@Implements("Projectile")
public final class Projectile extends Renderable {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1697353407
	)
	@Export("id")
	int id;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1819729721
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1816375249
	)
	@Export("sourceX")
	int sourceX;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1971112379
	)
	@Export("sourceY")
	int sourceY;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -671357151
	)
	@Export("sourceZ")
	int sourceZ;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1445481407
	)
	@Export("endHeight")
	int endHeight;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -928823359
	)
	int field999;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1485013559
	)
	int field994;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1640014625
	)
	int field996;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1554518213
	)
	@Export("cycleStart")
	int cycleStart;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1343734409
	)
	@Export("cycleEnd")
	int cycleEnd;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 306471889
	)
	@Export("slope")
	int slope;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 2063261185
	)
	@Export("startHeight")
	int startHeight;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -538558605
	)
	int field1016;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 620638805
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("az")
	@Export("isMoving")
	boolean isMoving;
	@ObfuscatedName("aa")
	@Export("x")
	double x;
	@ObfuscatedName("ai")
	@Export("y")
	double y;
	@ObfuscatedName("ao")
	@Export("z")
	double z;
	@ObfuscatedName("as")
	@Export("speedX")
	double speedX;
	@ObfuscatedName("ay")
	@Export("speedY")
	double speedY;
	@ObfuscatedName("aj")
	@Export("speed")
	double speed;
	@ObfuscatedName("av")
	@Export("speedZ")
	double speedZ;
	@ObfuscatedName("aw")
	@Export("accelerationZ")
	double accelerationZ;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1523857173
	)
	@Export("yaw")
	int yaw;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1408010841
	)
	@Export("pitch")
	int pitch;
	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "Lif;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = 1339653213
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -271784133
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
		int var12 = VarcInt.SpotAnimationDefinition_get(this.id).sequence;
		if (var12 != -1) {
			this.sequenceDefinition = HealthBarUpdate.SequenceDefinition_get(var12);
		} else {
			this.sequenceDefinition = null;
		}

	}

	Projectile(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12) {
		this(var1, var2, var3, var4, var5, var6, var7, var8, var9, var11, var12);
		this.field1016 = var10;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "1143521536"
	)
	@Export("setDestination")
	final void setDestination(int var1, int var2, int var3, int var4) {
		this.field999 = var1;
		this.field994 = var2;
		this.field996 = var3;
		double var5;
		if (!this.isMoving) {
			var5 = (double)(this.field999 - this.sourceX);
			double var7 = (double)(this.field994 - this.sourceY);
			double var9 = Math.sqrt(var5 * var5 + var7 * var7);
			this.x = (double)this.sourceX + (double)this.startHeight * var5 / var9;
			this.y = var7 * (double)this.startHeight / var9 + (double)this.sourceY;
			this.z = (double)this.sourceZ;
		}

		var5 = (double)(this.cycleEnd + 1 - var4);
		this.speedX = ((double)this.field999 - this.x) / var5;
		this.speedY = ((double)this.field994 - this.y) / var5;
		this.speed = Math.sqrt(this.speedY * this.speedY + this.speedX * this.speedX);
		if (!this.isMoving) {
			this.speedZ = -this.speed * Math.tan((double)this.slope * 0.02454369D);
		}

		this.accelerationZ = ((double)this.field996 - this.z - this.speedZ * var5) * 2.0D / (var5 * var5);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "40"
	)
	@Export("advance")
	final void advance(int var1) {
		this.isMoving = true;
		this.x += (double)var1 * this.speedX;
		this.y += (double)var1 * this.speedY;
		this.z += (double)var1 * this.accelerationZ * 0.5D * (double)var1 + this.speedZ * (double)var1;
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
				int var2 = this.sequenceDefinition.method4368();
				if (this.frame >= var2) {
					this.frame = var2 - this.sequenceDefinition.frameCount;
				}
			}
		}

	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)Ljm;",
		garbageValue = "-75"
	)
	@Export("getModel")
	protected final Model getModel() {
		SpotAnimationDefinition var1 = VarcInt.SpotAnimationDefinition_get(this.id);
		Model var2 = var1.getModel(this.frame);
		if (var2 == null) {
			return null;
		} else {
			var2.rotateZ(this.pitch);
			return var2;
		}
	}

	@ObfuscatedName("iv")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "91"
	)
	static void method2363(int var0, int var1) {
		if (class461.clientPreferences.getMusicVolume() != 0 && var0 != -1) {
			ArrayList var2 = new ArrayList();
			var2.add(new MusicSong(MusicPatch.field3690, var0, 0, class461.clientPreferences.getMusicVolume(), false));
			class180.method3804(var2, 0, 0, 0, 0, true);
			Client.playingJingle = true;
		}

	}

	@ObfuscatedName("my")
	@ObfuscatedSignature(
		descriptor = "(Lny;IIZB)V",
		garbageValue = "3"
	)
	@Export("alignWidgetSize")
	static void alignWidgetSize(Widget var0, int var1, int var2, boolean var3) {
		int var4 = var0.width;
		int var5 = var0.height;
		if (var0.widthAlignment == 0) {
			var0.width = var0.rawWidth;
		} else if (var0.widthAlignment == 1) {
			var0.width = var1 - var0.rawWidth;
		} else if (var0.widthAlignment == 2) {
			var0.width = var0.rawWidth * var1 >> 14;
		}

		if (var0.heightAlignment == 0) {
			var0.height = var0.rawHeight;
		} else if (var0.heightAlignment == 1) {
			var0.height = var2 - var0.rawHeight;
		} else if (var0.heightAlignment == 2) {
			var0.height = var2 * var0.rawHeight >> 14;
		}

		if (var0.widthAlignment == 4) {
			var0.width = var0.field3869 * var0.height / var0.field3870;
		}

		if (var0.heightAlignment == 4) {
			var0.height = var0.width * var0.field3870 / var0.field3869;
		}

		if (var0.contentType == 1337) {
			Client.viewportWidget = var0;
		}

		if (var0.type == 12) {
			var0.method7268().method6958(var0.width, var0.height);
		}

		if (var3 && var0.onResize != null && (var4 != var0.width || var5 != var0.height)) {
			ScriptEvent var6 = new ScriptEvent();
			var6.widget = var0;
			var6.args = var0.onResize;
			Client.scriptEvents.addFirst(var6);
		}

	}
}
