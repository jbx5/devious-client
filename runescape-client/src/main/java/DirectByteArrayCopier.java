import java.nio.ByteBuffer;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kv")
@Implements("DirectByteArrayCopier")
public class DirectByteArrayCopier extends AbstractByteArrayCopier {
	@ObfuscatedName("c")
	@Export("directBuffer")
	ByteBuffer directBuffer;

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)[B",
		garbageValue = "56"
	)
	@Export("get")
	byte[] get() {
		byte[] var1 = new byte[this.directBuffer.capacity()]; // L: 13
		this.directBuffer.position(0); // L: 14
		this.directBuffer.get(var1); // L: 15
		return var1; // L: 16
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "([BB)V",
		garbageValue = "1"
	)
	@Export("set")
	public void set(byte[] var1) {
		this.directBuffer = ByteBuffer.allocateDirect(var1.length); // L: 20
		this.directBuffer.position(0); // L: 21
		this.directBuffer.put(var1); // L: 22
	} // L: 23

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(ILkw;IIIII[FI)Lkw;",
		garbageValue = "-1366585654"
	)
	static Widget method5686(int var0, Widget var1, int var2, int var3, int var4, int var5, int var6, float[] var7) {
		Widget var8 = new Widget(); // L: 915
		var8.type = var0; // L: 916
		var8.parentId = var1.id; // L: 917
		var8.childIndex = var2; // L: 918
		var8.isIf3 = true; // L: 919
		var8.xAlignment = var3; // L: 920
		var8.yAlignment = var4; // L: 921
		var8.widthAlignment = var5; // L: 922
		var8.heightAlignment = var6; // L: 923
		var8.rawX = (int)((float)var1.width * var7[0]); // L: 924
		var8.rawY = (int)((float)var1.height * var7[1]); // L: 925
		var8.rawWidth = (int)(var7[2] * (float)var1.width); // L: 926
		var8.rawHeight = (int)((float)var1.height * var7[3]); // L: 927
		return var8; // L: 928
	}
}
