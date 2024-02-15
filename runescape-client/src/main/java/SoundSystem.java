import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("be")
@Implements("SoundSystem")
public class SoundSystem implements Runnable {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "[Lbf;"
	)
	@Export("players")
	volatile PcmPlayer[] players;

	SoundSystem() {
		this.players = new PcmPlayer[2];
	}

	public void run() {
		try {
			for (int var1 = 0; var1 < 2; ++var1) {
				PcmPlayer var2 = this.players[var1];
				if (var2 != null) {
					var2.run();
				}
			}
		} catch (Exception var4) {
			class315.RunException_sendStackTrace((String)null, var4);
		}

	}

	@ObfuscatedName("as")
	public static int method809(long var0) {
		return (int)(var0 >>> 7 & 127L);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IZIB)V",
		garbageValue = "115"
	)
	public static final void method805(int var0, boolean var1, int var2) {
		if (var0 >= 8000 && var0 <= 48000) {
			PcmPlayer.field295 = var0;
			PcmPlayer.PcmPlayer_stereo = var1;
			class362.field3960 = var2;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1560357606"
	)
	static int method808() {
		return Login.loginIndex;
	}

	@ObfuscatedName("lj")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "2146340843"
	)
	static String method810(int var0) {
		if (var0 < 0) {
			return "";
		} else {
			return Client.menuTargets[var0].length() > 0 ? Client.menuActions[var0] + " " + Client.menuTargets[var0] : Client.menuActions[var0];
		}
	}

	@ObfuscatedName("nj")
	@ObfuscatedSignature(
		descriptor = "(Lng;I)Z",
		garbageValue = "-2081066520"
	)
	static final boolean method807(Widget var0) {
		int var1 = var0.contentType;
		if (var1 == 205) {
			Client.logoutTimer = 250;
			return true;
		} else {
			int var2;
			int var3;
			if (var1 >= 300 && var1 <= 313) {
				var2 = (var1 - 300) / 2;
				var3 = var1 & 1;
				Client.playerAppearance.changeAppearance(var2, var3 == 1);
			}

			if (var1 >= 314 && var1 <= 323) {
				var2 = (var1 - 314) / 2;
				var3 = var1 & 1;
				Client.playerAppearance.method6471(var2, var3 == 1);
			}

			if (var1 == 324) {
				Client.playerAppearance.method6493(0);
			}

			if (var1 == 325) {
				Client.playerAppearance.method6493(1);
			}

			if (var1 == 326) {
				PacketBufferNode var4 = ViewportMouse.getPacketBufferNode(ClientPacket.field3201, Client.packetWriter.isaacCipher);
				Client.playerAppearance.write(var4.packetBuffer);
				Client.packetWriter.addNode(var4);
				return true;
			} else {
				return false;
			}
		}
	}
}
