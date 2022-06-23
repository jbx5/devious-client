import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("mr")
public final class class342 {
	@ObfuscatedName("fw")
	@ObfuscatedSignature(descriptor = "(S)Z", garbageValue = "208")
	static boolean method6312() {
		if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) {
			while (Client.archiveLoadersDone < Client.archiveLoaders.size()) {
				ArchiveLoader var0 = ((ArchiveLoader) (Client.archiveLoaders.get(Client.archiveLoadersDone)));
				if (!var0.isLoaded()) {
					return false;
				}
				++Client.archiveLoadersDone;
			} 
			return true;
		} else {
			return true;
		}
	}
}