import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qq")
@Implements("ByteArrayPool")
public class ByteArrayPool {
	@ObfuscatedName("ab")
	static final Object field4577;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 467495095
	)
	@Export("ByteArrayPool_smallCount")
	static int ByteArrayPool_smallCount;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 563797191
	)
	@Export("ByteArrayPool_mediumCount")
	static int ByteArrayPool_mediumCount;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1219240193
	)
	@Export("ByteArrayPool_largeCount")
	static int ByteArrayPool_largeCount;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1638723491
	)
	static int field4573;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1728453825
	)
	static int field4574;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 791946105
	)
	static int field4583;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 969672835
	)
	static int field4578;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1622704261
	)
	static int field4585;
	@ObfuscatedName("as")
	@Export("ByteArrayPool_small")
	static byte[][] ByteArrayPool_small;
	@ObfuscatedName("ay")
	@Export("ByteArrayPool_medium")
	static byte[][] ByteArrayPool_medium;
	@ObfuscatedName("ak")
	@Export("ByteArrayPool_large")
	static byte[][] ByteArrayPool_large;
	@ObfuscatedName("aj")
	static byte[][] field4589;
	@ObfuscatedName("aw")
	static ArrayList field4590;

	static {
		field4577 = new Object();
		ByteArrayPool_smallCount = 0;
		ByteArrayPool_mediumCount = 0;
		ByteArrayPool_largeCount = 0;
		field4573 = 0;
		field4574 = 1000;
		field4583 = 250;
		field4578 = 100;
		field4585 = 50;
		ByteArrayPool_small = new byte[1000][];
		ByteArrayPool_medium = new byte[250][];
		ByteArrayPool_large = new byte[100][];
		field4589 = new byte[50][];
		field4590 = new ArrayList();
		Renderable.method5509();
		new HashMap();
	}

	@ObfuscatedName("hb")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1234231525"
	)
	static void method7920() {
		if (class176.varcs.hasUnwrittenChanges()) {
			class176.varcs.write();
		}

		class53.method1110();
		if (Message.mouseRecorder != null) {
			Message.mouseRecorder.isRunning = false;
		}

		Message.mouseRecorder = null;
		Client.packetWriter.close();
		if (GameEngine.taskHandler != null) {
			try {
				GameEngine.taskHandler.close();
			} catch (Exception var3) {
			}
		}

		GameEngine.taskHandler = null;
		ObjectSound.method1980();
		class182.method3664();
		class36.scene.clear();

		for (int var1 = 0; var1 < 4; ++var1) {
			Client.collisionMaps[var1].clear();
		}

		NpcOverrides.worldMap = null;
		WorldMapRenderer.method4769(0, 0);
		HttpContentType.method8564();
		Client.playingJingle = false;
		WorldMapSectionType.method4888();
		if (MusicPatchPcmStream.pcmPlayer1 != null) {
			MusicPatchPcmStream.pcmPlayer1.shutdown();
		}

		WorldMapSectionType.field2556.method7049();
		class227.method4406();
		if (class60.urlRequester != null) {
			class60.urlRequester.close();
		}

		HealthBarDefinition.method3654();
		JagexCache.JagexCache_dat2File = null;
		JagexCache.JagexCache_idx255File = null;
		KeyHandler.JagexCache_idxFiles = null;
		PlayerCompositionColorTextureOverride.method3518();
		class302.masterDisk = null;
		Client.archiveLoaders.clear();
		Client.field645 = 0;
		WorldMapSectionType.field2556 = new JagNetThread();
		class60.urlRequester = new class113(SpriteMask.client.field532, 218);

		try {
			class339.method6310("oldschool", ItemLayer.field2655, class191.field1978.name, 0, 23);
		} catch (IOException var2) {
			throw new RuntimeException(var2);
		}

		class302.masterDisk = new ArchiveDisk(255, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idx255File, 500000);
		GameEngine.taskHandler = new TaskHandler();
		SpriteMask.client.method517();
		Client.field517 = class92.field1136;
		WorldMapSection2.updateGameState(0);
	}
}
