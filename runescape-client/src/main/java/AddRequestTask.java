import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qm")
@Implements("AddRequestTask")
public class AddRequestTask extends SongTask {
	@ObfuscatedName("mm")
	@ObfuscatedSignature(
		descriptor = "Ldi;"
	)
	@Export("localPlayer")
	static Player localPlayer;

	@ObfuscatedSignature(
		descriptor = "(Lri;)V"
	)
	public AddRequestTask(SongTask var1) {
		super(var1);
		super.field4843 = "AddRequestTask";
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1411718299"
	)
	public boolean vmethod8618() {
		while (!class334.field3621.isEmpty()) {
			MusicSong var1 = (MusicSong)class334.field3621.peek();
			if (var1 == null) {
				class334.field3621.pop();
			} else {
				var1.midiPcmStream = this.method8577();
				class334.musicSongs.add(var1);
				class334.field3621.pop();
			}
		}

		return true;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Lms;",
		garbageValue = "-1178517341"
	)
	MidiPcmStream method8577() {
		MidiPcmStream var1 = null;
		Iterator var2 = class334.field3616.iterator();

		while (true) {
			MidiPcmStream var3;
			do {
				do {
					if (!var2.hasNext()) {
						if (var1 != null) {
							++var1.field3637;
							if (var1.method6506() == 0 && var1.isReady()) {
								var1.clear();
								var1.method6510();
								var1.setPcmStreamVolume(0);
							}
						}

						return var1;
					}

					var3 = (MidiPcmStream)var2.next();
				} while(var3 == null);
			} while(var1 != null && var1.field3637 <= var3.field3637 && (var3.method6506() != 0 || !var3.isReady()));

			var1 = var3;
		}
	}
}
