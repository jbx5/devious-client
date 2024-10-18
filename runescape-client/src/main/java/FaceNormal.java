import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jf")
@Implements("FaceNormal")
public class FaceNormal {
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 517384369
	)
	static int field2750;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1273186789
	)
	@Export("x")
	int x;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1226372845
	)
	@Export("y")
	int y;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 618262055
	)
	@Export("z")
	int z;

	FaceNormal() {
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lpe;II)V",
		garbageValue = "2129505229"
	)
	public static void method5261(AbstractArchive var0, int var1) {
		if (!class333.field3628.isEmpty()) {
			ArrayList var2 = new ArrayList();
			Iterator var3 = class333.field3628.iterator();

			while (var3.hasNext()) {
				MusicSong var4 = (MusicSong)var3.next();
				var4.field3750 = false;
				var4.field3757 = false;
				var4.field3751 = false;
				var4.field3752 = false;
				var4.musicTrackArchive = var0;
				var4.musicTrackVolume = var1;
				var4.field3749 = 0.0F;
				var2.add(var4);
			}

			ParamComposition.method4154(var2, class333.musicPlayerStatus, class333.field3631, class333.field3632, class333.field3633, false);
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lqt;Lqt;I)Lqt;",
		garbageValue = "608532264"
	)
	public static final class426 method5263(class426 var0, class426 var1) {
		class426 var2;
		synchronized(class426.field4768) {
			if (class426.field4770 == 0) {
				var2 = new class426(var0);
			} else {
				class426.field4768[--class426.field4770].method8169(var0);
				var2 = class426.field4768[class426.field4770];
			}
		}

		var2.method8173(var1);
		return var2;
	}

	@ObfuscatedName("fi")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "42"
	)
	static final void method5260() {
		Scene.Scene_isLowDetail = false;
		Client.isLowDetail = false;
	}

	@ObfuscatedName("ia")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1701397167"
	)
	static void method5262() {
		if (LoginState.worldMap != null) {
			LoginState.worldMap.method9721(class198.topLevelWorldView.plane, (GameEngine.entity.getX() >> 7) + class198.topLevelWorldView.baseX, (GameEngine.entity.getY() >> 7) + class198.topLevelWorldView.baseY, false);
			LoginState.worldMap.loadCache();
		}

	}
}
