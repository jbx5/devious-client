import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lh")
@Implements("WorldMapLabel")
public class WorldMapLabel {
	@ObfuscatedName("wn")
	static List field3203;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1484412449
	)
	static int field3204;
	@ObfuscatedName("ak")
	@Export("text")
	String text;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -2131612803
	)
	@Export("width")
	int width;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1333894303
	)
	@Export("height")
	int height;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lkr;"
	)
	@Export("size")
	WorldMapLabelSize size;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IILkr;)V"
	)
	WorldMapLabel(String var1, int var2, int var3, WorldMapLabelSize var4) {
		this.text = var1;
		this.width = var2;
		this.height = var3;
		this.size = var4;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "2026325851"
	)
	public static int method5937(int var0, int var1, int var2) {
		var2 &= 3;
		if (var2 == 0) {
			return var1;
		} else if (var2 == 1) {
			return 7 - var0;
		} else {
			return var2 == 2 ? 7 - var1 : var0;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lor;II)V",
		garbageValue = "152083568"
	)
	public static void method5938(AbstractArchive var0, int var1) {
		if (!class329.field3579.isEmpty()) {
			ArrayList var2 = new ArrayList();
			Iterator var3 = class329.field3579.iterator();

			while (var3.hasNext()) {
				MusicSong var4 = (MusicSong)var3.next();
				var4.field3694 = false;
				var4.field3687 = false;
				var4.field3696 = false;
				var4.field3692 = false;
				var4.musicTrackArchive = var0;
				var4.musicTrackVolume = var1;
				var4.field3688 = 0.0F;
				var2.add(var4);
			}

			ScriptFrame.method1169(var2, class329.musicPlayerStatus, class329.field3584, class329.field3585, class329.field3580, false);
		}
	}
}
