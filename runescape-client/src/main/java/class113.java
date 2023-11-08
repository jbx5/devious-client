import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("es")
public class class113 extends UrlRequester {
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = -467021809
	)
	static int field1426;
	@ObfuscatedName("ab")
	final boolean field1423;

	public class113(boolean var1, int var2) {
		super(var2);
		this.field1423 = var1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lea;I)V",
		garbageValue = "422697771"
	)
	void vmethod2910(UrlRequest var1) throws IOException {
		URLConnection var2 = null;
		boolean var9 = false;

		HttpURLConnection var12;
		label136: {
			label128: {
				try {
					label131: {
						var9 = true;
						String var3 = var1.field1429.getProtocol();
						if (var3.equals("http")) {
							var2 = this.method2911(var1);
						} else {
							if (!var3.equals("https")) {
								var1.field1427 = UrlRequest.field1432;
								var9 = false;
								break label131;
							}

							var2 = this.method2916(var1);
						}

						this.method2890(var2, var1);
						var9 = false;
						break label136;
					}
				} catch (IOException var10) {
					var1.field1427 = UrlRequest.field1432;
					var9 = false;
					break label128;
				} finally {
					if (var9) {
						if (var2 != null && var2 instanceof HttpURLConnection) {
							HttpURLConnection var6 = (HttpURLConnection)var2;
							var6.disconnect();
						}

					}
				}

				if (var2 != null && var2 instanceof HttpURLConnection) {
					HttpURLConnection var4 = (HttpURLConnection)var2;
					var4.disconnect();
				}

				return;
			}

			if (var2 != null && var2 instanceof HttpURLConnection) {
				var12 = (HttpURLConnection)var2;
				var12.disconnect();
			}

			return;
		}

		if (var2 != null && var2 instanceof HttpURLConnection) {
			var12 = (HttpURLConnection)var2;
			var12.disconnect();
		}

	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lea;I)Ljava/net/URLConnection;",
		garbageValue = "-1165040742"
	)
	URLConnection method2911(UrlRequest var1) throws IOException {
		URLConnection var2 = var1.field1429.openConnection();
		this.method2905(var2);
		return var2;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lea;I)Ljava/net/URLConnection;",
		garbageValue = "1061431523"
	)
	URLConnection method2916(UrlRequest var1) throws IOException {
		HttpsURLConnection var2 = (HttpsURLConnection)var1.field1429.openConnection();
		if (!this.field1423) {
			if (class15.field69 == null) {
				class15.field69 = new class15();
			}

			class15 var4 = class15.field69;
			var2.setSSLSocketFactory(var4);
		}

		this.method2905(var2);
		return var2;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Llq;Luy;I)Lld;",
		garbageValue = "-133059507"
	)
	@Export("getPacketBufferNode")
	public static PacketBufferNode getPacketBufferNode(ClientPacket var0, IsaacCipher var1) {
		PacketBufferNode var2 = FaceNormal.method5512();
		var2.clientPacket = var0;
		var2.clientPacketLength = var0.length;
		if (var2.clientPacketLength == -1) {
			var2.packetBuffer = new PacketBuffer(260);
		} else if (var2.clientPacketLength == -2) {
			var2.packetBuffer = new PacketBuffer(10000);
		} else if (var2.clientPacketLength <= 18) {
			var2.packetBuffer = new PacketBuffer(20);
		} else if (var2.clientPacketLength <= 98) {
			var2.packetBuffer = new PacketBuffer(100);
		} else {
			var2.packetBuffer = new PacketBuffer(260);
		}

		var2.packetBuffer.setIsaacCipher(var1);
		var2.packetBuffer.writeByteIsaac(var2.clientPacket.id);
		var2.index = 0;
		return var2;
	}
}
