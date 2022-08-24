import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import java.awt.FontMetrics;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("fr")
@Implements("VarcInt")
public class VarcInt extends DualNode {
	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "Lls;")
	@Export("VarcInt_archive")
	static AbstractArchive VarcInt_archive;

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "Liz;")
	@Export("VarcInt_cached")
	static EvictingDualNodeHashTable VarcInt_cached = new EvictingDualNodeHashTable(64);

	@ObfuscatedName("ax")
	@Export("loginScreenFontMetrics")
	static FontMetrics loginScreenFontMetrics;

	@ObfuscatedName("w")
	@Export("persist")
	public boolean persist = false;

	VarcInt() {
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(Lqr;I)V", garbageValue = "-148027464")
	void method3318(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}
			this.method3325(var1, var2);
		} 
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(Lqr;II)V", garbageValue = "189989470")
	void method3325(Buffer var1, int var2) {
		if (var2 == 2) {
			this.persist = true;
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(ILjava/lang/String;Ljava/lang/String;I)V", garbageValue = "710867325")
	@Export("addGameMessage")
	static void addGameMessage(int var0, String var1, String var2) {
		class161.addChatMessage(var0, var1, var2, ((String) (null)));
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-1849403941")
	public static void method3328() {
		ItemContainer.midiPcmStream.clear();
		class273.musicPlayerStatus = 1;
		NetFileRequest.musicTrackArchive = null;
	}
}