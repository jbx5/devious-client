import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("si")
@Implements("HttpContentType")
public class HttpContentType {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lsi;"
	)
	@Export("APPLICATION_JSON")
	public static final HttpContentType APPLICATION_JSON;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lsi;"
	)
	@Export("TEXT_PLAIN")
	static final HttpContentType TEXT_PLAIN;
	@ObfuscatedName("ar")
	@Export("contentType")
	String contentType;

	static {
		APPLICATION_JSON = new HttpContentType("application/json");
		TEXT_PLAIN = new HttpContentType("text/plain");
	}

	HttpContentType(String var1) {
		this.contentType = var1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1925429052"
	)
	@Export("getValue")
	public String getValue() {
		return this.contentType;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)Ltu;",
		garbageValue = "-2020292957"
	)
	public static class514 method8562(int var0) {
		int var1 = class512.field5056[var0];
		if (var1 == 1) {
			return class514.field5065;
		} else if (var1 == 2) {
			return class514.field5061;
		} else {
			return var1 == 3 ? class514.field5066 : null;
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2006289317"
	)
	public static void method8564() {
		class316.field3424.clear();
	}

	@ObfuscatedName("kn")
	@ObfuscatedSignature(
		descriptor = "(Luo;B)V",
		garbageValue = "-41"
	)
	static final void method8565(PacketBuffer var0) {
		var0.importIndex();
		int var1 = var0.readBits(8);
		int var2;
		if (var1 < Client.npcCount) {
			for (var2 = var1; var2 < Client.npcCount; ++var2) {
				Client.field618[++Client.field617 - 1] = Client.npcIndices[var2];
			}
		}

		if (var1 > Client.npcCount) {
			throw new RuntimeException("");
		} else {
			Client.npcCount = 0;

			for (var2 = 0; var2 < var1; ++var2) {
				int var3 = Client.npcIndices[var2];
				NPC var4 = Client.npcs[var3];
				int var5 = var0.readBits(1);
				if (var5 == 0) {
					Client.npcIndices[++Client.npcCount - 1] = var3;
					var4.npcCycle = Client.cycle;
				} else {
					int var6 = var0.readBits(2);
					if (var6 == 0) {
						Client.npcIndices[++Client.npcCount - 1] = var3;
						var4.npcCycle = Client.cycle;
						Client.field549[++Client.field637 - 1] = var3;
					} else {
						int var7;
						int var8;
						if (var6 == 1) {
							Client.npcIndices[++Client.npcCount - 1] = var3;
							var4.npcCycle = Client.cycle;
							var7 = var0.readBits(3);
							var4.method2664(var7, class228.field2409);
							var8 = var0.readBits(1);
							if (var8 == 1) {
								Client.field549[++Client.field637 - 1] = var3;
							}
						} else if (var6 == 2) {
							Client.npcIndices[++Client.npcCount - 1] = var3;
							var4.npcCycle = Client.cycle;
							if (var0.readBits(1) == 1) {
								var7 = var0.readBits(3);
								var4.method2664(var7, class228.field2410);
								var8 = var0.readBits(3);
								var4.method2664(var8, class228.field2410);
							} else {
								var7 = var0.readBits(3);
								var4.method2664(var7, class228.field2408);
							}

							var7 = var0.readBits(1);
							if (var7 == 1) {
								Client.field549[++Client.field637 - 1] = var3;
							}
						} else if (var6 == 3) {
							Client.field618[++Client.field617 - 1] = var3;
						}
					}
				}
			}

		}
	}
}
