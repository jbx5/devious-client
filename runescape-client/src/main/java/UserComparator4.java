import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("db")
@Implements("UserComparator4")
public class UserComparator4 implements Comparator {
	@ObfuscatedName("vf")
	@ObfuscatedGetter(
		intValue = 1706361753
	)
	@Export("foundItemIdCount")
	static int foundItemIdCount;
	@ObfuscatedName("c")
	@Export("reversed")
	final boolean reversed;

	public UserComparator4(boolean var1) {
		this.reversed = var1; // L: 10
	} // L: 11

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lnr;Lnr;B)I",
		garbageValue = "-116"
	)
	@Export("compare_bridged")
	int compare_bridged(Buddy var1, Buddy var2) {
		return this.reversed ? var1.int2 - var2.int2 : var2.int2 - var1.int2; // L: 14
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((Buddy)var1, (Buddy)var2); // L: 18
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 22
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)[Lqt;",
		garbageValue = "392614583"
	)
	@Export("FillMode_values")
	public static FillMode[] FillMode_values() {
		return new FillMode[]{FillMode.SOLID, FillMode.field4810, FillMode.field4814}; // L: 15
	}

	@ObfuscatedName("hp")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "564741140"
	)
	static boolean method2730() {
		return (Client.drawPlayerNames & 4) != 0; // L: 4788
	}

	@ObfuscatedName("iq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1545861626"
	)
	static final void method2731() {
		PacketBuffer var0 = Client.packetWriter.packetBuffer; // L: 7813
		var0.importIndex(); // L: 7814
		int var1 = var0.readBits(8); // L: 7815
		int var2;
		if (var1 < Client.npcCount) { // L: 7816
			for (var2 = var1; var2 < Client.npcCount; ++var2) { // L: 7817
				Client.field775[++Client.field625 - 1] = Client.npcIndices[var2];
			}
		}

		if (var1 > Client.npcCount) { // L: 7819
			throw new RuntimeException("");
		} else {
			Client.npcCount = 0; // L: 7820

			for (var2 = 0; var2 < var1; ++var2) { // L: 7821
				int var3 = Client.npcIndices[var2]; // L: 7822
				NPC var4 = Client.npcs[var3]; // L: 7823
				int var5 = var0.readBits(1); // L: 7824
				if (var5 == 0) { // L: 7825
					Client.npcIndices[++Client.npcCount - 1] = var3; // L: 7826
					var4.npcCycle = Client.cycle; // L: 7827
				} else {
					int var6 = var0.readBits(2); // L: 7830
					if (var6 == 0) { // L: 7831
						Client.npcIndices[++Client.npcCount - 1] = var3; // L: 7832
						var4.npcCycle = Client.cycle; // L: 7833
						Client.field550[++Client.field549 - 1] = var3; // L: 7834
					} else {
						int var7;
						int var8;
						if (var6 == 1) { // L: 7837
							Client.npcIndices[++Client.npcCount - 1] = var3; // L: 7838
							var4.npcCycle = Client.cycle; // L: 7839
							var7 = var0.readBits(3); // L: 7840
							var4.method2510(var7, class193.field2246); // L: 7841
							var8 = var0.readBits(1); // L: 7842
							if (var8 == 1) { // L: 7843
								Client.field550[++Client.field549 - 1] = var3;
							}
						} else if (var6 == 2) { // L: 7846
							Client.npcIndices[++Client.npcCount - 1] = var3; // L: 7847
							var4.npcCycle = Client.cycle; // L: 7848
							if (var0.readBits(1) == 1) { // L: 7849
								var7 = var0.readBits(3); // L: 7850
								var4.method2510(var7, class193.field2247); // L: 7851
								var8 = var0.readBits(3); // L: 7852
								var4.method2510(var8, class193.field2247); // L: 7853
							} else {
								var7 = var0.readBits(3); // L: 7856
								var4.method2510(var7, class193.field2244); // L: 7857
							}

							var7 = var0.readBits(1); // L: 7859
							if (var7 == 1) { // L: 7860
								Client.field550[++Client.field549 - 1] = var3;
							}
						} else if (var6 == 3) { // L: 7863
							Client.field775[++Client.field625 - 1] = var3; // L: 7864
						}
					}
				}
			}

		}
	} // L: 7868
}
