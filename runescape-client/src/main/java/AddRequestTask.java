import java.util.Iterator;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qe")
@Implements("AddRequestTask")
public class AddRequestTask extends SongTask {
	@ObfuscatedSignature(
		descriptor = "(Lra;)V"
	)
	public AddRequestTask(SongTask var1) {
		super(var1);
		super.field4881 = "AddRequestTask";
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "343486624"
	)
	public boolean vmethod8740() {
		while (!class333.field3625.isEmpty()) {
			MusicSong var1 = (MusicSong)class333.field3625.peek();
			if (var1 == null) {
				class333.field3625.pop();
			} else {
				var1.midiPcmStream = this.method8695();
				class333.musicSongs.add(var1);
				class333.field3625.pop();
			}
		}

		return true;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Lmn;",
		garbageValue = "2099352601"
	)
	MidiPcmStream method8695() {
		MidiPcmStream var1 = null;
		Iterator var2 = class333.field3626.iterator();

		while (true) {
			MidiPcmStream var3;
			do {
				do {
					if (!var2.hasNext()) {
						if (var1 != null) {
							++var1.field3647;
							if (var1.method6602() == 0 && var1.isReady()) {
								var1.clear();
								var1.method6606();
								var1.setPcmStreamVolume(0);
							}
						}

						return var1;
					}

					var3 = (MidiPcmStream)var2.next();
				} while(var3 == null);
			} while(var1 != null && var1.field3647 <= var3.field3647 && (var3.method6602() != 0 || !var3.isReady()));

			var1 = var3;
		}
	}
}
