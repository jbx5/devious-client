import java.util.Iterator;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qj")
@Implements("AddRequestTask")
public class AddRequestTask extends SongTask {
	@ObfuscatedSignature(
		descriptor = "(Lrm;)V"
	)
	public AddRequestTask(SongTask var1) {
		super(var1);
		super.field4796 = "AddRequestTask";
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "734274820"
	)
	public boolean vmethod8342() {
		while (!class332.field3563.isEmpty()) {
			MusicSong var1 = (MusicSong)class332.field3563.peek();
			if (var1 == null) {
				class332.field3563.pop();
			} else {
				var1.midiPcmStream = this.method8294();
				class332.musicSongs.add(var1);
				class332.field3563.pop();
			}
		}

		return true;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Lmr;",
		garbageValue = "-1287981005"
	)
	MidiPcmStream method8294() {
		MidiPcmStream var1 = null;
		Iterator var2 = class332.field3562.iterator();

		while (true) {
			MidiPcmStream var3;
			do {
				do {
					if (!var2.hasNext()) {
						if (var1 != null) {
							++var1.field3604;
							if (var1.method6260() == 0 && var1.isReady()) {
								var1.clear();
								var1.method6247();
								var1.setPcmStreamVolume(0);
							}
						}

						return var1;
					}

					var3 = (MidiPcmStream)var2.next();
				} while(var3 == null);
			} while(var1 != null && var1.field3604 <= var3.field3604 && (var3.method6260() != 0 || !var3.isReady()));

			var1 = var3;
		}
	}
}
