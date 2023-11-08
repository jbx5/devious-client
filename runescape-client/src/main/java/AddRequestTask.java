import java.util.Iterator;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pj")
@Implements("AddRequestTask")
public class AddRequestTask extends SongTask {
	@ObfuscatedSignature(
		descriptor = "(Lql;)V"
	)
	public AddRequestTask(SongTask var1) {
		super(var1);
		super.field4552 = "AddRequestTask";
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-799935345"
	)
	public boolean vmethod7858() {
		while (!class316.field3416.isEmpty()) {
			MusicSong var1 = (MusicSong)class316.field3416.peek();
			if (var1 == null) {
				class316.field3416.pop();
			} else {
				var1.midiPcmStream = this.method7805();
				class316.musicSongs.add(var1);
				class316.field3416.pop();
			}
		}

		return true;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Lmn;",
		garbageValue = "1270029666"
	)
	MidiPcmStream method7805() {
		MidiPcmStream var1 = null;
		Iterator var2 = class316.field3415.iterator();

		while (true) {
			MidiPcmStream var3;
			do {
				do {
					if (!var2.hasNext()) {
						if (var1 != null) {
							++var1.field3455;
							if (var1.method6007() == 0 && var1.isReady()) {
								var1.clear();
								var1.method6011();
								var1.setPcmStreamVolume(0);
							}
						}

						return var1;
					}

					var3 = (MidiPcmStream)var2.next();
				} while(var3 == null);
			} while(var1 != null && var1.field3455 <= var3.field3455 && (var3.method6007() != 0 || !var3.isReady()));

			var1 = var3;
		}
	}
}
