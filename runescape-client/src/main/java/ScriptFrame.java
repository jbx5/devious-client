import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cr")
@Implements("ScriptFrame")
public class ScriptFrame {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Ldm;"
	)
	@Export("script")
	Script script;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1297096727
	)
	@Export("pc")
	int pc;
	@ObfuscatedName("aj")
	@Export("intLocals")
	int[] intLocals;
	@ObfuscatedName("az")
	@Export("stringLocals")
	String[] stringLocals;

	ScriptFrame() {
		this.pc = -1;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/ArrayList;IIIIZB)V",
		garbageValue = "16"
	)
	public static void method1169(ArrayList var0, int var1, int var2, int var3, int var4, boolean var5) {
		if (!var0.isEmpty()) {
			class329.field3576.clear();
			class329.field3581.clear();
			class148.method3243(var5);
			if (!var5) {
				class329.field3579.clear();
			}

			Iterator var6 = var0.iterator();

			while (var6.hasNext()) {
				MusicSong var7 = (MusicSong)var6.next();
				if (var7.musicTrackGroupId != -1 && var7.musicTrackFileId != -1) {
					if (!var5) {
						class329.field3579.add(var7);
					}

					class329.field3576.add(var7);
				}
			}

			if (!class329.field3576.isEmpty()) {
				class146.method3226(var1, var2, var3, var4);
				class329.field3581.add(new AddRequestTask((SongTask)null));
				class329.field3581.add(new class445((SongTask)null, class415.field4660, class329.field3586, LoginPacket.field1682));
				ArrayList var12 = new ArrayList();
				var12.add(new class440(new FadeInTask((SongTask)null, 0, true, class329.field3580)));
				if (!class329.musicSongs.isEmpty()) {
					ArrayList var13 = new ArrayList();
					var13.add(new DelayFadeTask(new ConcurrentMidiTask((SongTask)null, var12), class329.field3585));
					ArrayList var9 = new ArrayList();
					Iterator var10 = class329.musicSongs.iterator();

					while (var10.hasNext()) {
						MusicSong var11 = (MusicSong)var10.next();
						var9.add(var11);
					}

					var13.add(new DelayFadeTask(new FadeOutTask(new class438((SongTask)null, var9), 0, false, class329.field3584), class329.musicPlayerStatus));
					class329.field3581.add(new ConcurrentMidiTask((SongTask)null, var13));
				} else {
					class329.field3581.add(new DelayFadeTask((SongTask)null, class329.field3585));
					class329.field3581.add(new ConcurrentMidiTask((SongTask)null, var12));
				}

			}
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)[Lsy;",
		garbageValue = "99"
	)
	static class484[] method1168() {
		return new class484[]{class484.field4999, class484.field5001, class484.field5000, class484.field5004};
	}
}
