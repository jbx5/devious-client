import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tq")
public class class518 implements Enum {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Ltq;"
	)
	public static final class518 field5109;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Ltq;"
	)
	public static final class518 field5102;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Ltq;"
	)
	public static final class518 field5103;
	@ObfuscatedName("vv")
	@ObfuscatedGetter(
		intValue = -204418723
	)
	static int field5105;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1322144523
	)
	public final int field5104;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1024311835
	)
	public final int field5107;
	@ObfuscatedName("ar")
	public final Class field5106;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Ltr;"
	)
	final class514 field5110;

	static {
		field5109 = new class518(2, 0, Integer.class, new class515());
		field5102 = new class518(1, 1, Long.class, new class517());
		field5103 = new class518(0, 2, String.class, new class519());
	}

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/Class;Ltr;)V"
	)
	class518(int var1, int var2, Class var3, class514 var4) {
		this.field5104 = var1;
		this.field5107 = var2;
		this.field5106 = var3;
		this.field5110 = var4;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-884190501"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field5107;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Luk;I)Ljava/lang/Object;",
		garbageValue = "-1116840792"
	)
	public Object method9243(Buffer var1) {
		return this.field5110.vmethod9259(var1);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)[Ltq;",
		garbageValue = "-476737263"
	)
	public static class518[] method9256() {
		return new class518[]{field5102, field5103, field5109};
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IIII)Ldd;",
		garbageValue = "-1751733062"
	)
	@Export("getWorldMapScript")
	static Script getWorldMapScript(int var0, int var1, int var2) {
		int var3 = Varcs.shift8LeftAndAdd(var1, var0);
		Script var4 = SecureUrlRequester.getScript(var3, var0);
		if (var4 != null) {
			return var4;
		} else {
			var3 = class380.method7195(var2, var0);
			var4 = SecureUrlRequester.getScript(var3, var0);
			if (var4 != null) {
				return var4;
			} else {
				var3 = class359.method6932(var0);
				var4 = SecureUrlRequester.getScript(var3, var0);
				return var4 != null ? var4 : null;
			}
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Luk;I)V",
		garbageValue = "896385763"
	)
	public static void method9241(Object var0, Buffer var1) {
		Class var3 = var0.getClass();
		class518[] var5 = method9256();
		int var6 = 0;

		class518 var4;
		while (true) {
			if (var6 >= var5.length) {
				var4 = null;
				break;
			}

			class518 var7 = var5[var6];
			if (var3 == var7.field5106) {
				var4 = var7;
				break;
			}

			++var6;
		}

		if (var4 == null) {
			throw new IllegalArgumentException();
		} else {
			class514 var2 = var4.field5110;
			var2.vmethod9263(var0, var1);
		}
	}

	@ObfuscatedName("jm")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1661815480"
	)
	static final int method9254(int var0) {
		return Math.min(Math.max(var0, 128), 383);
	}

	@ObfuscatedName("om")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1075846579"
	)
	static final void method9255(int var0, int var1) {
		if (Client.currentClanChannels[var0] != null) {
			if (var1 >= 0 && var1 < Client.currentClanChannels[var0].method3492()) {
				ClanChannelMember var2 = (ClanChannelMember)Client.currentClanChannels[var0].members.get(var1);
				if (var2.rank == -1) {
					PacketBufferNode var3 = class482.getPacketBufferNode(ClientPacket.field3223, Client.packetWriter.isaacCipher);
					var3.packetBuffer.writeByte(3 + CollisionMap.stringCp1252NullTerminatedByteSize(var2.username.getName()));
					var3.packetBuffer.writeByte(var0);
					var3.packetBuffer.writeShort(var1);
					var3.packetBuffer.writeStringCp1252NullTerminated(var2.username.getName());
					Client.packetWriter.addNode(var3);
				}
			}
		}
	}
}
