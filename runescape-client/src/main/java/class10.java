import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import javax.net.ssl.HttpsURLConnection;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("j")
public class class10 {
	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "Lqu;"
	)
	static IndexedSprite field45;
	@ObfuscatedName("jz")
	@ObfuscatedGetter(
		intValue = 2124416093
	)
	@Export("cameraYaw")
	static int cameraYaw;
	@ObfuscatedName("c")
	HttpsURLConnection field48;
	@ObfuscatedName("p")
	final Map field43;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	class400 field44;
	@ObfuscatedName("n")
	Map field50;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lx;"
	)
	final class9 field46;
	@ObfuscatedName("w")
	boolean field47;
	@ObfuscatedName("s")
	boolean field52;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 618018867
	)
	int field49;

	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URL;Lx;Z)V"
	)
	public class10(URL var1, class9 var2, boolean var3) throws IOException {
		this.field47 = false; // L: 20
		this.field52 = false; // L: 21
		this.field49 = 300000; // L: 22
		if (!var2.method87()) { // L: 25
			throw new UnsupportedEncodingException("Unsupported request method used " + var2.method75());
		} else {
			this.field48 = (HttpsURLConnection)var1.openConnection(); // L: 26
			if (!var3) {
				HttpsURLConnection var4 = this.field48;
				if (class15.field86 == null) {
					class15.field86 = new class15();
				}

				class15 var5 = class15.field86; // L: 34
				var4.setSSLSocketFactory(var5); // L: 36
			}

			this.field46 = var2; // L: 38
			this.field43 = new HashMap(); // L: 39
			this.field50 = new HashMap(); // L: 40
		}
	} // L: 41

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "1485385530"
	)
	public void method92(String var1, String var2) {
		if (!this.field47) { // L: 44
			this.field43.put(var1, var2); // L: 45
		}
	} // L: 46

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "-83"
	)
	String method96() {
		ArrayList var1 = new ArrayList(this.field50.entrySet()); // L: 49
		Collections.sort(var1, new class18(this)); // L: 50
		StringBuilder var2 = new StringBuilder(); // L: 63
		Iterator var3 = var1.iterator(); // L: 64

		while (var3.hasNext()) {
			Entry var4 = (Entry)var3.next(); // L: 65
			if (var2.length() > 0) { // L: 67
				var2.append(",");
			}

			var2.append(((class399)var4.getKey()).method7299()); // L: 68
			float var5 = (Float)var4.getValue(); // L: 69
			if (var5 < 1.0F) { // L: 70
				String var6 = Float.toString(var5).substring(0, 4); // L: 71
				var2.append(";q=" + var6); // L: 72
			}
		}

		return var2.toString(); // L: 76
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "376821684"
	)
	void method91() throws ProtocolException {
		if (!this.field47) { // L: 80
			this.field48.setRequestMethod(this.field46.method75()); // L: 81
			if (!this.field50.isEmpty()) { // L: 82
				this.field43.put("Accept", this.method96());
			}

			Iterator var1 = this.field43.entrySet().iterator(); // L: 83

			while (var1.hasNext()) {
				Entry var2 = (Entry)var1.next(); // L: 84
				this.field48.setRequestProperty((String)var2.getKey(), (String)var2.getValue()); // L: 86
			}

			if (this.field46.method76() && this.field44 != null) { // L: 89
				this.field48.setDoOutput(true); // L: 90
				ByteArrayOutputStream var13 = new ByteArrayOutputStream(); // L: 91

				try {
					var13.write(this.field44.vmethod7323()); // L: 93
					var13.writeTo(this.field48.getOutputStream()); // L: 94
				} catch (IOException var11) { // L: 96
					var11.printStackTrace(); // L: 97
				} finally {
					if (var13 != null) { // L: 100
						try {
							var13.close(); // L: 102
						} catch (IOException var10) { // L: 104
							var10.printStackTrace(); // L: 105
						}
					}

				}
			}

			this.field48.setConnectTimeout(this.field49); // L: 110
			this.field48.setInstanceFollowRedirects(this.field52); // L: 111
			this.field47 = true; // L: 112
		}
	} // L: 113

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-86"
	)
	boolean method95() throws IOException, SocketTimeoutException {
		if (!this.field47) { // L: 116
			this.method91();
		}

		this.field48.connect(); // L: 117
		return this.field48.getResponseCode() == -1; // L: 118
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)Ly;",
		garbageValue = "-1364612263"
	)
	class21 method97() {
		try {
			if (!this.field47 || this.field48.getResponseCode() == -1) { // L: 124
				return new class21("No REST response has been received yet.");
			}
		} catch (IOException var10) { // L: 126
			this.field48.disconnect(); // L: 127
			return new class21("Error decoding REST response code: " + var10.getMessage()); // L: 128
		}

		class21 var1 = null; // L: 130

		class21 var3;
		try {
			var1 = new class21(this.field48); // L: 132
			return var1; // L: 140
		} catch (IOException var8) { // L: 134
			var3 = new class21("Error decoding REST response: " + var8.getMessage()); // L: 135
		} finally {
			this.field48.disconnect(); // L: 138
		}

		return var3;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IB)Lfa;",
		garbageValue = "16"
	)
	@Export("KitDefinition_get")
	public static KitDefinition KitDefinition_get(int var0) {
		KitDefinition var1 = (KitDefinition)KitDefinition.KitDefinition_cached.get((long)var0); // L: 27
		if (var1 != null) { // L: 28
			return var1;
		} else {
			byte[] var2 = KitDefinition.KitDefinition_archive.takeFile(3, var0); // L: 29
			var1 = new KitDefinition(); // L: 30
			if (var2 != null) { // L: 31
				var1.decode(new Buffer(var2));
			}

			KitDefinition.KitDefinition_cached.put(var1, (long)var0); // L: 32
			return var1; // L: 33
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)[Lqr;",
		garbageValue = "-2037614425"
	)
	static PrivateChatMode[] method106() {
		return new PrivateChatMode[]{PrivateChatMode.field4854, PrivateChatMode.field4852, PrivateChatMode.field4851}; // L: 11
	}

	@ObfuscatedName("gf")
	@ObfuscatedSignature(
		descriptor = "(Lce;B)V",
		garbageValue = "-50"
	)
	static final void method108(Actor var0) {
		boolean var1 = var0.field1136 == Client.cycle || var0.sequence == -1 || var0.sequenceDelay != 0; // L: 4201
		if (!var1) { // L: 4202
			SequenceDefinition var2 = class4.SequenceDefinition_get(var0.sequence); // L: 4203
			if (var2 != null && !var2.isCachedModelIdSet()) { // L: 4204
				var1 = var0.sequenceFrameCycle + 1 > var2.frameLengths[var0.sequenceFrame]; // L: 4208
			} else {
				var1 = true; // L: 4205
			}
		}

		if (var1) { // L: 4211
			int var8 = var0.field1136 - var0.field1183; // L: 4212
			int var3 = Client.cycle - var0.field1183; // L: 4213
			int var4 = var0.field1131 * 738291136 + var0.field1192 * 128; // L: 4214
			int var5 = var0.field1181 * 128 + var0.field1131 * 738291136; // L: 4215
			int var6 = var0.field1131 * 738291136 + var0.field1180 * 128; // L: 4216
			int var7 = var0.field1131 * 738291136 + var0.field1140 * 128; // L: 4217
			var0.x = (var6 * var3 + var4 * (var8 - var3)) / var8; // L: 4218
			var0.y = (var3 * var7 + var5 * (var8 - var3)) / var8; // L: 4219
		}

		var0.field1201 = 0; // L: 4221
		var0.orientation = var0.field1185; // L: 4222
		var0.rotation = var0.orientation; // L: 4223
	} // L: 4224

	@ObfuscatedName("hl")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "16"
	)
	static final void method109(int var0) {
		int[] var1 = class11.sceneMinimapSprite.pixels; // L: 5723
		int var2 = var1.length; // L: 5724

		int var3;
		for (var3 = 0; var3 < var2; ++var3) { // L: 5725
			var1[var3] = 0;
		}

		int var4;
		int var5;
		for (var3 = 1; var3 < 103; ++var3) { // L: 5726
			var4 = (103 - var3) * 2048 + 24628; // L: 5727

			for (var5 = 1; var5 < 103; ++var5) { // L: 5728
				if ((Tiles.Tiles_renderFlags[var0][var5][var3] & 24) == 0) { // L: 5729
					MusicPatchNode.scene.drawTileMinimap(var1, var4, 512, var0, var5, var3);
				}

				if (var0 < 3 && (Tiles.Tiles_renderFlags[var0 + 1][var5][var3] & 8) != 0) { // L: 5730
					MusicPatchNode.scene.drawTileMinimap(var1, var4, 512, var0 + 1, var5, var3);
				}

				var4 += 4; // L: 5731
			}
		}

		var3 = (238 + (int)(Math.random() * 20.0D) - 10 << 16) + (238 + (int)(Math.random() * 20.0D) - 10 << 8) + (238 + (int)(Math.random() * 20.0D) - 10); // L: 5734
		var4 = 238 + (int)(Math.random() * 20.0D) - 10 << 16; // L: 5735
		class11.sceneMinimapSprite.setRaster(); // L: 5736

		int var6;
		for (var5 = 1; var5 < 103; ++var5) { // L: 5737
			for (var6 = 1; var6 < 103; ++var6) { // L: 5738
				if ((Tiles.Tiles_renderFlags[var0][var6][var5] & 24) == 0) { // L: 5739
					class148.drawObject(var0, var6, var5, var3, var4);
				}

				if (var0 < 3 && (Tiles.Tiles_renderFlags[var0 + 1][var6][var5] & 8) != 0) { // L: 5740
					class148.drawObject(var0 + 1, var6, var5, var3, var4);
				}
			}
		}

		Client.mapIconCount = 0; // L: 5743

		for (var5 = 0; var5 < 104; ++var5) { // L: 5744
			for (var6 = 0; var6 < 104; ++var6) { // L: 5745
				long var7 = MusicPatchNode.scene.getFloorDecorationTag(Tiles.Client_plane, var5, var6); // L: 5746
				if (var7 != 0L) { // L: 5747
					int var9 = class156.Entity_unpackID(var7); // L: 5748
					int var10 = PlayerComposition.getObjectDefinition(var9).mapIconId; // L: 5749
					if (var10 >= 0 && class139.WorldMapElement_get(var10).field1856) { // L: 5750 5751
						Client.mapIcons[Client.mapIconCount] = class139.WorldMapElement_get(var10).getSpriteBool(false); // L: 5754
						Client.mapIconXs[Client.mapIconCount] = var5; // L: 5755
						Client.mapIconYs[Client.mapIconCount] = var6; // L: 5756
						++Client.mapIconCount; // L: 5757
					}
				}
			}
		}

		class20.rasterProvider.apply(); // L: 5762
	} // L: 5763

	@ObfuscatedName("jn")
	@ObfuscatedSignature(
		descriptor = "(Lkw;IIIIIII)V",
		garbageValue = "2090499864"
	)
	static final void method110(Widget var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (Client.field570) { // L: 10405
			Client.alternativeScrollbarWidth = 32;
		} else {
			Client.alternativeScrollbarWidth = 0; // L: 10406
		}

		Client.field570 = false; // L: 10407
		int var7;
		if (MouseHandler.MouseHandler_currentButton == 1 || !Renderable.mouseCam && MouseHandler.MouseHandler_currentButton == 4) { // L: 10408
			if (var5 >= var1 && var5 < var1 + 16 && var6 >= var2 && var6 < var2 + 16) { // L: 10409
				var0.scrollY -= 4; // L: 10410
				class403.invalidateWidget(var0); // L: 10411
			} else if (var5 >= var1 && var5 < var1 + 16 && var6 >= var3 + var2 - 16 && var6 < var3 + var2) { // L: 10413
				var0.scrollY += 4; // L: 10414
				class403.invalidateWidget(var0); // L: 10415
			} else if (var5 >= var1 - Client.alternativeScrollbarWidth && var5 < Client.alternativeScrollbarWidth + var1 + 16 && var6 >= var2 + 16 && var6 < var3 + var2 - 16) { // L: 10417
				var7 = var3 * (var3 - 32) / var4; // L: 10418
				if (var7 < 8) { // L: 10419
					var7 = 8;
				}

				int var8 = var6 - var2 - 16 - var7 / 2; // L: 10420
				int var9 = var3 - 32 - var7; // L: 10421
				var0.scrollY = var8 * (var4 - var3) / var9; // L: 10422
				class403.invalidateWidget(var0); // L: 10423
				Client.field570 = true; // L: 10424
			}
		}

		if (Client.mouseWheelRotation != 0) { // L: 10427
			var7 = var0.width; // L: 10428
			if (var5 >= var1 - var7 && var6 >= var2 && var5 < var1 + 16 && var6 <= var3 + var2) { // L: 10429
				var0.scrollY += Client.mouseWheelRotation * 45; // L: 10430
				class403.invalidateWidget(var0); // L: 10431
			}
		}

	} // L: 10434
}
