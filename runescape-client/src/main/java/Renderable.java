import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jd")
@Implements("Renderable")
public abstract class Renderable extends DualNode {
	@ObfuscatedName("tw")
	@ObfuscatedGetter(
		intValue = -1717089125
	)
	static int field2716;
	@ObfuscatedName("er")
	@ObfuscatedGetter(
		intValue = 1760673469
	)
	@Export("height")
	public int height;

	protected Renderable() {
		this.height = 1000;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Ljn;",
		garbageValue = "1157175232"
	)
	@Export("getModel")
	protected Model getModel() {
		return null;
	}

	@ObfuscatedName("dd")
	@Export("draw")
	void draw(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
		Model var11 = this.getModel();
		if (var11 != null) {
			this.height = var11.height;
			var11.draw(var1, var2, var3, var4, var5, var6, var7, var8, var9);
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/ArrayList;IIIIZI)V",
		garbageValue = "-1122381163"
	)
	public static void method4881(ArrayList var0, int var1, int var2, int var3, int var4, boolean var5) {
		if (!var0.isEmpty()) {
			class321.field3500.clear();
			class321.field3498.clear();
			SongTask.method7848(var5);
			class139.method3118(var0, var5);
			if (!class321.field3500.isEmpty()) {
				WorldMapSection2.method5289(var1, var2, var3, var4);
				class321.field3498.add(new AddRequestTask((SongTask)null));
				class321.field3498.add(new class428((SongTask)null, class321.field3493, class321.field3494, class321.field3497));
				ArrayList var6 = new ArrayList();
				var6.add(new class423(new FadeInTask((SongTask)null, 0, true, class321.field3503)));
				if (!class321.musicSongs.isEmpty()) {
					ArrayList var7 = new ArrayList();
					var7.add(new DelayFadeTask(new ConcurrentMidiTask((SongTask)null, var6), class321.field3502));
					ArrayList var9 = new ArrayList();
					Iterator var10 = class321.musicSongs.iterator();

					while (var10.hasNext()) {
						MusicSong var11 = (MusicSong)var10.next();
						var9.add(var11);
					}

					var7.add(new DelayFadeTask(new FadeOutTask(new class421((SongTask)null, var9), 0, false, class321.field3501), class321.musicPlayerStatus));
					class321.field3498.add(new ConcurrentMidiTask((SongTask)null, var7));
				} else {
					class321.field3498.add(new DelayFadeTask((SongTask)null, class321.field3502));
					class321.field3498.add(new ConcurrentMidiTask((SongTask)null, var6));
				}

			}
		}
	}
}
