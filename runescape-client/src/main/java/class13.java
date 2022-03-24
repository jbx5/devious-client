import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Hashtable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.bouncycastle.crypto.tls.DefaultTlsClient;
import org.bouncycastle.crypto.tls.TlsAuthentication;

@ObfuscatedName("j")
class class13 extends DefaultTlsClient {

	@ObfuscatedSignature(descriptor = 
	"Lc;")

	final class12 this$1;

	@ObfuscatedSignature(descriptor = 
	"(Lc;)V")

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

	@ObfuscatedName("la")
	@ObfuscatedSignature(descriptor = 
	"(Ljava/lang/String;ZB)V", garbageValue = 
	"1")

	@Export("findItemDefinitions")
	static void findItemDefinitions(String var0, boolean var1) {
		var0 = var0.toLowerCase();
		short[] var2 = new short[16];
		int var3 = 0;

		for (int var4 = 0; var4 < ArchiveLoader.ItemDefinition_fileCount; ++var4) {
			ItemComposition var9 = class67.ItemDefinition_get(var4);
			if ((((!var1) || var9.isTradable) && (var9.noteTemplate == (-1))) && (var9.name.toLowerCase().indexOf(var0) != (-1))) {
				if (var3 >= 250) {
					PendingSpawn.foundItemIdCount = -1;
					class14.foundItemIds = null;
					return;
				}

				if (var3 >= var2.length) {
					short[] var6 = new short[var2.length * 2];

					for (int var7 = 0; var7 < var3; ++var7) {
						var6[var7] = var2[var7];
					}

					var2 = var6;
				}

				var2[var3++] = ((short) (var4));
			}
		}

		class14.foundItemIds = var2;
		MouseRecorder.foundItemIndex = 0;
		PendingSpawn.foundItemIdCount = var3;
		String[] var8 = new String[PendingSpawn.foundItemIdCount];

		for (int var5 = 0; var5 < PendingSpawn.foundItemIdCount; ++var5) {
			var8[var5] = class67.ItemDefinition_get(var2[var5]).name;
		}

		class193.method3880(var8, class14.foundItemIds);
	}
}