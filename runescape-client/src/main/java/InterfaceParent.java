import java.io.IOException;
import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dn")
@Implements("InterfaceParent")
public class InterfaceParent extends Node {
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1127246631
	)
	@Export("group")
	int group;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 49206093
	)
	@Export("type")
	int type;
	@ObfuscatedName("ar")
	boolean field1065;

	InterfaceParent() {
		this.field1065 = false;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "143844531"
	)
	public static boolean method2276(int var0) {
		boolean var1 = false;
		boolean var2 = false;
		if (!class306.field3399.isEmpty()) {
			SongTask var3 = (SongTask)class306.field3399.get(0);
			if (var3 == null) {
				class306.field3399.remove(0);
			} else if (var3.vmethod7676(var0)) {
				if (var3.method7668()) {
					System.out.println("Error in midimanager.service: " + var3.method7651());
					var1 = true;
				} else {
					if (var3.getSongTask() != null) {
						class306.field3399.add(1, var3.getSongTask());
					}

					var2 = var3.method7650();
				}

				class306.field3399.remove(0);
			} else {
				var2 = var3.method7650();
			}
		}

		if (var1) {
			class306.field3399.clear();
			ArrayList var4 = class162.method3356();
			class306.field3399.add(new ClearRequestTask((SongTask)null, var4));
		}

		return var2;
	}

	@ObfuscatedName("hv")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2055389038"
	)
	static void method2277() {
		if (PendingSpawn.varcs.hasUnwrittenChanges()) {
			PendingSpawn.varcs.write();
		}

		if (class497.mouseRecorder != null) {
			class497.mouseRecorder.isRunning = false;
		}

		class497.mouseRecorder = null;
		Client.packetWriter.close();
		if (GameEngine.taskHandler != null) {
			try {
				GameEngine.taskHandler.close();
			} catch (Exception var3) {
			}
		}

		GameEngine.taskHandler = null;
		class159.method3336();
		class197.archive2.clearFiles();
		FontName.archive13.clearFiles();
		ReflectionCheck.field273.clearFiles();
		class191.field1970.clearFiles();
		World.field829.clearFiles();
		class106.field1358.clearFiles();
		Varcs.field1402.clearFiles();
		Interpreter.field885.clearFiles();
		class10.compass = null;
		SoundCache.redHintArrowSprite = null;
		class282.mapSceneSprites = null;
		DbTableType.headIconPkSprites = null;
		class17.headIconPrayerSprites = null;
		class345.headIconHintSprites = null;
		DynamicObject.field1014 = null;
		class211.crossSprites = null;
		MusicPatchNode2.mapDotSprites = null;
		class302.scrollBarSprites = null;
		AbstractWorldMapIcon.field3044 = null;
		UserComparator5.scene.clear();

		int var1;
		for (var1 = 0; var1 < 4; ++var1) {
			Client.collisionMaps[var1].clear();
		}

		class127.worldMap = null;
		RouteStrategy.method4227(0, 0);
		class306.field3398.clear();
		Client.playingJingle = false;
		class133.method3041();
		if (VerticalAlignment.pcmPlayer1 != null) {
			VerticalAlignment.pcmPlayer1.shutdown();
		}

		class153.field1700.method6853();
		ArchiveDiskAction.method6681();
		if (WorldMapLabel.urlRequester != null) {
			WorldMapLabel.urlRequester.close();
		}

		try {
			JagexCache.JagexCache_dat2File.close();

			for (var1 = 0; var1 < JagexCache.field1840; ++var1) {
				class302.JagexCache_idxFiles[var1].close();
			}

			JagexCache.JagexCache_idx255File.close();
			JagexCache.JagexCache_randomDat.close();
		} catch (Exception var4) {
		}

		JagexCache.JagexCache_dat2File = null;
		JagexCache.JagexCache_idx255File = null;
		class302.JagexCache_idxFiles = null;
		FileSystem.FileSystem_cacheFiles.clear();
		class158.masterDisk = null;
		Client.archiveLoaders.clear();
		Client.field814 = 0;
		class153.field1700 = new NewArchiveStuff();
		WorldMapLabel.urlRequester = new class113(TileItem.client.field562, 215);

		try {
			PlayerCompositionColorTextureOverride.method3575("oldschool", VarpDefinition.field1910, ArchiveLoader.field1044.name, 0, 22);
		} catch (IOException var2) {
			throw new RuntimeException(var2);
		}

		class158.masterDisk = new ArchiveDisk(255, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idx255File, 500000);
		GameEngine.taskHandler = new TaskHandler();
		Client.field547 = class92.field1144;
		class129.updateGameState(0);
	}
}
