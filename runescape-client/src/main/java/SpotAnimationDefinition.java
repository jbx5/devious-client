import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hn")
@Implements("SpotAnimationDefinition")
public class SpotAnimationDefinition extends DualNode {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	@Export("SpotAnimationDefinition_archive")
	public static AbstractArchive SpotAnimationDefinition_archive;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	@Export("SpotAnimationDefinition_modelArchive")
	public static AbstractArchive SpotAnimationDefinition_modelArchive;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	@Export("SpotAnimationDefinition_cached")
	public static EvictingDualNodeHashTable SpotAnimationDefinition_cached;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lll;"
	)
	@Export("SpotAnimationDefinition_cachedModels")
	public static EvictingDualNodeHashTable SpotAnimationDefinition_cachedModels;
	@ObfuscatedName("fk")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	static Archive field2045;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -529104789
	)
	@Export("id")
	int id;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 651213805
	)
	@Export("archive")
	int archive;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 87795567
	)
	@Export("sequence")
	public int sequence;
	@ObfuscatedName("az")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("ao")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("au")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("ak")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1014748399
	)
	@Export("widthScale")
	int widthScale;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -41021843
	)
	@Export("heightScale")
	int heightScale;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -2065636433
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 156830159
	)
	@Export("ambient")
	int ambient;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -846309613
	)
	@Export("contrast")
	int contrast;

	static {
		SpotAnimationDefinition_cached = new EvictingDualNodeHashTable(64);
		SpotAnimationDefinition_cachedModels = new EvictingDualNodeHashTable(30);
	}

	SpotAnimationDefinition() {
		this.sequence = -1;
		this.widthScale = 128;
		this.heightScale = 128;
		this.orientation = 0;
		this.ambient = 0;
		this.contrast = 0;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Luq;I)V",
		garbageValue = "-1313689172"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Luq;II)V",
		garbageValue = "1262911593"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.archive = var1.readUnsignedShort();
		} else if (var2 == 2) {
			this.sequence = var1.readUnsignedShort();
		} else if (var2 == 4) {
			this.widthScale = var1.readUnsignedShort();
		} else if (var2 == 5) {
			this.heightScale = var1.readUnsignedShort();
		} else if (var2 == 6) {
			this.orientation = var1.readUnsignedShort();
		} else if (var2 == 7) {
			this.ambient = var1.readUnsignedByte();
		} else if (var2 == 8) {
			this.contrast = var1.readUnsignedByte();
		} else {
			int var3;
			int var4;
			if (var2 == 40) {
				var3 = var1.readUnsignedByte();
				this.recolorFrom = new short[var3];
				this.recolorTo = new short[var3];

				for (var4 = 0; var4 < var3; ++var4) {
					this.recolorFrom[var4] = (short)var1.readUnsignedShort();
					this.recolorTo[var4] = (short)var1.readUnsignedShort();
				}
			} else if (var2 == 41) {
				var3 = var1.readUnsignedByte();
				this.retextureFrom = new short[var3];
				this.retextureTo = new short[var3];

				for (var4 = 0; var4 < var3; ++var4) {
					this.retextureFrom[var4] = (short)var1.readUnsignedShort();
					this.retextureTo[var4] = (short)var1.readUnsignedShort();
				}
			}
		}

	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IB)Lkz;",
		garbageValue = "-62"
	)
	@Export("getModel")
	public final Model getModel(int var1) {
		Model var2 = this.method3787();
		if (var2 == null) {
			return null;
		} else {
			Model var3;
			if (this.sequence != -1 && var1 != -1) {
				var3 = MilliClock.SequenceDefinition_get(this.sequence).transformSpotAnimationModel(var2, var1);
			} else {
				var3 = var2.toSharedSpotAnimationModel(true);
			}

			if (this.widthScale != 128 || this.heightScale != 128) {
				var3.scale(this.widthScale, this.heightScale, this.widthScale);
			}

			if (this.orientation != 0) {
				if (this.orientation == 90) {
					var3.rotateY90Ccw();
				}

				if (this.orientation == 180) {
					var3.rotateY90Ccw();
					var3.rotateY90Ccw();
				}

				if (this.orientation == 270) {
					var3.rotateY90Ccw();
					var3.rotateY90Ccw();
					var3.rotateY90Ccw();
				}
			}

			return var3;
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Lkz;",
		garbageValue = "1900796983"
	)
	public final Model method3787() {
		Model var1 = (Model)SpotAnimationDefinition_cachedModels.get((long)this.id);
		if (var1 == null) {
			ModelData var2 = ModelData.ModelData_get(SpotAnimationDefinition_modelArchive, this.archive, 0);
			if (var2 == null) {
				return null;
			}

			int var3;
			if (this.recolorFrom != null) {
				for (var3 = 0; var3 < this.recolorFrom.length; ++var3) {
					var2.recolor(this.recolorFrom[var3], this.recolorTo[var3]);
				}
			}

			if (this.retextureFrom != null) {
				for (var3 = 0; var3 < this.retextureFrom.length; ++var3) {
					var2.retexture(this.retextureFrom[var3], this.retextureTo[var3]);
				}
			}

			var1 = var2.toModel(this.ambient + 64, this.contrast + 850, -30, -50, -30);
			SpotAnimationDefinition_cachedModels.put(var1, (long)this.id);
		}

		return var1;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lvt;"
	)
	@Export("newRunException")
	public static RunException newRunException(Throwable var0, String var1) {
		RunException var2;
		if (var0 instanceof RunException) {
			var2 = (RunException)var0;
			var2.message = var2.message + ' ' + var1;
		} else {
			var2 = new RunException(var0, var1);
		}

		return var2;
	}

	@ObfuscatedName("jh")
	@ObfuscatedSignature(
		descriptor = "(Ldj;I)Z",
		garbageValue = "-1345035276"
	)
	static boolean method3798(Player var0) {
		if (Client.drawPlayerNames == 0) {
			return false;
		} else {
			boolean var1;
			if (VarpDefinition.localPlayer != var0) {
				var1 = (Client.drawPlayerNames & 4) != 0;
				boolean var2 = var1 || NpcOverrides.method3696() && var0.isFriend();
				if (!var2) {
					boolean var3 = (Client.drawPlayerNames & 2) != 0;
					var2 = var3 && var0.isFriendsChatMember();
				}

				return var2;
			} else {
				var1 = (Client.drawPlayerNames & 8) != 0;
				return var1;
			}
		}
	}
}
