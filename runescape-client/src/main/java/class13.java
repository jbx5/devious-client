import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Hashtable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.bouncycastle.crypto.tls.DefaultTlsClient;
import org.bouncycastle.crypto.tls.TlsAuthentication;

@ObfuscatedName("ax")
class class13 extends DefaultTlsClient {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	static ClanChannel field54;
	@ObfuscatedName("kf")
	@ObfuscatedSignature(
		descriptor = "[Luc;"
	)
	@Export("headIconPrayerSprites")
	static SpritePixels[] headIconPrayerSprites;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lad;"
	)
	final SecureRandomSSLSocket this$1;

	@ObfuscatedSignature(
		descriptor = "(Lad;)V"
	)
	class13(SecureRandomSSLSocket var1) {
		this.this$1 = var1;
	}

	public TlsAuthentication getAuthentication() throws IOException {
		return new class11(this);
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

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Low;Low;I)V",
		garbageValue = "1347219538"
	)
	public static void method171(AbstractArchive var0, AbstractArchive var1) {
		NPCComposition.NpcDefinition_archive = var0;
		NPCComposition.field1947 = var1;
	}

	@ObfuscatedName("or")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1839649993"
	)
	static final void method176() {
		Client.field704 = Client.cycleCntr;
	}
}
