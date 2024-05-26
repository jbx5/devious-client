import java.nio.ByteBuffer;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nc")
@Implements("DirectByteArrayCopier")
public class DirectByteArrayCopier extends AbstractByteArrayCopier {
	@ObfuscatedName("ak")
	@Export("directBuffer")
	ByteBuffer directBuffer;

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)[B",
		garbageValue = "20"
	)
	@Export("get")
	byte[] get() {
		byte[] var1 = new byte[this.directBuffer.capacity()];
		this.directBuffer.position(0);
		this.directBuffer.get(var1);
		return var1;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "-957801632"
	)
	@Export("set")
	public void set(byte[] var1) {
		this.directBuffer = ByteBuffer.allocateDirect(var1.length);
		this.directBuffer.position(0);
		this.directBuffer.put(var1);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)[Loz;",
		garbageValue = "2103550747"
	)
	public static StudioGame[] method7109() {
		return new StudioGame[]{StudioGame.game4, StudioGame.game5, StudioGame.oldscape, StudioGame.game3, StudioGame.stellardawn, StudioGame.runescape};
	}
}
