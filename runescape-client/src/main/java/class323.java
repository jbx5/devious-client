import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mj")
public class class323 {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lmj;"
	)
	public static final class323 field3422;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lmj;"
	)
	public static final class323 field3415;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lmj;"
	)
	public static final class323 field3417;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lmj;"
	)
	public static final class323 field3424;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lmj;"
	)
	public static final class323 field3418;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lmj;"
	)
	public static final class323 field3419;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lmj;"
	)
	public static final class323 field3427;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lmj;"
	)
	public static final class323 field3421;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lmj;"
	)
	public static final class323 field3416;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lmj;"
	)
	public static final class323 field3423;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lmj;"
	)
	public static final class323 field3420;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lmj;"
	)
	public static final class323 field3425;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lmj;"
	)
	public static final class323 field3426;
	@ObfuscatedName("kz")
	@ObfuscatedGetter(
		intValue = -887244477
	)
	@Export("cameraPitch")
	static int cameraPitch;

	static {
		field3422 = new class323(7);
		field3415 = new class323(11);
		field3417 = new class323(14);
		field3424 = new class323(14);
		field3418 = new class323(5);
		field3419 = new class323(6);
		field3427 = new class323(20);
		field3421 = new class323(4);
		field3416 = new class323(7);
		field3423 = new class323(4);
		field3420 = new class323(7);
		field3425 = new class323(2);
		field3426 = new class323(17);
	}

	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "7"
	)
	class323(int var1) {
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1423092027"
	)
	public static void method6517() {
		if (MouseHandler.MouseHandler_instance != null) {
			synchronized(MouseHandler.MouseHandler_instance) {
				MouseHandler.MouseHandler_instance = null;
			}
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Lme;",
		garbageValue = "868015187"
	)
	public static PacketBufferNode method6516() {
		PacketBufferNode var0;
		if (PacketBufferNode.PacketBufferNode_packetBufferNodeCount == 0) {
			var0 = new PacketBufferNode();
		} else {
			var0 = PacketBufferNode.PacketBufferNode_packetBufferNodes[--PacketBufferNode.PacketBufferNode_packetBufferNodeCount];
		}

		var0.clientPacket = null;
		var0.clientPacketLength = 0;
		var0.packetBuffer = new PacketBuffer(5000);
		return var0;
	}
}
