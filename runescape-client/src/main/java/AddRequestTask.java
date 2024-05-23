import java.util.Iterator;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qh")
@Implements("AddRequestTask")
public class AddRequestTask extends SongTask {
	@ObfuscatedName("av")
	public static short[][] field4780;
	@ObfuscatedName("io")
	@ObfuscatedSignature(
		descriptor = "Lhe;"
	)
	static Task field4779;

	@ObfuscatedSignature(
		descriptor = "(Lre;)V"
	)
	public AddRequestTask(SongTask var1) {
		super(var1);
		super.field4793 = "AddRequestTask";
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1230726323"
	)
	public boolean vmethod8329() {
		while (!class329.field3576.isEmpty()) {
			MusicSong var1 = (MusicSong)class329.field3576.peek();
			if (var1 == null) {
				class329.field3576.pop();
			} else {
				var1.midiPcmStream = this.method8262();
				class329.musicSongs.add(var1);
				class329.field3576.pop();
			}
		}

		return true;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Lmw;",
		garbageValue = "-1043214319"
	)
	MidiPcmStream method8262() {
		MidiPcmStream var1 = null;
		Iterator var2 = class329.field3577.iterator();

		while (true) {
			MidiPcmStream var3;
			do {
				do {
					if (!var2.hasNext()) {
						if (var1 != null) {
							++var1.field3620;
							if (var1.method6374() == 0 && var1.isReady()) {
								var1.clear();
								var1.method6256();
								var1.setPcmStreamVolume(0);
							}
						}

						return var1;
					}

					var3 = (MidiPcmStream)var2.next();
				} while(var3 == null);
			} while(var1 != null && var1.field3620 <= var3.field3620 && (var3.method6374() != 0 || !var3.isReady()));

			var1 = var3;
		}
	}
}
