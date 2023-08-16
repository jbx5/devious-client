import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pf")
@Implements("AddRequestTask")
public class AddRequestTask extends SongTask {
	@ObfuscatedName("tw")
	@ObfuscatedSignature(
		descriptor = "Lbb;"
	)
	@Export("pcmPlayer1")
	static PcmPlayer pcmPlayer1;

	@ObfuscatedSignature(
		descriptor = "(Lpm;)V"
	)
	public AddRequestTask(SongTask var1) {
		super(var1);
		super.field4523 = "AddRequestTask";
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1604030758"
	)
	public boolean vmethod7621() {
		while (!class305.field3411.isEmpty()) {
			MusicSong var1 = (MusicSong)class305.field3411.peek();
			if (var1 == null) {
				class305.field3411.pop();
			} else {
				var1.midiPcmStream = this.method7571();
				class305.musicSongs.add(var1);
				class305.field3411.pop();
			}
		}

		return true;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)Llf;",
		garbageValue = "53"
	)
	MidiPcmStream method7571() {
		MidiPcmStream var1 = null;
		Iterator var2 = class305.field3402.iterator();

		while (true) {
			MidiPcmStream var3;
			do {
				do {
					if (!var2.hasNext()) {
						if (var1 != null) {
							++var1.field3443;
							if (var1.method5830() == 0 && var1.isReady()) {
								var1.clear();
								var1.method5877();
								var1.setPcmStreamVolume(0);
							}
						}

						return var1;
					}

					var3 = (MidiPcmStream)var2.next();
				} while(var3 == null);
			} while(var1 != null && var1.field3443 <= var3.field3443 && (var3.method5830() != 0 || !var3.isReady()));

			var1 = var3;
		}
	}

	@ObfuscatedName("ij")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-71"
	)
	static final void method7574() {
		if (WorldMapIcon_0.field2973) {
			for (int var0 = 0; var0 < Players.Players_count; ++var0) {
				Player var1 = Client.players[Players.Players_indices[var0]];
				var1.method2353();
			}

			WorldMapIcon_0.field2973 = false;
		}

	}
}
