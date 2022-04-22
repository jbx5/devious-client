import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Hashtable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.bouncycastle.crypto.tls.DefaultTlsClient;
import org.bouncycastle.crypto.tls.TlsAuthentication;

@ObfuscatedName("k")
class class13 extends DefaultTlsClient {
	@ObfuscatedName("gk")
	@ObfuscatedSignature(descriptor = 
	"Lmd;")

	@Export("fontPlain12")
	static Font fontPlain12;

	@ObfuscatedSignature(descriptor = 
	"Lw;")

	final class12 this$1;

	@ObfuscatedSignature(descriptor = 
	"(Lw;)V")

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

	@ObfuscatedName("gs")
	@ObfuscatedSignature(descriptor = 
	"(IIII)V", garbageValue = 
	"-547008186")

	static final void method163(int var0, int var1, int var2) {
		if (WorldMapLabelSize.cameraX < var0) {
			WorldMapLabelSize.cameraX = ((((var0 - WorldMapLabelSize.cameraX) * ArchiveDisk.field4309) / 1000) + WorldMapLabelSize.cameraX) + Script.field955;
			if (WorldMapLabelSize.cameraX > var0) {
				WorldMapLabelSize.cameraX = var0;
			}
		}

		if (WorldMapLabelSize.cameraX > var0) {
			WorldMapLabelSize.cameraX -= (((WorldMapLabelSize.cameraX - var0) * ArchiveDisk.field4309) / 1000) + Script.field955;
			if (WorldMapLabelSize.cameraX < var0) {
				WorldMapLabelSize.cameraX = var0;
			}
		}

		if (ItemContainer.cameraY < var1) {
			ItemContainer.cameraY = ((((var1 - ItemContainer.cameraY) * ArchiveDisk.field4309) / 1000) + ItemContainer.cameraY) + Script.field955;
			if (ItemContainer.cameraY > var1) {
				ItemContainer.cameraY = var1;
			}
		}

		if (ItemContainer.cameraY > var1) {
			ItemContainer.cameraY -= (((ItemContainer.cameraY - var1) * ArchiveDisk.field4309) / 1000) + Script.field955;
			if (ItemContainer.cameraY < var1) {
				ItemContainer.cameraY = var1;
			}
		}

		if (class154.cameraZ < var2) {
			class154.cameraZ = ((((var2 - class154.cameraZ) * ArchiveDisk.field4309) / 1000) + class154.cameraZ) + Script.field955;
			if (class154.cameraZ > var2) {
				class154.cameraZ = var2;
			}
		}

		if (class154.cameraZ > var2) {
			class154.cameraZ -= (((class154.cameraZ - var2) * ArchiveDisk.field4309) / 1000) + Script.field955;
			if (class154.cameraZ < var2) {
				class154.cameraZ = var2;
			}
		}

	}

	@ObfuscatedName("hs")
	@ObfuscatedSignature(descriptor = 
	"(IIB)I", garbageValue = 
	"109")

	static int method164(int var0, int var1) {
		int var2 = var1 - 334;
		if (var2 < 0) {
			var2 = 0;
		} else if (var2 > 100) {
			var2 = 100;
		}

		int var3 = (((Client.zoomWidth - Client.zoomHeight) * var2) / 100) + Client.zoomHeight;
		return (var0 * var3) / 256;
	}
}