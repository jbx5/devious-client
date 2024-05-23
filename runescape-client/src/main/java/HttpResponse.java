import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ad")
@Implements("HttpResponse")
public class HttpResponse {
	@ObfuscatedName("fm")
	@ObfuscatedSignature(
		descriptor = "Lot;"
	)
	static Archive field105;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -993178463
	)
	@Export("responseCode")
	final int responseCode;
	@ObfuscatedName("al")
	@Export("headerFields")
	final Map headerFields;
	@ObfuscatedName("aj")
	@Export("responseBody")
	final String responseBody;

	HttpResponse(String var1) {
		this.responseCode = 400;
		this.headerFields = null;
		this.responseBody = "";
	}

	HttpResponse(HttpURLConnection var1) throws IOException {
		this.responseCode = var1.getResponseCode();
		var1.getResponseMessage();
		this.headerFields = var1.getHeaderFields();
		StringBuilder var2 = new StringBuilder();
		InputStream var3 = this.responseCode >= 300 ? var1.getErrorStream() : var1.getInputStream();
		if (var3 != null) {
			InputStreamReader var4 = new InputStreamReader(var3);
			BufferedReader var5 = new BufferedReader(var4);

			String var6;
			while ((var6 = var5.readLine()) != null) {
				var2.append(var6);
			}

			var3.close();
		}

		this.responseBody = var2.toString();
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "24"
	)
	@Export("getResponseCode")
	public int getResponseCode() {
		return this.responseCode;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/util/Map;",
		garbageValue = "-15"
	)
	@Export("getHeaderFields")
	public Map getHeaderFields() {
		return this.headerFields;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "2108198471"
	)
	@Export("getResponseBody")
	public String getResponseBody() {
		return this.responseBody;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lor;S)V",
		garbageValue = "186"
	)
	public static void method272(AbstractArchive var0) {
		VarcInt.VarcInt_archive = var0;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2025178871"
	)
	@Export("clearItemContainer")
	static void clearItemContainer(int var0) {
		ItemContainer var1 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var1 != null) {
			for (int var2 = 0; var2 < var1.ids.length; ++var2) {
				var1.ids[var2] = -1;
				var1.quantities[var2] = 0;
			}

		}
	}

	@ObfuscatedName("hu")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-222266204"
	)
	static void method277() {
		Client.field540 = true;
		if (WorldMapCacheName.varcs != null && WorldMapCacheName.varcs.hasUnwrittenChanges()) {
			WorldMapCacheName.varcs.write();
		}

		InterfaceParent.method2318();
		class449.method8388();
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
		class13.clear();
		class141.method3164();
		ModeWhere.field4623.clear();

		for (int var1 = 0; var1 < 4; ++var1) {
			if (ModeWhere.field4623.field1332[var1] != null) {
				ModeWhere.field4623.field1332[var1].clear();
			}
		}

		class6.worldMap = null;
		Skills.method7123(0, 0);
		SoundSystem.method851();
		Client.playingJingle = false;
		class151.method3270();
		if (class137.pcmPlayer1 != null) {
			class137.pcmPlayer1.shutdown();
		}

		HttpMethod.field32.method7345();
		class319.method6172();
		if (PacketBufferNode.urlRequester != null) {
			PacketBufferNode.urlRequester.close();
		}

		class160.method3400();
		JagexCache.JagexCache_dat2File = null;
		JagexCache.JagexCache_idx255File = null;
		class74.JagexCache_idxFiles = null;
		GraphicsObject.method2102();
		class332.masterDisk = null;
		Client.archiveLoaders.clear();
		Client.field828 = 0;
		HttpMethod.field32 = new JagNetThread();
		PacketBufferNode.urlRequester = new SecureUrlRequester(class188.client.https, 222);

		try {
			class95.method2410("oldschool", class375.field4075, FloorOverlayDefinition.field2400.name, 0, 23);
		} catch (IOException var2) {
			throw new RuntimeException(var2);
		}

		class332.masterDisk = new ArchiveDisk(255, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idx255File, 500000);
		GameEngine.taskHandler = new TaskHandler();
		class188.client.method495();
		UserComparator6.method3020(class94.field1166);
		class105.updateGameState(0);
	}
}
