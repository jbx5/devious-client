import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("d")
public class class14 {
	@ObfuscatedName("b")
	@Export("Tiles_overlays")
	static byte[][][] Tiles_overlays;
	@ObfuscatedName("ia")
	@ObfuscatedSignature(descriptor = 
	"Lqi;")

	@Export("compass")
	static SpritePixels compass;
	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = 
	225446733)

	final int field73;
	@ObfuscatedName("c")
	final String field69;
	@ObfuscatedName("i")
	final ThreadFactory field75;
	@ObfuscatedName("f")
	final ThreadPoolExecutor field71;

	public class14(String var1, int var2, int var3) {
		this.field69 = var1;
		this.field73 = var2;
		this.field75 = new class16(this);
		this.field71 = this.method165(var3);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(IB)Ljava/util/concurrent/ThreadPoolExecutor;", garbageValue = 
	"-61")

	final ThreadPoolExecutor method165(int var1) {
		return new ThreadPoolExecutor(var1, var1, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(this.field73), this.field75);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(Lr;B)Lx;", garbageValue = 
	"3")

	public class19 method166(class10 var1) {
		if (this.field71.getQueue().remainingCapacity() <= 0) {
			System.err.println((("REST thread pool queue is empty\r\nThread pool size " + this.field71.getCorePoolSize()) + " Queue capacity ") + this.field73);
			return new class19("Queue full");
		} else {
			class19 var2 = new class19(this.field71.submit(new class20(this, var1)));
			return var2;
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"(B)V", garbageValue = 
	"-31")

	public final void method167() {
		try {
			this.field71.shutdown();
		} catch (Exception var2) {
			System.err.println("Error shutting down RestRequestService\r\n" + var2);
		}

	}

	@ObfuscatedName("gi")
	@ObfuscatedSignature(descriptor = 
	"(Lky;III)V", garbageValue = 
	"-1754195222")

	@Export("checkIfMinimapClicked")
	static final void checkIfMinimapClicked(Widget var0, int var1, int var2) {
		if ((Client.minimapState == 0) || (Client.minimapState == 3)) {
			if ((!Client.isMenuOpen) && ((MouseHandler.MouseHandler_lastButton == 1) || ((!GameBuild.mouseCam) && (MouseHandler.MouseHandler_lastButton == 4)))) {
				SpriteMask var3 = var0.getSpriteMask(true);
				if (var3 == null) {
					return;
				}

				int var4 = MouseHandler.MouseHandler_lastPressedX - var1;
				int var5 = MouseHandler.MouseHandler_lastPressedY - var2;
				if (var3.contains(var4, var5)) {
					var4 -= var3.width / 2;
					var5 -= var3.height / 2;
					int var6 = Client.camAngleY & 2047;
					int var7 = Rasterizer3D.Rasterizer3D_sine[var6];
					int var8 = Rasterizer3D.Rasterizer3D_cosine[var6];
					int var9 = ((var7 * var5) + (var4 * var8)) >> 11;
					int var10 = ((var5 * var8) - (var7 * var4)) >> 11;
					int var11 = (var9 + GrandExchangeEvents.localPlayer.x) >> 7;
					int var12 = (GrandExchangeEvents.localPlayer.y - var10) >> 7;
					PacketBufferNode var13 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2910, Client.packetWriter.isaacCipher);
					var13.packetBuffer.writeByte(18);
					var13.packetBuffer.writeShortLE(var11 + GrandExchangeOfferOwnWorldComparator.baseX);
					var13.packetBuffer.writeShort(var12 + VarcInt.baseY);
					var13.packetBuffer.writeByteSub(KeyHandler.KeyHandler_pressedKeys[82] ? KeyHandler.KeyHandler_pressedKeys[81] ? 2 : 1 : 0);
					var13.packetBuffer.writeByte(var4);
					var13.packetBuffer.writeByte(var5);
					var13.packetBuffer.writeShort(Client.camAngleY);
					var13.packetBuffer.writeByte(57);
					var13.packetBuffer.writeByte(0);
					var13.packetBuffer.writeByte(0);
					var13.packetBuffer.writeByte(89);
					var13.packetBuffer.writeShort(GrandExchangeEvents.localPlayer.x);
					var13.packetBuffer.writeShort(GrandExchangeEvents.localPlayer.y);
					var13.packetBuffer.writeByte(63);
					Client.packetWriter.addNode(var13);
					Client.destinationX = var11;
					Client.destinationY = var12;
				}
			}

		}
	}
}