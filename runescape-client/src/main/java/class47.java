import java.awt.Component;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantLock;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bd")
public class class47 {
	@ObfuscatedName("kn")
	@ObfuscatedGetter(
		intValue = -1951368845
	)
	@Export("cameraX")
	static int cameraX;
	@ObfuscatedName("me")
	@ObfuscatedGetter(
		intValue = 1043320483
	)
	static int field314;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lcl;"
	)
	VorbisSample field310;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lbl;"
	)
	RawSound field311;
	@ObfuscatedName("ag")
	ReentrantLock field313;

	@ObfuscatedSignature(
		descriptor = "(Lcl;Lbl;)V"
	)
	class47(VorbisSample var1, RawSound var2) {
		this.field310 = var1;
		this.field311 = var2;
		this.field313 = new ReentrantLock();
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;B)V",
		garbageValue = "0"
	)
	static void method899(Component var0) {
		var0.removeMouseListener(MouseHandler.MouseHandler_instance);
		var0.removeMouseMotionListener(MouseHandler.MouseHandler_instance);
		var0.removeFocusListener(MouseHandler.MouseHandler_instance);
		MouseHandler.MouseHandler_currentButtonVolatile = 0;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)Z",
		garbageValue = "690538178"
	)
	static final boolean method902(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7 = ViewportMouse.ViewportMouse_y + var6;
		if (var7 < var0 && var7 < var1 && var7 < var2) {
			return false;
		} else {
			var7 = ViewportMouse.ViewportMouse_y - var6;
			if (var7 > var0 && var7 > var1 && var7 > var2) {
				return false;
			} else {
				var7 = ViewportMouse.ViewportMouse_x + var6;
				if (var7 < var3 && var7 < var4 && var7 < var5) {
					return false;
				} else {
					var7 = ViewportMouse.ViewportMouse_x - var6;
					return var7 <= var3 || var7 <= var4 || var7 <= var5;
				}
			}
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-62"
	)
	static void method901() {
		class163.updateLoginIndex(24);
		VerticalAlignment.setLoginResponseString("", "You were disconnected from the server.", "");
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1935757196"
	)
	static void method900() {
		if (!class105.clientPreferences.isTitleMusicDisabled()) {
			ArrayList var0 = new ArrayList();
			var0.add(new MusicSong(class199.archive6, "scape main", "", 255, false));
			FontName.method9220(var0, 0, 0, 0, 100, false);
		} else {
			class137.method3187(0, 0);
		}

	}

	@ObfuscatedName("lx")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "1933764384"
	)
	static void method903(int var0, String var1) {
		int var2 = SoundCache.localPlayer.worldView.playerUpdateManager.playerCount;
		int[] var3 = SoundCache.localPlayer.worldView.playerUpdateManager.playerIndices;
		boolean var4 = false;
		Username var5 = new Username(var1, Projectile.loginType);

		for (int var6 = 0; var6 < var2; ++var6) {
			Player var7 = SoundCache.localPlayer.worldView.players[var3[var6]];
			if (var7 != null && var7 != SoundCache.localPlayer && var7.username != null && var7.username.equals(var5)) {
				PacketBufferNode var8;
				if (var0 == 1) {
					var8 = class170.getPacketBufferNode(ClientPacket.OPPLAYER1, Client.packetWriter.isaacCipher);
					var8.packetBuffer.writeByteSub(0);
					var8.packetBuffer.writeShortAdd(var3[var6]);
					Client.packetWriter.addNode(var8);
				} else if (var0 == 4) {
					var8 = class170.getPacketBufferNode(ClientPacket.OPPLAYER4, Client.packetWriter.isaacCipher);
					var8.packetBuffer.writeByteSub(0);
					var8.packetBuffer.writeShort(var3[var6]);
					Client.packetWriter.addNode(var8);
				} else if (var0 == 6) {
					var8 = class170.getPacketBufferNode(ClientPacket.OPPLAYER6, Client.packetWriter.isaacCipher);
					var8.packetBuffer.writeShortAddLE(var3[var6]);
					var8.packetBuffer.writeByteAdd(0);
					Client.packetWriter.addNode(var8);
				} else if (var0 == 7) {
					var8 = class170.getPacketBufferNode(ClientPacket.OPPLAYER7, Client.packetWriter.isaacCipher);
					var8.packetBuffer.writeShortAddLE(var3[var6]);
					var8.packetBuffer.writeByteAdd(0);
					Client.packetWriter.addNode(var8);
				}

				var4 = true;
				break;
			}
		}

		if (!var4) {
			VarbitComposition.addGameMessage(4, "", "Unable to find " + var1);
		}

	}
}
