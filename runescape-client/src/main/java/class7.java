import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
@ObfuscatedName("w")
public class class7 {
	@ObfuscatedName("c")
	ExecutorService field25;

	@ObfuscatedName("v")
	Future field22;

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Lqt;")
	final Buffer field21;

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "Lf;")
	final class3 field24;

	@ObfuscatedSignature(descriptor = "(Lqt;Lf;)V")
	public class7(Buffer var1, class3 var2) {
		this.field25 = Executors.newSingleThreadExecutor();
		this.field21 = var1;
		this.field24 = var2;
		this.method43();
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "1259823289")
	public boolean method46() {
		return this.field22.isDone();
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-750933605")
	public void method41() {
		this.field25.shutdown();
		this.field25 = null;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(I)Lqt;", garbageValue = "1646387788")
	public Buffer method42() {
		try {
			return ((Buffer) (this.field22.get()));
		} catch (Exception var2) {
			return null;
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "422290407")
	void method43() {
		this.field22 = this.field25.submit(new class1(this, this.field21, this.field24));
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(Llh;III)Lqe;", garbageValue = "488582948")
	@Export("SpriteBuffer_getSprite")
	public static SpritePixels SpriteBuffer_getSprite(AbstractArchive var0, int var1, int var2) {
		if (!Ignored.method6774(var0, var1, var2)) {
			return null;
		} else {
			SpritePixels var4 = new SpritePixels();
			var4.width = ModelData0.SpriteBuffer_spriteWidth;
			var4.height = class456.SpriteBuffer_spriteHeight;
			var4.xOffset = class426.SpriteBuffer_xOffsets[0];
			var4.yOffset = class142.SpriteBuffer_yOffsets[0];
			var4.subWidth = class359.SpriteBuffer_spriteWidths[0];
			var4.subHeight = class456.SpriteBuffer_spriteHeights[0];
			int var5 = var4.subWidth * var4.subHeight;
			byte[] var6 = class421.SpriteBuffer_pixels[0];
			var4.pixels = new int[var5];
			for (int var7 = 0; var7 < var5; ++var7) {
				var4.pixels[var7] = class13.SpriteBuffer_spritePalette[var6[var7] & 255];
			}
			class426.SpriteBuffer_xOffsets = null;
			class142.SpriteBuffer_yOffsets = null;
			class359.SpriteBuffer_spriteWidths = null;
			class456.SpriteBuffer_spriteHeights = null;
			class13.SpriteBuffer_spritePalette = null;
			class421.SpriteBuffer_pixels = null;
			return var4;
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(I)[Lce;", garbageValue = "-916941960")
	static AttackOption[] method52() {
		return new AttackOption[]{ AttackOption.AttackOption_alwaysRightClick, AttackOption.AttackOption_dependsOnCombatLevels, AttackOption.field1294, AttackOption.AttackOption_hidden, AttackOption.field1288 };
	}

	@ObfuscatedName("e")
	static int method51(long var0) {
		return ((int) (var0 >>> 14 & 3L));
	}

	@ObfuscatedName("jf")
	@ObfuscatedSignature(descriptor = "(III)V", garbageValue = "2121106568")
	@Export("runIntfCloseListeners")
	static final void runIntfCloseListeners(int var0, int var1) {
		if (WorldMapSection2.loadInterface(var0)) {
			TaskHandler.runComponentCloseListeners(SoundCache.Widget_interfaceComponents[var0], var1);
		}
	}
}