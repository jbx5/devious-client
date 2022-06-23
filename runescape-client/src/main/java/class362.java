import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Export;
@ObfuscatedName("mv")
public final class class362 implements Comparable {
	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "[Lbc;")
	@Export("World_worlds")
	static World[] World_worlds;

	@ObfuscatedName("c")
	Object field4276;

	@ObfuscatedName("v")
	Object field4275;

	@ObfuscatedName("q")
	@ObfuscatedGetter(longValue = 9010980018461630201L)
	long field4277;

	@ObfuscatedName("f")
	@ObfuscatedGetter(longValue = 5118343004498114985L)
	long field4278;

	class362(Object var1, Object var2) {
		this.field4276 = var1;
		this.field4275 = var2;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(Lmv;I)I", garbageValue = "-1596161732")
	int method6553(class362 var1) {
		if (this.field4278 < var1.field4278) {
			return -1;
		} else {
			return this.field4278 > var1.field4278 ? 1 : 0;
		}
	}

	public boolean equals(Object var1) {
		if (var1 instanceof class362) {
			return this.field4275.equals(((class362) (var1)).field4275);
		} else {
			throw new IllegalArgumentException();
		}
	}

	public int hashCode() {
		return this.field4275.hashCode();
	}

	public int compareTo(Object var1) {
		return this.method6553(((class362) (var1)));
	}

	@ObfuscatedName("ic")
	@ObfuscatedSignature(descriptor = "(III)V", garbageValue = "985949639")
	@Export("resumePauseWidget")
	static void resumePauseWidget(int var0, int var1) {
		PacketBufferNode var2 = EnumComposition.getPacketBufferNode(ClientPacket.RESUME_PAUSEBUTTON, Client.packetWriter.isaacCipher);
		var2.packetBuffer.writeShortLE(var1);
		var2.packetBuffer.writeIntIME(var0);
		Client.packetWriter.addNode(var2);
	}
}