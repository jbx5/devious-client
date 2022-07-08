import java.io.DataOutputStream;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.bouncycastle.crypto.tls.TlsAuthentication;
import java.util.Hashtable;
import java.io.IOException;
import java.io.ByteArrayOutputStream;
import org.bouncycastle.crypto.tls.DefaultTlsClient;
import net.runelite.mapping.Export;
@ObfuscatedName("r")
class class13 extends DefaultTlsClient {
	@ObfuscatedName("w")
	@Export("SpriteBuffer_spritePalette")
	public static int[] SpriteBuffer_spritePalette;

	@ObfuscatedName("iu")
	@ObfuscatedSignature(descriptor = "[Lqu;")
	@Export("mapSceneSprites")
	static IndexedSprite[] mapSceneSprites;

	@ObfuscatedSignature(descriptor = "Lz;")
	final class12 this$1;

	@ObfuscatedSignature(descriptor = "(Lz;)V")
	class13(class12 var1) {
		this.this$1 = var1;
	}

	public Hashtable getClientExtensions() throws IOException {
		Hashtable var1 = super.getClientExtensions();
		if (var1 == null) {
			var1 = new Hashtable();
		}
		byte[] var2 = this.this$1.val$host.getBytes();
		ByteArrayOutputStream var3 = new ByteArrayOutputStream();
		DataOutputStream var4 = new DataOutputStream(var3);
		var4.writeShort(var2.length + 3);
		var4.writeByte(0);
		var4.writeShort(var2.length);
		var4.write(var2);
		var4.close();
		var1.put(0, var3.toByteArray());
		return var1;
	}

	public TlsAuthentication getAuthentication() throws IOException {
		return new class11(this);
	}
}