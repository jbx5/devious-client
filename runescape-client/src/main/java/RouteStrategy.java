import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("in")
@Implements("RouteStrategy")
public abstract class RouteStrategy {
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1929046779
	)
	@Export("approxDestinationX")
	public int approxDestinationX;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 564458277
	)
	@Export("approxDestinationY")
	public int approxDestinationY;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 2019727173
	)
	@Export("approxDestinationSizeX")
	public int approxDestinationSizeX;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1270533897
	)
	@Export("approxDestinationSizeY")
	public int approxDestinationSizeY;

	protected RouteStrategy() {
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIILij;I)Z",
		garbageValue = "2142084611"
	)
	@Export("hasArrived")
	protected abstract boolean hasArrived(int var1, int var2, int var3, CollisionMap var4);

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIS)V",
		garbageValue = "-1978"
	)
	public static void method4227(int var0, int var1) {
		ArchiveLoader.method2259(var0, var1, 0, 0);
		class306.field3398.clear();
		if (!class306.musicSongs.isEmpty() && (var0 != 0 || var1 != 0)) {
			class306.field3399.add(new DelayFadeTask((SongTask)null, class306.musicPlayerStatus));
			class306.field3399.add(new FadeOutTask((SongTask)null, 0, false, class306.field3402));
		}

		ArrayList var2 = class162.method3356();
		class306.field3399.add(new ClearRequestTask((SongTask)null, var2));
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZS)I",
		garbageValue = "-21358"
	)
	static int method4230(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.LOGOUT) {
			Client.logoutTimer = 250;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("il")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-774340966"
	)
	@Export("setWindowedMode")
	static void setWindowedMode(int var0) {
		Client.field742 = 0L;
		if (var0 >= 2) {
			Client.isResizable = true;
		} else {
			Client.isResizable = false;
		}

		if (Huffman.getWindowedMode() == 1) {
			TileItem.client.setMaxCanvasSize(765, 503);
		} else {
			TileItem.client.setMaxCanvasSize(7680, 2160);
		}

		if (Client.gameState >= 25) {
			LoadSongTask.method7680();
		}

	}
}
