import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tm")
public class class503 implements MouseWheel {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Ltm;"
	)
	public static final class503 field5030;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Ltm;"
	)
	public static final class503 field5027;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Ltm;"
	)
	public static final class503 field5028;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 110782213
	)
	public final int field5031;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1427007715
	)
	public final int field5029;
	@ObfuscatedName("aj")
	public final Class field5026;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Ltd;"
	)
	final class499 field5032;

	static {
		field5030 = new class503(0, 0, Integer.class, new class500());
		field5027 = new class503(1, 1, Long.class, new class502());
		field5028 = new class503(2, 2, String.class, new class504());
	}

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/Class;Ltd;)V"
	)
	class503(int var1, int var2, Class var3, class499 var4) {
		this.field5031 = var1;
		this.field5029 = var2;
		this.field5026 = var3;
		this.field5032 = var4;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1644350448"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field5029;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lty;B)Ljava/lang/Object;",
		garbageValue = "-37"
	)
	public Object method8938(Buffer var1) {
		return this.field5032.vmethod8959(var1);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)[Ltm;",
		garbageValue = "-101"
	)
	public static class503[] method8943() {
		return new class503[]{field5027, field5030, field5028};
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Llw;Luy;B)Llv;",
		garbageValue = "52"
	)
	@Export("getPacketBufferNode")
	public static PacketBufferNode getPacketBufferNode(ClientPacket var0, IsaacCipher var1) {
		PacketBufferNode var2 = class130.method3005();
		var2.clientPacket = var0;
		var2.clientPacketLength = var0.length;
		if (var2.clientPacketLength == -1) {
			var2.packetBuffer = new PacketBuffer(260);
		} else if (var2.clientPacketLength == -2) {
			var2.packetBuffer = new PacketBuffer(10000);
		} else if (var2.clientPacketLength <= 18) {
			var2.packetBuffer = new PacketBuffer(20);
		} else if (var2.clientPacketLength <= 98) {
			var2.packetBuffer = new PacketBuffer(100);
		} else {
			var2.packetBuffer = new PacketBuffer(260);
		}

		var2.packetBuffer.setIsaacCipher(var1);
		var2.packetBuffer.writeByteIsaac(var2.clientPacket.id);
		var2.index = 0;
		return var2;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Class;I)Ltm;",
		garbageValue = "-1095130595"
	)
	public static class503 method8935(Class var0) {
		class503[] var1 = method8943();

		for (int var2 = 0; var2 < var1.length; ++var2) {
			class503 var3 = var1[var2];
			if (var3.field5026 == var0) {
				return var3;
			}
		}

		return null;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lty;I)V",
		garbageValue = "472817950"
	)
	public static void method8944(Object var0, Buffer var1) {
		Class var3 = var0.getClass();
		class503 var4 = method8935(var3);
		if (var4 == null) {
			throw new IllegalArgumentException();
		} else {
			class499 var2 = var4.field5032;
			var2.vmethod8956(var0, var1);
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1510166958"
	)
	public static void method8952() {
		HealthBarDefinition.HealthBarDefinition_cached.clear();
		HealthBarDefinition.HealthBarDefinition_cachedSprites.clear();
	}

	@ObfuscatedName("my")
	@ObfuscatedSignature(
		descriptor = "(Lmt;B)Lmt;",
		garbageValue = "-69"
	)
	static Widget method8951(Widget var0) {
		Widget var1 = WorldMapEvent.method5647(var0);
		if (var1 == null) {
			var1 = var0.parent;
		}

		return var1;
	}
}
