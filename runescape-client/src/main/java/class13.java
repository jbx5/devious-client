import java.io.DataOutputStream;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.bouncycastle.crypto.tls.TlsAuthentication;
import java.util.Hashtable;
import java.io.IOException;
import java.io.ByteArrayOutputStream;
import org.bouncycastle.crypto.tls.DefaultTlsClient;
import net.runelite.mapping.Export;
@ObfuscatedName("g")
class class13 extends DefaultTlsClient {
	@ObfuscatedName("rg")
	@ObfuscatedSignature(descriptor = "Lnw;")
	@Export("friendsChat")
	static FriendsChat friendsChat;

	@ObfuscatedSignature(descriptor = "Lx;")
	final class12 this$1;

	@ObfuscatedSignature(descriptor = "(Lx;)V")
	class13(class12 var1) {
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

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(II)Lfs;", garbageValue = "1615716454")
	@Export("SpotAnimationDefinition_get")
	public static SpotAnimationDefinition SpotAnimationDefinition_get(int var0) {
		SpotAnimationDefinition var1 = ((SpotAnimationDefinition) (SpotAnimationDefinition.SpotAnimationDefinition_cached.get(((long) (var0)))));
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = SpotAnimationDefinition.SpotAnimationDefinition_archive.takeFile(13, var0);
			var1 = new SpotAnimationDefinition();
			var1.id = var0;
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}
			SpotAnimationDefinition.SpotAnimationDefinition_cached.put(var1, ((long) (var0)));
			return var1;
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(II)I", garbageValue = "2040602993")
	public static int method174(int var0) {
		return var0 >>> 4 & class439.field4694;
	}

	@ObfuscatedName("hm")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-301016750")
	static void method173() {
		if (class28.localPlayer.x >> 7 == Client.destinationX && class28.localPlayer.y >> 7 == Client.destinationY) {
			Client.destinationX = 0;
		}
	}
}