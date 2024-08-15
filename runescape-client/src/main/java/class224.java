import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ib")
public abstract class class224 {
	@ObfuscatedName("au")
	String field2425;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lii;"
	)
	final class221 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lii;Ljava/lang/String;)V"
	)
	class224(class221 var1, String var2) {
		this.this$0 = var1;
		this.field2425 = var2;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-564375811"
	)
	public abstract int vmethod4725();

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-8"
	)
	public int vmethod4732() {
		return -1;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "461949463"
	)
	public String vmethod4724() {
		return null;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-362535766"
	)
	public String method4722() {
		return this.field2425;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "([BI)Lvc;",
		garbageValue = "-496156064"
	)
	@Export("readSpritePixelsFromBytes")
	public static final SpritePixels readSpritePixelsFromBytes(byte[] var0) {
		BufferedImage var1 = null;

		try {
			Class var2 = ImageIO.class;
			synchronized(ImageIO.class) {
				var1 = ImageIO.read(new ByteArrayInputStream(var0));
			}

			int var6 = var1.getWidth();
			int var7 = var1.getHeight();
			int[] var4 = new int[var6 * var7];
			PixelGrabber var5 = new PixelGrabber(var1, 0, 0, var6, var7, var4, 0, var6);
			var5.grabPixels();
			return new SpritePixels(var4, var6, var7);
		} catch (IOException var9) {
		} catch (InterruptedException var10) {
		}

		return new SpritePixels(0, 0);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIILkt;II)V",
		garbageValue = "-1649936202"
	)
	@Export("createObjectSound")
	static void createObjectSound(int var0, int var1, int var2, ObjectComposition var3, int var4) {
		ObjectSound var5 = new ObjectSound();
		var5.plane = var0;
		var5.x = var1 * 128;
		var5.y = var2 * 128;
		int var6 = var3.sizeX;
		int var7 = var3.sizeY;
		if (var4 == 1 || var4 == 3) {
			var6 = var3.sizeY;
			var7 = var3.sizeX;
		}

		var5.maxX = (var6 + var1) * 16384;
		var5.maxY = (var7 + var2) * 128;
		var5.soundEffectId = var3.ambientSoundId;
		var5.field836 = var3.int7 * 16384;
		var5.field834 = Math.max(var3.int8 * 128 - 128, 0);
		var5.field837 = var3.int5;
		var5.field841 = var3.int6;
		var5.soundEffectIds = var3.soundEffectIds;
		if (var3.transforms != null) {
			var5.obj = var3;
			var5.set();
		}

		ObjectSound.objectSounds.addFirst(var5);
		if (var5.soundEffectIds != null) {
			var5.field839 = var5.field837 + (int)(Math.random() * (double)(var5.field841 - var5.field837));
		}

	}
}
