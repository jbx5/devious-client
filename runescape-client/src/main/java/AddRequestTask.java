import java.util.Iterator;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pb")
@Implements("AddRequestTask")
public class AddRequestTask extends SongTask {
	@ObfuscatedSignature(
		descriptor = "(Lqd;)V"
	)
	public AddRequestTask(SongTask var1) {
		super(var1);
		super.field4597 = "AddRequestTask";
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2012801823"
	)
	public boolean vmethod7975() {
		while (!class319.field3461.isEmpty()) {
			MusicSong var1 = (MusicSong)class319.field3461.peek();
			if (var1 == null) {
				class319.field3461.pop();
			} else {
				var1.midiPcmStream = this.method7914();
				class319.musicSongs.add(var1);
				class319.field3461.pop();
			}
		}

		return true;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Lmk;",
		garbageValue = "450811833"
	)
	MidiPcmStream method7914() {
		MidiPcmStream var1 = null;
		Iterator var2 = class319.field3457.iterator();

		while (true) {
			MidiPcmStream var3;
			do {
				do {
					if (!var2.hasNext()) {
						if (var1 != null) {
							++var1.field3499;
							if (var1.method6071() == 0 && var1.isReady()) {
								var1.clear();
								var1.method6075();
								var1.setPcmStreamVolume(0);
							}
						}

						return var1;
					}

					var3 = (MidiPcmStream)var2.next();
				} while(var3 == null);
			} while(var1 != null && var1.field3499 <= var3.field3499 && (var3.method6071() != 0 || !var3.isReady()));

			var1 = var3;
		}
	}

	@ObfuscatedName("pe")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "1"
	)
	static void method7922(boolean var0) {
		Client.leftClickOpensMenu = var0;
	}
}
