import java.net.HttpURLConnection;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import java.io.IOException;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import net.runelite.mapping.Export;
@ObfuscatedName("cm")
public class class101 extends UrlRequester {
	@ObfuscatedName("dn")
	@ObfuscatedSignature(descriptor = "Lnj;")
	@Export("js5Socket")
	static AbstractSocket js5Socket;

	@ObfuscatedName("c")
	final boolean field1349;

	public class101(boolean var1, int var2) {
		super(var2);
		this.field1349 = var1;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(Lcb;B)V", garbageValue = "35")
	void vmethod2629(UrlRequest var1) throws IOException {
		URLConnection var2 = null;
		try {
			try {
				String var3 = var1.url.getProtocol();
				if (var3.equals("http")) {
					var2 = this.method2624(var1);
				} else {
					if (!var3.equals("https")) {
						var1.isDone0 = true;
						return;
					}
					var2 = this.method2625(var1);
				}
				this.method2603(var2, var1);
			} catch (IOException var7) {
			}
		} finally {
			var1.isDone0 = true;
			if (var2 != null) {
				if (var2 instanceof HttpURLConnection) {
					((HttpURLConnection) (var2)).disconnect();
				} else if (var2 instanceof HttpsURLConnection) {
					((HttpsURLConnection) (var2)).disconnect();
				}
			}
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = "(Lcb;I)Ljava/net/URLConnection;", garbageValue = "2109554710")
	URLConnection method2624(UrlRequest var1) throws IOException {
		URLConnection var2 = var1.url.openConnection();
		this.method2602(var2);
		return var2;
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(descriptor = "(Lcb;S)Ljava/net/URLConnection;", garbageValue = "21713")
	URLConnection method2625(UrlRequest var1) throws IOException {
		HttpsURLConnection var2 = ((HttpsURLConnection) (var1.url.openConnection()));
		if (!this.field1349) {
			var2.setSSLSocketFactory(class15.method190());
		}
		this.method2602(var2);
		return var2;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "(BI)C", garbageValue = "532547773")
	public static char method2633(byte var0) {
		int var1 = var0 & 255;
		if (var1 == 0) {
			throw new IllegalArgumentException("" + Integer.toString(var1, 16));
		} else {
			if (var1 >= 128 && var1 < 160) {
				char var2 = class341.cp1252AsciiExtension[var1 - 128];
				if (var2 == 0) {
					var2 = '?';
				}
				var1 = var2;
			}
			return ((char) (var1));
		}
	}

	@ObfuscatedName("ge")
	@ObfuscatedSignature(descriptor = "(Lku;III)V", garbageValue = "1606047506")
	@Export("checkIfMinimapClicked")
	static final void checkIfMinimapClicked(Widget var0, int var1, int var2) {
		if (Client.minimapState == 0 || Client.minimapState == 3) {
			if (!Client.isMenuOpen && (MouseHandler.MouseHandler_lastButton == 1 || !ObjectSound.mouseCam && MouseHandler.MouseHandler_lastButton == 4)) {
				SpriteMask var3 = var0.getSpriteMask(true);
				if (var3 == null) {
					return;
				}
				int var4 = MouseHandler.MouseHandler_lastPressedX - var1;
				int var5 = MouseHandler.MouseHandler_lastPressedY - var2;
				if (var3.contains(var4, var5)) {
					var4 -= var3.width / 2;
					var5 -= var3.height / 2;
					int var6 = Client.camAngleY & 2047;
					int var7 = Rasterizer3D.Rasterizer3D_sine[var6];
					int var8 = Rasterizer3D.Rasterizer3D_cosine[var6];
					int var9 = var5 * var7 + var8 * var4 >> 11;
					int var10 = var8 * var5 - var4 * var7 >> 11;
					int var11 = var9 + class28.localPlayer.x >> 7;
					int var12 = class28.localPlayer.y - var10 >> 7;
					PacketBufferNode var13 = class433.getPacketBufferNode(ClientPacket.field2995, Client.packetWriter.isaacCipher);
					var13.packetBuffer.writeByte(18);
					var13.packetBuffer.writeShortAddLE(Message.baseY * 64 + var12);
					var13.packetBuffer.writeByteSub(KeyHandler.KeyHandler_pressedKeys[82] ? KeyHandler.KeyHandler_pressedKeys[81] ? 2 : 1 : 0);
					var13.packetBuffer.writeShortAdd(class300.baseX * 8 + var11);
					var13.packetBuffer.writeByte(var4);
					var13.packetBuffer.writeByte(var5);
					var13.packetBuffer.writeShort(Client.camAngleY);
					var13.packetBuffer.writeByte(57);
					var13.packetBuffer.writeByte(0);
					var13.packetBuffer.writeByte(0);
					var13.packetBuffer.writeByte(89);
					var13.packetBuffer.writeShort(class28.localPlayer.x);
					var13.packetBuffer.writeShort(class28.localPlayer.y);
					var13.packetBuffer.writeByte(63);
					Client.packetWriter.addNode(var13);
					Client.destinationX = var11;
					Client.destinationY = var12;
				}
			}
		}
	}
}