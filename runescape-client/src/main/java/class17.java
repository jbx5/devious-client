import java.security.cert.Certificate;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSessionContext;
import javax.net.ssl.SSLSession;
import javax.security.cert.X509Certificate;
import java.security.Principal;
import net.runelite.mapping.Export;
@ObfuscatedName("y")
class class17 implements SSLSession {
	@ObfuscatedName("rj")
	@ObfuscatedSignature(descriptor = "Ley;")
	@Export("guestClanChannel")
	static ClanChannel guestClanChannel;

	@ObfuscatedSignature(descriptor = "Lx;")
	final class12 this$1;

	@ObfuscatedSignature(descriptor = "(Lx;)V")
	class17(class12 var1) {
		this.this$1 = var1;
	}

	public long getCreationTime() {
		throw new UnsupportedOperationException();
	}

	public int getApplicationBufferSize() {
		return 0;
	}

	public Principal getPeerPrincipal() throws SSLPeerUnverifiedException {
		return null;
	}

	public long getLastAccessedTime() {
		throw new UnsupportedOperationException();
	}

	public Certificate[] getLocalCertificates() {
		throw new UnsupportedOperationException();
	}

	public Principal getLocalPrincipal() {
		throw new UnsupportedOperationException();
	}

	public Certificate[] getPeerCertificates() throws SSLPeerUnverifiedException {
		return this.this$1.field64;
	}

	public X509Certificate[] getPeerCertificateChain() throws SSLPeerUnverifiedException {
		return null;
	}

	public String getCipherSuite() {
		throw new UnsupportedOperationException();
	}

	public String getPeerHost() {
		throw new UnsupportedOperationException();
	}

	public String getProtocol() {
		throw new UnsupportedOperationException();
	}

	public byte[] getId() {
		throw new UnsupportedOperationException();
	}

	public SSLSessionContext getSessionContext() {
		throw new UnsupportedOperationException();
	}

	public Object getValue(String var1) {
		throw new UnsupportedOperationException();
	}

	public String[] getValueNames() {
		throw new UnsupportedOperationException();
	}

	public boolean isValid() {
		throw new UnsupportedOperationException();
	}

	public void putValue(String var1, Object var2) {
		throw new UnsupportedOperationException();
	}

	public void removeValue(String var1) {
		throw new UnsupportedOperationException();
	}

	public int getPacketBufferSize() {
		throw new UnsupportedOperationException();
	}

	public void invalidate() {
		throw new UnsupportedOperationException();
	}

	public int getPeerPort() {
		return 0;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(Lci;I)V", garbageValue = "193482070")
	@Export("runScriptEvent")
	public static void runScriptEvent(ScriptEvent var0) {
		class228.runScript(var0, 500000, 475000);
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(II)[B", garbageValue = "-462685190")
	@Export("ByteArrayPool_getArray")
	public static synchronized byte[] ByteArrayPool_getArray(int var0) {
		return ByteArrayPool.ByteArrayPool_getArrayBool(var0, false);
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-314282579")
	static void method262() {
		Messages.Messages_channels.clear();
		Messages.Messages_hashTable.clear();
		Messages.Messages_queue.clear();
		Messages.Messages_count = 0;
	}

	@ObfuscatedName("w")
	public static int method263(long var0) {
		return ((int) (var0 >>> 7 & 127L));
	}

	@ObfuscatedName("jf")
	@ObfuscatedSignature(descriptor = "(Lku;IIIIIII)V", garbageValue = "-1374373276")
	static final void method261(Widget var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (Client.field562) {
			Client.alternativeScrollbarWidth = 32;
		} else {
			Client.alternativeScrollbarWidth = 0;
		}
		Client.field562 = false;
		int var7;
		if (MouseHandler.MouseHandler_currentButton == 1 || !ObjectSound.mouseCam && MouseHandler.MouseHandler_currentButton == 4) {
			if (var5 >= var1 && var5 < var1 + 16 && var6 >= var2 && var6 < var2 + 16) {
				var0.scrollY -= 4;
				class220.invalidateWidget(var0);
			} else if (var5 >= var1 && var5 < var1 + 16 && var6 >= var3 + var2 - 16 && var6 < var3 + var2) {
				var0.scrollY += 4;
				class220.invalidateWidget(var0);
			} else if (var5 >= var1 - Client.alternativeScrollbarWidth && var5 < Client.alternativeScrollbarWidth + var1 + 16 && var6 >= var2 + 16 && var6 < var3 + var2 - 16) {
				var7 = var3 * (var3 - 32) / var4;
				if (var7 < 8) {
					var7 = 8;
				}
				int var8 = var6 - var2 - 16 - var7 / 2;
				int var9 = var3 - 32 - var7;
				var0.scrollY = var8 * (var4 - var3) / var9;
				class220.invalidateWidget(var0);
				Client.field562 = true;
			}
		}
		if (Client.mouseWheelRotation != 0) {
			var7 = var0.width;
			if (var5 >= var1 - var7 && var6 >= var2 && var5 < var1 + 16 && var6 <= var3 + var2) {
				var0.scrollY += Client.mouseWheelRotation * 45;
				class220.invalidateWidget(var0);
			}
		}
	}
}