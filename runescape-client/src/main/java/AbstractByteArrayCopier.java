import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("no")
@Implements("AbstractByteArrayCopier")
public abstract class AbstractByteArrayCopier {
	AbstractByteArrayCopier() {
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "-1949273929"
	)
	@Export("get")
	abstract byte[] get();

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "-994274734"
	)
	@Export("set")
	public abstract void set(byte[] var1);

	@ObfuscatedName("hb")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-356932832"
	)
	@Export("playSong")
	static void playSong(int var0) {
		if (var0 == -1 && !Client.playingJingle) {
			class169.method3521(0, 0);
		} else if (var0 != -1 && !WorldMapRenderer.method4894(var0) && class30.clientPreferences.getMusicVolume() != 0) {
			ArrayList var1 = new ArrayList();
			var1.add(new MusicSong(Renderable.archive6, var0, 0, class30.clientPreferences.getMusicVolume(), false));
			if (Client.playingJingle) {
				class133.method3120(var1, 0, 100, 100, 0);
			} else {
				PacketWriter.method2891(var1, 0, 100, 100, 0, false);
			}
		}

	}

	@ObfuscatedName("iv")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1743387110"
	)
	static final void method6954() {
		int var0 = Players.Players_count;
		int[] var1 = Players.Players_indices;

		for (int var2 = 0; var2 < var0; ++var2) {
			Player var3 = Client.players[var1[var2]];
			if (var3 != null) {
				ScriptEvent.updateActorSequence(var3, 1);
			}
		}

	}
}
