import java.util.Iterator;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qd")
@Implements("AddRequestTask")
public class AddRequestTask extends SongTask {
	@ObfuscatedSignature(
		descriptor = "(Lro;)V"
	)
	public AddRequestTask(SongTask var1) {
		super(var1);
		super.field4814 = "AddRequestTask";
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "-4307"
	)
	public boolean vmethod8276() {
		while (!class330.field3587.isEmpty()) {
			MusicSong var1 = (MusicSong)class330.field3587.peek();
			if (var1 == null) {
				class330.field3587.pop();
			} else {
				var1.midiPcmStream = this.method8224();
				class330.musicSongs.add(var1);
				class330.field3587.pop();
			}
		}

		return true;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)Lmc;",
		garbageValue = "2"
	)
	MidiPcmStream method8224() {
		MidiPcmStream var1 = null;
		Iterator var2 = class330.field3582.iterator();

		while (true) {
			MidiPcmStream var3;
			do {
				do {
					if (!var2.hasNext()) {
						if (var1 != null) {
							++var1.field3627;
							if (var1.method6187() == 0 && var1.isReady()) {
								var1.clear();
								var1.method6190();
								var1.setPcmStreamVolume(0);
							}
						}

						return var1;
					}

					var3 = (MidiPcmStream)var2.next();
				} while(var3 == null);
			} while(var1 != null && var1.field3627 <= var3.field3627 && (var3.method6187() != 0 || !var3.isReady()));

			var1 = var3;
		}
	}
}
