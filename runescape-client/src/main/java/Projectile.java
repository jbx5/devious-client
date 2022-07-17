import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("bu")
@Implements("Projectile")
public final class Projectile extends Renderable {
	@ObfuscatedName("rp")
	@Export("ClanChat_inClanChat")
	static boolean ClanChat_inClanChat;

	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = -630035333)
	@Export("id")
	int id;

	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = -753482197)
	@Export("plane")
	int plane;

	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = -1909485103)
	@Export("sourceX")
	int sourceX;

	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = -867044193)
	@Export("sourceY")
	int sourceY;

	@ObfuscatedName("j")
	@ObfuscatedGetter(intValue = 1371453553)
	@Export("sourceZ")
	int sourceZ;

	@ObfuscatedName("e")
	@ObfuscatedGetter(intValue = 1478366795)
	@Export("endHeight")
	int endHeight;

	@ObfuscatedName("g")
	@ObfuscatedGetter(intValue = 1542338147)
	@Export("cycleStart")
	int cycleStart;

	@ObfuscatedName("w")
	@ObfuscatedGetter(intValue = 981154783)
	@Export("cycleEnd")
	int cycleEnd;

	@ObfuscatedName("y")
	@ObfuscatedGetter(intValue = -1247849497)
	@Export("slope")
	int slope;

	@ObfuscatedName("i")
	@ObfuscatedGetter(intValue = -1919042303)
	@Export("startHeight")
	int startHeight;

	@ObfuscatedName("s")
	@ObfuscatedGetter(intValue = -1467854933)
	@Export("targetIndex")
	int targetIndex;

	@ObfuscatedName("t")
	@Export("isMoving")
	boolean isMoving;

	@ObfuscatedName("z")
	@Export("x")
	double x;

	@ObfuscatedName("r")
	@Export("y")
	double y;

	@ObfuscatedName("u")
	@Export("z")
	double z;

	@ObfuscatedName("k")
	@Export("speedX")
	double speedX;

	@ObfuscatedName("h")
	@Export("speedY")
	double speedY;

	@ObfuscatedName("x")
	@Export("speed")
	double speed;

	@ObfuscatedName("l")
	@Export("speedZ")
	double speedZ;

	@ObfuscatedName("a")
	@Export("accelerationZ")
	double accelerationZ;

	@ObfuscatedName("p")
	@ObfuscatedGetter(intValue = 262224371)
	@Export("yaw")
	int yaw;

	@ObfuscatedName("b")
	@ObfuscatedGetter(intValue = -703855763)
	@Export("pitch")
	int pitch;

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = "Lgc;")
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;

	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = -100465905)
	@Export("frame")
	int frame;

	@ObfuscatedName("m")
	@ObfuscatedGetter(intValue = 784173733)
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
		int var12 = ObjectSound.SpotAnimationDefinition_get(this.id).sequence;
		if (var12 != -1) {
			this.sequenceDefinition = ScriptFrame.SequenceDefinition_get(var12);
		} else {
			this.sequenceDefinition = null;
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(IIIII)V", garbageValue = "-1811806599")
	@Export("setDestination")
	final void setDestination(int var1, int var2, int var3, int var4) {
		double var5;
		if (!this.isMoving) {
			var5 = ((double) (var1 - this.sourceX));
			double var7 = ((double) (var2 - this.sourceY));
			double var9 = Math.sqrt(var5 * var5 + var7 * var7);
			this.x = ((double) (this.startHeight)) * var5 / var9 + ((double) (this.sourceX));
			this.y = var7 * ((double) (this.startHeight)) / var9 + ((double) (this.sourceY));
			this.z = ((double) (this.sourceZ));
		}
		var5 = ((double) (this.cycleEnd + 1 - var4));
		this.speedX = (((double) (var1)) - this.x) / var5;
		this.speedY = (((double) (var2)) - this.y) / var5;
		this.speed = Math.sqrt(this.speedX * this.speedX + this.speedY * this.speedY);
		if (!this.isMoving) {
			this.speedZ = -this.speed * Math.tan(((double) (this.slope)) * 0.02454369);
		}
		this.accelerationZ = 2.0 * (((double) (var3)) - this.z - var5 * this.speedZ) / (var5 * var5);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(I)Lhy;", garbageValue = "1081110576")
	@Export("getModel")
	protected final Model getModel() {
		SpotAnimationDefinition var1 = ObjectSound.SpotAnimationDefinition_get(this.id);
		Model var2 = var1.getModel(this.frame);
		if (var2 == null) {
			return null;
		} else {
			var2.rotateZ(this.pitch);
			return var2;
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(IB)V", garbageValue = "-99")
	@Export("advance")
	final void advance(int var1) {
		this.isMoving = true;
		this.x += this.speedX * ((double) (var1));
		this.y += ((double) (var1)) * this.speedY;
		this.z += ((double) (var1)) * this.speedZ + ((double) (var1)) * this.accelerationZ * 0.5 * ((double) (var1));
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
				int var2 = this.sequenceDefinition.method3835();
				if (this.frame >= var2) {
					this.frame = var2 - this.sequenceDefinition.frameCount;
				}
			}
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;I)I", garbageValue = "-1805196162")
	public static int method1950(CharSequence var0) {
		int var1 = var0.length();
		int var2 = 0;
		for (int var3 = 0; var3 < var1; ++var3) {
			var2 = (var2 << 5) - var2 + var0.charAt(var3);
		}
		return var2;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "72")
	public static void method1959() {
		ItemComposition.ItemDefinition_cachedSprites.clear();
	}

	@ObfuscatedName("fa")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "1050216582")
	static final void method1961() {
		FloorOverlayDefinition.FloorOverlayDefinition_cached.clear();
		NPC.method2379();
		Widget.method5711();
		class141.method3047();
		PacketBufferNode.method5194();
		ObjectSound.method1702();
		SequenceDefinition.SequenceDefinition_cached.clear();
		SequenceDefinition.SequenceDefinition_cachedFrames.clear();
		SequenceDefinition.SequenceDefinition_cachedModel.clear();
		FileSystem.method3282();
		VarbitComposition.VarbitDefinition_cached.clear();
		VarpDefinition.VarpDefinition_cached.clear();
		AbstractWorldMapData.HitSplatDefinition_cachedSprites.method7525();
		ModeWhere.HitSplatDefinition_cached.method7525();
		HitSplatDefinition.HitSplatDefinition_cached.clear();
		HitSplatDefinition.HitSplatDefinition_cachedSprites.clear();
		HitSplatDefinition.HitSplatDefinition_cachedFonts.clear();
		class92.method2389();
		Interpreter.method1868();
		class67.method1886();
		SoundCache.method763();
		MilliClock.method3301();
		class67.method1887();
		Client.Widget_cachedModels.clear();
		Client.Widget_cachedFonts.clear();
		class14.method148();
		Widget.Widget_cachedSprites.clear();
		Widget.DBTableIndex_cache.clear();
		Widget.DBTableMasterIndex_cache.clear();
		Widget.Widget_cachedSpriteMasks.clear();
		((TextureProvider) (Rasterizer3D.Rasterizer3D_textureLoader)).clear();
		Script.Script_cached.clear();
		Varcs.archive5.clearFiles();
		WorldMapEvent.field2882.clearFiles();
		class341.archive7.clearFiles();
		Client.archive4.clearFiles();
		WorldMapSectionType.archive9.clearFiles();
		class121.archive6.clearFiles();
		class10.archive11.clearFiles();
		class304.archive8.clearFiles();
		Language.field4098.clearFiles();
		ApproximateRouteStrategy.archive10.clearFiles();
		UserComparator7.field1383.clearFiles();
		class267.archive12.clearFiles();
		class132.field1588.clearFiles();
	}
}