import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pe")
@Implements("AddRequestTask")
public class AddRequestTask extends SongTask
{
	@ObfuscatedSignature(
		descriptor = "(Lpp;)V"
	)
	public AddRequestTask(SongTask var1) {
		super(var1);
		super.songTaskName = "AddRequestTask";
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "994462530"
	)
	public boolean vmethod7676(int var1) {
		while (!class306.field3396.isEmpty()) {
			MusicSong var2 = (MusicSong)class306.field3396.peek();
			if (var2 == null) {
				class306.field3396.pop();
			} else {
				var2.midiPcmStream = this.method7611();
				class306.musicSongs.add(var2);
				class306.field3396.pop();
			}
		}

		return true;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Llc;",
		garbageValue = "1784609156"
	)
	MidiPcmStream method7611() {
		MidiPcmStream var1 = null;
		Iterator var2 = class306.field3395.iterator();

		while (true) {
			MidiPcmStream var3;
			do {
				do {
					if (!var2.hasNext()) {
						if (var1 != null) {
							++var1.field3439;
							if (var1.method5816() == 0 && var1.isReady()) {
								var1.clear();
								var1.method5820();
								var1.setPcmStreamVolume(0);
							}
						}

						return var1;
					}

					var3 = (MidiPcmStream)var2.next();
				} while(var3 == null);
			} while(var1 != null && var1.field3439 <= var3.field3439 && (var3.field3439 != var1.field3439 || var3.method5816() != 0 || !var3.isReady()));

			var1 = var3;
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lmt;I[B[BS)V",
		garbageValue = "24138"
	)
	@Export("Widget_setKey")
	static final void Widget_setKey(Widget var0, int var1, byte[] var2, byte[] var3) {
		if (var0.field3711 == null) {
			if (var2 == null) {
				return;
			}

			var0.field3711 = new byte[11][];
			var0.field3700 = new byte[11][];
			var0.field3657 = new int[11];
			var0.field3630 = new int[11];
		}

		var0.field3711[var1] = var2;
		if (var2 != null) {
			var0.field3698 = true;
		} else {
			var0.field3698 = false;

			for (int var4 = 0; var4 < var0.field3711.length; ++var4) {
				if (var0.field3711[var4] != null) {
					var0.field3698 = true;
					break;
				}
			}
		}

		var0.field3700[var1] = var3;
	}
}
