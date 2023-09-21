import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pi")
@Implements("AddRequestTask")
public class AddRequestTask extends SongTask {
	@ObfuscatedName("am")
	@Export("SpriteBuffer_pixels")
	public static byte[][] SpriteBuffer_pixels;

	@ObfuscatedSignature(
		descriptor = "(Lqm;)V"
	)
	public AddRequestTask(SongTask var1) {
		super(var1);
		super.field4572 = "AddRequestTask";
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-90"
	)
	public boolean vmethod7780() {
		while (!class319.field3428.isEmpty()) {
			MusicSong var1 = (MusicSong)class319.field3428.peek();
			if (var1 == null) {
				class319.field3428.pop();
			} else {
				var1.midiPcmStream = this.method7733();
				class319.musicSongs.add(var1);
				class319.field3428.pop();
			}
		}

		return true;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)Lmt;",
		garbageValue = "4"
	)
	MidiPcmStream method7733() {
		MidiPcmStream var1 = null;
		Iterator var2 = class319.field3431.iterator();

		while (true) {
			MidiPcmStream var3;
			do {
				do {
					if (!var2.hasNext()) {
						if (var1 != null) {
							++var1.field3450;
							if (var1.method5971() == 0 && var1.isReady()) {
								var1.clear();
								var1.method6044();
								var1.setPcmStreamVolume(0);
							}
						}

						return var1;
					}

					var3 = (MidiPcmStream)var2.next();
				} while(var3 == null);
			} while(var1 != null && var1.field3450 <= var3.field3450 && (var3.method5971() != 0 || !var3.isReady()));

			var1 = var3;
		}
	}

	@ObfuscatedName("gs")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1457106589"
	)
	static final void method7739() {
		Scene.Scene_isLowDetail = false;
		Client.isLowDetail = false;
	}

	@ObfuscatedName("la")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "19136899"
	)
	static final void method7738(int var0) {
		if (var0 >= 0) {
			int var1 = Client.menuArguments1[var0];
			int var2 = Client.menuArguments2[var0];
			int var3 = Client.menuOpcodes[var0];
			int var4 = Client.menuIdentifiers[var0];
			int var5 = Client.menuItemIds[var0];
			String var6 = Client.menuActions[var0];
			String var7 = Client.menuTargets[var0];
			class33.menuAction(var1, var2, var3, var4, var5, var6, var7, MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
		}
	}
}
