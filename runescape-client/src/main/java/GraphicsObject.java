import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cz")
@Implements("GraphicsObject")
public class GraphicsObject extends Renderable {
	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "Lpv;"
	)
	@Export("clientLanguage")
	static Language clientLanguage;
	@ObfuscatedName("fc")
	@ObfuscatedSignature(
		descriptor = "Lov;"
	)
	static Archive field883;
	@ObfuscatedName("fv")
	@ObfuscatedSignature(
		descriptor = "Lcu;"
	)
	@Export("loginState")
	static LoginState loginState;
	@ObfuscatedName("si")
	static boolean field893;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -753797499
	)
	@Export("id")
	int id;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -656693601
	)
	@Export("cycleStart")
	int cycleStart;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 213232931
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 596666987
	)
	@Export("x")
	int x;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -511219319
	)
	@Export("y")
	int y;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -620532157
	)
	@Export("z")
	int z;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1820518937
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1032630509
	)
	@Export("frameCycle")
	int frameCycle;
	@ObfuscatedName("al")
	@Export("isFinished")
	boolean isFinished;

	GraphicsObject(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		this.frame = 0;
		this.frameCycle = 0;
		this.isFinished = false;
		this.id = var1;
		this.plane = var2;
		this.x = var3;
		this.y = var4;
		this.z = var5;
		this.cycleStart = var7 + var6;
		int var8 = UserComparator3.SpotAnimationDefinition_get(this.id).sequence;
		if (var8 != -1) {
			this.isFinished = false;
			this.sequenceDefinition = DevicePcmPlayerProvider.SequenceDefinition_get(var8);
		} else {
			this.isFinished = true;
		}

	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "76"
	)
	@Export("advance")
	final void advance(int var1) {
		if (!this.isFinished) {
			this.frameCycle += var1;
			if (!this.sequenceDefinition.isCachedModelIdSet()) {
				while (this.frameCycle > this.sequenceDefinition.frameLengths[this.frame]) {
					this.frameCycle -= this.sequenceDefinition.frameLengths[this.frame];
					++this.frame;
					if (this.frame >= this.sequenceDefinition.frameIds.length) {
						this.isFinished = true;
						break;
					}
				}
			} else {
				this.frame += var1;
				if (this.frame >= this.sequenceDefinition.method4232()) {
					this.isFinished = true;
				}
			}

		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Ljn;",
		garbageValue = "1157175232"
	)
	@Export("getModel")
	protected final Model getModel() {
		SpotAnimationDefinition var1 = UserComparator3.SpotAnimationDefinition_get(this.id);
		Model var2;
		if (!this.isFinished) {
			var2 = var1.getModel(this.frame);
		} else {
			var2 = var1.getModel(-1);
		}

		return var2 == null ? null : var2;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Loc;III)Lvg;",
		garbageValue = "-349860405"
	)
	@Export("SpriteBuffer_getSprite")
	public static SpritePixels SpriteBuffer_getSprite(AbstractArchive var0, int var1, int var2) {
		byte[] var4 = var0.takeFile(var1, var2);
		boolean var3;
		if (var4 == null) {
			var3 = false;
		} else {
			HttpQueryParams.SpriteBuffer_decode(var4);
			var3 = true;
		}

		if (!var3) {
			return null;
		} else {
			SpritePixels var5 = new SpritePixels();
			var5.width = SpriteBufferProperties.SpriteBuffer_spriteWidth;
			var5.height = SpriteBufferProperties.SpriteBuffer_spriteHeight;
			var5.xOffset = SpriteBufferProperties.SpriteBuffer_xOffsets[0];
			var5.yOffset = SpriteBufferProperties.SpriteBuffer_yOffsets[0];
			var5.subWidth = SpriteBufferProperties.SpriteBuffer_spriteWidths[0];
			var5.subHeight = Ignored.SpriteBuffer_spriteHeights[0];
			int var6 = var5.subWidth * var5.subHeight;
			byte[] var7 = SpriteBufferProperties.SpriteBuffer_pixels[0];
			var5.pixels = new int[var6];

			for (int var8 = 0; var8 < var6; ++var8) {
				var5.pixels[var8] = class126.SpriteBuffer_spritePalette[var7[var8] & 255];
			}

			SpotAnimationDefinition.method3949();
			return var5;
		}
	}

	@ObfuscatedName("li")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIIZI)V",
		garbageValue = "-1773581638"
	)
	@Export("insertMenuItem")
	static final void insertMenuItem(String var0, String var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
		if (!Client.isMenuOpen) {
			if (Client.menuOptionsCount < 500) {
				Client.menuActions[Client.menuOptionsCount] = var0;
				Client.menuTargets[Client.menuOptionsCount] = var1;
				Client.menuOpcodes[Client.menuOptionsCount] = var2;
				Client.menuIdentifiers[Client.menuOptionsCount] = var3;
				Client.menuArguments1[Client.menuOptionsCount] = var4;
				Client.menuArguments2[Client.menuOptionsCount] = var5;
				Client.menuItemIds[Client.menuOptionsCount] = var6;
				Client.menuShiftClick[Client.menuOptionsCount] = var7;
				++Client.menuOptionsCount;
			}

		}
	}

	public GraphicsObject() {
	}
}
