import java.io.IOException;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qj")
public class class441 {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lqj;"
	)
	public static final class441 field4748;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lqj;"
	)
	static final class441 field4746;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1320051105
	)
	final int field4747;

	static {
		field4748 = new class441(1);
		field4746 = new class441(0);
	}

	class441(int var1) {
		this.field4747 = var1;
	}

	@ObfuscatedName("gs")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "430547706"
	)
	static void method7995() {
		Client.field788 = true;
		if (class130.varcs != null && class130.varcs.hasUnwrittenChanges()) {
			class130.varcs.write();
		}

		class254.method4939();
		RestClientThreadFactory.method204();
		if (Tiles.mouseRecorder != null) {
			Tiles.mouseRecorder.isRunning = false;
		}

		Tiles.mouseRecorder = null;
		Client.packetWriter.close();
		if (class350.taskHandler != null) {
			try {
				class350.taskHandler.close();
			} catch (Exception var3) {
			}
		}

		class350.taskHandler = null;
		class318.clear();
		class150.method3201();
		if (LoginType.scene != null) {
			LoginType.scene.clear();
		}

		for (int var1 = 0; var1 < Client.collisionMaps.length; ++var1) {
			if (Client.collisionMaps[var1] != null) {
				Client.collisionMaps[var1].clear();
			}
		}

		ModeWhere.worldMap = null;
		class11.method108(0, 0);
		UserComparator5.method2897();
		Client.playingJingle = false;
		Canvas.method294();
		if (class144.pcmPlayer1 != null) {
			class144.pcmPlayer1.shutdown();
		}

		ChatChannel.field1023.method7078();
		StructComposition.method4041();
		if (class94.urlRequester != null) {
			class94.urlRequester.close();
		}

		Archive.method6949();
		JagexCache.JagexCache_dat2File = null;
		JagexCache.JagexCache_idx255File = null;
		UserComparator5.JagexCache_idxFiles = null;
		class200.method3823();
		Decimator.masterDisk = null;
		Client.archiveLoaders.clear();
		Client.field773 = 0;
		ChatChannel.field1023 = new JagNetThread();
		class94.urlRequester = new SecureUrlRequester(UrlRequest.client.https, 221);

		try {
			class498.method8662("oldschool", class430.field4669, HealthBar.field1325.name, 0, 23);
		} catch (IOException var2) {
			throw new RuntimeException(var2);
		}

		Decimator.masterDisk = new ArchiveDisk(255, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idx255File, 500000);
		class350.taskHandler = new TaskHandler();
		UrlRequest.client.method591();
		ConcurrentMidiTask.method7851(class93.field1152);
		FaceNormal.updateGameState(0);
	}
}
