import java.util.Iterator;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qe")
@Implements("AddRequestTask")
public class AddRequestTask extends SongTask {
	@ObfuscatedSignature(
		descriptor = "(Lqc;)V"
	)
	public AddRequestTask(SongTask var1) {
		super(var1);
		super.field4651 = "AddRequestTask";
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-362428891"
	)
	public boolean vmethod7854() {
		while (!class321.field3500.isEmpty()) {
			MusicSong var1 = (MusicSong)class321.field3500.peek();
			if (var1 == null) {
				class321.field3500.pop();
			} else {
				var1.midiPcmStream = this.method7793();
				class321.musicSongs.add(var1);
				class321.field3500.pop();
			}
		}

		return true;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)Lmx;",
		garbageValue = "0"
	)
	MidiPcmStream method7793() {
		MidiPcmStream var1 = null;
		Iterator var2 = class321.field3491.iterator();

		while (true) {
			MidiPcmStream var3;
			do {
				do {
					if (!var2.hasNext()) {
						if (var1 != null) {
							++var1.field3534;
							if (var1.method6000() == 0 && var1.isReady()) {
								var1.clear();
								var1.method6004();
								var1.setPcmStreamVolume(0);
							}
						}

						return var1;
					}

					var3 = (MidiPcmStream)var2.next();
				} while(var3 == null);
			} while(var1 != null && var1.field3534 <= var3.field3534 && (var3.method6000() != 0 || !var3.isReady()));

			var1 = var3;
		}
	}
}
