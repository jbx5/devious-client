import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qc")
@Implements("SongTask")
public abstract class SongTask {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lqc;"
	)
	@Export("songTask")
	SongTask songTask;
	@ObfuscatedName("at")
	String field4653;
	@ObfuscatedName("an")
	String field4651;
	@ObfuscatedName("ao")
	boolean field4650;
	@ObfuscatedName("ab")
	boolean field4654;

	@ObfuscatedSignature(
		descriptor = "(Lqc;)V"
	)
	SongTask(SongTask var1) {
		this.songTask = var1;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-362428891"
	)
	public abstract boolean vmethod7854();

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "21996"
	)
	public boolean method7826() {
		return this.field4650;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1961667359"
	)
	public boolean method7829() {
		return this.field4654;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "495814194"
	)
	public String method7842() {
		return "Error in task: " + this.field4651 + ", Error message: " + this.field4653;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)Lqc;",
		garbageValue = "-5"
	)
	public SongTask method7827() {
		return this.songTask;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "53"
	)
	void method7844(String var1) {
		this.field4650 = true;
		this.field4653 = var1;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "2033769251"
	)
	static void method7848(boolean var0) {
		MusicSong var2;
		if (var0) {
			Iterator var7 = class321.musicSongs.iterator();

			while (true) {
				do {
					if (!var7.hasNext()) {
						class321.musicSongs.clear();
						return;
					}

					var2 = (MusicSong)var7.next();
				} while(var2 == null);

				var2.midiPcmStream.clear();
				var2.midiPcmStream.method6004();
				var2.midiPcmStream.setPcmStreamVolume(0);
				var2.midiPcmStream.field3534 = 0;
				int var3 = var2.musicTrackGroupId;
				int var4 = var2.musicTrackFileId;
				Iterator var5 = class321.field3499.iterator();

				while (var5.hasNext()) {
					class327 var6 = (class327)var5.next();
					var6.vmethod6187(var3, var4);
				}
			}
		} else {
			for (int var1 = 0; var1 < class321.musicSongs.size(); ++var1) {
				var2 = (MusicSong)class321.musicSongs.get(var1);
				if (var2 == null) {
					class321.musicSongs.remove(var1);
					--var1;
				} else if (var2.field3612) {
					if (var2.midiPcmStream.field3534 > 0) {
						--var2.midiPcmStream.field3534;
					}

					var2.midiPcmStream.clear();
					var2.midiPcmStream.method6004();
					var2.midiPcmStream.setPcmStreamVolume(0);
					class321.musicSongs.remove(var1);
					--var1;
				} else {
					var2.field3612 = true;
				}
			}

		}
	}
}
