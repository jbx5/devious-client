import java.io.DataOutputStream;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.bouncycastle.crypto.tls.TlsAuthentication;
import java.util.Hashtable;
import java.io.IOException;
import java.io.ByteArrayOutputStream;
import org.bouncycastle.crypto.tls.DefaultTlsClient;
import net.runelite.mapping.Export;
@ObfuscatedName("u")
class class13 extends DefaultTlsClient {
	@ObfuscatedSignature(descriptor = "Lm;")
	final class12 this$1;

	@ObfuscatedSignature(descriptor = "(Lm;)V")
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

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(Lqz;II)V", garbageValue = "-751482834")
	@Export("readPlayerUpdate")
	static void readPlayerUpdate(PacketBuffer var0, int var1) {
		boolean var2 = var0.readBits(1) == 1;
		if (var2) {
			Players.Players_pendingUpdateIndices[++Players.Players_pendingUpdateCount - 1] = var1;
		}
		int var3 = var0.readBits(2);
		Player var4 = Client.players[var1];
		if (var3 == 0) {
			if (var2) {
				var4.field1111 = false;
			} else if (Client.localPlayerIndex == var1) {
				throw new RuntimeException();
			} else {
				Players.Players_regions[var1] = (var4.plane << 28) + (class7.baseY * 64 + var4.pathY[0] >> 13) + (Decimator.baseX * 8 + var4.pathX[0] >> 13 << 14);
				if (var4.field1162 != -1) {
					Players.Players_orientations[var1] = var4.field1162;
				} else {
					Players.Players_orientations[var1] = var4.orientation;
				}
				Players.Players_targetIndices[var1] = var4.targetIndex;
				Client.players[var1] = null;
				if (var0.readBits(1) != 0) {
					class118.updateExternalPlayer(var0, var1);
				}
			}
		} else {
			int var5;
			int var6;
			int var7;
			if (var3 == 1) {
				var5 = var0.readBits(3);
				var6 = var4.pathX[0];
				var7 = var4.pathY[0];
				if (var5 == 0) {
					--var6;
					--var7;
				} else if (var5 == 1) {
					--var7;
				} else if (var5 == 2) {
					++var6;
					--var7;
				} else if (var5 == 3) {
					--var6;
				} else if (var5 == 4) {
					++var6;
				} else if (var5 == 5) {
					--var6;
					++var7;
				} else if (var5 == 6) {
					++var7;
				} else if (var5 == 7) {
					++var6;
					++var7;
				}
				if (Client.localPlayerIndex == var1 && (var4.x < 1536 || var4.y < 1536 || var4.x >= 11776 || var4.y >= 11776)) {
					var4.resetPath(var6, var7);
					var4.field1111 = false;
				} else if (var2) {
					var4.field1111 = true;
					var4.tileX = var6;
					var4.tileY = var7;
				} else {
					var4.field1111 = false;
					var4.method2131(var6, var7, Players.field1298[var1]);
				}
			} else if (var3 == 2) {
				var5 = var0.readBits(4);
				var6 = var4.pathX[0];
				var7 = var4.pathY[0];
				if (var5 == 0) {
					var6 -= 2;
					var7 -= 2;
				} else if (var5 == 1) {
					--var6;
					var7 -= 2;
				} else if (var5 == 2) {
					var7 -= 2;
				} else if (var5 == 3) {
					++var6;
					var7 -= 2;
				} else if (var5 == 4) {
					var6 += 2;
					var7 -= 2;
				} else if (var5 == 5) {
					var6 -= 2;
					--var7;
				} else if (var5 == 6) {
					var6 += 2;
					--var7;
				} else if (var5 == 7) {
					var6 -= 2;
				} else if (var5 == 8) {
					var6 += 2;
				} else if (var5 == 9) {
					var6 -= 2;
					++var7;
				} else if (var5 == 10) {
					var6 += 2;
					++var7;
				} else if (var5 == 11) {
					var6 -= 2;
					var7 += 2;
				} else if (var5 == 12) {
					--var6;
					var7 += 2;
				} else if (var5 == 13) {
					var7 += 2;
				} else if (var5 == 14) {
					++var6;
					var7 += 2;
				} else if (var5 == 15) {
					var6 += 2;
					var7 += 2;
				}
				if (Client.localPlayerIndex != var1 || var4.x >= 1536 && var4.y >= 1536 && var4.x < 11776 && var4.y < 11776) {
					if (var2) {
						var4.field1111 = true;
						var4.tileX = var6;
						var4.tileY = var7;
					} else {
						var4.field1111 = false;
						var4.method2131(var6, var7, Players.field1298[var1]);
					}
				} else {
					var4.resetPath(var6, var7);
					var4.field1111 = false;
				}
			} else {
				var5 = var0.readBits(1);
				int var8;
				int var9;
				int var10;
				int var11;
				if (var5 == 0) {
					var6 = var0.readBits(12);
					var7 = var6 >> 10;
					var8 = var6 >> 5 & 31;
					if (var8 > 15) {
						var8 -= 32;
					}
					var9 = var6 & 31;
					if (var9 > 15) {
						var9 -= 32;
					}
					var10 = var8 + var4.pathX[0];
					var11 = var9 + var4.pathY[0];
					if (Client.localPlayerIndex != var1 || var4.x >= 1536 && var4.y >= 1536 && var4.x < 11776 && var4.y < 11776) {
						if (var2) {
							var4.field1111 = true;
							var4.tileX = var10;
							var4.tileY = var11;
						} else {
							var4.field1111 = false;
							var4.method2131(var10, var11, Players.field1298[var1]);
						}
					} else {
						var4.resetPath(var10, var11);
						var4.field1111 = false;
					}
					var4.plane = ((byte) (var7 + var4.plane & 3));
					if (Client.localPlayerIndex == var1) {
						class268.Client_plane = var4.plane;
					}
				} else {
					var6 = var0.readBits(30);
					var7 = var6 >> 28;
					var8 = var6 >> 14 & 16383;
					var9 = var6 & 16383;
					var10 = (Decimator.baseX * 8 + var8 + var4.pathX[0] & 16383) - Decimator.baseX * 8;
					var11 = (class7.baseY * 64 + var9 + var4.pathY[0] & 16383) - class7.baseY * 64;
					if (Client.localPlayerIndex == var1 && (var4.x < 1536 || var4.y < 1536 || var4.x >= 11776 || var4.y >= 11776)) {
						var4.resetPath(var10, var11);
						var4.field1111 = false;
					} else if (var2) {
						var4.field1111 = true;
						var4.tileX = var10;
						var4.tileY = var11;
					} else {
						var4.field1111 = false;
						var4.method2131(var10, var11, Players.field1298[var1]);
					}
					var4.plane = ((byte) (var7 + var4.plane & 3));
					if (Client.localPlayerIndex == var1) {
						class268.Client_plane = var4.plane;
					}
				}
			}
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-1238151208")
	static void method165() {
		class116.method2683(24);
		ItemComposition.setLoginResponseString("The game servers are currently being updated.", "Please wait a few minutes and try again.", "");
	}

	@ObfuscatedName("hp")
	@ObfuscatedSignature(descriptor = "(III)Lgr;", garbageValue = "-1254170840")
	static RouteStrategy method164(int var0, int var1) {
		Client.field691.approxDestinationX = var0;
		Client.field691.approxDestinationY = var1;
		Client.field691.approxDestinationSizeX = 1;
		Client.field691.approxDestinationSizeY = 1;
		return Client.field691;
	}
}