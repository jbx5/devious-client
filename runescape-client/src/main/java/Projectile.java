import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ck")
@Implements("Projectile")
public final class Projectile extends Renderable {
	@ObfuscatedName("vl")
	@ObfuscatedGetter(
		intValue = -1106968031
	)
	static int field937;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1715665897
	)
	@Export("id")
	int id;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 950599391
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1474959745
	)
	@Export("sourceX")
	int sourceX;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1673087401
	)
	@Export("sourceY")
	int sourceY;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1451961285
	)
	@Export("sourceZ")
	int sourceZ;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1112467891
	)
	@Export("endHeight")
	int endHeight;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1278515723
	)
	int field960;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 799813617
	)
	int field938;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -499492361
	)
	int field945;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1803322589
	)
	@Export("cycleStart")
	int cycleStart;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -605935351
	)
	@Export("cycleEnd")
	int cycleEnd;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -822202755
	)
	@Export("slope")
	int slope;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -584446471
	)
	@Export("startHeight")
	int startHeight;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -489123553
	)
	int field950;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 868463931
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("ak")
	@Export("isMoving")
	boolean isMoving;
	@ObfuscatedName("aj")
	@Export("x")
	double x;
	@ObfuscatedName("am")
	@Export("y")
	double y;
	@ObfuscatedName("aq")
	@Export("z")
	double z;
	@ObfuscatedName("ai")
	@Export("speedX")
	double speedX;
	@ObfuscatedName("aw")
	@Export("speedY")
	double speedY;
	@ObfuscatedName("ae")
	@Export("speed")
	double speed;
	@ObfuscatedName("an")
	@Export("speedZ")
	double speedZ;
	@ObfuscatedName("ag")
	@Export("accelerationZ")
	double accelerationZ;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -777446121
	)
	@Export("yaw")
	int yaw;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1808297649
	)
	@Export("pitch")
	int pitch;
	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "Lhx;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = 93342027
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = 1377913919
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
		int var12 = Canvas.SpotAnimationDefinition_get(this.id).sequence;
		if (var12 != -1) {
			this.sequenceDefinition = DynamicObject.SequenceDefinition_get(var12);
		} else {
			this.sequenceDefinition = null;
		}

	}

	Projectile(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12) {
		this(var1, var2, var3, var4, var5, var6, var7, var8, var9, var11, var12);
		this.field950 = var10;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "34043964"
	)
	@Export("setDestination")
	final void setDestination(int var1, int var2, int var3, int var4) {
		this.field960 = var1;
		this.field938 = var2;
		this.field945 = var3;
		double var5;
		if (!this.isMoving) {
			var5 = (double)(this.field960 - this.sourceX);
			double var7 = (double)(this.field938 - this.sourceY);
			double var9 = Math.sqrt(var7 * var7 + var5 * var5);
			this.x = (double)this.sourceX + (double)this.startHeight * var5 / var9;
			this.y = (double)this.startHeight * var7 / var9 + (double)this.sourceY;
			this.z = (double)this.sourceZ;
		}

		var5 = (double)(this.cycleEnd + 1 - var4);
		this.speedX = ((double)this.field960 - this.x) / var5;
		this.speedY = ((double)this.field938 - this.y) / var5;
		this.speed = Math.sqrt(this.speedY * this.speedY + this.speedX * this.speedX);
		if (!this.isMoving) {
			this.speedZ = -this.speed * Math.tan(0.02454369D * (double)this.slope);
		}

		this.accelerationZ = 2.0D * ((double)this.field945 - this.z - this.speedZ * var5) / (var5 * var5);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)Lka;",
		garbageValue = "1"
	)
	@Export("getModel")
	protected final Model getModel() {
		SpotAnimationDefinition var1 = Canvas.SpotAnimationDefinition_get(this.id);
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
		garbageValue = "-1019112167"
	)
	@Export("advance")
	final void advance(int var1) {
		this.isMoving = true;
		this.x += (double)var1 * this.speedX;
		this.y += (double)var1 * this.speedY;
		this.z += (double)var1 * this.speedZ + (double)var1 * (double)var1 * 0.5D * this.accelerationZ;
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
				int var2 = this.sequenceDefinition.method4064();
				if (this.frame >= var2) {
					this.frame = var2 - this.sequenceDefinition.frameCount;
				}
			}
		}

	}

	@ObfuscatedName("jm")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1070521773"
	)
	static boolean method2209() {
		return (Client.drawPlayerNames & 8) != 0;
	}

	@ObfuscatedName("mp")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2039275921"
	)
	@Export("changeGameOptions")
	static final void changeGameOptions(int var0) {
		class396.method7403();
		class159.method3426();
		int var1 = FloorOverlayDefinition.VarpDefinition_get(var0).type;
		if (var1 != 0) {
			int var2 = Varps.Varps_main[var0];
			if (var1 == 1) {
				if (var2 == 1) {
					Rasterizer3D.method5191(0.9D);
					((TextureProvider)Rasterizer3D.clips.Rasterizer3D_textureLoader).setBrightness(0.9D);
					class166.method3495();
					WorldMapIcon_1.clientPreferences.updateBrightness(0.9D);
				}

				if (var2 == 2) {
					Rasterizer3D.method5191(0.8D);
					((TextureProvider)Rasterizer3D.clips.Rasterizer3D_textureLoader).setBrightness(0.8D);
					class166.method3495();
					WorldMapIcon_1.clientPreferences.updateBrightness(0.8D);
				}

				if (var2 == 3) {
					Rasterizer3D.method5191(0.7D);
					((TextureProvider)Rasterizer3D.clips.Rasterizer3D_textureLoader).setBrightness(0.7D);
					class166.method3495();
					WorldMapIcon_1.clientPreferences.updateBrightness(0.7D);
				}

				if (var2 == 4) {
					Rasterizer3D.method5191(0.6D);
					((TextureProvider)Rasterizer3D.clips.Rasterizer3D_textureLoader).setBrightness(0.6D);
					class166.method3495();
					WorldMapIcon_1.clientPreferences.updateBrightness(0.6D);
				}
			}

			if (var1 == 3) {
				if (var2 == 0) {
					Decimator.setMusicVolume(255);
				}

				if (var2 == 1) {
					Decimator.setMusicVolume(192);
				}

				if (var2 == 2) {
					Decimator.setMusicVolume(128);
				}

				if (var2 == 3) {
					Decimator.setMusicVolume(64);
				}

				if (var2 == 4) {
					Decimator.setMusicVolume(0);
				}
			}

			if (var1 == 4) {
				if (var2 == 0) {
					SoundSystem.method868(127);
				}

				if (var2 == 1) {
					SoundSystem.method868(96);
				}

				if (var2 == 2) {
					SoundSystem.method868(64);
				}

				if (var2 == 3) {
					SoundSystem.method868(32);
				}

				if (var2 == 4) {
					SoundSystem.method868(0);
				}
			}

			if (var1 == 5) {
				Client.leftClickOpensMenu = var2 == 1;
			}

			if (var1 == 6) {
				Client.chatEffects = var2;
			}

			if (var1 == 9) {
			}

			if (var1 == 10) {
				if (var2 == 0) {
					Login.method2198(127);
				}

				if (var2 == 1) {
					Login.method2198(96);
				}

				if (var2 == 2) {
					Login.method2198(64);
				}

				if (var2 == 3) {
					Login.method2198(32);
				}

				if (var2 == 4) {
					Login.method2198(0);
				}
			}

			if (var1 == 17) {
				Client.followerIndex = var2 & 65535;
			}

			if (var1 == 18) {
				Client.playerAttackOption = (AttackOption)class12.findEnumerated(MenuAction.method2139(), var2);
				if (Client.playerAttackOption == null) {
					Client.playerAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

			if (var1 == 19) {
				if (var2 == -1) {
					Client.combatTargetPlayerIndex = -1;
				} else {
					Client.combatTargetPlayerIndex = var2 & 2047;
				}
			}

			if (var1 == 22) {
				AttackOption[] var3 = new AttackOption[]{AttackOption.field1334, AttackOption.AttackOption_alwaysRightClick, AttackOption.AttackOption_hidden, AttackOption.AttackOption_dependsOnCombatLevels, AttackOption.field1337};
				Client.npcAttackOption = (AttackOption)class12.findEnumerated(var3, var2);
				if (Client.npcAttackOption == null) {
					Client.npcAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

		}
	}
}
