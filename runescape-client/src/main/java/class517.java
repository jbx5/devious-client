import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tr")
public class class517 implements MouseWheel {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Ltr;"
	)
	public static final class517 field5067;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Ltr;"
	)
	public static final class517 field5066;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Ltr;"
	)
	public static final class517 field5065;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1542172023
	)
	public final int field5068;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1742426081
	)
	public final int field5069;
	@ObfuscatedName("ah")
	public final Class field5070;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Ltd;"
	)
	public final class513 field5071;

	static {
		field5067 = new class517(2, 0, Integer.class, new class514());
		field5066 = new class517(1, 1, Long.class, new class516());
		field5065 = new class517(0, 2, String.class, new class518());
	}

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/Class;Ltd;)V"
	)
	class517(int var1, int var2, Class var3, class513 var4) {
		this.field5068 = var1;
		this.field5069 = var2;
		this.field5070 = var3;
		this.field5071 = var4;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1243971674"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field5069;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lul;I)Ljava/lang/Object;",
		garbageValue = "-1115238999"
	)
	public Object method9032(Buffer var1) {
		return this.field5071.vmethod9054(var1);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lom;Lom;ZI)V",
		garbageValue = "2080268851"
	)
	public static void method9041(AbstractArchive var0, AbstractArchive var1, boolean var2) {
		ObjectComposition.ObjectDefinition_archive = var0;
		ObjectComposition.ObjectDefinition_modelsArchive = var1;
		ObjectComposition.ObjectDefinition_isLowDetail = var2;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-4677"
	)
	public static void method9048() {
		class190.field1915.clear();
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "618410019"
	)
	public static boolean method9044(int var0) {
		return (var0 >> 20 & 1) != 0;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)[Ltr;",
		garbageValue = "-527981427"
	)
	public static class517[] method9047() {
		return new class517[]{field5065, field5067, field5066};
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Class;B)Ltr;",
		garbageValue = "25"
	)
	public static class517 method9029(Class var0) {
		class517[] var1 = method9047();

		for (int var2 = 0; var2 < var1.length; ++var2) {
			class517 var3 = var1[var2];
			if (var3.field5070 == var0) {
				return var3;
			}
		}

		return null;
	}

	@ObfuscatedName("ip")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "119"
	)
	static void method9051() {
		PacketBufferNode var0 = ClanChannelMember.getPacketBufferNode(ClientPacket.EVENT_WINDOW_SETTING, Client.packetWriter.isaacCipher);
		var0.packetBuffer.writeByte(class178.getWindowedMode());
		var0.packetBuffer.writeShort(class340.canvasWidth);
		var0.packetBuffer.writeShort(class491.canvasHeight);
		Client.packetWriter.addNode(var0);
	}

	@ObfuscatedName("mm")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "-352823613"
	)
	static final String method9050(int var0) {
		return var0 < 999999999 ? Integer.toString(var0) : "*";
	}
}
