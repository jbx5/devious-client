import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ni")
@Implements("GameBuild")
public class GameBuild {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	@Export("LIVE")
	public static final GameBuild LIVE;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	@Export("BUILDLIVE")
	public static final GameBuild BUILDLIVE;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	@Export("RC")
	public static final GameBuild RC;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	@Export("WIP")
	public static final GameBuild WIP;
	@ObfuscatedName("aq")
	@Export("Tiles_saturation")
	static int[] Tiles_saturation;
	@ObfuscatedName("as")
	@Export("name")
	public final String name;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1386645051
	)
	@Export("buildId")
	public final int buildId;

	static {
		LIVE = new GameBuild("LIVE", 0);
		BUILDLIVE = new GameBuild("BUILDLIVE", 3);
		RC = new GameBuild("RC", 1);
		WIP = new GameBuild("WIP", 2);
	}

	GameBuild(String var1, int var2) {
		this.name = var1;
		this.buildId = var2;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lnd;B)I",
		garbageValue = "-18"
	)
	static int method6651(AbstractArchive var0) {
		int var1 = Login.field954.length + Login.field919.length;
		String[] var2 = Login.field934;

		for (int var3 = 0; var3 < var2.length; ++var3) {
			String var4 = var2[var3];
			if (var0.getGroupId(var4) != -1) {
				++var1;
			}
		}

		return var1;
	}

	@ObfuscatedName("nv")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "2"
	)
	@Export("FriendSystem_invalidateIgnoreds")
	static final void FriendSystem_invalidateIgnoreds() {
		Iterator var0 = Messages.Messages_hashTable.iterator();

		while (var0.hasNext()) {
			Message var1 = (Message)var0.next();
			var1.clearIsFromIgnored();
		}

		if (Canvas.friendsChat != null) {
			Canvas.friendsChat.invalidateIgnoreds();
		}

	}
}
