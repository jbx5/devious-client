import java.util.Iterator;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ql")
@Implements("AddRequestTask")
public class AddRequestTask extends SongTask {
	@ObfuscatedSignature(
		descriptor = "(Lqe;)V"
	)
	public AddRequestTask(SongTask var1) {
		super(var1);
		super.field4627 = "AddRequestTask";
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2024199564"
	)
	public boolean vmethod8043() {
		while (!class321.field3478.isEmpty()) {
			MusicSong var1 = (MusicSong)class321.field3478.peek();
			if (var1 == null) {
				class321.field3478.pop();
			} else {
				var1.midiPcmStream = this.method7985();
				class321.musicSongs.add(var1);
				class321.field3478.pop();
			}
		}

		return true;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Lmo;",
		garbageValue = "-485784038"
	)
	MidiPcmStream method7985() {
		MidiPcmStream var1 = null;
		Iterator var2 = class321.field3479.iterator();

		while (true) {
			MidiPcmStream var3;
			do {
				do {
					if (!var2.hasNext()) {
						if (var1 != null) {
							++var1.field3518;
							if (var1.method6150() == 0 && var1.isReady()) {
								var1.clear();
								var1.method6202();
								var1.setPcmStreamVolume(0);
							}
						}

						return var1;
					}

					var3 = (MidiPcmStream)var2.next();
				} while(var3 == null);
			} while(var1 != null && var1.field3518 <= var3.field3518 && (var3.method6150() != 0 || !var3.isReady()));

			var1 = var3;
		}
	}
}
