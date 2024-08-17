import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dv")
@Implements("Projectile")
public final class Projectile extends Renderable {
	@ObfuscatedName("fn")
	@ObfuscatedSignature(
		descriptor = "Loj;"
	)
	@Export("soundEffectsArchive")
	static Archive soundEffectsArchive;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1751068693
	)
	@Export("id")
	int id;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 811825783
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 437475431
	)
	@Export("sourceX")
	int sourceX;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -2024600239
	)
	@Export("sourceY")
	int sourceY;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 235136663
	)
	@Export("sourceZ")
	int sourceZ;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 984010753
	)
	@Export("endHeight")
	int endHeight;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1708183315
	)
	int field945;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -344170065
	)
	int field964;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -524617913
	)
	int field975;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1363781743
	)
	@Export("cycleStart")
	int cycleStart;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1101245703
	)
	@Export("cycleEnd")
	int cycleEnd;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 375351981
	)
	@Export("slope")
	int slope;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1831083141
	)
	@Export("startHeight")
	int startHeight;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 977794367
	)
	int field957;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -280727141
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("af")
	@Export("isMoving")
	boolean isMoving;
	@ObfuscatedName("aa")
	@Export("x")
	double x;
	@ObfuscatedName("ah")
	@Export("y")
	double y;
	@ObfuscatedName("ag")
	@Export("z")
	double z;
	@ObfuscatedName("av")
	@Export("speedX")
	double speedX;
	@ObfuscatedName("ar")
	@Export("speedY")
	double speedY;
	@ObfuscatedName("ap")
	@Export("speed")
	double speed;
	@ObfuscatedName("ak")
	@Export("speedZ")
	double speedZ;
	@ObfuscatedName("ai")
	@Export("accelerationZ")
	double accelerationZ;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1756009483
	)
	@Export("yaw")
	int yaw;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 2069338675
	)
	@Export("pitch")
	int pitch;
	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "Lkr;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = 1014959227
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = 1193144355
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
		int var12 = AbstractWorldMapIcon.SpotAnimationDefinition_get(this.id).sequence;
		if (var12 != -1) {
			this.sequenceDefinition = class182.SequenceDefinition_get(var12);
		} else {
			this.sequenceDefinition = null;
		}

	}

	Projectile(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12) {
		this(var1, var2, var3, var4, var5, var6, var7, var8, var9, var11, var12);
		this.field957 = var10;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "125"
	)
	@Export("setDestination")
	final void setDestination(int var1, int var2, int var3, int var4) {
		this.field945 = var1;
		this.field964 = var2;
		this.field975 = var3;
		double var5;
		if (!this.isMoving) {
			var5 = (double)(this.field945 - this.sourceX);
			double var7 = (double)(this.field964 - this.sourceY);
			double var9 = Math.sqrt(var5 * var5 + var7 * var7);
			this.x = (double)this.sourceX + (double)this.startHeight * var5 / var9;
			this.y = (double)this.startHeight * var7 / var9 + (double)this.sourceY;
			this.z = (double)this.sourceZ;
		}

		var5 = (double)(this.cycleEnd + 1 - var4);
		this.speedX = ((double)this.field945 - this.x) / var5;
		this.speedY = ((double)this.field964 - this.y) / var5;
		this.speed = Math.sqrt(this.speedX * this.speedX + this.speedY * this.speedY);
		if (!this.isMoving) {
			this.speedZ = -this.speed * Math.tan(0.02454369D * (double)this.slope);
		}

		this.accelerationZ = 2.0D * ((double)this.field975 - this.z - var5 * this.speedZ) / (var5 * var5);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1135745174"
	)
	@Export("advance")
	final void advance(int var1) {
		this.isMoving = true;
		this.x += (double)var1 * this.speedX;
		this.y += (double)var1 * this.speedY;
		this.z += this.speedZ * (double)var1 + (double)var1 * 0.5D * this.accelerationZ * (double)var1;
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
				int var2 = this.sequenceDefinition.method5307();
				if (this.frame >= var2) {
					this.frame = var2 - this.sequenceDefinition.frameCount;
				}
			}
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Lhr;",
		garbageValue = "-1547633874"
	)
	@Export("getModel")
	protected final Model getModel() {
		SpotAnimationDefinition var1 = AbstractWorldMapIcon.SpotAnimationDefinition_get(this.id);
		Model var2 = var1.getModel(this.frame);
		if (var2 == null) {
			return null;
		} else {
			var2.rotateZ(this.pitch);
			return var2;
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2065029307"
	)
	public static void method2268() {
		class239.field2007.clear();
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lnq;II)V",
		garbageValue = "-1315355362"
	)
	@Export("Widget_setKeyIgnoreHeld")
	static final void Widget_setKeyIgnoreHeld(Widget var0, int var1) {
		if (var0.field3879 == null) {
			throw new RuntimeException();
		} else {
			if (var0.field3951 == null) {
				var0.field3951 = new int[var0.field3879.length];
			}

			var0.field3951[var1] = Integer.MAX_VALUE;
		}
	}

	@ObfuscatedName("hy")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1778726258"
	)
	static void method2254() {
		class343.compass = null;
		FileSystem.redHintArrowSprite = null;
		BufferedSource.mapSceneSprites = null;
		SecureRandomFuture.headIconPkSprites = null;
		VertexNormal.headIconPrayerSprites = null;
		class218.headIconHintSprites = null;
		TileItem.mapDotSprites = null;
		MusicSong.crossSprites = null;
		class269.field2960 = null;
		class129.scrollBarSprites = null;
		BufferedFile.field5281 = null;
	}

	@ObfuscatedName("km")
	@ObfuscatedSignature(
		descriptor = "(ZLvs;B)V",
		garbageValue = "-52"
	)
	@Export("loadRegions")
	static final void loadRegions(boolean var0, PacketBuffer var1) {
		Client.isInInstance = var0;
		int var2;
		int var4;
		int var5;
		int var6;
		int var7;
		if (!Client.isInInstance) {
			int var3 = var1.readUnsignedShortLE();
			var1.readSignedShort();
			var2 = var1.readUnsignedShortAdd();
			var4 = var1.readUnsignedShort();
			class60.xteaKeys = new int[var4][4];

			for (var5 = 0; var5 < var4; ++var5) {
				for (var6 = 0; var6 < 4; ++var6) {
					class60.xteaKeys[var5][var6] = var1.readInt();
				}
			}

			class92.regions = new int[var4];
			WorldMapRectangle.regionMapArchiveIds = new int[var4];
			Interpreter.regionLandArchiveIds = new int[var4];
			Canvas.regionLandArchives = new byte[var4][];
			Skeleton.regionMapArchives = new byte[var4][];
			var4 = 0;

			for (var5 = (var2 - 6) / 8; var5 <= (var2 + 6) / 8; ++var5) {
				for (var6 = (var3 - 6) / 8; var6 <= (var3 + 6) / 8; ++var6) {
					var7 = var6 + (var5 << 8);
					class92.regions[var4] = var7;
					WorldMapRectangle.regionMapArchiveIds[var4] = ClientPreferences.archive9.getGroupId("m" + var5 + "_" + var6);
					Interpreter.regionLandArchiveIds[var4] = ClientPreferences.archive9.getGroupId("l" + var5 + "_" + var6);
					++var4;
				}
			}

			Canvas.method294(var2, var3, true);
		} else {
			var2 = var1.readUnsignedShortAdd();
			boolean var15 = var1.readUnsignedByteAdd() == 1;
			var4 = var1.readUnsignedShortAdd();
			var5 = var1.readUnsignedShort();
			var1.importIndex();

			int var8;
			int var9;
			for (var6 = 0; var6 < 4; ++var6) {
				for (var7 = 0; var7 < 13; ++var7) {
					for (var8 = 0; var8 < 13; ++var8) {
						var9 = var1.readBits(1);
						if (var9 == 1) {
							Client.instanceChunkTemplates[var6][var7][var8] = var1.readBits(26);
						} else {
							Client.instanceChunkTemplates[var6][var7][var8] = -1;
						}
					}
				}
			}

			var1.exportIndex();
			class60.xteaKeys = new int[var5][4];

			for (var6 = 0; var6 < var5; ++var6) {
				for (var7 = 0; var7 < 4; ++var7) {
					class60.xteaKeys[var6][var7] = var1.readInt();
				}
			}

			class92.regions = new int[var5];
			WorldMapRectangle.regionMapArchiveIds = new int[var5];
			Interpreter.regionLandArchiveIds = new int[var5];
			Canvas.regionLandArchives = new byte[var5][];
			Skeleton.regionMapArchives = new byte[var5][];
			var5 = 0;

			for (var6 = 0; var6 < 4; ++var6) {
				for (var7 = 0; var7 < 13; ++var7) {
					for (var8 = 0; var8 < 13; ++var8) {
						var9 = Client.instanceChunkTemplates[var6][var7][var8];
						if (var9 != -1) {
							int var10 = var9 >> 14 & 1023;
							int var11 = var9 >> 3 & 2047;
							int var12 = (var10 / 8 << 8) + var11 / 8;

							int var13;
							for (var13 = 0; var13 < var5; ++var13) {
								if (class92.regions[var13] == var12) {
									var12 = -1;
									break;
								}
							}

							if (var12 != -1) {
								class92.regions[var5] = var12;
								var13 = var12 >> 8 & 255;
								int var14 = var12 & 255;
								WorldMapRectangle.regionMapArchiveIds[var5] = ClientPreferences.archive9.getGroupId("m" + var13 + "_" + var14);
								Interpreter.regionLandArchiveIds[var5] = ClientPreferences.archive9.getGroupId("l" + var13 + "_" + var14);
								++var5;
							}
						}
					}
				}
			}

			Canvas.method294(var4, var2, !var15);
		}

	}
}
