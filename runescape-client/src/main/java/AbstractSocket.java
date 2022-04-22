import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ny")
@Implements("AbstractSocket")
public abstract class AbstractSocket {
	@ObfuscatedName("bk")
	@ObfuscatedGetter(intValue = 
	770576215)

	static int field4275;

	protected AbstractSocket() {
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(S)V", garbageValue = 
	"-13138")

	@Export("close")
	public abstract void close();

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(I)I", garbageValue = 
	"-891040314")

	@Export("readUnsignedByte")
	public abstract int readUnsignedByte() throws IOException;

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"(B)I", garbageValue = 
	"46")

	@Export("available")
	public abstract int available() throws IOException;

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"(IB)Z", garbageValue = 
	"27")

	@Export("isAvailable")
	public abstract boolean isAvailable(int var1) throws IOException;

	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = 
	"([BIIB)I", garbageValue = 
	"-118")

	@Export("read")
	public abstract int read(byte[] var1, int var2, int var3) throws IOException;

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = 
	"([BIII)V", garbageValue = 
	"-1359342670")

	@Export("write")
	public abstract void write(byte[] var1, int var2, int var3) throws IOException;

	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = 
	"(Lln;Ljava/lang/String;Ljava/lang/String;B)Lqq;", garbageValue = 
	"3")

	@Export("SpriteBuffer_getIndexedSpriteByName")
	public static IndexedSprite SpriteBuffer_getIndexedSpriteByName(AbstractArchive var0, String var1, String var2) {
		int var3 = var0.getGroupId(var1);
		int var4 = var0.getFileId(var3, var2);
		byte[] var7 = var0.takeFile(var3, var4);
		boolean var6;
		if (var7 == null) {
			var6 = false;
		} else {
			WorldMapArea.SpriteBuffer_decode(var7);
			var6 = true;
		}

		IndexedSprite var5;
		if (!var6) {
			var5 = null;
		} else {
			var5 = HorizontalAlignment.method3492();
		}

		return var5;
	}
}