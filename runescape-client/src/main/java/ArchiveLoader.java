import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("do")
@Implements("ArchiveLoader")
public class ArchiveLoader {
	@ObfuscatedName("ve")
	static List field1055;
	@ObfuscatedName("gl")
	@Export("authServiceBaseUrl")
	static String authServiceBaseUrl;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lov;"
	)
	@Export("archive")
	final Archive archive;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 58353501
	)
	@Export("groupCount")
	final int groupCount;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1629974393
	)
	@Export("loadedCount")
	int loadedCount;

	@ObfuscatedSignature(
		descriptor = "(Lov;Ljava/lang/String;)V"
	)
	ArchiveLoader(Archive var1, String var2) {
		this.loadedCount = 0;
		this.archive = var1;
		this.groupCount = var1.getGroupCount();
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "27"
	)
	@Export("isLoaded")
	boolean isLoaded() {
		this.loadedCount = 0;

		for (int var1 = 0; var1 < this.groupCount; ++var1) {
			if (!this.archive.method6938(var1) || this.archive.method6912(var1)) {
				++this.loadedCount;
			}
		}

		return this.loadedCount >= this.groupCount;
	}
}
