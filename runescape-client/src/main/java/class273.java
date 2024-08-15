import java.io.IOException;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kp")
public class class273 {
	@ObfuscatedName("om")
	@ObfuscatedSignature(
		descriptor = "Lnq;"
	)
	static Widget field2978;
	@ObfuscatedName("ab")
	final int[][] field2979;
	@ObfuscatedName("ay")
	final int[][] field2972;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -662758213
	)
	int field2973;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1788246597
	)
	int field2971;
	@ObfuscatedName("ax")
	final int[] field2975;
	@ObfuscatedName("ao")
	final int[] field2974;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 379261387
	)
	final int field2977;

	class273(int var1, int var2) {
		this.field2979 = new int[var1][var2];
		this.field2972 = new int[var1][var2];
		int var3 = var2 * var1;
		int var4 = WorldMapEvent.method6096(var3 / 4);
		this.field2975 = new int[var4];
		this.field2974 = new int[var4];
		this.field2977 = var4 - 1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "12"
	)
	void method5443() {
		for (int var1 = 0; var1 < this.field2979.length; ++var1) {
			for (int var2 = 0; var2 < this.field2979[var1].length; ++var2) {
				this.field2979[var1][var2] = 0;
				this.field2972[var1][var2] = 99999999;
			}
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-114"
	)
	void method5444(int var1, int var2) {
		this.field2973 = var1;
		this.field2971 = var2;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1170264415"
	)
	int method5478() {
		return this.field2973;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "109"
	)
	int method5446() {
		return this.field2971;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-928436791"
	)
	int method5447() {
		return this.field2979.length;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1334785519"
	)
	int method5448() {
		return this.field2979[0].length;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)[[I",
		garbageValue = "-21"
	)
	int[][] method5449() {
		return this.field2979;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)[[I",
		garbageValue = "-242529068"
	)
	int[][] method5450() {
		return this.field2972;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)[I",
		garbageValue = "82"
	)
	int[] method5451() {
		return this.field2975;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)[I",
		garbageValue = "14"
	)
	int[] method5452() {
		return this.field2974;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "982924749"
	)
	int method5453() {
		return this.field2977;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "([BILjava/lang/CharSequence;I)I",
		garbageValue = "1419762120"
	)
	public static int method5472(byte[] var0, int var1, CharSequence var2) {
		int var3 = var2.length();
		int var4 = var1;

		for (int var5 = 0; var5 < var3; ++var5) {
			char var6 = var2.charAt(var5);
			if (var6 <= 127) {
				var0[var4++] = (byte)var6;
			} else if (var6 <= 2047) {
				var0[var4++] = (byte)(192 | var6 >> 6);
				var0[var4++] = (byte)(128 | var6 & '?');
			} else {
				var0[var4++] = (byte)(224 | var6 >> '\f');
				var0[var4++] = (byte)(128 | var6 >> 6 & 63);
				var0[var4++] = (byte)(128 | var6 & '?');
			}
		}

		return var4 - var1;
	}

	@ObfuscatedName("hh")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1598929448"
	)
	static void method5468() {
		Client.field516 = true;
		if (ObjectComposition.varcs != null && ObjectComposition.varcs.hasUnwrittenChanges()) {
			ObjectComposition.varcs.write();
		}

		class336.method6432();
		WorldMapLabelSize.method5528();
		if (Friend.mouseRecorder != null) {
			Friend.mouseRecorder.isRunning = false;
		}

		Friend.mouseRecorder = null;
		Client.packetWriter.close();
		if (GameEngine.taskHandler != null) {
			try {
				GameEngine.taskHandler.close();
			} catch (Exception var3) {
			}
		}

		GameEngine.taskHandler = null;
		class171.clear();
		Projectile.method2254();
		if (class328.worldView != null) {
			class328.worldView.clear();

			for (int var1 = 0; var1 < 4; ++var1) {
				if (class328.worldView.collisionMaps[var1] != null) {
					class328.worldView.collisionMaps[var1].clear();
				}
			}
		}

		class219.worldMap = null;
		class92.method2440(0, 0);
		class147.method3342();
		Client.playingJingle = false;
		AbstractWorldMapData.method5949();
		if (class132.pcmPlayer1 != null) {
			class132.pcmPlayer1.shutdown();
		}

		SecureRandomFuture.field980.method7358();
		class169.method3598();
		if (Canvas.urlRequester != null) {
			Canvas.urlRequester.close();
		}

		ViewportMouse.method4375();
		JagexCache.JagexCache_dat2File = null;
		JagexCache.JagexCache_idx255File = null;
		ItemContainer.JagexCache_idxFiles = null;
		SoundSystem.method821();
		class92.masterDisk = null;
		Client.archiveLoaders.clear();
		Client.field799 = 0;
		SecureRandomFuture.field980 = new JagNetThread();
		Canvas.urlRequester = new SecureUrlRequester(DynamicObject.client.https, 224);

		try {
			class91.method2431("oldschool", CollisionMap.field2948, WorldMapData_0.field3013.name, 0, 23);
		} catch (IOException var2) {
			throw new RuntimeException(var2);
		}

		class92.masterDisk = new ArchiveDisk(255, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idx255File, 500000);
		GameEngine.taskHandler = new TaskHandler();
		DynamicObject.client.method472();
		GameBuild.method7155(class94.field1142);
		UserComparator3.updateGameState(0);
	}
}
