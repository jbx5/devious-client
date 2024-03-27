import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Hashtable;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.bouncycastle.crypto.tls.DefaultTlsClient;
import org.bouncycastle.crypto.tls.TlsAuthentication;

@ObfuscatedName("ax")
class class13 extends DefaultTlsClient {
	@ObfuscatedName("gg")
	@ObfuscatedGetter(
		intValue = 1515401243
	)
	static int field60;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lai;"
	)
	final SecureRandomSSLSocket this$1;

	@ObfuscatedSignature(
		descriptor = "(Lai;)V"
	)
	class13(SecureRandomSSLSocket var1) {
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

	@ObfuscatedName("kd")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "258076310"
	)
	static void method170(int var0, int var1, int var2, int var3, int var4, int var5) {
		NodeDeque var6 = Client.groundItems[var0][var1][var2];
		if (var6 != null) {
			for (TileItem var7 = (TileItem)var6.last(); var7 != null; var7 = (TileItem)var6.previous()) {
				if ((var3 & 32767) == var7.id && var4 == var7.quantity) {
					var7.quantity = var5;
					break;
				}
			}

			class477.updateItemPile(var0, var1, var2);
		}

	}
}
