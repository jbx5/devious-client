import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dw")
@Implements("MouseRecorder")
public class MouseRecorder implements Runnable {
	@ObfuscatedName("az")
	@Export("isRunning")
	boolean isRunning;
	@ObfuscatedName("ah")
	@Export("lock")
	Object lock;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1365818253
	)
	@Export("index")
	int index;
	@ObfuscatedName("at")
	@Export("xs")
	int[] xs;
	@ObfuscatedName("an")
	@Export("ys")
	int[] ys;
	@ObfuscatedName("ao")
	@Export("millis")
	long[] millis;

	MouseRecorder() {
		this.isRunning = true;
		this.lock = new Object();
		this.index = 0;
		this.xs = new int[500];
		this.ys = new int[500];
		this.millis = new long[500];
	}

	public void run() {
		for (; this.isRunning; class499.method8677(50L)) {
			synchronized(this.lock) {
				if (this.index < 500) {
					this.xs[this.index] = MouseHandler.MouseHandler_x;
					this.ys[this.index] = MouseHandler.MouseHandler_y;
					this.millis[this.index] = MouseHandler.MouseHandler_millis;
					++this.index;
				}
			}
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)Lis;",
		garbageValue = "-1126485821"
	)
	@Export("getObjectDefinition")
	public static ObjectComposition getObjectDefinition(int var0) {
		ObjectComposition var1 = (ObjectComposition)ObjectComposition.ObjectDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = ObjectComposition.ObjectDefinition_archive.takeFile(6, var0);
			var1 = new ObjectComposition();
			var1.id = var0;
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.postDecode();
			if (var1.isSolid) {
				var1.interactType = 0;
				var1.boolean1 = false;
			}

			ObjectComposition.ObjectDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("gk")
	@ObfuscatedSignature(
		descriptor = "(S)Ltl;",
		garbageValue = "256"
	)
	@Export("getWorldMap")
	static WorldMap getWorldMap() {
		return ModeWhere.worldMap;
	}

	@ObfuscatedName("iv")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1668694715"
	)
	@Export("setWindowedMode")
	static void setWindowedMode(int var0) {
		Client.field740 = 0L;
		if (var0 >= 2) {
			Client.isResizable = true;
		} else {
			Client.isResizable = false;
		}

		if (class36.getWindowedMode() == 1) {
			UrlRequest.client.setMaxCanvasSize(765, 503);
		} else {
			UrlRequest.client.setMaxCanvasSize(7680, 2160);
		}

		if (Client.gameState >= 25 && Client.packetWriter != null && Client.packetWriter.isaacCipher != null) {
			PacketBufferNode var1 = FadeInTask.getPacketBufferNode(ClientPacket.EVENT_WINDOW_SETTING, Client.packetWriter.isaacCipher);
			var1.packetBuffer.writeByte(class36.getWindowedMode());
			var1.packetBuffer.writeShort(class148.canvasWidth);
			var1.packetBuffer.writeShort(class342.canvasHeight);
			Client.packetWriter.addNode(var1);
		}

	}
}
