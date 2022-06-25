import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Implements;
import java.util.Iterator;
import net.runelite.mapping.Export;
@ObfuscatedName("ag")
@Implements("SoundSystem")
public class SoundSystem implements Runnable {
	@ObfuscatedName("ui")
	static Iterator field312;

	@ObfuscatedName("nt")
	@ObfuscatedSignature(descriptor = "Lkb;")
	static Widget field313;

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "[Lar;")
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
			class249.RunException_sendStackTrace(((String) (null)), var4);
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(I)[Lky;", garbageValue = "-236959023")
	@Export("PlayerType_values")
	public static PlayerType[] PlayerType_values() {
		return new PlayerType[]{ PlayerType.PlayerType_playerModerator, PlayerType.PlayerType_ironman, PlayerType.field3959, PlayerType.PlayerType_jagexModerator, PlayerType.field3949, PlayerType.PlayerType_ultimateIronman, PlayerType.field3952, PlayerType.PlayerType_hardcoreIronman, PlayerType.field3958, PlayerType.field3951, PlayerType.field3954, PlayerType.field3957, PlayerType.field3956, PlayerType.PlayerType_normal, PlayerType.field3960, PlayerType.field3945 };
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "(Llh;II)V", garbageValue = "1978245093")
	static void method739(AbstractArchive var0, int var1) {
		if ((var1 & 536870912) != 0) {
			Login.logoSprite = class421.SpriteBuffer_getIndexedSpriteByName(var0, "logo_deadman_mode", "");
		} else if ((var1 & 1073741824) != 0) {
			Login.logoSprite = class421.SpriteBuffer_getIndexedSpriteByName(var0, "logo_seasonal_mode", "");
		} else {
			Login.logoSprite = class421.SpriteBuffer_getIndexedSpriteByName(var0, "logo", "");
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(III)I", garbageValue = "939387682")
	static final int method740(int var0, int var1) {
		int var2 = WorldMapIcon_1.method4594(var0 - 1, var1 - 1) + WorldMapIcon_1.method4594(1 + var0, var1 - 1) + WorldMapIcon_1.method4594(var0 - 1, var1 + 1) + WorldMapIcon_1.method4594(var0 + 1, 1 + var1);
		int var3 = WorldMapIcon_1.method4594(var0 - 1, var1) + WorldMapIcon_1.method4594(1 + var0, var1) + WorldMapIcon_1.method4594(var0, var1 - 1) + WorldMapIcon_1.method4594(var0, 1 + var1);
		int var4 = WorldMapIcon_1.method4594(var0, var1);
		return var2 / 16 + var3 / 8 + var4 / 4;
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(descriptor = "([BB)[B", garbageValue = "-44")
	@Export("decompressBytes")
	static final byte[] decompressBytes(byte[] var0) {
		Buffer var1 = new Buffer(var0);
		int var2 = var1.readUnsignedByte();
		int var3 = var1.readInt();
		if (var3 < 0 || AbstractArchive.field4012 != 0 && var3 > AbstractArchive.field4012) {
			throw new RuntimeException();
		} else if (var2 == 0) {
			byte[] var6 = new byte[var3];
			var1.readBytes(var6, 0, var3);
			return var6;
		} else {
			int var4 = var1.readInt();
			if (var4 >= 0 && (AbstractArchive.field4012 == 0 || var4 <= AbstractArchive.field4012)) {
				byte[] var5 = new byte[var4];
				if (var2 == 1) {
					BZip2Decompressor.BZip2Decompressor_decompress(var5, var4, var0, var3, 9);
				} else {
					AbstractArchive.gzipDecompressor.decompress(var1, var5);
				}
				return var5;
			} else {
				throw new RuntimeException();
			}
		}
	}

	@ObfuscatedName("fo")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-2037281423")
	static void method736() {
		Client.packetWriter.clearBuffer();
		Client.packetWriter.packetBuffer.offset = 0;
		Client.packetWriter.serverPacket = null;
		Client.packetWriter.field1350 = null;
		Client.packetWriter.field1347 = null;
		Client.packetWriter.field1352 = null;
		Client.packetWriter.serverPacketLength = 0;
		Client.packetWriter.field1342 = 0;
		Client.rebootTimer = 0;
		class125.method2824();
		Client.minimapState = 0;
		Client.destinationX = 0;
		int var0;
		for (var0 = 0; var0 < 2048; ++var0) {
			Client.players[var0] = null;
		}
		class101.localPlayer = null;
		for (var0 = 0; var0 < Client.npcs.length; ++var0) {
			NPC var1 = Client.npcs[var0];
			if (var1 != null) {
				var1.targetIndex = -1;
				var1.false0 = false;
			}
		}
		class125.method2830();
		HealthBarUpdate.updateGameState(30);
		for (var0 = 0; var0 < 100; ++var0) {
			Client.field703[var0] = true;
		}
		SpriteMask.method5522();
	}

	@ObfuscatedName("ft")
	@ObfuscatedSignature(descriptor = "(IIIB)V", garbageValue = "-73")
	@Export("queueSoundEffect")
	static void queueSoundEffect(int var0, int var1, int var2) {
		if (class19.clientPreferences.method2241() != 0 && var1 != 0 && Client.soundEffectCount < 50) {
			Client.soundEffectIds[Client.soundEffectCount] = var0;
			Client.queuedSoundEffectLoops[Client.soundEffectCount] = var1;
			Client.queuedSoundEffectDelays[Client.soundEffectCount] = var2;
			Client.soundEffects[Client.soundEffectCount] = null;
			Client.soundLocations[Client.soundEffectCount] = 0;
			++Client.soundEffectCount;
		}
	}

	@ObfuscatedName("fq")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-735322936")
	static final void method743() {
		if (Projectile.ClanChat_inClanChat) {
			if (Huffman.friendsChat != null) {
				Huffman.friendsChat.sort();
			}
			class161.method3287();
			Projectile.ClanChat_inClanChat = false;
		}
	}
}