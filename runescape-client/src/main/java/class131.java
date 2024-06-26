import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fw")
public class class131 {
	@ObfuscatedName("ak")
	public static final float field1544;
	@ObfuscatedName("ap")
	public static final float field1539;
	@ObfuscatedName("an")
	static float[] field1540;
	@ObfuscatedName("aj")
	static float[] field1542;
	@ObfuscatedName("jf")
	@Export("regionLandArchiveIds")
	static int[] regionLandArchiveIds;

	static {
		field1544 = Math.ulp(1.0F);
		field1539 = 2.0F * field1544;
		field1540 = new float[4];
		field1542 = new float[5];
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/ArrayList;ZI)V",
		garbageValue = "-1728915559"
	)
	static void method3071(ArrayList var0, boolean var1) {
		if (!var1) {
			class330.field3585.clear();
		}

		Iterator var2 = var0.iterator();

		while (var2.hasNext()) {
			MusicSong var3 = (MusicSong)var2.next();
			if (var3.musicTrackGroupId != -1 && var3.musicTrackFileId != -1) {
				if (!var1) {
					class330.field3585.add(var3);
				}

				class330.field3587.add(var3);
			}
		}

	}

	@ObfuscatedName("io")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1947023152"
	)
	static final void method3068() {
		if (Client.logoutTimer > 0) {
			class135.logOut();
		} else {
			Client.timer.method8338();
			ClanChannelMember.updateGameState(40);
			class386.field4521 = Client.packetWriter.getSocket();
			Client.packetWriter.removeSocket();
		}
	}
}
