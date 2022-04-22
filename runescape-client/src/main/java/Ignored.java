import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ng")
@Implements("Ignored")
public class Ignored extends User {
	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = 
	-60193045)

	@Export("id")
	int id;

	Ignored() {
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(Lng;B)I", garbageValue = 
	"-48")

	@Export("compareTo_ignored")
	int compareTo_ignored(Ignored var1) {
		return this.id - var1.id;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(Lnn;I)I", garbageValue = 
	"842367957")

	@Export("compareTo_user")
	public int compareTo_user(User var1) {
		return this.compareTo_ignored(((Ignored) (var1)));
	}

	public int compareTo(Object var1) {
		return this.compareTo_ignored(((Ignored) (var1)));
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = 
	"(IB)V", garbageValue = 
	"127")

	static void method6828(int var0) {
		if (var0 != Login.loginIndex) {
			Login.loginIndex = var0;
		}
	}
}