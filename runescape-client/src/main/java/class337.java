import java.io.IOException;
import java.util.concurrent.ThreadFactory;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mt")
class class337 implements ThreadFactory {
	@ObfuscatedName("af")
	static boolean[] field3676;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	final MidiPcmStream this$0;

	@ObfuscatedSignature(
		descriptor = "(Lms;)V"
	)
	class337(MidiPcmStream var1) {
		this.this$0 = var1;
	}

	public Thread newThread(Runnable var1) {
		return new Thread(var1, "OSRS WAV Load");
	}

	@ObfuscatedName("ae")
	static final void method6699(long var0) {
		try {
			Thread.sleep(var0);
		} catch (InterruptedException var3) {
		}

	}

	@ObfuscatedName("hw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1886337145"
	)
	static void method6698() {
		Client.field575 = true;
		if (class229.varcs != null && class229.varcs.hasUnwrittenChanges()) {
			class229.varcs.write();
		}

		WorldMapArea.method5876();
		class501.method9230();
		if (LoginScreenAnimation.mouseRecorder != null) {
			LoginScreenAnimation.mouseRecorder.isRunning = false;
		}

		LoginScreenAnimation.mouseRecorder = null;
		Client.packetWriter.close();
		if (GameEngine.taskHandler != null) {
			try {
				GameEngine.taskHandler.close();
			} catch (Exception var2) {
			}
		}

		GameEngine.taskHandler = null;
		class179.clear();
		class187.method3921();
		Client.worldViewManager.clear();
		UserComparator8.worldMap = null;
		AbstractWorldMapIcon.method6257(0, 0);
		SoundCache.method889();
		Client.playingJingle = false;
		MenuAction.method2299();
		if (HealthBarConfig.pcmPlayer1 != null) {
			HealthBarConfig.pcmPlayer1.shutdown();
		}

		FontName.field5260.method7625();
		TextureProvider.method5183();
		if (AsyncHttpResponse.urlRequester != null) {
			AsyncHttpResponse.urlRequester.close();
		}

		BuddyRankComparator.method3233();
		JagexCache.JagexCache_dat2File = null;
		JagexCache.JagexCache_idx255File = null;
		class215.JagexCache_idxFiles = null;
		Messages.method3083();
		class382.masterDisk = null;
		Client.archiveLoaders.clear();
		Client.field814 = 0;
		FontName.field5260 = new JagNetThread();
		AsyncHttpResponse.urlRequester = new SecureUrlRequester(class1.client.https, 225);

		try {
			WorldMapLabel.method6195("oldschool", JagexCache.field2382, WorldMapSprite.field3217.name, 0, 23);
		} catch (IOException var1) {
			throw new RuntimeException(var1);
		}

		class382.masterDisk = new ArchiveDisk(255, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idx255File, 500000);
		GameEngine.taskHandler = new TaskHandler();
		class1.client.method507();
		class324.method6405(class95.field1174);
		class464.updateGameState(0);
	}
}
