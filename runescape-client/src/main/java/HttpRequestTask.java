import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ac")
@Implements("HttpRequestTask")
public class HttpRequestTask implements Callable {
	@ObfuscatedName("aw")
	@Export("FileSystem_cacheDir")
	static File FileSystem_cacheDir;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lng;"
	)
	@Export("scriptActiveWidget")
	static Widget scriptActiveWidget;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1816225167
	)
	@Export("canvasWidth")
	public static int canvasWidth;
	@ObfuscatedName("io")
	@ObfuscatedSignature(
		descriptor = "Lul;"
	)
	static Fonts field76;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lau;"
	)
	final HttpRequest field75;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lar;"
	)
	final AsyncRestClient this$0;

	@ObfuscatedSignature(
		descriptor = "(Lar;Lau;)V"
	)
	HttpRequestTask(AsyncRestClient var1, HttpRequest var2) {
		this.this$0 = var1;
		this.field75 = var2;
	}

	public Object call() throws Exception {
		try {
			while (this.field75.connect()) {
				World.method2001(10L);
			}
		} catch (IOException var2) {
			return new HttpResponse("Error servicing REST query: " + var2.getMessage());
		}

		return this.field75.getResponse();
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lpe;I)V",
		garbageValue = "-374364079"
	)
	public static void method288(AbstractArchive var0) {
		StructComposition.StructDefinition_archive = var0;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1647584111"
	)
	public static int method287(int var0) {
		return class506.field5144[var0 & 16383];
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "([FI)V",
		garbageValue = "1542623997"
	)
	static void method282(float[] var0) {
		if (class133.field1547 + var0[0] < 1.3333334F) {
			float var1 = var0[0] - 2.0F;
			float var2 = var0[0] - 1.0F;
			float var3 = (float)Math.sqrt((double)(var1 * var1 - 4.0F * var2 * var2));
			float var4 = (var3 + -var1) * 0.5F;
			if (var0[1] + class133.field1547 > var4) {
				var0[1] = var4 - class133.field1547;
			} else {
				var4 = (-var1 - var3) * 0.5F;
				if (var0[1] < var4 + class133.field1547) {
					var0[1] = var4 + class133.field1547;
				}
			}
		} else {
			var0[0] = 1.3333334F - class133.field1547;
			var0[1] = 0.33333334F - class133.field1547;
		}

	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(ILda;ZB)I",
		garbageValue = "-42"
	)
	static int method286(int var0, Script var1, boolean var2) {
		if (var0 == 7900) {
			int var3 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
			Client.field507 = Math.max(var3, 0);
			return 1;
		} else if (var0 == 7901) {
			Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = Client.field507;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("hz")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-5"
	)
	@Export("doCheat")
	static final void doCheat(String var0) {
		if (var0.equalsIgnoreCase("toggleroof")) {
			TaskHandler.clientPreferences.updateRoofsHidden(!TaskHandler.clientPreferences.isRoofsHidden());
			if (TaskHandler.clientPreferences.isRoofsHidden()) {
				class430.addGameMessage(99, "", "Roofs are now all hidden");
			} else {
				class430.addGameMessage(99, "", "Roofs will only be removed selectively");
			}
		}

		if (var0.startsWith("zbuf")) {
			boolean var1 = class27.method437(var0.substring(5).trim()) == 1;
			Projectile.client.method620(var1);
			Rasterizer3D.method4852(var1);
		}

		if (var0.equalsIgnoreCase("z")) {
			Client.z = !Client.z;
		}

		if (var0.equalsIgnoreCase("displayfps")) {
			TaskHandler.clientPreferences.toggleDisplayFps();
		}

		if (var0.equalsIgnoreCase("renderself")) {
			Client.renderSelf = !Client.renderSelf;
		}

		if (var0.equalsIgnoreCase("mouseovertext")) {
			Client.showMouseOverText = !Client.showMouseOverText;
		}

		int var2;
		String[] var3;
		if (var0.startsWith("setdrawdistance")) {
			var3 = var0.split(" ");

			try {
				var2 = Integer.parseInt(var3[1]);
				TaskHandler.clientPreferences.setDrawDistance(var2);
			} catch (NumberFormatException var6) {
				class430.addGameMessage(99, "", String.format("Error setting draw distance. setdrawdistance should be in the format \"::setdrawdistance X\" where X is a valid number. Value provided: %s", var3[1]));
			}
		}

		if (var0.startsWith("settilerendermode")) {
			var3 = var0.split(" ");

			try {
				var2 = Integer.parseInt(var3[1]);
				class198.topLevelWorldView.scene.method5037(class232.method4676()[var2]);
			} catch (NumberFormatException var5) {
				class430.addGameMessage(99, "", String.format("Error setting tile render mode. settilerendermode should be in the format \"::settilerendermode X\" where X is a valid number from 0-1. 0=camera 1=target Value provided: %s", var3[1]));
			}
		}

		if (var0.equalsIgnoreCase("getdrawdistance")) {
			class430.addGameMessage(99, "", String.format("%d", TaskHandler.clientPreferences.getDrawDistance()));
		}

		if (Client.staffModLevel >= 2) {
			if (var0.equalsIgnoreCase("errortest")) {
				throw new RuntimeException();
			}

			if (var0.equalsIgnoreCase("showcoord")) {
				LoginState.worldMap.showCoord = !LoginState.worldMap.showCoord;
			}

			if (var0.equalsIgnoreCase("fpson")) {
				TaskHandler.clientPreferences.updateDisplayFps(true);
			}

			if (var0.equalsIgnoreCase("fpsoff")) {
				TaskHandler.clientPreferences.updateDisplayFps(false);
			}

			if (var0.equalsIgnoreCase("gc")) {
				System.gc();
			}

			if (var0.equalsIgnoreCase("clientdrop")) {
				WorldMapSectionType.method6254();
			}

			if (var0.equalsIgnoreCase("clientreload")) {
				PcmPlayer.method833();
			}
		}

		PacketBufferNode var7 = class113.getPacketBufferNode(ClientPacket.DOCHEAT, Client.packetWriter.isaacCipher);
		var7.packetBuffer.writeByte(var0.length() + 1);
		var7.packetBuffer.writeStringCp1252NullTerminated(var0);
		Client.packetWriter.addNode(var7);
	}
}
