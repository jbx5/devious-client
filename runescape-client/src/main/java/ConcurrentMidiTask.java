import java.util.ArrayList;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pf")
@Implements("ConcurrentMidiTask")
public class ConcurrentMidiTask extends SongTask
{
	@ObfuscatedName("aw")
	ArrayList field4532;

	@ObfuscatedSignature(
		descriptor = "(Lpp;Ljava/util/ArrayList;)V"
	)
	public ConcurrentMidiTask(SongTask var1, ArrayList var2) {
		super(var1);
		this.field4532 = var2;
		super.songTaskName = "ConcurrentMidiTask";
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "994462530"
	)
	public boolean vmethod7676(int var1) {
		for (int var2 = 0; var2 < this.field4532.size(); ++var2) {
			SongTask var3 = (SongTask)this.field4532.get(var2);
			if (var3 == null) {
				this.field4532.remove(var2);
				--var2;
			} else if (var3.vmethod7676(var1)) {
				if (var3.method7668()) {
					this.method7653(var3.method7651());
					this.field4532.clear();
					return true;
				}

				if (var3.getSongTask() != null) {
					this.field4532.add(var3.getSongTask());
				}

				super.field4526 = var3.field4526;
				this.field4532.remove(var2);
				--var2;
			}
		}

		if (this.field4532.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lnd;Lnd;IIS)Lpc;",
		garbageValue = "-2870"
	)
	public static Font method7672(AbstractArchive var0, AbstractArchive var1, int var2, int var3) {
		byte[] var5 = var0.takeFile(var2, var3);
		boolean var4;
		if (var5 == null) {
			var4 = false;
		} else {
			VarbitComposition.SpriteBuffer_decode(var5);
			var4 = true;
		}

		if (!var4) {
			return null;
		} else {
			byte[] var6 = var1.takeFile(var2, var3);
			Font var8;
			if (var6 == null) {
				var8 = null;
			} else {
				Font var7 = new Font(var6, class492.SpriteBuffer_xOffsets, class134.SpriteBuffer_yOffsets, class172.SpriteBuffer_spriteWidths, class528.SpriteBuffer_spriteHeights, class528.SpriteBuffer_spritePalette, ArchiveDiskAction.SpriteBuffer_pixels);
				DbTableType.method8985();
				var8 = var7;
			}

			return var8;
		}
	}
}
